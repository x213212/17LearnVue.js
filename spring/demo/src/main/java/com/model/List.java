package com.model;

import java.awt.print.Book;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class List {

	@Autowired private Integer code;
	@Autowired private ListData data;

    public List(){
    	code = 0;

    }

    public List(Integer code, String data,String name,String[] tmp) {
        super();
        this.code = code;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

 
	public ListData getData() {
		return data;
	}
	public void setData(ListData data) {
		this.data = data;
		this.data.coutTotlal();
		
	}
}
