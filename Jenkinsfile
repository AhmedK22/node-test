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
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
                        sh 'docker build -t ahmedk22/myapp:2.2 .'
                        sh 'docker login -u ahmedk22 -p Ak12345678#'
                        sh 'docker push ahmedk22/myapp:2.2'
                    }
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
