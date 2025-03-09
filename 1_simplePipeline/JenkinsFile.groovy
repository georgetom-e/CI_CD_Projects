pipeline {
    
     agent {
    docker { image 'python:3.14.0a5-bookworm' }
  }

    stages {
        stage('Stage_1') {
            steps {
                echo 'Pipeline has begun'
            }
        }
        
        stage('Stage_2_CheckPython') {
            steps {
                  sh 'python --version'
            }
        }

        stage('Stage_3_Print100') {
    steps {
        sh '''
        python -c "for i in range(1, 101): print(i)"
        '''
    }
}

        }
    }

