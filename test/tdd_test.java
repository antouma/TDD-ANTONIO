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
	
	@Test
	public void get_orElsePrimeraOPcion(){
		c.puto("Nombre", "Antonio");
		assertEquals("Antonio", c.getOrelse("Nombre", "0"));
	}
	@Test
	public void get_orElseSegundaOpcion(){
		c.puto("Nombre", "Antonio");
		assertEquals("0", c.getOrelse("Apellido", "0"));
	}
	
	@Test
	public void containKey_devueltoTrue(){
		c.puto("Nombre", "Antonio");
		assertEquals(true, c.containsKey("Nombre"));
	}
	@Test
	public void containKey_devueltoFalse(){
		c.puto("Nombre", "Antonio");
		assertEquals(false, c.containsKey("Apellido"));
	}
	
	
	
}
