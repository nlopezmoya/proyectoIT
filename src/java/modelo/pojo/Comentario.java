package modelo.pojo;
// Generated 01-jun-2015 18:19:23 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Comentario generated by hbm2java
 */
public class Comentario  implements java.io.Serializable {


     private Integer id;
     private Date fecha;
     private String texto;
     private int idEvento;
     private int idUsuario;

    public Comentario() {
    }

    public Comentario(Date fecha, String texto, int idEvento, int idUsuario) {
       this.fecha = fecha;
       this.texto = texto;
       this.idEvento = idEvento;
       this.idUsuario = idUsuario;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getIdEvento() {
        return this.idEvento;
    }
    
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }




}

