package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgcategoria;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Curso;

public class ap_frglistadocategoria extends Fragment {

    ap_adplistadofrgcategoria ap_adpcategoria;
    RecyclerView ap_rclvcategoria;
    ArrayList<Curso> ap_listacategoria;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frglistadocategoria, container, false);
        ap_rclvcategoria = vista.findViewById(R.id.ap_ccrclvlistadocurso);
        ap_listacategoria = new ArrayList<>();

        ap_cargaLista();

        ap_mostrarData();

        return vista;
    }

    private void ap_cargaLista() {
        ap_listacategoria.add(new Curso("Estrategias de ventas web"));
        ap_listacategoria.add(new Curso("Manejo de clientes dificiles"));
        ap_listacategoria.add(new Curso("20 formas de vender y no morir en el intento"));
    }

    private void ap_mostrarData() {
        ap_rclvcategoria.setLayoutManager(new LinearLayoutManager(getContext()));
        ap_adpcategoria = new ap_adplistadofrgcategoria(getContext(), ap_listacategoria);
        ap_rclvcategoria.setAdapter(ap_adpcategoria);

        ap_adpcategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ap_varlocnombrecurso = ap_listacategoria.get(ap_rclvcategoria.getChildAdapterPosition(view)).getAp_varstrnombrecurso();
                Toast.makeText(getContext(), "Seleccionó: " + ap_varlocnombrecurso, Toast.LENGTH_SHORT).show();
            }
        });
    }
}