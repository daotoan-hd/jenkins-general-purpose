package dev.ops.path.cicd.tool

class Git {
    def checkoutSCM() {
        checkout scm
    }

    def clone(repo) {
        sh "git clone ${repo}"
    }

    def commit(msg, pattern = ".") {
        add(pattern)
        sh "git commit -m \"${msg}\""
    }

    def add(pattern) {
        sh "git add ${pattern}"
    }

    def getDefaultBranch() {

    }

    def getBranch
}
