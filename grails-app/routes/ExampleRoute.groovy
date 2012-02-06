import org.apache.camel.builder.RouteBuilder

class ExampleRoute extends RouteBuilder {
	def grailsApplication

    @Override
    void configure() {
    	println grailsApplication?.config

        // example:
        // from('seda:input').to('stream:out')
        from('activemq:example').processRef("myProcessor").process { it.out.body = it.in.body + " =2=" }.to('bean:exampleService?method=receive')
    }
}
