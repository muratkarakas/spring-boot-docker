pipeline {
    agent any
    stages {
        stage ('Initialize') {
            steps {
               echo 'Init Step'
            }
        }

        stage ('Build') {
            steps {
	              sh  'mvn install  -Dmaven.test.failure.ignore=false' 
			}
        }

        stage ('Docker Build') {
            steps {
               echo 'Docker Build Step'
            }
        }
        stage ('Deploy') {
           steps {
               echo 'Deploy Step'
           }
        }
    }
}
