# Step 1: Build on top of a lightweight Java 17 runtime
FROM openjdk:17-jdk-slim

# Step 2: Create a workspace folder inside the virtual container
WORKDIR /app

# Step 3: Copy the compiled .jar file from your local target folder into the container
COPY target/*.jar app.jar

# Step 4: Run the Java application
CMD ["java", "-jar", "app.jar"]