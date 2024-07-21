# Netty Native Sample

Netty Native Sample contains a simple HTTP server using Netty that responds with "Hello World" to any HTTP request.

## Requirements

- Java 21
- GraalVM if you want to build a native image
- Docker if you want to build a Docker image

## Getting Started

### Clone the Repository

```bash
git clone https://gitlab.com/nikbucher/netty-native-sample.git
cd netty-native-sample
```

### Build and Run

1. **Build the project:**

    ```bash
    ./gradlew build
    ```

2. **Run the server:**

    ```bash
    ./gradlew run
    ```

3. **Access the server:**

   Navigate to `http://127.0.0.1:8080/` in your browser.

## Running Tests

```bash
./gradlew test
```


## GraalVM Native Image

To build a native image:

```bash
./gradlew nativeCompile
```

This creates a native executable located at `app/build/native/nativeCompile/netty-server`.

## Docker Image

To build a Docker image:

```bash
docker build -f build.Dockerfile -t netty-native-sample .
```

To run the built Docker image:

```bash
docker run --rm -i -t -p 8080:8080 netty-native-sample
```


## License

This project is licensed under the Unlicense. See the [LICENSE](LICENSE) file for details.
