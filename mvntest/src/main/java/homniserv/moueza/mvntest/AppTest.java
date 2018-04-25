package homniserv.moueza.mvntest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		App app = new App();
		Integer res = app.add(1, 2);
		assertSame(3, res);
		assertTrue(3 == res);
	}

}
