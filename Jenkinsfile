pipeline {
    agent none
    
    tools {
        // On utilise le nom "M3" que l'on voit sur ta capture d'écran
        maven 'M3' 
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
                // Sur Windows, on utilise "bat" au lieu de "sh"
                bat 'mvn test -Dtest=EmpruntTest'
            }
        }
    }
}