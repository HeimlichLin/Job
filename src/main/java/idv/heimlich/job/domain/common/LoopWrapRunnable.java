package idv.heimlich.job.domain.common;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoopWrapRunnable implements Runnable {

	private final static Logger LOG = LoggerFactory
			.getLogger(LoopWrapRunnable.class);
	private final Runnable runnable;

	final JobStatus jobStatus;
	private int sleepSec = 200;// sleep time

	public LoopWrapRunnable(final Runnable runnable,
			final JobStatus jobStatus) {
		this(runnable, jobStatus, 10);
	}

	public LoopWrapRunnable(final Runnable runnable, final JobStatus jobStatus,
			final int sleepSec) {
		this.runnable = runnable;
		this.jobStatus = jobStatus;
		this.sleepSec = sleepSec;
	}

	@Override
	public void run() {
		LOG.info("start " + this.runnable.getClass());
		while (this.jobStatus.isContinue()) {
			try {
				this.runnable.run();
				TimeUnit.SECONDS.sleep(this.sleepSec);
				LOG.info("run " + this.runnable.getClass());
			} catch (final InterruptedException e) {
				LOG.info("call  terminate:" + this.runnable.getClass());
			} catch (final Exception e) {
				LOG.info("catch error  :{}" + this.runnable.getClass());
			}
		}
		LOG.info("end " + this.runnable.getClass());
	}

}
