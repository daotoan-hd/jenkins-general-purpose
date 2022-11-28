import groovy.transform.Field

def call() {
    def run = {
        stage("Test") {
            sh "ansible --version"
        }
    }

    dockerAgentWrapper {
        run
    }
}

