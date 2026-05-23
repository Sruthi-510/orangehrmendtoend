pipeline {
agent any

tools {
maven 'Maven'
jdk 'JDK21'
allure 'Allure'
}

parameters {
string(name: 'suiteXmlFile', defaultValue: 'testng.xml', description: 'TestNG Suite XML file name')
choice(name: 'browser', choices: ['chrome', 'firefox', 'edge'])
booleanParam(name: 'headless', defaultValue: true)
booleanParam(name: 'incognito', defaultValue: true)
string(name: 'testUrl', defaultValue: 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
}

triggers {
githubPush()
}

stages {
stage('Clean Workspace') {
steps {
cleanWs()
}
}

stage('Checkout Code') {
steps {
git branch: 'main', url: 'https://github.com/Sruthi-510/orangehrmendtoend.git'
}
}

stage('Maven Build & Package') {
steps {
bat 'mvn clean package -DskipTests'
}
}

stage('Docker Image Build') {
steps {
bat 'docker build -t orangehrm-automation-image .'
}
}

stage('Docker Execution') {
steps {
bat 'docker stop running-automation-container || exit 0'
bat 'docker rm running-automation-container || exit 0'
bat 'docker run --name running-automation-container orangehrm-automation-image'
}
}
}

post {
always {
echo 'Execution Completed'
junit 'target/surefire-reports/*.xml'
allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
}
success {
echo 'All Clear'
}
}
}