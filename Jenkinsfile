pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/jay-java/AWSDemo.git'
            }
        }
        stage('Build JAR') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t awsdemo:latest .'
            }
        }
        stage('Run Container') {
            steps {
                sh '''
                docker rm -f awsdemo || true
                docker run -d --name awsdemo -p 8081:8080 awsdemo:latest
                '''
            }
        }
    }
}
