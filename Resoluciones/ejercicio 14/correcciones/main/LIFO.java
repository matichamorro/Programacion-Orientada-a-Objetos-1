package ar.edu.unlp.info.oo1.JobScheduler;

import java.util.List;

public class LIFO implements Policy {

	public LIFO() {
		
	}
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}	
}
