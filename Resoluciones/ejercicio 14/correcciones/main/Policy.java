package ar.edu.unlp.info.oo1.JobScheduler;

import java.util.List;

public interface Policy {

	public JobDescription next(List<JobDescription> jobs);
}
