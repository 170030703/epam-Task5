package simplecompoundinterst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InterestTest {
	Interest i;
	@Before
	public void init()
	{
		i=new Interest();
	}

	@Test
	public void test() {
		
		assertEquals(288,i.simpleinterest(0,2,1),0);
		assertEquals(1223.9999771118164,i.compoundinterest(1200,2,1),0);
	}

}
