pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git branch: 'main', url: 'https://github.com/bhaskarbhatt-04/TechM.git'
            }
        }
        
        stage('Build and Test') {
            environment {
                // Define environment variables if needed
                DOCKER_IMAGE_NAME = 'firstimg:latest'
            }
            steps {
                // Build Docker image with application and testing tools
                script {
                    docker.build DOCKER_IMAGE_NAME, '-f Dockerfile .'
                }
                // Run tests using pytest inside Docker container
                script {
                    docker.run("-v $PWD:/app $DOCKER_IMAGE_NAME pytest")
                }
            }
        }
        
        stage('Deploy') {
            steps {
                // Replace with deployment steps if needed
                echo 'Deployment steps go here'
            }
        }
    }
    
    post {
        always {
            // Clean up Docker containers and images after pipeline execution
            cleanWs()
            script {
                docker.image(firstimg).remove(force: true)
            }
        }
    }
}
