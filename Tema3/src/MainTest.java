import org.junit.Assert;

import org.junit.jupiter.api.Test;

//import junit.framework.Assert;


class MainTest {
	@Test
	public void testConcatenate() {
		Persoana persoana1 = new Persoana("ELENA", "zoitanu", 35, "Cluj", false);
		Assert.assertEquals("elena_ZOITANU", persoana1.obtineIdentificator());
	}

}
