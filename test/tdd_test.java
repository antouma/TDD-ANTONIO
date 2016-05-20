import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class tdd_test {
	private tdd c;
	
	
	@Before
	public void setUp(){
		c = new tdd();
	}
	
	@Test
	public void put_normal(){
		c.puto("Nombre", "Antonio");
		assertEquals("Antonio" , c.geto("Nombre"));
	}
	@Test
	public void put_teniaValoryLoReemplazo(){
		c.puto("Nombre", "Antonio");
		c.puto("Nombre","Felipe");
		assertEquals("Felipe" , c.geto("Nombre"));
	}
	@Test
	public void get_normal(){
		c.puto("Nombre", "Antonio");
		assertEquals("Antonio" , c.geto("Nombre"));
	}
	@Test(expected = NegativeKey.class)
	public void addClaveDevuelveExcepcion(){
		c.puto("Nombre", "Juan");
		c.geto("Apellido");
	
	}
}
