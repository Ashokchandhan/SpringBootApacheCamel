package com.app.router;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFilesRouter extends RouteBuilder {

	public void configure() throws Exception{
		from("file:D:\\source")
		.to("file:D:\\desti ");
	}
}
