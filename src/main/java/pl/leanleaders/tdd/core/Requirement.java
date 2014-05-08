package pl.leanleaders.tdd.core;

import java.util.Date;

public class Requirement {
	private Date doneAfter;
	public Requirement( String id, String name, String estimation, boolean done, Date doneAfter) {
		this.setDoneAfter(doneAfter);
		this.setId(id);
		this.setName(name);
		this.setEstimation(estimation);
		this.setDone(done);
		
	}
	
	public Requirement() {
		this("", "", "", false, new Date());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEstimation() {
		return estimation;
	}

	public void setEstimation(String estimation) {
		this.estimation = estimation;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getDoneAfter() {
		return doneAfter;
	}

	public void setDoneAfter(Date doneAfter) {
		this.doneAfter = doneAfter;
	}

	private String id;
	private String name;
	private String estimation;
	private boolean done;
}