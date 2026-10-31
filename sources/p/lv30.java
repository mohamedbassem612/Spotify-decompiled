package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lv30 extends y5 {
    public static final heg Y = new heg(sfb1.l, ajn0.e("Function"));
    public static final heg Z = new heg(sfb1.i, ajn0.e("KFunction"));
    public final List X;
    public final voe0 e;
    public final dzq0 f;
    public final yv30 g;
    public final int h;
    public final kv30 i;
    public final mv30 t;

    public lv30(voe0 voe0Var, zbc zbcVar, yv30 yv30Var, int i) {
        super(voe0Var, yv30Var.a(i));
        this.e = voe0Var;
        this.f = zbcVar;
        this.g = yv30Var;
        this.h = i;
        this.i = new kv30(this);
        this.t = new mv30(voe0Var, this);
        ArrayList arrayList = new ArrayList();
        tr80 tr80Var = new tr80(1, i, 1);
        ArrayList arrayList2 = new ArrayList(q7h.U(tr80Var, 10));
        lr80 it = tr80Var.iterator();
        while (((sr80) it).c) {
            arrayList.add(z0h1.A1(this, 2, ajn0.e("P" + it.nextInt()), arrayList.size(), this.e));
            arrayList2.add(rih1.a);
        }
        arrayList.add(z0h1.A1(this, 3, ajn0.e("R"), arrayList.size(), this.e));
        this.X = o7h.l1(arrayList);
        yv30 yv30Var2 = this.g;
        if (yv30Var2.equals(uv30.d) || yv30Var2.equals(xv30.d) || yv30Var2.equals(vv30.d)) {
            return;
        }
        yv30Var2.equals(wv30.d);
    }

    @Override // p.beg
    public final xdg B() {
        return null;
    }

    @Override // p.beg
    public final ksi1 Q() {
        return null;
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.beg
    public final boolean U() {
        return false;
    }

    @Override // p.beg
    public final boolean W() {
        return false;
    }

    @Override // p.zji0
    public final boolean Z() {
        return false;
    }

    @Override // p.beg
    public final zpi0 a0() {
        return ypi0.b;
    }

    @Override // p.wim0
    public final zpi0 c0(g8b0 g8b0Var) {
        return this.t;
    }

    @Override // p.beg
    public final int e0() {
        return 2;
    }

    @Override // p.jfg
    public final h0h1 g() {
        return this.i;
    }

    public final fg5 getAnnotations() {
        return rzs0.g;
    }

    @Override // p.p9r
    public final mka1 getSource() {
        return mka1.m0;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        return mht.e;
    }

    @Override // p.beg
    public final Collection h() {
        return z6x.a;
    }

    @Override // p.zji0
    public final boolean isExternal() {
        return false;
    }

    @Override // p.beg
    public final boolean isInline() {
        return false;
    }

    @Override // p.kfg
    public final boolean j() {
        return false;
    }

    @Override // p.n9r
    public final n9r k() {
        return this.f;
    }

    @Override // p.beg, p.kfg
    public final List n() {
        return this.X;
    }

    @Override // p.beg, p.zji0
    public final int o() {
        return 4;
    }

    @Override // p.beg
    public final boolean p() {
        return false;
    }

    @Override // p.beg
    public final boolean p0() {
        return false;
    }

    public final int r0() {
        return this.h;
    }

    public final yv30 s0() {
        return this.g;
    }

    public final String toString() {
        return getName().b();
    }
}
