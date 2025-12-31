pipeline {
    agent { label 'agent-linux' }
    stages {
        stage('Compilation') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Tests Unitaires') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
