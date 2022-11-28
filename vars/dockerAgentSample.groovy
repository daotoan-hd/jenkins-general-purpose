import groovy.transform.Field

def call() {
    dockerAgentWrapper {
        run
    }
}

@Field run = {
    stage("Test") {
        sh "ansible --version"
    }
}
