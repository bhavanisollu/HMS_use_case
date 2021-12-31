pipeline{
    
    agent any
    tools {
        maven 'MyMaven'
    }
    stages {
        stage('Build Maven') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'Hotel-rooms-service']], userRemoteConfigs: [[url: 'https://github.com/bhavanisollu/HMS_use_case.git']]])
                //checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AlekhyaKaligotla/Hotel-Booking-System.git']]])
                //checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'Hotel-rooms-service']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/bhavanisollu/HMS_use_case.git']]])
            
                bat "mvn -Dmaven.test.failure.ignore=true package"    
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                  bat 'docker build -t bhavani005/HotelRoomService .'
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                 withCredentials([string(credentialsId: 'bhavani005', variable: 'dokerhubcred')]) {
                    bat "docker login -u bhavani005 -p ${dokerhubcred}"
                 }  
                 bat 'docker push bhavani005/HotelRoomService'
                }
            }
        }
        stage('Deploy to kubernetes'){
            steps{
                script{
                     // kubernetesDeploy(configs:"deploymentAndService.yaml" , kubeconfigId : "jenkins-deploy-kubernetes-id")
                    
                    try{
                    //bat 'kubectl create secret generic demo-secret --from-file=.dockerconfigjson=config.json --type kubernetes.io/dockerconfigjson'
                    bat 'kubectl apply -f Deployment-and-Service.yaml'
                    }
                    catch(error){
                   // bat 'kubectl create -f secret.yaml'
                    bat 'kubectl create -f Deployment-and-Service.yaml'
                    }  
                }
            }
        }
    }
}
