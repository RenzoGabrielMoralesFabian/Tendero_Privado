package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Entidades;

public class Publicidad {
    private String titulo;
    private String descripcion;
    private int imagenid;

    public Publicidad() {}

    public Publicidad(String titulo, String descripcion, int imagenid) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenid = imagenid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}
