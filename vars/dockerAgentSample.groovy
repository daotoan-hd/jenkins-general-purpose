import dev.ops.path.cicd.tool.Ansible
import dev.ops.path.cicd.tool.Git

def call() {

    dockerNode(image: 'daotoanhd/devopstools:1.0.0') {
        stage ("test") {
            sh "pwd"
            sh "ansible --version"
        }
        stage ("test") {
            sh "pwd"
        }
        stage ("test") {
            sh "pwd"
        }
        stage ("test") {
            sh "pwd"
        }
    }


}
