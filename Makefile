# Makefile - Run with: make <target>
# .PHONY tells Make these targets don't create files
.PHONY: run build clean test install

# Start Spring Boot application
run:
	cd backend/demo && ./mvnw spring-boot:run

# Build project into JAR file
build:
	cd backend/demo && ./mvnw clean package

# Remove build artifacts
clean:
	cd backend/demo && ./mvnw clean

# Run tests
test:
	cd backend/demo && ./mvnw test

# Build and install to local Maven repository
install:
	cd backend/demo && ./mvnw clean install
~