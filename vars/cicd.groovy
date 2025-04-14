def GitDownload(repo)
{
    git "https://github.com/SANDEEPREDDY1196/${rep}.git"
}
def BuildArtifact()
{
   sh "mvn package"
}
