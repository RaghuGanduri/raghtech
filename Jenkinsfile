pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
		jdk "Jdk8"
    }

    stages {
        stage('Build') {
            steps {
			    
                // Get some code from a GitHub repository
                git 'https://github.com/sathkaalapp/PandithaAPIs.git'
				git 'checkout origin/otpservice'

				echo "building the project"
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
				
				echo "build completed"
            }
		}

        stage('Deploy') {
            steps {
			    
				echo "build completed"
				bat "mvn spring-boot:run"
            }
        }
    }
}

9848514545
