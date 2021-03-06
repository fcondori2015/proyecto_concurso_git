package dominio;
// Generated 24/07/2015 09:37:24 by Hibernate Tools 3.6.0



/**
 * Convocatoria generated by hbm2java
 */
public class Convocatoria  implements java.io.Serializable {


     private int idInscripcion;
     private Cargo cargo;
     private Persona persona;
     private Integer fojas;
     private Double antecedentes;
     private Double oposicion;
     private Double puntaje;

    public Convocatoria() {
    }

	
    public Convocatoria(int idInscripcion, Cargo cargo, Persona persona) {
        this.idInscripcion = idInscripcion;
        this.cargo = cargo;
        this.persona = persona;
    }
    public Convocatoria(int idInscripcion, Cargo cargo, Persona persona, Integer fojas, Double antecedentes, Double oposicion, Double puntaje) {
       this.idInscripcion = idInscripcion;
       this.cargo = cargo;
       this.persona = persona;
       this.fojas = fojas;
       this.antecedentes = antecedentes;
       this.oposicion = oposicion;
       this.puntaje = puntaje;
    }
   
    public int getIdInscripcion() {
        return this.idInscripcion;
    }
    
    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Integer getFojas() {
        return this.fojas;
    }
    
    public void setFojas(Integer fojas) {
        this.fojas = fojas;
    }
    public Double getAntecedentes() {
        return this.antecedentes;
    }
    
    public void setAntecedentes(Double antecedentes) {
        this.antecedentes = antecedentes;
    }
    public Double getOposicion() {
        return this.oposicion;
    }
    
    public void setOposicion(Double oposicion) {
        this.oposicion = oposicion;
    }
    public Double getPuntaje() {
        return this.puntaje;
    }
    
    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }




}


