package be.occam.acsi.domain.service;

import javax.annotation.Resource;

import be.occam.acsi.web.util.DataGuard;

public abstract class Service<T extends Service> {
	
	@Resource
	protected DataGuard dataGuard; 
	
	public T guard() {
		
		this.dataGuard.guard();
		
		return (T) this;
		
	}

}
