pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'build app'
            }
        }
        stage('test') {
            steps {
                echo 'test app'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy app'
            }
        }
    }
    post {
        always {
            emailext body: 'pipeline de validation', subject: 'Pipeline Status', to: 'bendhaferanwar@gmail.com'
        }
    }
        
    
    
}
