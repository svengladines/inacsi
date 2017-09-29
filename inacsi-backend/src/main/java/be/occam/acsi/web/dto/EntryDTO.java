package be.occam.acsi.web.dto;

import java.util.Date;

import be.occam.acsi.domain.object.Entry;
import be.occam.acsi.domain.object.Therapy;
import be.occam.utils.timing.Timing;

public class EntryDTO {
	
	String name;
	String telephone;
	String email;
	String birthDay;
	String birthMonth;
	String birthYear;
	
	Therapy therapy;
	String subject;
	String description;
	String availability;
	
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
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public static Entry toEntry( EntryDTO dto ) {
		
		Entry entry
			= new Entry();
		
		entry.setName( dto.getName() );
		entry.setEmail( dto.getEmail() );
		entry.setTelephone( dto.getTelephone() );
		
		Date birthDate
			= Timing.date( String.format( "%s/%s/%s", dto.getBirthDay(), dto.getBirthMonth(), dto.getBirthYear() ) );
		entry.setBirthDay( birthDate );
		
		entry.setTherapy( dto.getTherapy() );
		entry.setSubject( dto.getSubject() );
		entry.setDescription( dto.getDescription() );
		entry.setAvailability( dto.getAvailability() );
		
		return entry;
		
	}
	
	@Override
	public String toString() {
		
		return String.format( "{name=%s,telephone=%s,email=%s,birthDay=%s,therapy=%s,subject=%s,description=%s,availablity=%s}",
				this.name,
				this.telephone,
				this.email,
				String.format( "%s/%s/%s", this.birthDay, this.birthMonth, this.birthYear ),
				this.therapy.name(),
				this.subject,
				this.description,
				this.availability );
		
	}

}
