package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades;

public class Curso {
    private String ap_varstrnombrecurso;
    private String ap_varstrlinkcurso;

    public Curso() {
    }

    public Curso(String ap_varstrnombrecurso, String ap_varstrlinkcurso) {
        this.ap_varstrnombrecurso = ap_varstrnombrecurso;
        this.ap_varstrlinkcurso = ap_varstrlinkcurso;
    }

    public String getAp_varstrnombrecurso() {
        return ap_varstrnombrecurso;
    }

    public void setAp_varstrnombrecurso(String ap_varstrnombrecurso) {
        this.ap_varstrnombrecurso = ap_varstrnombrecurso;
    }

    public String getAp_varstrlinkcurso() {
        return ap_varstrlinkcurso;
    }

    public void setAp_varstrlinkcurso(String ap_varstrlinkcurso) {
        this.ap_varstrlinkcurso = ap_varstrlinkcurso;
    }
}
