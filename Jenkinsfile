pipeline {
    agent none // On ne définit pas d'agent global pour pouvoir choisir par stage
    
    stages {
        stage('Compilation & TU (Agent Linux)') {
            agent { label 'linux' } // Cible ton premier agent
            steps {
                echo 'Lancement des Tests Unitaires sur Linux...'
                sh 'mvn clean compile'
                sh 'mvn test' // Par défaut, Surefire ne lancera que ClientTest et LivreTest (TU)
            }
        }
        
        stage('Tests Fonctionnels (Agent Windows)') {
            agent { label 'windows' } // Cible ton nouvel agent "agent-windows"
            steps {
                echo 'Lancement des Tests Fonctionnels sur l\'agent Windows dockerisé...'
                // On force le test spécifique déplacé dans le nouveau dossier
                sh 'mvn test -Dtest=EmpruntTest'
            }
        }
    }
    
    post {
        always {
            junit '**/target/surefire-reports/*.xml' // Pour avoir les jolis graphiques dans Jenkins
        }
    }
}