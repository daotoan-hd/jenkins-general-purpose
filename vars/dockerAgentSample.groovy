import groovy.transform.Field

def call() {

    def body = { this.execute() }

    dockerAgentWrapper {
        body
    }
}

def execute() {
    stage("Test") {
        sh "ansible --version"
    }
}
