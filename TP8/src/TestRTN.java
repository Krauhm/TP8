import static org.junit.Assert.*;
import org.junit.Test;

public class TestRTN {
	@Test
	public void testRomanToNumeral() {
		RomanToNumeral TestObject = new RomanToNumeral();
		int Value = TestObject.getNumeral("X");
		assertEquals(Value, 10);
	}

}