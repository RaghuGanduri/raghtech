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
			    echo "Getting code from git"
                // Get some code from a GitHub repository
                git 'https://github.com/RaghuGanduri/raghtech.git'

				echo "building the project"
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
				echo "making jar file"
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
