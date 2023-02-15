package two.learning.spring;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach
{

	@Override
	public String getDailyWorkout()
	{
		return "Practise touch down or whatever!";
	}
	


}
