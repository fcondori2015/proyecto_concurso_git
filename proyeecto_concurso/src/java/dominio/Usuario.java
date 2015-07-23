package dominio;
// Generated 22/07/2015 11:18:12 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private TipoUsuario tipoUsuario;
     private String nombre;
     private String apellido;
     private Date fechaNacimiento;
     private String dni;
     private String userName;
     private String pass;
     private Boolean activo;
     private Date ultimaActualizacion;

    public Usuario() {
    }

	
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Usuario(int idUsuario, TipoUsuario tipoUsuario, String nombre, String apellido, Date fechaNacimiento, String dni, String userName, String pass, Boolean activo, Date ultimaActualizacion) {
       this.idUsuario = idUsuario;
       this.tipoUsuario = tipoUsuario;
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.dni = dni;
       this.userName = userName;
       this.pass = pass;
       this.activo = activo;
       this.ultimaActualizacion = ultimaActualizacion;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public Date getUltimaActualizacion() {
        return this.ultimaActualizacion;
    }
    
    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }




}


