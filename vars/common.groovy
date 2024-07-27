def call(String stageName){

  if("${stageName}" == "Build") {
    echo "Building the package"
    sh "mvn package"
    echo "Building Done"
  }
  else if("${stageName}" == "Test") {
    echo "Testing with SonarQube"
    sh "mvn sonar:sonar"
    echo "Test Done"
  }
  else if("${stageName}" == "Deploy") {
    echo "Deploying to Nexus"
    sh "mvn deploy"
    echo "Deployment successful"
  }
}
