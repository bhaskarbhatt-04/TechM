pipeline {
    agent any
    
    stages {
        stage('Pull Source Code') {
            steps {
                // Checkout source code from Git
                git 'https://github.com/bhaskarbhatt-04/TechM.git'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                // Build Docker image
                script {
                    docker.withRegistry('https://docker.io', 'docker-hub-credentials') {
                        def customImage = docker.build('divide-app-image:latest', '.Dockerfile')
                        customImage.push()
                    }
                }
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline successfully completed!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
