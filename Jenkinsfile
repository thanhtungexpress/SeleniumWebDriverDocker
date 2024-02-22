pipeline {
    agent any
    tools{
    maven '3.9.6'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    // Clone your Selenium project from your version control system (e.g., Git)
                    checkout scm
                    // Maven build
                    sh 'mvn clean test'
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    // Run Selenium tests using TestNG
                    sh 'mvn test'
                }
            }
        }
    }
}
