package com.rest.tools;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Track {

	String title;
	String singer;
	private String dummy;
 
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getSinger() {
		return singer;
	}
 
	public void setSinger(String singer) {
		this.singer = singer;
	}
 
	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + "]";
	}

	@JsonIgnore
	public String getDummy() {
		return dummy;
	}

	public void setDummy(String dummy) {
		this.dummy = dummy;
	}
	
}
