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
                    dir('Selenium') {  // Change directory to 'project' where pom.xml is located
                        bat '"C:\apache-maven-3.9.9-bin\apache-maven-3.9.9" clean install'
                    }
                }
            }
        }
    }
}
