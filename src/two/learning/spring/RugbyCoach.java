package two.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class RugbyCoach implements Coach
{
	/*
	 * dodajemy pole z prywatne pole FortuneService oraz defaultowy konstruktor 
	 * oraz metode setFortuneSevices z anotacja Autowired
	 * ktora szuka klasy z anotacja Component ktora implementuje interfejs
	 * FortuneService 
	 * 
	 * LUB
	 * 
	 * dodajemy pole z prywatne pole FortuneService z anotacja Autowired 
	 * które z pomocą technologi reflection szuka klasy 
	 * z anotacja Component, ktora implementuje interfejs Autowired 
	 * oraz dodajemy defaultowy konstruktor 
	 * 
	 */
	
//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// inject properties from the file
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// create default constructor
	
	public RugbyCoach() 
	{
		System.out.println("RugbyCoach: we are in RugbyCoach default construtor");
	}
	
	// create setter method with Autowired annotation
	
	@Autowired
	@Qualifier("fileRandomFortuneService")
	public void setFortuneService(FortuneService thefortuneService)
	{
		System.out.println("RugbyCoach: we are in RugbyCoach setter method");
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "RugbyCoach >> Practise touch down or whatever!";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
	
	// gettery i settery dla email i team
	
	public String getEmail() {
		return "Email: " + email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return "Team: " + team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
