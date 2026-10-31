package io.doist.recyclerviewext.sticky_headers;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p.b611;
import p.d7v0;
import p.kzb1;
import p.n611;
import p.s611;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class StickyHeadersLinearLayoutManager<T extends z511 & d7v0> extends LinearLayoutManager {
    public d7v0 g1;
    public int h1;
    public int i1;

    public final int G0(int i, n611 n611Var, s611 s611Var) {
        int iG0 = super.G0(i, n611Var, s611Var);
        if (iG0 == 0) {
            return iG0;
        }
        throw null;
    }

    public final void H0(int i) {
        w1(i, Integer.MIN_VALUE);
        throw null;
    }

    public final int I0(int i, n611 n611Var, s611 s611Var) {
        int iI0 = super.I0(i, n611Var, s611Var);
        if (iI0 == 0) {
            return iI0;
        }
        throw null;
    }

    public final void f0(z511 z511Var, z511 z511Var2) {
        d7v0 d7v0Var = this.g1;
        if (d7v0Var != null) {
            d7v0Var.z((b611) null);
        }
        if (!(z511Var2 instanceof d7v0)) {
            this.g1 = null;
            throw null;
        }
        this.g1 = (d7v0) z511Var2;
        z511Var2.w((b611) null);
        throw null;
    }

    public final void g0(RecyclerView recyclerView) {
        d7v0 adapter = recyclerView.getAdapter();
        d7v0 d7v0Var = this.g1;
        if (d7v0Var != null) {
            d7v0Var.z((b611) null);
        }
        if (!(adapter instanceof d7v0)) {
            this.g1 = null;
            throw null;
        }
        this.g1 = adapter;
        adapter.w((b611) null);
        throw null;
    }

    public final void t0(n611 n611Var, s611 s611Var) {
        super.t0(n611Var, s611Var);
        if (!s611Var.g) {
            throw null;
        }
    }

    public final void w0(Parcelable parcelable) {
        if (parcelable instanceof kzb1) {
            kzb1 kzb1Var = (kzb1) parcelable;
            this.h1 = kzb1Var.b;
            this.i1 = kzb1Var.c;
            parcelable = kzb1Var.a;
        }
        super.w0(parcelable);
    }

    public final void w1(int i, int i2) {
        this.h1 = -1;
        this.i1 = Integer.MIN_VALUE;
        throw null;
    }

    public final Parcelable x0() {
        kzb1 kzb1Var = new kzb1();
        kzb1Var.a = super.x0();
        kzb1Var.b = this.h1;
        kzb1Var.c = this.i1;
        return kzb1Var;
    }
}
