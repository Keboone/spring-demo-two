package practice.two.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import two.learning.spring.Coach;
import two.learning.spring.FortuneService;

//@Component
public class GolfCoach implements Coach 
{
	
//	@Autowired
//	@Qualifier("idkFortuneService")
	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Do some golf club swings!";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
