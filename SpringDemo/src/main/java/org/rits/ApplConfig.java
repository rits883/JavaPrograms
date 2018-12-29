package org.rits;

import org.bikes.Pulser200Rs;
import org.bikes.RoyalEnfiled;
import org.bikes.YamahaR15;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class ApplConfig {
	
	@Bean
	@Scope("prototype")
	public Pulser200Rs getPulser() {
		return new Pulser200Rs();
	}

	
	@Bean
	public RoyalEnfiled getRoyalEnfiled() {
		return new RoyalEnfiled();
	}
	
	@Bean
	public YamahaR15 getYamahaR15() {
		return new YamahaR15();
	}
}
