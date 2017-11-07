package br.com.javaweb.agenda.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QItemContato is a Querydsl query type for ItemContato
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QItemContato extends EntityPathBase<ItemContato> {

    private static final long serialVersionUID = -1543492153;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QItemContato itemContato = new QItemContato("itemContato");

    protected QContato contato;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    protected QTipoItemContato tipoItemContato;

    public final StringPath valorContato = createString("valorContato");

    public QItemContato(String variable) {
        this(ItemContato.class, forVariable(variable), INITS);
    }

    public QItemContato(Path<? extends ItemContato> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QItemContato(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QItemContato(PathMetadata<?> metadata, PathInits inits) {
        this(ItemContato.class, metadata, inits);
    }

    public QItemContato(Class<? extends ItemContato> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contato = inits.isInitialized("contato") ? new QContato(forProperty("contato")) : null;
        this.tipoItemContato = inits.isInitialized("tipoItemContato") ? new QTipoItemContato(forProperty("tipoItemContato")) : null;
    }

    public QContato contato() {
        if (contato == null){
            contato = new QContato(forProperty("contato"));
        }
        return contato;
    }

    public QTipoItemContato tipoItemContato() {
        if (tipoItemContato == null){
            tipoItemContato = new QTipoItemContato(forProperty("tipoItemContato"));
        }
        return tipoItemContato;
    }

}

