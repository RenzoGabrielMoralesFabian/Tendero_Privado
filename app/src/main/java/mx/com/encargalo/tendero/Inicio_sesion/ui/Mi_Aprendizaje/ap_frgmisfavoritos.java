package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgmisfavoritos;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Curso;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Favorito;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Adapters.pub_adplistadofrglistado;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Entidades.Publicidad;

public class ap_frgmisfavoritos extends Fragment {

    ap_adplistadofrgmisfavoritos ap_adpfavoritos;
    RecyclerView ap_rclvfavoritos;
    ArrayList<Favorito> ap_listafavoritos;

    Favorito favorito;
    RequestQueue requestQueue;
    JsonObjectRequest request;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgmisfavoritos, container, false);
        ap_rclvfavoritos = vista.findViewById(R.id.ap_mfrclvmisfavoritos);
        ap_rclvfavoritos.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ap_rclvfavoritos.setHasFixedSize(true);
        ap_listafavoritos = new ArrayList<>();

        requestQueue = Volley.newRequestQueue(getContext());

        parseJSON();

        return vista;
    }

    private void parseJSON() {
        String URL = "http://129.151.103.228/Encargalo/APIS/TenderoApp/c_listar_favoritos_aprendizaje.php?id_DocumentoPersona=11111119";

        request = new JsonObjectRequest(Request.Method.GET, URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        favorito = null;
                        JSONArray json=response.optJSONArray("consulta"); ///--------------------///--------------------///--------------------
                        try {
                            ap_listafavoritos.clear();
                            for (int i = 0; i<json.length();i++){
                                favorito=new Favorito();
                                JSONObject jsonObject=null;
                                jsonObject=json.getJSONObject(i);
                                favorito.setAp_strtitulo(jsonObject.optString("apreDescripcionRecurso"));
                                ap_listafavoritos.add(favorito);

                            }
                            ap_adpfavoritos = new ap_adplistadofrgmisfavoritos(getContext(), ap_listafavoritos);
                            ap_rclvfavoritos.setAdapter(ap_adpfavoritos);
                            ap_adpfavoritos.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    String titulo = ap_listafavoritos.get(ap_rclvfavoritos.getChildAdapterPosition(view)).getAp_strtitulo();
                                    Toast.makeText(getContext(), "Seleccionó: " + titulo, Toast.LENGTH_SHORT).show();
                                }
                            });

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), "Error al consultar"+ error.toString(), Toast.LENGTH_SHORT).show();

            }
        });
        requestQueue.add(request);
    }
}