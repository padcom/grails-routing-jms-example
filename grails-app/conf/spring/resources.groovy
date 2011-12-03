// Place your Spring DSL code here
beans = {
	myProcessor(org.example.MyProcessor) {
		textProviderService = ref("textProviderService")
	}
}
