package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u0n0 {
    public final hux a;
    public final int b;
    public final lik1 c;
    public final mtn0 d;
    public final gvn0 e;
    public final Set f;
    public final boolean g;
    public final zob1 h;

    public u0n0(hux huxVar, int i, lik1 lik1Var, mtn0 mtn0Var, gvn0 gvn0Var, Set set, xe01 xe01Var, int i2) {
        boolean z = (i2 & 64) == 0;
        zob1 zob1VarB = (i2 & 128) != 0 ? gio1.b(Boolean.FALSE) : xe01Var;
        this.a = huxVar;
        this.b = i;
        this.c = lik1Var;
        this.d = mtn0Var;
        this.e = gvn0Var;
        this.f = set;
        this.g = z;
        this.h = zob1VarB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0n0)) {
            return false;
        }
        u0n0 u0n0Var = (u0n0) obj;
        return u890.j(this.a, u0n0Var.a) && this.b == u0n0Var.b && u890.j(this.c, u0n0Var.c) && this.d.equals(u0n0Var.d) && this.e == u0n0Var.e && this.f.equals(u0n0Var.f) && this.g == u0n0Var.g && this.h.equals(u0n0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(gvg.c((this.e.hashCode() + ((this.d.hashCode() + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c.a)) * 31)) * 31, 31, this.f), 31, this.g);
    }
}
