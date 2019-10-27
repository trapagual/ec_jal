package es.trapasoft.webbookauthor.modelo;

import es.velsoft.eg.modelo.Libros;
import es.velsoft.eg.modelo.Autores;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T12:33:09")
@StaticMetamodel(Libros.class)
public class Libros_ { 

    public static volatile SingularAttribute<Libros, Float> price;
    public static volatile SingularAttribute<Libros, String> title;
    public static volatile SingularAttribute<Libros, Autores> authorId;
    public static volatile SingularAttribute<Libros, Integer> bookId;

}