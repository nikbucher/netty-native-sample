package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {
	@Test
	void appHasAGreeting() {
		var sut = new App();
		assertThat(sut.getGreeting()).as("app should have a greeting").isNotNull();
	}
}
