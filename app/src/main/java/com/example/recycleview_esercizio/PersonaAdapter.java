package com.example.recycleview_esercizio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder> {

    private final Persona[] persone;

    public PersonaAdapter(Persona[] persone) {
        this.persone = persone;
    }

    @NonNull
    @Override
    public PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.persone_riga,parent, false);

        return new PersonaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaViewHolder holder, int position) {
        holder.bind(persone[position]);

    }

    @Override
    public int getItemCount() {
        return persone.length;
    }

    static class PersonaViewHolder extends RecyclerView.ViewHolder{

        private final TextView nome;
        private final TextView cognome;
        private final ImageView immagine;

        public PersonaViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.text_view_nome);
            cognome = itemView.findViewById(R.id.text_view_cognome);
            immagine = itemView.findViewById(R.id.image_view_persona);
        }

        public void bind(Persona persona){
            nome.setText(persona.getName());
            cognome.setText(persona.getCognome());
            immagine.setImageResource(persona.getImage());
        }
    }
}
