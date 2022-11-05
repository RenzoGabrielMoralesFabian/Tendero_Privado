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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgmisfavoritos;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Favorito;

public class ap_frgmisfavoritos extends Fragment {

    ap_adplistadofrgmisfavoritos ap_adpfavoritos;
    RecyclerView ap_rclvfavoritos;
    ArrayList<Favorito> ap_listafavoritos;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgmisfavoritos, container, false);
        ap_rclvfavoritos = vista.findViewById(R.id.ap_mfrclvmisfavoritos);
        ap_listafavoritos = new ArrayList<>();

        ap_cargarLista();

        ap_mostrarData();

        return vista;
    }

    private void ap_cargarLista() {
        ap_listafavoritos.add(new Favorito("Favorito 1"));
        ap_listafavoritos.add(new Favorito("Favorito 2"));
        ap_listafavoritos.add(new Favorito("Favorito 3"));
    }

    private void ap_mostrarData() {
        ap_rclvfavoritos.setLayoutManager(new LinearLayoutManager(getContext()));
        ap_adpfavoritos = new ap_adplistadofrgmisfavoritos(getContext(), ap_listafavoritos);
        ap_rclvfavoritos.setAdapter(ap_adpfavoritos);

        ap_adpfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = ap_listafavoritos.get(ap_rclvfavoritos.getChildAdapterPosition(view)).getTitulo();
                Toast.makeText(getContext(), "Seleccionó: " + titulo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}