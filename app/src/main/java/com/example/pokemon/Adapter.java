package com.example.pokemon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PokemonViewHolder> {

    private List<Data.Pokemon> listPokemons;
    private ArrayList<Integer> numberOfPokemons;
    private Context context;

    private int start;
    private int end;

    public Adapter(Context context, List<Data.Pokemon> pokemons, ArrayList<Integer> numerodepokemons, int debut, int fin) {
        this.context = context;
        this.listPokemons = pokemons;
        this.numberOfPokemons = numerodepokemons;
        this.start = debut;
        this.end = fin;
    }

    public void setpokemons(List<Data.Pokemon> pokemons, int debut, int fin) {
        this.listPokemons = pokemons;
        this.start = debut;
        this.end = fin;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Adapter.PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
        context = viewGroup.getContext();
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PokemonViewHolder holder, int position) {

        String url = listPokemons.get(position).getUrl();
        String a = url.substring(0, url.length() - 1);
        String b = "https://pokeapi.co/api/v2/pokemon/";
        String c = a.substring(b.length());
        String url2 = "https://pokeres.bastionbot.org/images/pokemon/" + c + ".png";
        Glide.with(context)
                .load(url2)
                .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                .into(holder.pic);

        holder.pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pokeurll = url;
                Intent intent = new Intent("custom-message");
                intent.putExtra("pokeurl", pokeurll);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        if (listPokemons != null) {
            return listPokemons.size();
        }
        return 0;
    }


    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView id, name, fullname, htmlurl;
        ImageView pic;
        PokemonViewHolder(View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.imagedetails);
        }

    }
}
