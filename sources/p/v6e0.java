package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class v6e0 implements j4m {
    public final nhr0 a;
    public final k241 b;
    public final u7r0 c;
    public final vu30 d;
    public final bsp0 e;
    public final bbr0 f;
    public s7e0 g;
    public t7e0 i;
    public ymd0 t;
    public final kdn0 h = new kdn0(l3r.a);
    public final z11 X = new z11(this, (byte) 25);

    public v6e0(nhr0 nhr0Var, k241 k241Var, u7r0 u7r0Var, vu30 vu30Var, bsp0 bsp0Var, bbr0 bbr0Var) {
        this.a = nhr0Var;
        this.b = k241Var;
        this.c = u7r0Var;
        this.d = vu30Var;
        this.e = bsp0Var;
        this.f = bbr0Var;
    }

    @Override // p.j4m
    public final View a() {
        s7e0 s7e0Var = this.g;
        if (s7e0Var != null) {
            return (View) s7e0Var.getView();
        }
        return null;
    }

    @Override // p.j4m
    public final void b(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar) {
        ees eesVar = (ees) this.d.invoke(new s6e0(this, (byte) 0), new t6e0(this, (byte) 0));
        u6e0 u6e0Var = new u6e0(this);
        a680 a680Var = eesVar.a;
        a680Var.c = u6e0Var;
        u7r0 u7r0Var = this.c;
        s6t0 s6t0Var = u7r0Var.a;
        if (s6t0Var != null) {
            a680Var.a = new f38(s6t0Var, (byte) 3);
        }
        g4h1 g4h1Var = u7r0Var.b;
        if (g4h1Var != null) {
            a680Var.d = new f38(g4h1Var, (byte) 4);
        }
        iu30 iu30Var = u7r0Var.c;
        if (iu30Var != null) {
            a680Var.e = new u5e(iu30Var, this, (byte) 2);
        }
        if (u7r0Var.d) {
            eesVar.f = true;
        }
        aye1 aye1Var = u7r0Var.e;
        if (aye1Var != null) {
            eesVar.g = aye1Var;
        }
        aye1 aye1Var2 = u7r0Var.f;
        if (aye1Var2 != null) {
            eesVar.h = aye1Var2;
        }
        pu00 pu00Var = (pu00) this.f.b0(pu00.class).a();
        eesVar.i = pu00Var != null ? pu00Var.a : false;
        eesVar.j = new u5b(this, (byte) 3);
        eesVar.a.f = new eb80(this, (byte) 17);
        ges gesVarA = eesVar.a(context);
        gesVarA.E(jhlVar, this.b);
        this.g = new s7e0(gesVarA);
        ymd0 renderedState = gesVarA.getRenderedState();
        this.t = renderedState;
        renderedState.getClass();
        renderedState.g(this.X);
    }

    @Override // p.j4m
    public final f4h1 c() {
        return this.g;
    }

    @Override // p.j4m
    public final void d() {
        ymd0 ymd0Var = this.t;
        if (ymd0Var != null) {
            ymd0Var.k(this.X);
        }
        this.h.m(l3r.a);
        this.t = null;
        t7e0 t7e0Var = this.i;
        if (t7e0Var != null) {
            tac0 tac0Var = t7e0Var.b;
            if (tac0Var.i.compareTo(w8c0.c) > 0) {
                tac0Var.i(w8c0.a);
            }
            jhl jhlVar = t7e0Var.c;
            x8c0 x8c0Var = jhlVar.a;
            ek2 ek2Var = jhlVar.d;
            x8c0Var.d(ek2Var);
            jhlVar.b.d(ek2Var);
        }
        this.i = null;
        this.g = null;
    }

    @Override // p.j4m
    public final ymd0 e() {
        return this.h;
    }

    public abstract l5r0 f(Object obj, t7e0 t7e0Var);

    @Override // p.j4m
    public final Bundle serialize() {
        return null;
    }
}
