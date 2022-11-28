def call() {
    dockerAgentWrapper(run)
}

def run() {
    stage("Test") {
        sh "ansible --version"
    }
}
