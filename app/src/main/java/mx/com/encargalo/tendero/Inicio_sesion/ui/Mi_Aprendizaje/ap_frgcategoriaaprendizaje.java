package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgultimos;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.LastFavoritos;

public class ap_frgcategoriaaprendizaje extends Fragment {
    Button ap_cabtnvermas;
    Button ap_cabtncursosvender;
    Button ap_cabtncursosautoaprendizaje;
    Button ap_cabtncursosoperiones;

    ap_adplistadofrgultimos ap_adpultimos;
    RecyclerView ap_rclvultimos;
    ArrayList<LastFavoritos> ap_listaultimos;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgcategoriaaprendizaje, container, false);

        //Recycler

        ap_rclvultimos =vista.findViewById(R.id.ap_carclvcursosfavrecientes);
        ap_listaultimos = new ArrayList<>();

        ap_cargaLista();

        ap_mostrarData();


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
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoria);
            }
        });
        ap_cabtncursosautoaprendizaje=vista.findViewById(R.id.ap_cabtncursosautoaprendizaje);
        ap_cabtncursosautoaprendizaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoria);
            }
        });
        ap_cabtncursosoperiones=vista.findViewById(R.id.ap_cabtncursosoperiones);
        ap_cabtncursosoperiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoria);
            }
        });
        return vista;
    }

    private void ap_cargaLista() {
        ap_listaultimos.add(new LastFavoritos("Favorito 1"));
        ap_listaultimos.add(new LastFavoritos("Favorito 2"));
        ap_listaultimos.add(new LastFavoritos("Favorito 3"));
    }

    private void ap_mostrarData() {
        ap_rclvultimos.setLayoutManager(new LinearLayoutManager(getContext()));
        ap_adpultimos = new ap_adplistadofrgultimos(getContext(), ap_listaultimos);
        ap_rclvultimos.setAdapter(ap_adpultimos);

        ap_adpultimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = ap_listaultimos.get(ap_rclvultimos.getChildAdapterPosition(view)).getAp_strtitulo();
                Toast.makeText(getContext(), "Seleccionó: " + titulo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}