package be.occam.acsi.domain.object;

public class Therapist {
	
	protected String code;
	protected String givenName;
	protected String familyName;
	
	public Therapist(String givenName, String familyName) {
		this.givenName = givenName;
		this.familyName = familyName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	

}
