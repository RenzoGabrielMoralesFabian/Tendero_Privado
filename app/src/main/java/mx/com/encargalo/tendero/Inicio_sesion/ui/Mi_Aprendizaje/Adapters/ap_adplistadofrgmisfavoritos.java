package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Favorito;

public class ap_adplistadofrgmisfavoritos extends RecyclerView.Adapter<ap_adplistadofrgmisfavoritos.ViewHolder> implements View.OnClickListener{

    LayoutInflater ap_inflater;
    ArrayList<Favorito> ap_model;

    Context context;

    private View.OnClickListener ap_listener;

    public ap_adplistadofrgmisfavoritos(Context context, ArrayList<Favorito> model){
        this.ap_inflater =LayoutInflater.from(context);
        this.ap_model =model;
        this.context=context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = ap_inflater.inflate(R.layout.ap_mfitemcardfavorito, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.ap_listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ap_adplistadofrgmisfavoritos.ViewHolder holder, int position) {
        String titulo = ap_model.get(position).getAp_strtitulo();
        holder.titulo.setText(String.valueOf(titulo));

        String estado = ap_model.get(position).getAp_strestado();

        /*String estado = ap_model.get(position).getAp_strestado();
        Boolean btnestado = null;
        if(estado == "ACTIVO"){
            btnestado=true;
        }*/

//        Toast.makeText(context, estado, Toast.LENGTH_SHORT).show();

        /*if(estado.equals("ACTIVO")){
            holder.lottieFav.setFrame(100);
        }else {
            holder.lottieFav.setFrame(0);
        }*/

        if(holder.btnFav){
            holder.lottieFav.setFrame(100);
        }else {
            holder.lottieFav.setFrame(0);
        }//----------------------------------------solo para presentacion, borrar luego

        holder.lottieFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.btnFav){
                    holder.lottieFav.setMaxFrame(0);
                    holder.btnFav = false;
                }else {
                    holder.lottieFav.setMinAndMaxProgress(0.0f,1.0f);
                    holder.lottieFav.playAnimation();
                    holder.btnFav = true;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return ap_model.size();
    }

    @Override
    public void onClick(View view) {
        if(ap_listener !=null){
            ap_listener.onClick(view);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        LottieAnimationView lottieFav;
        private Boolean btnFav = true;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.ap_mftxtnombrecurso);
            lottieFav= itemView.findViewById(R.id.ap_mfbtnanimacion);
        }
    }
}
