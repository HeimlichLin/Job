package idv.heimlich.job.domain.common;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.job.common.exception.ApBusinessException;

public class JobLaunch implements JobStatus {

//	private final List<Runnable> runnables = new ArrayList<Runnable>();
	private final static Logger LOG = LoggerFactory.getLogger(JobLaunch.class);

	private static File LOCK_FILE = new File("/PCLMS/log/task.lock");
	private static JobLaunch INSTANCT = new JobLaunch();

	public JobLaunch() {

	}

	public void startLoopJob(final Runnable runnable, final int sleepSect) {
		LOG.info("job start!");
		try {
			final LoopWrapRunnable loopWrapRunnable = new LoopWrapRunnable(
					runnable, this, sleepSect);
			new Thread(loopWrapRunnable).start();
		} catch (final Exception e) {
			LOG.error("job Exception", e);
		}
		LOG.info("job end!");
	}

	private void executeContinueflg() {
		try {
			if (LOCK_FILE.exists()) {
				final boolean delete = LOCK_FILE.delete();
				if (!delete) {
					throw new ApBusinessException("檔案刪除失敗" + LOCK_FILE);
				}
			}
			final boolean createNewFile = LOCK_FILE.createNewFile();
			if (!createNewFile) {
				final boolean createNewFile2 = LOCK_FILE.getParentFile()
						.createNewFile();
				if (!createNewFile2) {
					throw new ApBusinessException(
							"無法建立folder:" + LOCK_FILE.getParentFile());
				}
				final boolean createLock = LOCK_FILE.createNewFile();
				if (createLock) {
					throw new ApBusinessException("建立file失敗:" + LOCK_FILE);
				}
			}
		} catch (final IOException e) {
			LOG.error("job IOException", e);
		}
	}

	public static JobLaunch getLaunch() {
		return JobLaunch.INSTANCT;
	}

	public void terminate() {
		synchronized (LOCK_FILE) {
			LOCK_FILE.delete();
			LOG.info("call terminate");
		}
	}

	public File getFile() {
		synchronized (LOCK_FILE) {
			return LOCK_FILE;
		}
	}

	public void run() {
		this.executeContinueflg();
	}

	@Override
	public boolean isContinue() {
		// TODO Auto-generated method stub
		return false;
	}

}
