package modelo.pojo;
// Generated 01-jun-2015 18:19:23 by Hibernate Tools 3.6.0



/**
 * Grupo generated by hbm2java
 */
public class Grupo  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String descripcion;
     private int idCategoria;

    public Grupo() {
    }

    public Grupo(String nombre, String descripcion, int idCategoria) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.idCategoria = idCategoria;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }




}

