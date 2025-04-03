pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/magesh-jit/simpleautomation.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'  // If using Maven
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn test'  // This runs Selenium test scripts
            }
        }
    }
}
