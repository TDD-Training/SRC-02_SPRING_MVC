package pl.leanleaders.tdd.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.leanleaders.tdd.core.Requirement;
import pl.leanleaders.tdd.persistence.RequirementsRepository;

@Service
public class RequirementsService {

	@Autowired
	private RequirementsRepository seedstarterRepository;

	public RequirementsService() {
		super();
	}

	public List<Requirement> findAll() {
		return this.seedstarterRepository.findAll();
	}

	public void add(final Requirement seedStarter) {
		this.seedstarterRepository.add(seedStarter);
	}
}
