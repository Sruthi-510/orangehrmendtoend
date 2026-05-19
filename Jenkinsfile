pipeline {
agent any

parameters {
choice(name: 'ENV', choices: ['QA', 'Staging', 'Production'], description: 'Select the environment to deploy to')
booleanParam(name: 'RUN_SONAR', defaultValue: false, description: 'Check to run SonarQube Code Analysis')
}

environment {
// Define global variables here if needed
APP_NAME = 'my-awesome-app'
}

stages {
stage('Fetch Code') {
steps {
echo "Fetching latest code for ${env.APP_NAME}..."
}
}

stage('Build') {
steps {
echo 'Building application...'
// If using Maven: sh 'mvn clean package -DskipTests'
// If using NodeJS: sh 'npm install && npm run build'
sh 'echo "Build step completed successfully"'
}
}

stage('Unit Tests') {
steps {
echo 'Running Unit Tests...'
// If using Maven: sh 'mvn test'
// If using NodeJS: sh 'npm test'
sh 'echo "Tests passed!"'
}
}

stage('Code Analysis') {
when {
expression { return params.RUN_SONAR }
}
steps {
echo 'Running SonarQube Analysis...'
// sh 'mvn sonar:sonar'
}
}

stage('Deploy') {
steps {
echo "Deploying ${env.APP_NAME} to the ${params.ENV} environment..."
// Add your deployment commands/scripts here
}
}
}

post {
always {
echo 'Cleaning up workspace...'
}
success {
echo 'Pipeline executed perfectly!'
}
failure {
echo 'Pipeline failed. Sending alert notification...'
}
}
}