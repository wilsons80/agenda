package br.com.javaweb.agenda.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QTipoItemContato is a Querydsl query type for TipoItemContato
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTipoItemContato extends EntityPathBase<TipoItemContato> {

    private static final long serialVersionUID = -1713331725;

    public static final QTipoItemContato tipoItemContato = new QTipoItemContato("tipoItemContato");

    public final BooleanPath ativo = createBoolean("ativo");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public QTipoItemContato(String variable) {
        super(TipoItemContato.class, forVariable(variable));
    }

    public QTipoItemContato(Path<? extends TipoItemContato> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoItemContato(PathMetadata<?> metadata) {
        super(TipoItemContato.class, metadata);
    }

}

