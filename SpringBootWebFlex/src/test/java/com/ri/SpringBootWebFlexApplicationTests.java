package com.ri;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootWebFlexApplicationTests {
	@Autowired
	private WebTestClient webtestclient;
	
	@Test
	public void testHelloWorld() {
		webtestclient
		.get().uri("/helloWorld") // GET method and URI
		.accept(MediaType.TEXT_PLAIN) //setting ACCEPT-Content
		.exchange() //gives access to response
		.expectStatus().isOk() //checking if response is OK
		.expectBody(String.class).isEqualTo("Hello World!"); // checking for response type and message
	}
	

	/*
	 * @Test void contextLoads() { }
	 */

}
