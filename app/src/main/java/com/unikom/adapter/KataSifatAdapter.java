package com.unikom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.entity.KataSifatEntity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KataSifatAdapter extends RecyclerView.Adapter<KataSifatAdapter.ColorViewHolder> {

    private ArrayList<KataSifatEntity> listKata = new ArrayList<>();

    private OnSifatClickListener onSifatClickListener;

    public KataSifatAdapter(OnSifatClickListener onSifatClickListener, List<KataSifatEntity> kataSifatEntities) {
        this.onSifatClickListener = onSifatClickListener;
        if (kataSifatEntities == null) return;
        listKata.clear();
        listKata.addAll(kataSifatEntities);
    }
    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        return new ColorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ColorViewHolder holder, final int position) {
        final KataSifatEntity kataSifatEntity = listKata.get(position);
        holder.tvCina.setText(String.valueOf(kataSifatEntity.getKata_cina()));
        holder.tvEja.setText(kataSifatEntity.getEja_kata());
        holder.tvIndo.setText(kataSifatEntity.getKata_indo());
        holder.btnPlay.setOnClickListener(v -> onSifatClickListener.onItemClick(holder.itemView, kataSifatEntity));
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
