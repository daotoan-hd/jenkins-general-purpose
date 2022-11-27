import dev.ops.path.cicd.tool.Ansible
import dev.ops.path.cicd.tool.Git

def call() {
    Git git = new Git()
    Ansible ansible = new Ansible()
}
