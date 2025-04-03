pipeline {
    agent any
    tools {
        maven 'mymaven'
    }
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/magesh-jit/simpleautomation.git'
            }
        }

        stage('Build') {
            steps {
                bat '@echo off && "C:\\apache-maven-3.9.9-bin\\apache-maven-3.9.9\\bin\\mvn" clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat '@echo off && "C:\\apache-maven-3.9.9-bin\\apache-maven-3.9.9\\bin\\mvn" test'
            }
        }
    }
}
