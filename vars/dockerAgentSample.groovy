import groovy.transform.Field

def call() {

    def body = { this.run() }

    dockerAgentWrapper {
        body
    }
}

def run() {
    stage("Test") {
        sh "ansible --version"
    }
}
