import groovy.transform.Field

def call() {
    def run = {
        stage("Test") {
            sh "ansible --version"
        }
    }

    dockerAgentWrapper {
        stage("Test") {
            sh "ansible --version"
        }
    }
}

