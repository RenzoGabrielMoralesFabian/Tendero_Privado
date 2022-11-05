package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades;

public class EventoEnVivo {
    String ap_strcharla;
    String ap_strfecha;

    public EventoEnVivo() {
    }

    public EventoEnVivo(String charla, String fecha) {
        this.ap_strcharla = charla;
        this.ap_strfecha = fecha;
    }

    public String getAp_strcharla() {
        return ap_strcharla;
    }

    public void setAp_strcharla(String ap_strcharla) {
        this.ap_strcharla = ap_strcharla;
    }

    public String getAp_strfecha() {
        return ap_strfecha;
    }

    public void setAp_strfecha(String ap_strfecha) {
        this.ap_strfecha = ap_strfecha;
    }
}
