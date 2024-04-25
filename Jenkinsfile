pipeline {
    agent any 

    tools {
        maven 'maven3.9.6'
    }


    stages {

        
        stage('Build and test'){
            steps{
                sh 'mvn -B clean package'
            }
        }

        stage('Artifact') {
            steps {
                archiveArtifacts artifacts: "./target/*.jar", onlyIfSuccessful: yes
            }
        }
        stage('SonarQube Analysis'){
            steps {
                withSonarQubeEnv('mysonar') {
                 sh 'mvn sonar:sonar'
                }
            }
        }
    }
}

