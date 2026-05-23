
# Step 1: Use an official pre-configured image with Maven and JDK 21
FROM maven:3.9.6-eclipse-temurin-21

# Step 2: Create an application workspace folder inside the container
WORKDIR /app

# Step 3: Copy your pom.xml and entire Eclipse source code into the container
COPY . /app

# Step 4: The command that automatically fires up your TestNG execution suite
CMD mvn test -DsuiteXmlFile=$SUITE_XML
