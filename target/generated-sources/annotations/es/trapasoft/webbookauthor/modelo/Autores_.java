package es.trapasoft.webbookauthor.modelo;

import es.velsoft.eg.modelo.Autores;
import es.velsoft.eg.modelo.Libros;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T12:33:09")
@StaticMetamodel(Autores.class)
public class Autores_ { 

    public static volatile SingularAttribute<Autores, String> name;
    public static volatile SingularAttribute<Autores, Integer> authorId;
    public static volatile CollectionAttribute<Autores, Libros> librosCollection;

}