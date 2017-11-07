package br.com.javaweb.agenda.infra.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.javaweb.agenda.service.ContatoService;
import br.com.javaweb.agenda.service.TipoItemContatoService;

public class AgendaApplication extends Application {
	
	//Armazena todos os WebServices da aplicação
	private Set<Object> services = new HashSet<>();
	
	
	public AgendaApplication() {
		services.add(new ContatoService());
		services.add(new TipoItemContatoService());
	}


	@Override
	public Set<Object> getSingletons() {
		return services;
	}
	
}
