def call(String repoUrl, String targetDir) {
    sh "git clone ${repoUrl} ${targetDir}"
}
