package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
public class ListData {
	
	@Autowired private Integer total;
	@Autowired private List<ListItem> items;
    
//	private List<Author> author = new ArrayList<Author>();

    public void ListData (Integer total,List<ListItem> items){
    	this.total = total;
    	this.items = items;
    }
    public Integer gettotal(){
    	return  total;
    }
    public List<ListItem> getitems()
    {
    	return items;
    	
    }
    public void addList (ListItem tmp)
    {
    	this.items.add(tmp);
    }
    public void  coutTotlal()
    {
    	this.total = items.size();
    	
    }
	
    public ListData(){
    	this.total = 0;
    	this.items =new ArrayList<>();
    }


	
//	public List<Author> getAuthor() {
//		return author;
//	}
//	public void setAuthor(List<Author> author) {
//		this.author = author;
//	}

}