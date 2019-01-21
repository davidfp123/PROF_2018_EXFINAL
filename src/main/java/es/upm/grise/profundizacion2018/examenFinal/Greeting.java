package es.upm.grise.profundizacion2018.examenFinal;

//import java.util.Calendar;

public class Greeting {
	
	public String getGreeting( Language language,MyCalendar mc ) {
		// Get current hour
		int hour = mc.getHour();
		
		// Find out the greeting language
		if ( language == null )
			language = Message.getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		System.out.println(hour);
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		return Message.getMessage( moment, language );
	}

}
