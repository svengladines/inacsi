package be.occam.acsi.domain.people;

import static be.occam.utils.javax.Utils.map;

import java.util.Map;

import be.occam.acsi.domain.object.Therapist;

public class Secretary {
	
	protected final Map<String,Therapist> therapists;
	
	public Secretary() {
		
		this.therapists = map();
		
		this.therapists.put("jacobs", new Therapist("Laura", "Jacobs") );
		this.therapists.put("jacops", new Therapist("Sigrid", "Jacops") );
		this.therapists.put("nys", new Therapist("Charlotte", "Nys") );
		this.therapists.put("poel", new Therapist("Sabine", "Poel" ) );
		this.therapists.put("verbiest", new Therapist("Siel", "Verbiest" ) );
		this.therapists.put("vanhauwaert", new Therapist("Ellen", "Van Hauwaert" ) );
		this.therapists.put("vuerinckx", new Therapist("Katrien", "Vuerinckx" ) );
		
	}
	
	public Therapist whoHasCode( String code ) {
		
		return this.therapists.get( code.toLowerCase() );
		
	}

}
