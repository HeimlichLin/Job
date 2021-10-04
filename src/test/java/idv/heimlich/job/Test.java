package idv.heimlich.job;

import org.slf4j.Logger;

import idv.heimlich.job.common.db.IDBSession;
import idv.heimlich.job.common.db.IDBSessionFactory;
import idv.heimlich.job.common.db.impl.DBSessionFactoryImpl;
import idv.heimlich.job.common.log.LogFactory;

public class Test {
	
	private static Logger LOGGER = LogFactory.getInstance();
	
	public static void main(String[] args) {
		LOGGER.debug("Test Start");
		IDBSessionFactory sessionFactory = new DBSessionFactoryImpl();
		IDBSession session = sessionFactory.getXdaoSession("");
		
	}

}
