package be.occam.acsi.domain.object;

import static be.occam.utils.javax.Utils.list;

import java.util.Date;
import java.util.List;

public class Entry {
	
	String name;
	String telephone;
	String email;
	Date birthDay;
	
	Therapy therapy;
	String subject;
	String description;
	String availabilityComment;
	List<String> availabilities;
	Therapist preferredTherapist;
	
	public Entry() {
		this.availabilities = list();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Therapy getTherapy() {
		return therapy;
	}
	
	public void setTherapy(Therapy therapy) {
		this.therapy = therapy;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvailabilityComment() {
		return availabilityComment;
	}

	public void setAvailabilityComment(String availabilityComment) {
		this.availabilityComment = availabilityComment;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public List<String> getAvailabilities() {
		return availabilities;
	}

	public Therapist getPreferredTherapist() {
		return preferredTherapist;
	}

	public void setPreferredTherapist(Therapist preferredTherapist) {
		this.preferredTherapist = preferredTherapist;
	}
	
	
}
