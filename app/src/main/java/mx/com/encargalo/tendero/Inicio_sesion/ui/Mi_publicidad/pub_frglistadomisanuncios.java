package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Adapters.pub_adplistadofrglistado;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Entidades.Publicidad;

public class pub_frglistadomisanuncios extends Fragment {

    pub_adplistadofrglistado pub_adplista;
    RecyclerView pub_rclvpublicidad;
    ArrayList<Publicidad> pub_listapublicidad;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pub_frglistadomisanuncios, container, false);
        pub_rclvpublicidad = vista.findViewById(R.id.pub_lmarclvmisanuncios);
        pub_listapublicidad = new ArrayList<>();

        //cargar la lista
        pub_cargarLista();
        //mostrar datos
        pub_mostrarData();

        return vista;
    }

    public void pub_cargarLista() {
        pub_listapublicidad.add(new Publicidad("Publicidad 1","18/09/2022","30","100","59%",R.drawable.ic_launcher_background));
        pub_listapublicidad.add(new Publicidad("Publicidad 2","20/10/2022","60","50","14%",R.drawable.ic_launcher_background));
        pub_listapublicidad.add(new Publicidad("Publicidad 3","01/06/2022","90","210","28%",R.drawable.ic_launcher_background));
    }

    private void pub_mostrarData() {
        pub_rclvpublicidad.setLayoutManager(new LinearLayoutManager(getContext()));
        pub_adplista = new pub_adplistadofrglistado(getContext(), pub_listapublicidad);
        pub_rclvpublicidad.setAdapter(pub_adplista);

        pub_adplista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pub_strtitulo = pub_listapublicidad.get(pub_rclvpublicidad.getChildAdapterPosition(view)).getTitulo();
                Toast.makeText(getContext(), "Selecciono: " + pub_strtitulo, Toast.LENGTH_SHORT).show();
                Navigation.findNavController(view).navigate(R.id.nav_detalleanuncio);
            }
        });
    }
}