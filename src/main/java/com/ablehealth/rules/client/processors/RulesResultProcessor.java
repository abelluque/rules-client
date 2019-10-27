package com.ablehealth.rules.client.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RulesResultProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		exchange.getOut().setBody(exchange.getIn().getBody());
	}

}
