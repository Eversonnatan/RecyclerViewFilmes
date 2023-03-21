package br.com.etecia.recyclerviewfilmes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Filmes> listFilmes;

    //criando construtor da classe com paramêtros

    public MyAdapter(Context mContexto, List<Filmes> listFilmes) {
        this.mContexto = mContexto;
        this.listFilmes = listFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return listFilmes.size();
    }

    //criar a classe ViewHolder
    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView idTituloFilmes;
        ImageView idImgFilmes;
        CardView idCardFilmes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idCardFilmes = itemView.findViewById(R.id.idCardFilmes);
            idImgFilmes = itemView.findViewById(R.id.idImgFilmes);
        }
    }

}
