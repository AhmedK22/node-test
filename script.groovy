def deployApp()
{
   echo 'Hi my bro1'
   withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
                        sh 'docker build -t ahmedk22/myapp:2.2 .'
                        sh 'docker login -u ahmedk22 -p Ak12345678#'
                        sh 'docker push ahmedk22/myapp:2.2'
                    }
}

def buildApp()
{
  echo 'Hi my bro2'
}

return this
