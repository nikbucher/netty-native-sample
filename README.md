# Netty Native Sample

[![build](https://github.com/nikbucher/netty-native-sample/actions/workflows/build.yml/badge.svg)](https://github.com/nikbucher/netty-native-sample/actions/workflows/build.yml)

Minimal HTTP server built with [Netty](https://netty.io/) that responds with "Hello World" to any request.
Demonstrates building the same app as a JVM app, a [GraalVM](https://www.graalvm.org/) native image, and a Docker image.

## Requirements

- Java 21
- GraalVM (only for the native image)
- Docker (only for the container image)

## Run

```bash
./gradlew run
```

Then open <http://127.0.0.1:8080/>.

## GraalVM Native Image

```bash
./gradlew nativeCompile
./app/build/native/nativeCompile/netty-server
```

## Docker Image

```bash
docker build -f build.Dockerfile -t netty-native-sample .
docker run --rm -p 8080:8080 netty-native-sample
```

## License

[MIT](LICENSE)
