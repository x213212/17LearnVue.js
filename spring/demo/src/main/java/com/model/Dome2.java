package com.model;

public class Dome2 {
	
    private String[] roles={"admin"};
    private String introduction = "I am a super administrator";
    private String avatar =  "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
    private String name ="Super Admin";
    
    
//	private List<Author> author = new ArrayList<Author>();

    public void setroles (String[ ] tmp){
    	this.roles = tmp;
    }
    public String[] getroles(){
    	return  this.roles;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getintroduction() {
		return introduction;
	}
	public void setintroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getavatar() {
		return avatar;
	}
	public void setavatar(String avatar) {
		this.avatar = avatar;
	}
	
//	public List<Author> getAuthor() {
//		return author;
//	}
//	public void setAuthor(List<Author> author) {
//		this.author = author;
//	}

}