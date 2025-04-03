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
                bat '"C:\\Program Files\\Apache\\maven\\bin\\mvn" clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat '"C:\\Program Files\\Apache\\maven\\bin\\mvn" test'  // Use bat instead of sh for Windows
            }
        }
    }
}
