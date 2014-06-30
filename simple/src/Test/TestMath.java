package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.main.SimpleMath;

public class TestMath {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(SimpleMath.cube(3.0),9.0);
		
	}

}
