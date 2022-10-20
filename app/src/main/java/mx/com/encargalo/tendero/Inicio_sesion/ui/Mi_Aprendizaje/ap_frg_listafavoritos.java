package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.com.encargalo.R;

/**
 * A simple {@link Fragment} subclass.
<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgmisfavoritos.java
 * Use the {@link ap_frgmisfavoritos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ap_frgmisfavoritos extends Fragment {
========
 * Use the {@link ap_frg_listafavoritos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ap_frg_listafavoritos extends Fragment {
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listafavoritos.java

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgmisfavoritos.java
    public ap_frgmisfavoritos() {
========
    public ap_frg_listafavoritos() {
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listafavoritos.java
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ap_frg03.
     */
    // TODO: Rename and change types and number of parameters
<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgmisfavoritos.java
    public static ap_frgmisfavoritos newInstance(String param1, String param2) {
        ap_frgmisfavoritos fragment = new ap_frgmisfavoritos();
========
    public static ap_frg_listafavoritos newInstance(String param1, String param2) {
        ap_frg_listafavoritos fragment = new ap_frg_listafavoritos();
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listafavoritos.java
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
<<<<<<<< HEAD:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frgmisfavoritos.java
        return inflater.inflate(R.layout.fragment_ap_frgmisfavoritos, container, false);
========
        return inflater.inflate(R.layout.fragment_ap_frg_listafavoritos, container, false);
>>>>>>>> b5e437f75cb2340b002948a939969f952b053ab5:app/src/main/java/mx/com/encargalo/tendero/Inicio_sesion/ui/Mi_Aprendizaje/ap_frg_listafavoritos.java
    }
}