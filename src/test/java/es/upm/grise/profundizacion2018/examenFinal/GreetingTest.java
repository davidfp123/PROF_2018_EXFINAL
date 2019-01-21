package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;


public class GreetingTest {

	private MyCalendar mc;
	
	@Before
	public void before(){
		mc = mock(MyCalendar.class);
	}
	
	@Test
	public void smokeTest1() {
		when(mc.getHour()).thenReturn(10);
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(null,mc));
	}
	
	@Test
	public void smokeTest2() {
		when(mc.getHour()).thenReturn(10);
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH,mc));
	}
	
	@Test
	public void smokeTest3() {
		when(mc.getHour()).thenReturn(10);
		Greeting greeting = new Greeting();
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH,mc));
	}

}
