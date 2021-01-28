package com.unikom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.entity.KataBendaEntity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class KataBendaAdapter extends RecyclerView.Adapter<KataBendaAdapter.ColorViewHolder> {

    private ArrayList<KataBendaEntity> listKata = new ArrayList<>();

    private OnBendaClickListener onBendaClickListener;

    public KataBendaAdapter(OnBendaClickListener onBendaClickListener, List<KataBendaEntity> kataBendaEntities) {
        this.onBendaClickListener = onBendaClickListener;
        if (kataBendaEntities == null) return;
        listKata.clear();
        listKata.addAll(kataBendaEntities);
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        return new ColorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ColorViewHolder holder, final int position) {
        final KataBendaEntity kataBendaEntity = listKata.get(position);
        holder.tvCina.setText(String.valueOf(kataBendaEntity.getKata_cina()));
        holder.tvEja.setText(kataBendaEntity.getEja_kata());
        holder.tvIndo.setText(kataBendaEntity.getKata_indo());
        holder.btnPlay.setOnClickListener(v -> onBendaClickListener.onItemClick(holder.itemView, kataBendaEntity));
    }

    @Override
    public int getItemCount() {
        return listKata.size();
    }

    static class ColorViewHolder extends RecyclerView.ViewHolder {

        TextView tvCina, tvEja, tvIndo;
        ImageButton btnPlay;

        public ColorViewHolder(@NonNull View view) {
            super(view);

            tvCina = view.findViewById(R.id.tv_cina);
            tvEja = view.findViewById(R.id.tv_eja);
            tvIndo = view.findViewById(R.id.tv_indo);
            btnPlay = view.findViewById(R.id.btnPlay);

        }
    }

}