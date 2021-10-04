package idv.heimlich.job.domain.bean;
//package idv.heimlich.BaseProject.domain.bean; 
// 
//public class WarehseDo { 
// 
//	public enum COLUMNS { 
//		POSTCODE("地區碼"), 
//		BONDNO("監管編號"), 
//		BONDBAN("倉儲業統一編碼"), 
//		BONDNAME("倉儲業中文名稱"), 
//		SPECIALST("專責人員"), 
//		BONDADD("保稅倉儲業地址"), 
//		BONDID("倉儲業代碼"), 
//		BONDPW("倉儲業密碼"), 
//		AUTHORITY("使用權限"), 
//		RCVID("收件人代碼"), 
//		SEPID("Sepower代碼"), 
//		CUSTOMSOFFICE("監管關別"), 
//		RECV_FLAG("准單接收註記"), 
//		BONDTYPE("倉庫別"), 
//		STATUS("狀態"), 
//		ACTIVEDATE("啟用日期"), 
//		ENDDATE("截止日期"), 
//		CHARGEDATE("收費日期"), 
//		TEL("電話"), 
//		FAX("傳真"), 
//		COFFICER("null"), 
//		CUSTOM_FLAG("null"), 
//		AUTOCONFIRM("null") 
//		; 
//		
//		private final String comments; 
//	 
//		private COLUMNS(final String comments) { 
//			this.comments = comments; 
//		} 
//
//		public String getComments() {
//			return comments;
//		} 
//	} 
// 
//	private String postcode; 
//	private String bondno; 
//	private String bondban; 
//	private String bondname; 
//	private String specialst; 
//	private String bondadd; 
//	private String bondid; 
//	private String bondpw; 
//	private String authority; 
//	private String rcvid; 
//	private String sepid; 
//	private String customsoffice; 
//	private String recvFlag; 
//	private String bondtype; 
//	private String status; 
//	private java.sql.Timestamp activedate; 
//	private java.sql.Timestamp enddate; 
//	private java.sql.Timestamp chargedate; 
//	private String tel; 
//	private String fax; 
//	private String cofficer; 
//	private String customFlag; 
//	private String autoconfirm; 
//	
//	public String getPostcode() { 
//		return postcode; 
//	} 
// 
//	public void setPostcode(String postcode) { 
//		this.postcode = postcode; 
//	} 
// 
//	public String getBondno() { 
//		return bondno; 
//	} 
// 
//	public void setBondno(String bondno) { 
//		this.bondno = bondno; 
//	} 
// 
//	public String getBondban() { 
//		return bondban; 
//	} 
// 
//	public void setBondban(String bondban) { 
//		this.bondban = bondban; 
//	} 
// 
//	public String getBondname() { 
//		return bondname; 
//	} 
// 
//	public void setBondname(String bondname) { 
//		this.bondname = bondname; 
//	} 
// 
//	public String getSpecialst() { 
//		return specialst; 
//	} 
// 
//	public void setSpecialst(String specialst) { 
//		this.specialst = specialst; 
//	} 
// 
//	public String getBondadd() { 
//		return bondadd; 
//	} 
// 
//	public void setBondadd(String bondadd) { 
//		this.bondadd = bondadd; 
//	} 
// 
//	public String getBondid() { 
//		return bondid; 
//	} 
// 
//	public void setBondid(String bondid) { 
//		this.bondid = bondid; 
//	} 
// 
//	public String getBondpw() { 
//		return bondpw; 
//	} 
// 
//	public void setBondpw(String bondpw) { 
//		this.bondpw = bondpw; 
//	} 
// 
//	public String getAuthority() { 
//		return authority; 
//	} 
// 
//	public void setAuthority(String authority) { 
//		this.authority = authority; 
//	} 
// 
//	public String getRcvid() { 
//		return rcvid; 
//	} 
// 
//	public void setRcvid(String rcvid) { 
//		this.rcvid = rcvid; 
//	} 
// 
//	public String getSepid() { 
//		return sepid; 
//	} 
// 
//	public void setSepid(String sepid) { 
//		this.sepid = sepid; 
//	} 
// 
//	public String getCustomsoffice() { 
//		return customsoffice; 
//	} 
// 
//	public void setCustomsoffice(String customsoffice) { 
//		this.customsoffice = customsoffice; 
//	} 
// 
//	public String getRecvFlag() { 
//		return recvFlag; 
//	} 
// 
//	public void setRecvFlag(String recvFlag) { 
//		this.recvFlag = recvFlag; 
//	} 
// 
//	public String getBondtype() { 
//		return bondtype; 
//	} 
// 
//	public void setBondtype(String bondtype) { 
//		this.bondtype = bondtype; 
//	} 
// 
//	public String getStatus() { 
//		return status; 
//	} 
// 
//	public void setStatus(String status) { 
//		this.status = status; 
//	} 
// 
//	public java.sql.Timestamp getActivedate() { 
//		return activedate; 
//	} 
// 
//	public void setActivedate(java.sql.Timestamp activedate) { 
//		this.activedate = activedate; 
//	} 
// 
//	public java.sql.Timestamp getEnddate() { 
//		return enddate; 
//	} 
// 
//	public void setEnddate(java.sql.Timestamp enddate) { 
//		this.enddate = enddate; 
//	} 
// 
//	public java.sql.Timestamp getChargedate() { 
//		return chargedate; 
//	} 
// 
//	public void setChargedate(java.sql.Timestamp chargedate) { 
//		this.chargedate = chargedate; 
//	} 
// 
//	public String getTel() { 
//		return tel; 
//	} 
// 
//	public void setTel(String tel) { 
//		this.tel = tel; 
//	} 
// 
//	public String getFax() { 
//		return fax; 
//	} 
// 
//	public void setFax(String fax) { 
//		this.fax = fax; 
//	} 
// 
//	public String getCofficer() { 
//		return cofficer; 
//	} 
// 
//	public void setCofficer(String cofficer) { 
//		this.cofficer = cofficer; 
//	} 
// 
//	public String getCustomFlag() { 
//		return customFlag; 
//	} 
// 
//	public void setCustomFlag(String customFlag) { 
//		this.customFlag = customFlag; 
//	} 
// 
//	public String getAutoconfirm() { 
//		return autoconfirm; 
//	} 
// 
//	public void setAutoconfirm(String autoconfirm) { 
//		this.autoconfirm = autoconfirm; 
//	} 
// 
//} 
