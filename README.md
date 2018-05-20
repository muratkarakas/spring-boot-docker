# spring-boot-docker
Simple spring boot application with docker<br />
run dockerRun.sh <br />
install buttler to your local machine => http://www.blog.labouardy.com/butler-cli-import-export-jenkins-plugins-jobs/<br />
import jenkins plugins after jenkins init => butler plugins import --server localhost:8090 --username admin --password password<br />
configure jenkins docker setup (http://localhost:8090/configureTools/)  Global Tool Configuration => docker-latest<br />
configure jenkins maven setup  (http://localhost:8090/configureTools/)  Global Tool Configuration  => maven-latest<br />
import pipeline job =>  butler jobs import --server localhost:8090 --username admin --password password<br />