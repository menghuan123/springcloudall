package com.example.demo.enums;



public enum Commons {

	SUFCOINNAME            (1,"sufcoinName"),
	NEWPRICE               (2,"newPrice"),
	GAINS                  (3,"gains");




	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private Commons(Integer type, String msg) {
		this.type = type;
		this.msg = msg;
	}
	private Integer type;
	private String msg;






}
