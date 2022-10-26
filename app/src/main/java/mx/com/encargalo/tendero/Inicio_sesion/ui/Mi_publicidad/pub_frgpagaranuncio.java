package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mx.com.encargalo.R;

public class pub_frgpagaranuncio extends Fragment {
    Button pub_pabtnpagoefectivo;
    Button pub_pabtncancelarpago;
    Button pub_pabtnpagaranuncio;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pub_frgpagaranuncio, container, false);
        pub_pabtnpagoefectivo=vista.findViewById(R.id.pub_pabtnpagoefectivo);
        pub_pabtncancelarpago=vista.findViewById(R.id.pub_pabtncancelarpago);
        pub_pabtnpagaranuncio=vista.findViewById(R.id.pub_pabtnpagaranuncio);
        pub_pabtncancelarpago.setVisibility(View.INVISIBLE);
        pub_pabtnpagaranuncio.setVisibility(View.INVISIBLE);
        pub_pabtnpagoefectivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pub_pabtncancelarpago.setVisibility(View.VISIBLE);
                pub_pabtnpagaranuncio.setVisibility(View.VISIBLE);

            }
        });
        pub_pabtnpagaranuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_codigopago);
            }
        });
        pub_pabtncancelarpago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_crearanuncio);
            }
        });

        return vista;
    }
}