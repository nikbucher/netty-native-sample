rootProject.name = "netty-native-sample"
include("app")

dependencyResolutionManagement {
	repositories {
		mavenCentral()
	}
}


pluginManagement {
	repositories {
		maven {
			url = uri("https://raw.githubusercontent.com/graalvm/native-build-tools/snapshots")
		}
		gradlePluginPortal()
	}
}

