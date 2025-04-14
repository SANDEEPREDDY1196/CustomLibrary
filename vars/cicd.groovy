def GitDownload(repo)
{
    git "https://github.com/SANDEEPREDDY1196/${repo}.git"
}
def BuildArtifact()
{
   sh "mvn package"
}
