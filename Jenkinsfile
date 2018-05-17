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
               sh 'docker images'
        }
        stage ('Deploy') {
               echo 'Deploy Step'
        }
   
}
