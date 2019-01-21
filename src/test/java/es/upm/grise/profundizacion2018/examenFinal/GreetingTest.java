package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class GreetingTest {

	private MyCalendar mc;
	private Message msg;

	@Before
	public void before(){
		mc = mock(MyCalendar.class);
		msg = mock(Message.class);	
	}
	
	@Test
	public void smokeTest1() {
		when(msg.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		when(msg.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");
		when(mc.getHour()).thenReturn(10);
		Greeting gt = new Greeting();
		assertEquals("Good morning", gt.getGreeting(null,mc,msg));
	}
	
	@Test
	public void smokeTest2() {
		when(msg.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		when(msg.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");
		when(mc.getHour()).thenReturn(10);
		Greeting gt = new Greeting();
		assertEquals("Good morning", gt.getGreeting(Language.ENGLISH,mc,msg));
	}
	
	@Test
	public void smokeTest3() {
		when(msg.getMessage(TimeOfTheDay.MORNING, Language.SPANISH)).thenReturn("Buenos días");
		when(mc.getHour()).thenReturn(10);
		Greeting gt = new Greeting();
		gt.getGreeting(null,mc,msg);
		assertEquals("Buenos días", gt.getGreeting(Language.SPANISH,mc,msg));
	}
	
	@Test
	public void smokeTest4(){
		when(mc.getHour()).thenReturn(10);
		when(msg.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		Greeting gt = new Greeting();	
		gt.getGreeting(null, mc, msg);
		verify(msg, times(1)).getDefaultLanguage();
		verify(msg, times(1)).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
		
	}
	
	@Test
	public void smokeTest5() {
		when(mc.getHour()).thenReturn(10);
		Greeting gt = new Greeting();
		gt.getGreeting(Language.ENGLISH,mc,msg);
		verify(msg, times(0)).getDefaultLanguage();
		verify(msg, times(1)).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
	}
}
