node {
  stage('Checkout') {
        checkout scm
  }

  stage('Build') {
        sh "./gradlew clean assemble"
  }

  stage('Check') {
        sh "./gradlew detekt check ktlintCheck"
  }

  stage('Report') {
        androidLint canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/lint-results.xml', unHealthy: '', unstableTotalAll: '0'
        step([$class: 'CheckStylePublisher', canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/reports/**/detekt.xml', unHealthy: '', unstableTotalAll: '0'])
        step([$class: 'CheckStylePublisher', canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/reports/**/ktlint*.xml', unHealthy: '', unstableTotalAll: '0'])
  }
}
