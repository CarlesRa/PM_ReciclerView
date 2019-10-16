package com.carlesramos.recicleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.carlesramos.recicleview.model.Country;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.BanderasViewHolder> {
    private Country[] datos;

    public CountryAdapter(Country[] datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public CountryAdapter.BanderasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_county, parent, false);
        BanderasViewHolder bvh = new BanderasViewHolder(itemView);
        return bvh;
    }

    @Override
    public void onBindViewHolder(@NonNull BanderasViewHolder holder, int position) {
        Country item = datos[position];
        holder.bindCountry(item);
    }

    @Override
    public int getItemCount() {
        return datos.length;
    }

    static class BanderasViewHolder extends RecyclerView.ViewHolder{
        private TextView tvPais;
        private TextView tvCapital;
        private TextView tvPoblacio;
        private ImageView ivBandera;

        public BanderasViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPais = itemView.findViewById(R.id.tvPais);
            tvCapital = itemView.findViewById(R.id.tvCapital);
            tvPoblacio = itemView.findViewById(R.id.tvEtiquetaPoblacio);
            ivBandera = itemView.findViewById(R.id.ivBandera);
        }

        public void bindCountry(Country c){
            tvPais.setText(c.getCountryName());
            tvCapital.setText(c.getCapital());
            tvPoblacio.setText(String.valueOf(c.getPopulation()));
            ivBandera.setImageResource(c.getImageUrl());
        }
    }
}
