pipeline {
    agent any

    stages {
        stage('Verify Project Location') {
            steps {
                sh 'pwd'
                sh 'ls -la'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Run Packaged JAR') {
            steps {
                sh 'java -jar target/assignment2-build-demo-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }

        success {
            echo 'Jenkins CI build completed successfully.'
        }

        failure {
            echo 'Jenkins CI build failed. Review the console output.'
        }
    }
}
