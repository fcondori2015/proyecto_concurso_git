package dominio;
// Generated 24/07/2015 09:37:24 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * UnidadDeOrganizacion generated by hbm2java
 */
public class UnidadDeOrganizacion  implements java.io.Serializable {


     private int codigoUnidadDeOrganizacion;
     private int idUnidadDeOrganizacion;
     private String nombreUnidad;
     private Set expedientes = new HashSet(0);

    public UnidadDeOrganizacion() {
    }

	
    public UnidadDeOrganizacion(int codigoUnidadDeOrganizacion, int idUnidadDeOrganizacion, String nombreUnidad) {
        this.codigoUnidadDeOrganizacion = codigoUnidadDeOrganizacion;
        this.idUnidadDeOrganizacion = idUnidadDeOrganizacion;
        this.nombreUnidad = nombreUnidad;
    }
    public UnidadDeOrganizacion(int codigoUnidadDeOrganizacion, int idUnidadDeOrganizacion, String nombreUnidad, Set expedientes) {
       this.codigoUnidadDeOrganizacion = codigoUnidadDeOrganizacion;
       this.idUnidadDeOrganizacion = idUnidadDeOrganizacion;
       this.nombreUnidad = nombreUnidad;
       this.expedientes = expedientes;
    }
   
    public int getCodigoUnidadDeOrganizacion() {
        return this.codigoUnidadDeOrganizacion;
    }
    
    public void setCodigoUnidadDeOrganizacion(int codigoUnidadDeOrganizacion) {
        this.codigoUnidadDeOrganizacion = codigoUnidadDeOrganizacion;
    }
    public int getIdUnidadDeOrganizacion() {
        return this.idUnidadDeOrganizacion;
    }
    
    public void setIdUnidadDeOrganizacion(int idUnidadDeOrganizacion) {
        this.idUnidadDeOrganizacion = idUnidadDeOrganizacion;
    }
    public String getNombreUnidad() {
        return this.nombreUnidad;
    }
    
    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }
    public Set getExpedientes() {
        return this.expedientes;
    }
    
    public void setExpedientes(Set expedientes) {
        this.expedientes = expedientes;
    }




}


