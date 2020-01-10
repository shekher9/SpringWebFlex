package com.ri.component;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class HelloWorldRouter {
	@Bean
	public RouterFunction<ServerResponse> routerFunction(HelloWorldHandler helloworldHandler){
		
		return RouterFunctions.route(RequestPredicates.GET("/helloWorld").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),helloworldHandler::helloWorld);
	}

}
