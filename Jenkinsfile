pipeline {
    agent none
    stages {
        stage('Compilation & TU') {
            agent { label 'agent-linux' }
            steps {
                // Exécute uniquement les tests dans src/test/java
                sh 'mvn clean test' 
            }
        }
        stage('Tests Fonctionnels (Windows)') {
            agent { label 'agent-windows' }
            steps {
                // Exécute spécifiquement le test fonctionnel sur Windows
                bat 'mvn test -Dtest=EmpruntTest'
            }
        }
    }
}