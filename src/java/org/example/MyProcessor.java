package org.example;

import org.apache.camel.*;

public class MyProcessor implements Processor {
	private TextProviderService textProviderService;

	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		exchange.getOut().setBody("Processed: " + textProviderService.getText() + " - org: " + body);
	}

	public TextProviderService getTextProviderService(TextProviderService textProviderService) {
		return this.textProviderService;
	}

	public void setTextProviderService(TextProviderService textProviderService) {
		this.textProviderService = textProviderService;
	}
}
