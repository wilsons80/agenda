package br.com.javaweb.agenda.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.javaweb.agenda.cmd.BuscarTiposItemContatoCmd;
import br.com.javaweb.agenda.to.TipoItemContatoTO;

@Component
@Path("/tipoitemcontato")
public class TipoItemContatoService {

	@Autowired
	private BuscarTiposItemContatoCmd buscarTiposItemContatoCmd;
	
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<TipoItemContatoTO> getItensTipoContato(){
		return buscarTiposItemContatoCmd.get();
	}
}
