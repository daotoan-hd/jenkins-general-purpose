import dev.ops.path.cicd.tool.Ansible
import dev.ops.path.cicd.tool.Git

def call() {

    dockerNode(image: 'jenkins/inbound-agent', remoteFs: '/home/jenkins') {
        stage ("test") {
            sh "pwd"
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
