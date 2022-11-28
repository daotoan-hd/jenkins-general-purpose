def call() {
    dockerAgentWrapper(this)
}

def run() {
    stage("Test") {
        sh "ansible --version"
    }
}
