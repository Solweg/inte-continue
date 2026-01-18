pipeline {
    agent none 
    
    parameters {
        booleanParam(name: 'RUN_FUNCTIONAL_TESTS', defaultValue: true, description: 'Cocher pour lancer les tests fonctionnels sur Windows')
    }

    tools {
        maven 'M3' 
    }
    
    stages {
        stage('Compilation & TU') {
            agent { label 'agent-linux' }
            steps {
                // On compile et on lance les tests unitaires sur Linux
                sh 'mvn clean test'
            }
        }

        stage('Tests Fonctionnels') {
            when {
                expression { params.RUN_FUNCTIONAL_TESTS == true }
            }
            agent { label 'agent-windows' }
            steps {
                // On lance spécifiquement les tests fonctionnels sur Windows
                sh 'mvn test -Dtest=EmpruntTest'
            }
        }
    }
}