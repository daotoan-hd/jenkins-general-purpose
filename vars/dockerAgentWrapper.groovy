import dev.ops.path.cicd.tool.Ansible
import dev.ops.path.cicd.tool.Git

def call(Closure body) {
    dockerNode(image: 'daotoanhd/devopstools:1.0.0') {
        body()
    }
}
