pipeline {
    agent any 

    tools {
        maven 'maven3.9.6'
    }


    stages {
        
        stage('Scan'){
            steps {
                withSonarQubeEnv('mysonar') {
                    sh 'mvn clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
                }
            }
        }
        stage('Quality gate'){
            steps {
                waitForQualityGate abortPipeline: true
            }
        }



    }
}

