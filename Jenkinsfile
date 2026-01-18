pipeline {
    agent none
    
    tools {
        maven 'M3' 
    }
    
   stage('Tests Fonctionnels') {
    // Cette condition vérifie si le paramètre est vrai
    when {
        expression { params.RUN_FUNCTIONAL_TESTS == true }
    }
    agent { label 'agent-windows' }
    steps {
        sh 'mvn test -Dtest=EmpruntTest'
    }
}
}