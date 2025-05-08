def call(string ProjectName,string Imagetag, string DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${Imagetag} ."
}
