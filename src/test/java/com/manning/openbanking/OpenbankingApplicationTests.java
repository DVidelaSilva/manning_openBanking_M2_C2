package com.manning.openbanking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class OpenbankingApplicationTests {

	@Test
	void contextLoads() {
	}
}
