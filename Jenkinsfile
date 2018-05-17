pipeline {
    agent any
    stages {
        stage ('Initialize') {
               def dockerHome = tool 'docker-latest'
               def mavenHome  = tool 'maven-latest'
               env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
               echo 'Init Step'
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
