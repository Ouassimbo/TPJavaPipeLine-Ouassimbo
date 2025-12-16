pipeline {
    agent {
        docker {
            image 'my-maven-git:latest'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    
    stages {
        stage('Checkout') {
            steps {
                echo '========================================='
                echo '     ÉTAPE 1 : Récupération du code     '
                echo '========================================='
                sh "rm -rf *"
                
                echo 'Clonage du dépôt GitHub...'
                sh "git clone https://github.com/Ouassimbo/TPJavaPipeLine-Ouassimbo.git"
                
                echo '✅ Code récupéré avec succès !'
            }
        }
        
        stage('Build') {
            steps {
                echo '========================================='
                echo '    ÉTAPE 2 : Compilation et Tests      '
                echo '========================================='
                script {
                    def currentDir = pwd()
                    echo "Répertoire actuel : ${currentDir}"
                    
                    dir('TPJavaPipeLine-Ouassimbo/maven') {
                        echo '🔨 Compilation Maven en cours...'
                        sh 'mvn clean test package'
                        
                        echo ''
                        echo '========================================='
                        echo '    ÉTAPE 3 : Exécution de l\'application'
                        echo '========================================='
                        sh "java -jar target/maven-0.0.1-SNAPSHOT.jar"
                    }
                }
            }
        }
    }
    
    post {
        success {
            echo ''
            echo '========================================='
            echo '✅  PIPELINE TERMINÉ AVEC SUCCÈS !  ✅'
            echo '========================================='
        }
        failure {
            echo ''
            echo '========================================='
            echo '❌      LE PIPELINE A ÉCHOUÉ !      ❌'
            echo '========================================='
        }
    }
}