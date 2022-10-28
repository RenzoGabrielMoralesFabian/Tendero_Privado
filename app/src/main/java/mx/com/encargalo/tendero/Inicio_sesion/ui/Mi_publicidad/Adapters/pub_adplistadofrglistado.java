package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Entidades.Publicidad;

public class pub_adplistadofrglistado extends RecyclerView.Adapter<pub_adplistadofrglistado.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    ArrayList<Publicidad> model;

    //listener
    private View.OnClickListener listener;

    public pub_adplistadofrglistado(Context context, ArrayList<Publicidad> model){
        this.inflater=LayoutInflater.from(context);
        this.model=model;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.pub_lmaitemcardanuncio, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull pub_adplistadofrglistado.ViewHolder holder, int position) {
        String titulo = model.get(position).getTitulo();
        String descripcion = model.get(position).getDescripcion();
        int imagen = model.get(position).getImagenid();
        holder.titulo.setText(titulo);
        holder.descripcion.setText(descripcion);
        holder.imagen.setImageResource(imagen);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, descripcion;
        ImageView imagen;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.pub_ltxttitulo);
            descripcion = itemView.findViewById(R.id.pub_ltxtdescripcion);
            imagen = itemView.findViewById(R.id.pub_limgvwimgprevia);
        }
    }
}
