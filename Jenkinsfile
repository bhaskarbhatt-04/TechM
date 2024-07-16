pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/bhaskarbhatt-04/TechM.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build('firstimg:latest', '-f addition/Dockerfile .')
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    // Using bat for Windows
                    docker.image('firstimg:latest').inside {
                        bat 'pytest'
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment steps go here'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
