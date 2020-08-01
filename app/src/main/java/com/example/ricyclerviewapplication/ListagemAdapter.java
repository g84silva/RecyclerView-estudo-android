package com.example.ricyclerviewapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ricyclerviewapplication.model.Receitas;

import java.util.LinkedList;

public class ListagemAdapter extends RecyclerView.Adapter<ListagemAdapter.ReceitaHolder> {

    private Context context;
    private LinkedList<Receitas> listaDeReceitas;

    private final LayoutInflater mInflater;

    public ListagemAdapter(Context context, LinkedList listaDeReceitas) {
        this.context = context;
        this.listaDeReceitas = listaDeReceitas;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ReceitaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mInflater.inflate(R.layout.item_list, parent, false);

        return new ReceitaHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReceitaHolder holder, int position) {

        Receitas receita = listaDeReceitas.get(position);

        String titulo = receita.getName();
        String mensagem = receita.getDescription();

        holder.mTitulo.setText(titulo);
        holder.mMensagem.setText(mensagem);
    }

    @Override
    public int getItemCount() {
        return listaDeReceitas.size();
    }

    class ReceitaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView mTitulo;
        public TextView mMensagem;
        public ImageView mImage;
        public ConstraintLayout mComponentepai;

        public ReceitaHolder(@NonNull View itemView) {
            super(itemView);

            mTitulo = itemView.findViewById(R.id.titulo);
            mMensagem = itemView.findViewById(R.id.mensagem);
            mImage = itemView.findViewById(R.id.image_detail);
            mComponentepai = itemView.findViewById(R.id.componente_pai);

            mComponentepai.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetalhesActivity.class);
            intent.putExtra("Receitas", listaDeReceitas.get(getAdapterPosition()));
            context.startActivity(intent);
        }
    }
}

