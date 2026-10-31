package com.spotify.encoremobile.recyclerviewutil;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p.ckr0;
import p.s611;
import p.wic0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Deprecated
public class SmoothScrollingGridLayoutManager extends GridLayoutManager {
    public final void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        ckr0 ckr0Var = new ckr0((byte) 1, recyclerView.getContext(), this);
        ((wic0) ckr0Var).a = i;
        S0(ckr0Var);
    }
}
