package com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import kotlin.Metadata;
import p.cq91;
import p.n611;
import p.s611;
import p.wic0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WheelControlLayoutManager extends LinearLayoutManager {
    public final int g1;
    public RecyclerView h1;

    public WheelControlLayoutManager(int i) {
        super(0);
        this.g1 = i;
    }

    public final void C1() {
        float f = ((a) this).O0 / 2.0f;
        int I = I();
        for (int i = 0; i < I; i++) {
            View viewH = H(i);
            if (viewH != null) {
                float fPow = (float) Math.pow((Math.abs(f - ((a.P(viewH) + a.M(viewH)) / 2.0f)) * 2.0f) / ((a) this).O0, 2.0d);
                viewH.setAlpha(fPow >= 0.0f ? 1.0f - fPow : 0.0f);
            }
        }
    }

    public final int G0(int i, n611 n611Var, s611 s611Var) {
        int iG0 = super.G0(i, n611Var, s611Var);
        C1();
        return iG0;
    }

    public final void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        cq91 cq91Var = new cq91(recyclerView.getContext(), (byte) 1);
        ((wic0) cq91Var).a = i;
        S0(cq91Var);
    }

    public final void g0(RecyclerView recyclerView) {
        this.h1 = recyclerView;
    }

    public final void t0(n611 n611Var, s611 s611Var) {
        RecyclerView recyclerView = this.h1;
        if (recyclerView != null) {
            View view = (View) recyclerView.getParent();
            if (view.getWidth() > 0 && recyclerView.getPaddingLeft() == 0) {
                int width = (view.getWidth() / 2) - (recyclerView.getContext().getResources().getDimensionPixelSize(this.g1) / 2);
                recyclerView.setPadding(width, 0, width, 0);
            }
        }
        super.t0(n611Var, s611Var);
        C1();
    }
}
