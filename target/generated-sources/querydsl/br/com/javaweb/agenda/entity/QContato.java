package br.com.javaweb.agenda.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QContato is a Querydsl query type for Contato
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContato extends EntityPathBase<Contato> {

    private static final long serialVersionUID = -685394854;

    public static final QContato contato = new QContato("contato");

    public final ListPath<Grupo, QGrupo> grupos = this.<Grupo, QGrupo>createList("grupos", Grupo.class, QGrupo.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public QContato(String variable) {
        super(Contato.class, forVariable(variable));
    }

    public QContato(Path<? extends Contato> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContato(PathMetadata<?> metadata) {
        super(Contato.class, metadata);
    }

}

