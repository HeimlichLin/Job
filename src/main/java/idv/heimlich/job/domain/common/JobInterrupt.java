package idv.heimlich.job.domain.common;

public class JobInterrupt {

	public static void main(final String[] args) {
		JobLaunch.getLaunch().terminate();
	}

}
