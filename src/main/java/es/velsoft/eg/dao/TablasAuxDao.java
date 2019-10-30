package es.velsoft.eg.dao;

import es.velsoft.eg.modelo.ObjLista;
import es.velsoft.eg.modelo.TablasAux;
import es.velsoft.eg.modelo.VTablasAuxiliares;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Alejandro
 * 
 * DAO para todas las tablas que tienen el mismo formato AUX_*(id, descripcion)
 * 
 * De momento no arroja errores. Habría que montar un sistema de excepciones más
 * inteligente, si no existe ya. Si existe, se adapta la clase para que arroje excepciones
 * 
 */
public class TablasAuxDao {

    private static final String SQL_GET_ALL = "SELECT id, descripcion FROM :nt";
    private static final String SQL_GET_BY_ID = "SELECT id, descripcion FROM :nt WHERE ID = :elId";
    private static final String SQL_GET_BY_NOMBRE = "SELECT id, descripcion FROM :nt WHERE descripcion LIKE :cadena";
    private static final String SQL_INSERT = "INSERT INTO :nt (descripcion) VALUES (:desc)";
    private static final String SQL_UPDATE = "UPDATE :nt SET descripcion = :desc WHERE id = :id";
    private static final String SQL_GET_LISTA_TA = "SELECT id, Nombre, Columnas FROM vTablasAuxiliares ORDER BY Nombre";
    
    private EntityManager sesion;

    private List<TablasAux> filasTA;

    private TablasAux ta;


    public TablasAuxDao() {
        filasTA = new ArrayList<>();
    }

    public List<TablasAux> getAllFromTA(String nombreTabla) {

        try {
            sesion = obtenerSessionHibernate();
            Query q = sesion.createNativeQuery(SQL_GET_ALL, TablasAux.class)
                    .setParameter("nt", nombreTabla);
            filasTA = q.getResultList();
        } catch (Exception e) {
            System.out.println("getAllFromTA: error " + e.getLocalizedMessage());

        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }

        return filasTA;
    }

    public TablasAux getById(String nombreTabla, int id) {
        try {
            sesion = obtenerSessionHibernate();
            Query q = sesion.createNativeQuery(SQL_GET_ALL, TablasAux.class)
                    .setParameter("nt", nombreTabla)
                    .setParameter("elId", id);
            ta = (TablasAux) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("getById: error " + e.getLocalizedMessage());
            ta = null;

        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
        return ta;
    }

    public TablasAux getByDesc(String nombreTabla, String cad) {
        try {
            sesion = obtenerSessionHibernate();
            Query q = sesion.createNativeQuery(SQL_GET_BY_ID, TablasAux.class)
                    .setParameter("nt", nombreTabla)
                    .setParameter("cadena", "%" + cad + "%");
            ta = (TablasAux) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("getByDesc: error " + e.getLocalizedMessage());
            ta = null;

        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
        return ta;
    }

    public void insertTA(TablasAux ta) {
        try {
            sesion = obtenerSessionHibernate();
            Query q = sesion.createNativeQuery(SQL_INSERT)
                    .setParameter("nt", ta.getNombreTabla())
                    .setParameter("desc", ta.getDescripcion());
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println("insertTA: error " + e.getLocalizedMessage());
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
    
    public void updateTA(TablasAux ta) {
        try {
            sesion = obtenerSessionHibernate();
            Query q = sesion.createNativeQuery(SQL_UPDATE)
                    .setParameter("nt", ta.getNombreTabla())
                    .setParameter("desc", ta.getDescripcion())
                    .setParameter("id", ta.getId());
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println("updateTA: error " + e.getLocalizedMessage());
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
    
    
    public List<VTablasAuxiliares> getListaTablasAux() {

        List<VTablasAuxiliares> lista = new ArrayList<>();
        try {
            sesion = obtenerSessionHibernate();
            Query q = sesion.createNativeQuery(SQL_GET_LISTA_TA, VTablasAuxiliares.class);
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("getAllFromTA: error " + e.getLocalizedMessage());

        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }

        return lista;
        
    }

    private EntityManager obtenerSessionHibernate() throws Exception {
        EntityManager session = EntityManagerHelper.getEMF().createEntityManager();
        return session;
    }

}
