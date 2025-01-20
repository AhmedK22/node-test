pipeline {
    agent any
   

    stages {
        stage('build') {
            steps {
               script {
                   withCredentials([usernamePassword(credentialsId:'docker-hub-cred',passwordVariable:PWD,usernameVariable:USER)])
                   sh "docker build -t ahmedk22/myapp:2.2 ."
                   sh "echo $PWD | docker login -u $USER --password-stdin"
                   sh "docker push ahmedk22/myapp:2.2"
               }
            }
        }

        stage('test') {
            steps {
                echo 'test stage'
            }
        }

         stage('deploy') {
            steps {
                echo 'deploy stage'
            }
        }
    }
}
