package two.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach 
{
	/*
	 * dodajemy metode getDailyFortune razem z prywatnym polem FortuneService oraz
	 * konstruktor z annotacją Autowired która szuka klasy z annotacja Component
	 * ktora implementuje interfejs FortuneService
	 */
	
	/*
	 * Qualifier:
	 * wybiera którego beana mamy użyć z użyciem ID danego beana(ID beana jest
	 * tworzone automatycznie przez Springa zmieniając nazwę klasy tak że pierwsza 
	 * litera jest mała
	 * 
	 * LUB 
	 * 
	 * wybiera którego beana mamy użyć z użyciem nazwy nadanej w nawiasach componentu 
	 * np. @Component("jojo") - robimy tak gdy 2 pierwsze litery klasy są z wielkiej 
	 * litery i wtedy Spring nie tworzy automatycznie ID klasy z pierwsza małą literą
	*/
	
//	@Autowired
//	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("jojo") FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "TennisCoach >> Practise your backhand volley!";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
