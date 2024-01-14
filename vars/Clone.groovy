def call(String repoUrl, String targetDir) {
    if (!repoUrl || !targetDir) {
        error("Repository URL and target directory are required.")
    }

    try {
        sh("git clone ${repoUrl} ${targetDir}")
    } catch (Exception e) {
        error("Failed to clone repository: ${e.message}")
    }
}
