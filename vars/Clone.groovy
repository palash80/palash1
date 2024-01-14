

def call(String repoUrl = 'https://github.com/palash80/palash1.git', String targetDir = 'default-target-dir') {
    if (!repoUrl || !targetDir) {
        error("Repository URL and target directory are required.")
    }

    try {
        sh("git clone ${repoUrl} ${targetDir}")
    } catch (Exception e) {
        error("Failed to clone repository: ${e.message}")
    }
}
