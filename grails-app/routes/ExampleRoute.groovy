class ExampleRoute {
    def configure = {
        // example:
        // from('seda:input').to('stream:out')
        from('activemq:example').processRef("myProcessor").to('bean:exampleService?method=receive')
    }
}
