package org.zerock.domain;

import java.util.Date;

public class MessageVO {
	private int mno;
	private String targetid;
	private String sender;
	private String msg;
	private Date opendate;
	private Date senddate;
	public MessageVO() {
		super();
	}
	public MessageVO(int mno, String targetid, String sender, String msg, Date opendate, Date senddate) {
		super();
		this.mno = mno;
		this.targetid = targetid;
		this.sender = sender;
		this.msg = msg;
		this.opendate = opendate;
		this.senddate = senddate;
	}
	public int getMno() {
		return mno;
	}
	public String getTargetid() {
		return targetid;
	}
	public String getSender() {
		return sender;
	}
	public String getMsg() {
		return msg;
	}
	public Date getOpendate() {
		return opendate;
	}
	public Date getSenddate() {
		return senddate;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public void setTargetid(String targetid) {
		this.targetid = targetid;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}
	public void setSenddate(Date senddate) {
		this.senddate = senddate;
	}
	@Override
	public String toString() {
		return "MessageVO [mno=" + mno + ", targetid=" + targetid + ", sender=" + sender + ", msg=" + msg
				+ ", opendate=" + opendate + ", senddate=" + senddate + "]";
	}
}
