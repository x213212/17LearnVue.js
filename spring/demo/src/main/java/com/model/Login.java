package com.model;

import java.awt.print.Book;

public class Login {

    private Integer code;
    private Token data;

    public Login(){

    }

    public Login(Integer code, String data,String name,String[] tmp) {
        super();
        this.code = code;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

 
	public Token getData() {
		return data;
	}
	public void setData(Token data) {
		this.data = data;
	}
}
