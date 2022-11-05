pipeline{
    agent {
        docker {
            image 'maven:3.6.3'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo "this is build.\n";
                sh 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                echo "Test";
            }
        }
    }
}