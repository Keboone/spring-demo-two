package two.learning.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService
{
	List<String> listOfFortunes = 
			Arrays.asList("Today is your lucky day!", "Not a lucky day!", "Normal day!");

	private Random rand = new Random();
	
	@Override
	public String getFortune() 
	{
		int index = rand.nextInt(listOfFortunes.size());
		
		String yourFortune = listOfFortunes.get(index);
		
		return listOfFortunes.size() + " " + yourFortune + " " + index;
	}

}
