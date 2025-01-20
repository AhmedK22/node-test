def gv
pipeline {
    agent any

    stages {
        stage('init') {
            steps{
                script{
                    gv = load "script.groovy" 
                }
            }
        }
        stage('build') {
            steps {
                script {
                   gv.deployApp()
                }
            }
        }

        stage('test') {
            steps {
                echo 'Test stage'
            }
        }

        stage('deploy') {
            steps {
                echo 'Deploy stage'
            }
        }
    }
}
