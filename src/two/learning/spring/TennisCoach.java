package two.learning.spring;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach 
{

	@Override
	public String getDailyWorkout() 
	{
		return "Practise your backhand volley!";
	}

}
