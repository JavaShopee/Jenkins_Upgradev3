job('test-first-maven-project-via-dsl') {
    description("First Maven Project Generated by DSL on ${new Date()}")
    scm {
        git("https://github.com/JavaShopee/Jenkins_Upgradev3.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}
