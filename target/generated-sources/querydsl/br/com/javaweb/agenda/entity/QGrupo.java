package br.com.javaweb.agenda.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QGrupo is a Querydsl query type for Grupo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGrupo extends EntityPathBase<Grupo> {

    private static final long serialVersionUID = 972908185;

    public static final QGrupo grupo = new QGrupo("grupo");

    public final BooleanPath ativo = createBoolean("ativo");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public QGrupo(String variable) {
        super(Grupo.class, forVariable(variable));
    }

    public QGrupo(Path<? extends Grupo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGrupo(PathMetadata<?> metadata) {
        super(Grupo.class, metadata);
    }

}

