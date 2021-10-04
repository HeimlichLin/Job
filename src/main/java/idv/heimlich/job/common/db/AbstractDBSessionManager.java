package idv.heimlich.job.common.db;

import idv.heimlich.job.common.db.impl.DBSessionImpl;

public abstract class AbstractDBSessionManager {
	
	private static IDBSession dbSession;
	
	public IDBSession getDBSession() {
		if (dbSession == null) {
			dbSession = new DBSessionImpl();
		}
		return dbSession;
	}
	
	protected abstract String getConnId();

}
