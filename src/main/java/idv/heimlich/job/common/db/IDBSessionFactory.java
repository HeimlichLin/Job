package idv.heimlich.job.common.db;

public interface IDBSessionFactory {

	IDBSession getXdaoSession(String conn);

}
