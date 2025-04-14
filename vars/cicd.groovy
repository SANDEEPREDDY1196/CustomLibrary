def GitDownload(repo)
{
    git "https://github.com/SANDEEPREDDY1196/${repo}.git"
}
def BuildArtifact()
{
   sh "mvn package"
}

def DeployQAServer(JobName, IPAddress, Context)
{
        sh "scp /var/lib/jenkins/workspace/${JobName}/webapp/target/webapp.war ubuntu@${IPAddress}:/var/lib/tomcat10/webapps/${Context}.war"
}
