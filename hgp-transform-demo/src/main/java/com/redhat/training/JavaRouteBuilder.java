package com.redhat.training;

import org.apache.camel.builder.RouteBuilder;

public class JavaRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:in?noop=true")
		.transform(body().regexReplaceAll(",", ";"))
		.to("file:out");

	}

}
