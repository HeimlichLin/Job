package idv.heimlich.job.common.dao;

import idv.heimlich.job.common.db.sql.SqlWhere;

public abstract class GeneralDAO<PO> {
	
	final String tableName;

	public GeneralDAO(String tableName) {
		this.tableName = tableName;
	}
	
	public abstract IConverter<PO> getConverter();
	
	public abstract SqlWhere getPkSqlWhere(PO arg0);
	
	public final RowMap getRowMap(PO po) {
		return this.getConverter().toRowMap(po);		
	}
	
	public String getTableName() {
		return this.tableName;
	}

}
