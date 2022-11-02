package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
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

//    OnDestruir mCallback;

    /*public interface OnDestruir {
        public void onDestruirFragmento(Fragment miFragmento);
        // Puedes agregar más si necesitas
    }*/

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
//                showDialogoPagar();
//                showDialogoPagar2();
            }
        });
        pub_pabtncancelarpago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_crearanuncio);
//                showDialogoCancelar();
            }
        });

        return vista;
    }



    /**
     * INTENTOS DE HACER FUCIONAR EL DIALOG (IGNORAR)
     *
     */


    private void showDialogoPagar2() {
        new AlertDialog.Builder(getContext())
                .setTitle("Pregunta")
                .setMessage("mensaje")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Crea el nuevo fragmento y la transacción.
                        Fragment nuevoFragmento = new Fragment();
                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.nav_codigopago, nuevoFragmento);
                        transaction.addToBackStack(null);

                        // Commit a la transacción
                        transaction.commit();
//                        Fragment.this.mCallback.onDestruirFragmento(this);
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                }).show();


    }

    private void  showDialogoPagar(){
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.pub_lytmodelpagaranuncio);
        dialog.show();
        Button btnpagar = dialog.findViewById(R.id.pub_mpabtnaceptar);
        Button btncancelar = dialog.findViewById(R.id.pub_mpabtncancelar);
        btnpagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment nuevoFragmento = new Fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.nav_crearanuncio, nuevoFragmento);
                transaction.addToBackStack(null);

                // Commit a la transacción
                transaction.commit();
//                Navigation.findNavController(view).navigate(R.id.nav_codigopago);
                /*Intent i =new Intent(getContext(), SplashPrueba.class);
                startActivity(i);*/
            }
        });
        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    private void  showDialogoCancelar(){
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.pub_lytmodelcancelaranuncio);
        dialog.show();
        Button btnpagar = dialog.findViewById(R.id.pub_mcabtnaceptar);
        Button btncancelar = dialog.findViewById(R.id.pub_mcabtncancelar);
        /*btnpagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_codigopago);
            }
        });*/
        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
}