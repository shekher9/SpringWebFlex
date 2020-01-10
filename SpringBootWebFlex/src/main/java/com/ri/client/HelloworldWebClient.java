package com.ri.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class HelloworldWebClient {

	public static void main(String[] args) {
		WebClient client=WebClient.create("http://localhost:4023");
		
		Mono<ClientResponse> response=client.get().uri("/helloWorld").accept(MediaType.TEXT_PLAIN).exchange();
		System.out.println("Result = " + response.flatMap(res -> res.bodyToMono(String.class)).block());

	}

}
