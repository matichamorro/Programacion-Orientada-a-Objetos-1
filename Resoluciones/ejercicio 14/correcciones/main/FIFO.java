package ar.edu.unlp.info.oo1.JobScheduler;

import java.util.List;

public class FIFO implements Policy {

	public FIFO() {
		
	}
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(0);
	}
}
