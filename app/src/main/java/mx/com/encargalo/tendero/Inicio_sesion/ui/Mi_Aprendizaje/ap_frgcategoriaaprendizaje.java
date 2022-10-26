package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mx.com.encargalo.R;

public class ap_frgcategoriaaprendizaje extends Fragment {
    Button ap_cabtnvermas;
    Button ap_cabtncursosvender;
    Button ap_cabtncursosautoaprendizaje;
    Button ap_cabtncursosoperiones;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgcategoriaaprendizaje, container, false);
        ap_cabtnvermas=vista.findViewById(R.id.ap_cabtnvermas);
        ap_cabtnvermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_misfavoritos);
            }
        });
        ap_cabtncursosvender=vista.findViewById(R.id.ap_cabtncursosvender);
        ap_cabtncursosvender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoriavender);
            }
        });
        ap_cabtncursosautoaprendizaje=vista.findViewById(R.id.ap_cabtncursosautoaprendizaje);
        ap_cabtncursosautoaprendizaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoriautoaprendizaje);
            }
        });
        ap_cabtncursosoperiones=vista.findViewById(R.id.ap_cabtncursosoperiones);
        ap_cabtncursosoperiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoriaoperacionesnegocio);
            }
        });
        return vista;
    }
}