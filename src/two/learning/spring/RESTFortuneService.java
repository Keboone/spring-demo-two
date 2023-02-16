package two.learning.spring;

import org.springframework.stereotype.Component;

@Component("jojo")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() 
	{
		return "jojo REST fortune";
	}

}
