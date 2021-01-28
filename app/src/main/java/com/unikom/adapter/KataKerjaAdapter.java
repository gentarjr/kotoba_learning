package com.unikom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.entity.KataKerjaEntity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KataKerjaAdapter extends RecyclerView.Adapter<KataKerjaAdapter.ColorViewHolder> {

    private ArrayList<KataKerjaEntity> listKata = new ArrayList<>();

    private OnKerjaClickListener onKerjaClickListener;

    public KataKerjaAdapter(OnKerjaClickListener onKerjaClickListener, List<KataKerjaEntity> kataKerjaEntities) {
        this.onKerjaClickListener = onKerjaClickListener;
        if (kataKerjaEntities == null) return;
        listKata.clear();
        listKata.addAll(kataKerjaEntities);
    }
    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        return new ColorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ColorViewHolder holder, final int position) {
        final KataKerjaEntity kataKerjaEntity = listKata.get(position);
        holder.tvCina.setText(String.valueOf(kataKerjaEntity.getKata_cina()));
        holder.tvEja.setText(kataKerjaEntity.getEja_kata());
        holder.tvIndo.setText(kataKerjaEntity.getKata_indo());
        holder.btnPlay.setOnClickListener(v -> onKerjaClickListener.onItemClick(holder.itemView, kataKerjaEntity));
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
