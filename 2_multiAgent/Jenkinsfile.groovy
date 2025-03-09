pipeline {
    agent none
    stages {
        stage('Agent_1_Python_Image') {
            agent {
                docker { image 'python:3.14.0a5-bookworm' }
            }
            steps {
                echo 'python --version'
                echo 'python print("Hello World!")'
            }
        }

        stage('Agent_2_Node_Image') {
            agent {
                docker { image 'node:16-alpine' }
            }
            steps {
                sh 'node --version'
            }
        }

        stage('Agent_3_MySQL_Image') {
            agent {
                docker { image 'mysql:latest' }
            }
            steps {
                sh 'SELECT NOW();'
            }
        }
    }
}
