package com.witx.jndi.bean;

public class FirstBean {

	private String foo = "小王";
	private int bar = 10;
	
	public String getFoo() {
		return foo;
	}
	public void setFoo(String foo) {
		this.foo = foo;
	}
	public int getBar() {
		return bar;
	}
	public void setBar(int bar) {
		this.bar = bar;
	}
	
	@Override
	public String toString() {
		return "FirstBean [foo=" + foo + ", bar=" + bar + "]";
	}
}
