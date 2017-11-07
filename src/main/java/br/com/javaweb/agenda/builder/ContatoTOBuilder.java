package br.com.javaweb.agenda.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class ContatoTOBuilder {
	
	
	public ContatoTO build(Contato contato){
		List<String> grupos = contato.getGrupos()
				                     .stream()
				                     .filter(g -> g.getAtivo())
				                     .map( g -> g.getNome() )
				                     .collect(Collectors.toList());
		
		return new ContatoTO(contato.getId(), contato.getNome(), grupos );
	}
	
	public List<ContatoTO> build(List<Contato> contatos){
		List<ContatoTO> contatosTO = new ArrayList<>();
		
		contatos.stream().forEach( contato -> {
			List<String> grupos = contato.getGrupos()
					                     .stream()
					                     .filter(g -> g.getAtivo())
					                     .map( g -> g.getNome() )
					                     .collect(Collectors.toList());
			
			contatosTO.add( new ContatoTO(contato.getId(), contato.getNome(), grupos )) ;
		});
		return contatosTO;
	}

}
