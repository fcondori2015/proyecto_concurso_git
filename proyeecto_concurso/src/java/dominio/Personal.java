package dominio;
// Generated 24/07/2015 09:37:24 by Hibernate Tools 3.6.0



/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private int idPersonal;
     private Profesion profesion;
     private Persona persona;
     private String numeroMatricula;

    public Personal() {
    }

	
    public Personal(int idPersonal, Profesion profesion) {
        this.idPersonal = idPersonal;
        this.profesion = profesion;
    }
    public Personal(int idPersonal, Profesion profesion, Persona persona, String numeroMatricula) {
       this.idPersonal = idPersonal;
       this.profesion = profesion;
       this.persona = persona;
       this.numeroMatricula = numeroMatricula;
    }
   
    public int getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
    public Profesion getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getNumeroMatricula() {
        return this.numeroMatricula;
    }
    
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }




}


