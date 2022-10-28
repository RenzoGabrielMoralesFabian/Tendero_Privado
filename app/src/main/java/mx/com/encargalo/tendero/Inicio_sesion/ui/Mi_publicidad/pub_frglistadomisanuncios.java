package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Adapters.pub_adplistadofrglistado;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Entidades.Publicidad;

public class pub_frglistadomisanuncios extends Fragment {

    pub_adplistadofrglistado adplistado;
    RecyclerView recyclerViewPublicidad;
    ArrayList<Publicidad> listaPublicidad;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pub_frglistadomisanuncios, container, false);
        recyclerViewPublicidad = vista.findViewById(R.id.pub_lmarclvmisanuncios);
        listaPublicidad = new ArrayList<>();

        //cargar la lista
        cargarLista();
        //mostrar datos
        mostrarData();

        return vista;
    }

    public void cargarLista() {
        listaPublicidad.add(new Publicidad("Publicidad 1","Descripción de la publicidad",R.drawable.ic_launcher_background));
        listaPublicidad.add(new Publicidad("Publicidad 2","Descripción de la publicidad",R.drawable.ic_launcher_background));
        listaPublicidad.add(new Publicidad("Publicidad 3","Descripción de la publicidad",R.drawable.ic_launcher_background));
    }

    private void mostrarData() {
        recyclerViewPublicidad.setLayoutManager(new LinearLayoutManager(getContext()));
        adplistado = new pub_adplistadofrglistado(getContext(), listaPublicidad);
        recyclerViewPublicidad.setAdapter(adplistado);

        adplistado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = listaPublicidad.get(recyclerViewPublicidad.getChildAdapterPosition(view)).getTitulo();
                Toast.makeText(getContext(), "Selecciono: " + titulo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}