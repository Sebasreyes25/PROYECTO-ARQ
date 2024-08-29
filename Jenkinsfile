node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=Sebasreyes25_PROYECTO-ARQ_AZGbWDf3MTMJDWtiM_pe"
    }
  }
}