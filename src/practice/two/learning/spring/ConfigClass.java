package practice.two.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import two.learning.spring.Coach;
import two.learning.spring.FortuneService;

@Configuration
//@ComponentScan("practice.two.learning.spring")
public class ConfigClass 
{
	@Bean
	public FortuneService idkFortuneService()
	{
		return new IdkFortuneService();
	}
	
	@Bean
	public Coach golfCoach()
	{
		GolfCoach myGolfCoach = new GolfCoach(idkFortuneService());
		return myGolfCoach;
	}
	
}
