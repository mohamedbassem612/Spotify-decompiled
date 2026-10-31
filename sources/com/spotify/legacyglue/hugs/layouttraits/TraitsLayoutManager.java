package com.spotify.legacyglue.hugs.layouttraits;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p.a1g1;
import p.c681;
import p.cg50;
import p.l7m0;
import p.lg50;
import p.n611;
import p.x6g1;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public class TraitsLayoutManager extends GridLayoutManager {
    public final c681 o1;
    public final x6g1 p1;
    public final l7m0 q1;
    public a1g1 r1;

    public TraitsLayoutManager(l7m0 l7m0Var, int i) {
        super(i);
        this.o1 = new c681(this, (byte) 24);
        this.p1 = new x6g1(this);
        this.q1 = l7m0Var;
    }

    public final void J1(int i) {
        l7m0 l7m0Var = this.q1;
        if (l7m0Var != null && i != ((GridLayoutManager) this).h1) {
            l7m0Var.h();
        }
        super.J1(i);
    }

    public final void f0(z511 z511Var, z511 z511Var2) {
        if (z511Var2 != null) {
            this.r1 = new a1g1(z511Var2, (byte) 1);
        } else {
            this.r1 = null;
        }
    }

    public final void g0(RecyclerView recyclerView) {
        lg50 lg50Var = new lg50(this, recyclerView);
        lg50Var.c = true;
        ((GridLayoutManager) this).m1 = lg50Var;
        recyclerView.j(this.p1);
        z511 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.r1 = new a1g1(adapter, (byte) 1);
        } else {
            this.r1 = null;
        }
    }

    public final void h0(RecyclerView recyclerView, n611 n611Var) {
        super/*androidx.recyclerview.widget.LinearLayoutManager*/.h0(recyclerView, n611Var);
        ((GridLayoutManager) this).m1 = new cg50();
        recyclerView.n0(this.p1);
        z511 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.r1 = new a1g1(adapter, (byte) 1);
        } else {
            this.r1 = null;
        }
    }

    public final void n0(RecyclerView recyclerView, int i, int i2) {
        super.n0(recyclerView, i, i2);
        this.q1.h();
    }

    public final void o0(RecyclerView recyclerView) {
        super.o0(recyclerView);
        this.q1.h();
    }

    public final void p0(RecyclerView recyclerView, int i, int i2) {
        super.p0(recyclerView, i, i2);
        this.q1.h();
    }

    public final void q0(RecyclerView recyclerView, int i, int i2) {
        super.q0(recyclerView, i, i2);
        this.q1.h();
    }

    public final void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.s0(recyclerView, i, i2, obj);
        this.q1.h();
    }
}
