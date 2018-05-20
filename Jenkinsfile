node {
        stage ('Initialize') {
               def dockerHome = tool 'docker-latest'
               def mavenHome  = tool 'maven-latest'
               env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
               env.DOCKER_HOST = "unix:///var/run/docker.sock"
        }

        stage('Checkout') {
               checkout scm
        }

        stage ('Build and Run Tests') {
	       sh  'mvn install allure:report sonar:sonar  -Dmaven.test.failure.ignore=true' 
           archiveArtifacts "target/**/*"
           junit 'target/surefire-reports/*.xml'
           allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
        
        stage('Check Results'){
            echo currentBuild.result
        }

        

        stage ('Docker Build') {
               sh 'mvn docker:build -Dmaven.test.skip=true'
        }
        stage ('Deploy') {
               echo 'Deploy Step'
        }
   
}
