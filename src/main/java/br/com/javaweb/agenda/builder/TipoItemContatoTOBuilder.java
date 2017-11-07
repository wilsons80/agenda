package br.com.javaweb.agenda.builder;

import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.entity.TipoItemContato;
import br.com.javaweb.agenda.to.TipoItemContatoTO;

@Component
public class TipoItemContatoTOBuilder {
	
	public TipoItemContatoTO build(TipoItemContato tipoItemContato){
		return new TipoItemContatoTO(tipoItemContato.getId(), tipoItemContato.getNome());
	}

}
