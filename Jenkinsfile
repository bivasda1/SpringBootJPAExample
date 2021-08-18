pipeline {
    agent any

    stages {
        stage ('Build') {

            steps {
                steps {
                sh 'mvn -B -DskipTests clean package' 
                      }
                  }
          }
    }
}
