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
        bat 'mvn clean install'
    }
}

        stage('Run Tests') {
            steps {
                sh 'mvn test'  // This runs Selenium test scripts
            }
        }
    }
}


