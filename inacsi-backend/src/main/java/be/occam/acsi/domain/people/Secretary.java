package be.occam.acsi.domain.people;

import static be.occam.utils.javax.Utils.map;

import java.util.Map;

import be.occam.acsi.domain.object.Therapist;

public class Secretary {
	
	protected final Map<String,Therapist> therapists;
	
	public Secretary() {
		
		this.therapists = map();
		
		this.therapists.put( "belmans", new Therapist( "Katrien", "Belmans" ) );
		this.therapists.put("jacobs", new Therapist("Laura", "Jacobs") );
		this.therapists.put("melotte", new Therapist("Katrien", "Melotte") );
		this.therapists.put("poel", new Therapist("Sabine", "Poel" ) );
		this.therapists.put("vanhie", new Therapist("Thijs", "Vanhie" ) );
		this.therapists.put("vannooten", new Therapist("Ellen", "Van Nooten" ) );
		this.therapists.put("verbiest", new Therapist("Siel", "Verbiest" ) );
		this.therapists.put("verbruggen", new Therapist("Hanne", "Verbruggen" ) );
		this.therapists.put("vuerinckx", new Therapist("Katrien", "Vuerinckx" ) );
		
	}
	
	public Therapist whoHasCode( String code ) {
		
		return this.therapists.get( code.toLowerCase() );
		
	}

}
