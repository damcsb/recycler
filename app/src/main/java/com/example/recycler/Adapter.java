package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>  {

    List<Persona> personas;

    public Adapter(List<Persona> personas) {
        this.personas = personas;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent, false);
        AdapterViewHolder holder = new AdapterViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Persona persona = personas.get(position);
        holder.nombre.setText(persona.getNombre());
        holder.apellido.setText(persona.getApellido());
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{

        TextView nombre, apellido;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.personanombre);
            apellido = itemView.findViewById(R.id.personaapellido);
        }
    }

}
