package com.evalieu_api.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class PortfolioApplicationTests {

	@Test
	void contextLoads() {
	}

}
