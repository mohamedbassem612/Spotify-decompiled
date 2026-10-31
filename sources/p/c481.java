package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c481 implements vn90 {
    public final g281 a;
    public final List b;
    public final boolean c;
    public final int d;
    public final int e;
    public final t4z f;
    public final vnm g;
    public final liq0 h;
    public final t5g1 i;
    public final yao0 j;

    public c481(g281 g281Var, List list, boolean z, int i, int i2, t4z t4zVar, vnm vnmVar, liq0 liq0Var, t5g1 t5g1Var, yao0 yao0Var) {
        this.a = g281Var;
        this.b = list;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = t4zVar;
        this.g = vnmVar;
        this.h = liq0Var;
        this.i = t5g1Var;
        this.j = yao0Var;
    }

    public final int a() {
        return this.e;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final g281 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c481)) {
            return false;
        }
        c481 c481Var = (c481) obj;
        return u890.j(this.a, c481Var.a) && u890.j(this.b, c481Var.b) && this.c == c481Var.c && this.d == c481Var.d && this.e == c481Var.e && u890.j(this.f, c481Var.f) && u890.j(this.g, c481Var.g) && u890.j(this.h, c481Var.h) && u890.j(this.i, c481Var.i) && u890.j(this.j, c481Var.j);
    }

    public final List getItems() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, xcg1.g(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31;
        vnm vnmVar = this.g;
        int iHashCode2 = (iHashCode + (vnmVar == null ? 0 : vnmVar.hashCode())) * 31;
        liq0 liq0Var = this.h;
        int iHashCode3 = (iHashCode2 + (liq0Var == null ? 0 : Integer.hashCode(liq0Var.a))) * 31;
        t5g1 t5g1Var = this.i;
        int iHashCode4 = (iHashCode3 + (t5g1Var == null ? 0 : t5g1Var.hashCode())) * 31;
        yao0 yao0Var = this.j;
        return iHashCode4 + (yao0Var != null ? yao0Var.hashCode() : 0);
    }
}
