def call(String ProjectName,String Imagetag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${Imagetag} ."
}
