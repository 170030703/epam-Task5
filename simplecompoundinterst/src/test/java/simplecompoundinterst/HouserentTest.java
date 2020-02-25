package simplecompoundinterst;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouserentTest {

	@Test
	public void testConstructioncost() {
		Houserent h=new Houserent();
		assertEquals(18001.00,h.constructioncost("standard",0),0);
	}

}
