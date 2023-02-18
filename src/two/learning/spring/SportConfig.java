package two.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("two.learning.spring")
public class SportConfig 
{
	// define bean for our sad fortune service 
	// >> poprzez interfejs jako zwracany typ obiektu i ID klasy
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	// define bean for a SwimCoach >> poprzez interfejs jako zwracany typ obiektu i ID klasy
	// AND inject dependency - czyli wrzucami zależności poprzez ID sadFortuneService()
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService()); 
		// to samo ID co w Beanie definiujacym FortuneService ktore chcemy uzyc
	}
	
	
	
	
}
