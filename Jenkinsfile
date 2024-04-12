pipeline {
    agent any
    stages {
        stage ('Jenkins Company') {
            steps {
                echo 'Company interface'
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}