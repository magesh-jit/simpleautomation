pipeline {
    agent any  // Runs on any available agent

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/magesh-jit/simpleautomation.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Post Build') {
            steps {
                echo 'Tests completed successfully!'
            }
        }
    }
}
