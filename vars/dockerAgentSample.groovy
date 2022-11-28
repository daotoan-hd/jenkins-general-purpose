def call() {
    new dockerAgentWrapper(run())
}

def run() {
    stage("Test") {
        sh "ansible --version"
    }
}
