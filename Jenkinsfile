node {
        stage ('Initialize') {
               def dockerHome = tool 'docker-latest'
               def mavenHome  = tool 'maven-latest'
               env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
        }

        stage ('Build') {
	           sh  'mvn install  -Dmaven.test.failure.ignore=true' 
               archiveArtifacts "target/**/*"
               junit 'target/surefire-reports/*.xml'
        }

        stage ('Docker Build') {
               sh 'mvn package docker:build'
        }
        stage ('Deploy') {
               echo 'Deploy Step'
        }
   
}
