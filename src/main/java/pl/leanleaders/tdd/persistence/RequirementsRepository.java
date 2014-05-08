package pl.leanleaders.tdd.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pl.leanleaders.tdd.core.Requirement;

//@Repository
public class RequirementsRepository {

	private final List<Requirement> seedRequirements = new ArrayList<Requirement>();

	public RequirementsRepository() {
		super();
	}

	public List<Requirement> findAll() {
		return new ArrayList<Requirement>(this.seedRequirements);
	}

	public void add(final Requirement seedStarter) {
		this.seedRequirements.add(seedStarter);
	}
}
