def call(){
	sh nexusArtifactUploader artifacts: [[artifactId: 'my-web-app', classifier: '', file: 'target/my-web-app.war', type: 'war']], credentialsId: 'nexus-credentials', groupId: 'in.kishan', nexusUrl: '65.2.128.242:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'maven-snapshots', version: '1.1-SNAPSHOT'
}
