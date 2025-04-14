package com.java.rest.requestmodel;

public class usercreation {

	
	   private String name;
	   private String job;
	   
	   usercreation(String name, String job ){this.name = name; this.job = job;}
	  
	   public String getname() {	return this.name;}
	   public String getjob() { return this.job; }
	   
	   public static class Builder {
		   

		   private String name;
		   private String job;
		   
		   public Builder setname(String name) { this.name = name; return this;}
		   public Builder setjob(String job) { this.job = job; return this; }
		   public usercreation build() { return new usercreation(this.name, this.job); }
		   
	   }
	
}
