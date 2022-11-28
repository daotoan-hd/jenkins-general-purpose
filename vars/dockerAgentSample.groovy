import groovy.transform.Field

def call() {

    dockerAgentWrapper {
        this.execute()
    }
}

def execute() {
    stage("Test") {
        sh "ansible --version"
    }
}
