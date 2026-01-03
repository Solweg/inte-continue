pipeline {
    agent none
    // Ajoute cette section pour que Jenkins trouve Maven
    tools {
        maven 'maven-3' // Remplace 'maven-3' par le nom configuré dans Jenkins -> Global Tool Configuration
    }
    stages {
        stage('Compilation & TU') {
            agent { label 'agent-linux' }
            steps {
                sh 'mvn clean test' 
            }
        }
        stage('Tests Fonctionnels (Windows)') {
            agent { label 'agent-windows' }
            steps {
                bat 'mvn test -Dtest=EmpruntTest'
            }
        }
    }
}