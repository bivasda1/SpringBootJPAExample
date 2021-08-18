#Added Line
pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_8_2') {
                    sh 'mvn clean compile'
                }
            }
            steps {
                withMaven(maven : 'maven_3_8_2') {
                    sh 'mvn test'
                }
            }
        }
    }
}
