import groovy.transform.Field

def call() {

    dockerAgentWrapper {
        this.execute()
    }
}

def execute() {
    return {
        stage("Test") {
            sh "ansible --version"
        }
    }
}
