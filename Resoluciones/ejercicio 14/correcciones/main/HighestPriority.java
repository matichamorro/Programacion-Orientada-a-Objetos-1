package ar.edu.unlp.info.oo1.JobScheduler;

import java.util.List;

public class HighestPriority implements Policy {

	public HighestPriority() {
		
	}
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
	    .orElse(null);
	}
	
	
}
