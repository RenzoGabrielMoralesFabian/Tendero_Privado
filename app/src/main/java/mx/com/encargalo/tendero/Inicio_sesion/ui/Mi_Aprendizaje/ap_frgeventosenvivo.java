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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgeventosenvivo;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.EventoEnVivo;

public class ap_frgeventosenvivo extends Fragment {

    ap_adplistadofrgeventosenvivo ap_adpeventosenvivo;
    RecyclerView ap_rclvevento;
    ArrayList<EventoEnVivo> ap_listaeventoenvivo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgeventosenvivo, container, false);
        ap_rclvevento =vista.findViewById(R.id.ap_eevrclveventos);
        ap_listaeventoenvivo = new ArrayList<>();

        ap_cargaLista();

        ap_mostrarData();

        return vista;
    }

    private void ap_cargaLista() {
        ap_listaeventoenvivo.add(new EventoEnVivo("Conoce sobre el programa Ventas top","5 sept 2022 07:00 p.m. Lima"));
        ap_listaeventoenvivo.add(new EventoEnVivo("Conoce sobre el programa Ventas top","5 sept 2022 07:00 p.m. Lima"));
    }

    private void ap_mostrarData() {
        ap_rclvevento.setLayoutManager(new LinearLayoutManager(getContext()));
        ap_adpeventosenvivo = new ap_adplistadofrgeventosenvivo(getContext(), ap_listaeventoenvivo);
        ap_rclvevento.setAdapter(ap_adpeventosenvivo);

        ap_adpeventosenvivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String charla = ap_listaeventoenvivo.get(ap_rclvevento.getChildAdapterPosition(view)).getAp_strcharla();
                Toast.makeText(getContext(), "Seleccionó: " + charla, Toast.LENGTH_SHORT).show();
            }
        });
    }
}