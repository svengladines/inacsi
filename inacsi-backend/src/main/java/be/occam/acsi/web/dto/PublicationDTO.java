package be.occam.acsi.web.dto;

import java.util.Date;

public class PublicationDTO {
	
	protected String page;
	protected String author;
	protected Date moment;
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}

}
