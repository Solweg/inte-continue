pipeline {
    agent none
    
    tools {
        maven 'M3' 
    }
    
    stages {
        stage('Compilation & TU') {
            agent { label 'agent-linux' }
            steps {
                sh 'mvn clean test' 
            }
        }
        stage('Tests Fonctionnels') {
            agent { label 'agent-windows' }
            steps {
                // On utilise 'sh' car ton PC est sous Linux
                sh 'mvn test -Dtest=EmpruntTest'
            }
        }
    }
}