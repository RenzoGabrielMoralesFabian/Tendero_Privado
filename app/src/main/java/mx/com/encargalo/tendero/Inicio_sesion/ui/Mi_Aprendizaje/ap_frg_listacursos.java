package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.com.encargalo.R;

/**
 * A simple {@link Fragment} subclass.
<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgcursoscategoria.java
 * Use the {@link ap_frgcursoscategoria#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ap_frgcursoscategoria extends Fragment {
========
 * Use the {@link ap_frg_listacursos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ap_frg_listacursos extends Fragment {
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listacursos.java

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgcursoscategoria.java
    public ap_frgcursoscategoria() {
========
    public ap_frg_listacursos() {
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listacursos.java
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ap_frg05.
     */
    // TODO: Rename and change types and number of parameters
<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgcursoscategoria.java
    public static ap_frgcursoscategoria newInstance(String param1, String param2) {
        ap_frgcursoscategoria fragment = new ap_frgcursoscategoria();
========
    public static ap_frg_listacursos newInstance(String param1, String param2) {
        ap_frg_listacursos fragment = new ap_frg_listacursos();
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listacursos.java
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgcursoscategoria.java
        return inflater.inflate(R.layout.fragment_ap_frgcursoscategoria, container, false);
========
        return inflater.inflate(R.layout.fragment_ap_frg_listacursos, container, false);
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listacursos.java
    }
}