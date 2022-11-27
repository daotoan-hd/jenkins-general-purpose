package dev.ops.path.cicd.tool


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

def getDefaultBranch(origin = "origin") {
    return sh(
        script: "git remote show ${origin} | grep 'HEAD branch' | cut -d' ' -f5",
        returnStdout: true).toString().trim()
}

def getCurrentBranch() {
    return sh(
        script: "git branch --show-current",
        returnStdout: true).toString().trim()
}

def getAllBranch() {
    return sh(
        script: "git branch",
        returnStdout: true
    ).split("\n")
}

def push(origin = "origin", branch = null) {
    if (!branch) {
        branch = getCurrentBranch()
    }
    sh "git push -u ${origin} ${branch}"
}

def switchBranch(branch) {
    sh "git switch ${branch}"
}

def switchCreateBranch(branch) {
    sh "git switch -c ${branch}"
}

