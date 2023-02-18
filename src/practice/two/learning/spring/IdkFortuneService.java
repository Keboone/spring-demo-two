package practice.two.learning.spring;

import two.learning.spring.FortuneService;

public class IdkFortuneService implements FortuneService 
{

	@Override
	public String getFortune() 
	{
		return "I don't know your fortune!";
	}

}
