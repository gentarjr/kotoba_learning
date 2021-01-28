package com.unikom.adapter;

import android.view.View;

import com.unikom.kotobalearning.entity.KataKerjaEntity;

public interface OnKerjaClickListener {
    void onItemClick(View view, KataKerjaEntity kataKerjaEntity);
}
