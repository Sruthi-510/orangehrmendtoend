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
string(name: 'testUrl', defaultValue: 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login', description: 'OrangeHRM Application URL')
}

stages {

stage('Clean Workspace') {
steps {
cleanWs()
}
}

stage('Checkout Code') {
steps {
// Pulls code directly from your OrangeHRM repository's main branch
git branch: 'main', url: 'https://github.com/Sruthi-510/orangehrmendtoend.git';
}
}

stage('Build Project') {
steps {
bat 'mvn clean compile'
}
}

stage('Execute UI Tests') {
steps {
// Single line batch execution prevents Groovy compilation and Sandbox errors
bat "mvn test -DsuiteXmlFile=${params.suiteXmlFile} -Dbrowser=${params.browser} -Dheadless=${params.headless} -Dincognito=${params.incognito} -DtestUrl=${params.testUrl}"
}
}

stage('Archive Reports') {
steps {
archiveArtifacts artifacts: 'target/**/*', fingerprint: true
}
}
}

post {
always {
echo 'Execution Completed'

// Generates standard test trend charts in Jenkins
junit 'target/surefire-reports/*.xml'

// Attaches Allure reports to your build dashboard
allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
}
success {
echo 'All OrangeHRM Automation Tests Passed!'
}
failure {
echo 'Some Automation Tests Failed.'
}
}
}
