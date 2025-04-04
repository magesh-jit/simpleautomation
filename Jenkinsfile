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
                    dir('Selenium') {
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

        stage('Publish JUnit Results') {
            steps {
                junit 'Selenium/target/surefire-reports/*.xml'
            }
        }

        //stage('Publish TestNG Report') {
            //steps {
            //    publishTestNGResults testResultsPattern: 'Selenium/test-output/testng-results.xml'
           // }
        //}

        // ✅ New stage added below to archive the report
        stage('Archive TestNG HTML Report') {
            steps {
                archiveArtifacts artifacts: 'Selenium/test-output/**/*.*', fingerprint: true
            }
        }
    }
}
