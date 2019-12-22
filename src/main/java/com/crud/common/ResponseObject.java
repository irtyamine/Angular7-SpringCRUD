package com.crud.common;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class ResponseObject {

	private HashMap<String, Object> data = new HashMap<String, Object>();

	public HashMap<String, Object> add(String s, Object o) {
		data.put(s, o);
		return data;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
