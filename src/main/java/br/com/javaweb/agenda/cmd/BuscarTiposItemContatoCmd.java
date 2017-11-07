package br.com.javaweb.agenda.cmd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.builder.TipoItemContatoTOBuilder;
import br.com.javaweb.agenda.dao.TipoItemContatoDAO;
import br.com.javaweb.agenda.to.TipoItemContatoTO;

@Component
public class BuscarTiposItemContatoCmd {

	@Autowired
	private TipoItemContatoTOBuilder tipoItemContatoTOBuilder;
	
	@Autowired
	private TipoItemContatoDAO tipoItemContatoDAO;
	
	public List<TipoItemContatoTO> get(){
		List<TipoItemContatoTO> tiposTO = new ArrayList<>();
		tipoItemContatoDAO.listarAtivos().stream().forEach( t -> tiposTO.add( tipoItemContatoTOBuilder.build( t ) ) );
		return tiposTO;
	}
	
}
