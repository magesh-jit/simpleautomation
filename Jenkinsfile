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
                script {
                    dir('Selenium') {  // Ensure this is the correct directory where pom.xml is located
                        bat '"C:\\apache-maven-3.9.9-bin\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    }
                }
            }
        }
        stage('Run Tests') {
            steps {
                script {
                    dir('Selenium') {
                        bat '"C:\\apache-maven-3.9.9-bin\\apache-maven-3.9.9\\bin\\mvn" test'
                    }
                }
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml' // Publish TestNG results
            }
        }
    }
}
