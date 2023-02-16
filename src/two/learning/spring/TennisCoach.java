package two.learning.spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
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
	
	private String fileName = 
			"C:/Users/Keboon/eclipse-workspace/spring-demo-annotations/src/randomFortuneData.txt";
	
	
	@Autowired
	public TennisCoach(@Qualifier("jojo") FortuneService theFortuneService)
	{
		System.out.println("TennisCoach >> we are in constructor");
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
	
	// define init method
	
	@PostConstruct
	public void doStartUpStuff()
	{
		System.out.println("Doing some start up stuff for TennisCoach!");
	}
	
	/*
	 * gdybyśmy używali @Scope("prototype") nie możemy wykonać anotacji @PreDestroy
	 * ani wgl metody destroy!!
	 * 
	 * Spring does not manage the complete lifecycle of a prototype bean
	 */
	
	@PreDestroy
	public void doCleanUpStuff()
	{
		System.out.println("Cleaning up the stuff for TennisCoach!");
	}
	
	
	
	
	
	
	
	
	
	
	

}
