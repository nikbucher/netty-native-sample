plugins {
	application
	alias(libs.plugins.graalvm.buildtools)
}


dependencies {
	implementation(enforcedPlatform(libs.spring.boot.bom))
	implementation(libs.netty.all)
	testImplementation(libs.junit.jupiter)
	testImplementation(libs.assertj.core)
}

val javaLanguageVersion = JavaLanguageVersion.of(libs.versions.java.get())
java {
	toolchain {
		languageVersion = javaLanguageVersion
	}
}

application {
	mainClass = "org.example.HttpHelloWorldServer"
}

graalvmNative {
	binaries {

		named("main") {
/*
			fallback.set(false)
			verbose.set(true)

			buildArgs.add("--initialize-at-build-time=io.netty")

			buildArgs.add("-H:+InstallExitHandlers")
			buildArgs.add("-H:+ReportUnsupportedElementsAtRuntime")
			buildArgs.add("-H:+ReportExceptionStackTraces")
*/

			imageName.set("netty-server")
		}
	}
}

tasks.withType<JavaCompile> {
	options.encoding = "UTF-8"
	options.compilerArgs.add("-parameters")
}

tasks.withType<Test> {
	useJUnitPlatform()
	testLogging {
		events("passed", "skipped", "failed")
	}
}
