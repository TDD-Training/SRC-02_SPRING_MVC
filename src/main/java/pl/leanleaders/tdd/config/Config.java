package pl.leanleaders.tdd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.leanleaders.tdd.core.services.RequirementsService;
import pl.leanleaders.tdd.persistence.RequirementsRepository;

@Configuration
public class Config {

	@Bean
	public RequirementsRepository requirementRepository() {
		return new RequirementsRepository();
	}

	@Bean 
	public RequirementsService requirementService() {
		return new RequirementsService();
	}
}
