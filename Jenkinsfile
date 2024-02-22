pipeline {
    agent any
    tools{
    maven '3.9.6'
    }
    stages {
        stage('Build and Test') {
            steps {
                script {
                    // Clone your Selenium project from Git
                    checkout scm
                    // Maven build and test
                    //sh 'mvn clean test'
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
