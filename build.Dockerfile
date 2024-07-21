# 1. Build the application
FROM gradle:jdk21-graal AS builder

WORKDIR /app-build
COPY . .
RUN gradle --no-daemon --console=plain check nativeBuild


# 2. Package the application
FROM ubuntu:jammy

WORKDIR /app
COPY --from=builder --chown=1001 /app-build/app/build/native/nativeCompile/netty-server /app/netty-server

EXPOSE 8080
USER 1001

CMD "/app/netty-server"
