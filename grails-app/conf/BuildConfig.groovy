grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }

    plugins {
//        runtime ':routing:1.1.4-SNAPSHOT'
//        runtime ':routing-jms:1.1.4-SNAPSHOT'
        runtime ':hibernate:2.0.0.RC3'
        runtime ':tomcat:2.0.0.RC3'
    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.13'
    }
}

def setupPluginLocation(String plugin) {
	[ "../../grails-${plugin}/workspace", "../grails-${plugin}"	].each { location ->
		if (new File(location).exists()) {
			println "Using ${location} for ${plugin} plugin source"
			grails.plugin.location."${plugin}" = location
		}
	}
}

setupPluginLocation('routing')
setupPluginLocation('routing-jms')
