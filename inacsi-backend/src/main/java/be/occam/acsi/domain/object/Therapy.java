package be.occam.acsi.domain.object;

public enum Therapy {
	
	Individual, Relation, Sex, Family, Counseling, SOVAKid, SOVAAdult, Group, Fail;
	
	public String getDescription() {
		
		String description = "Andere therapie";
		
		switch( this ) {
			case Individual: description = "Individuele therapie";
				break;
			case Counseling: description = "Bemiddeling";
				break;
			case Family: description = "Gezinstherapie";
				break;
			case Relation: description = "Relatietherapie";
				break;
			case Sex: description = "Sekstherapie";
				break;
			case SOVAKid: description = "SOVA Kinderen";
				break;
			case SOVAAdult: description = "SOVA volwassenen";
				break;
			case Group: description = "Doorlopende groepstherapie";
				break;
			case Fail: description = "Workshop faalangst";
				break;
				
			default: description = "Andere therapie";
		
		}
		
		return description;
		
	}

}
