package homniserv.moueza.mvntest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
class AppTest {

	@Test
	void testAdd() {
		// App app = new App();
		// Integer res = app.add(1, 2);
		// assertSame(3, res);
		// assertTrue(3 == res);
		assertEquals(2, 1 + 1);/** https://junit.org/junit5/docs/current/user-guide/#dependency-diagram */
	}

}
