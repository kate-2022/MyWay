package Five.TwoTwo.MyWay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public JavaDevelopment somethingNew() {
		
		return new JavaDevelopment();
	}

}
