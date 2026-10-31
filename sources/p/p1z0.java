package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p1z0 {
    public final k1z0 a;
    public final boolean b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final iu30 f;
    public final Function0 g;
    public final Function0 h;

    public p1z0(k1z0 k1z0Var, boolean z, Long l, Long l2, boolean z2, iu30 iu30Var, Function0 function0, Function0 function1) {
        this.a = k1z0Var;
        this.b = z;
        this.c = l;
        this.d = l2;
        this.e = z2;
        this.f = iu30Var;
        this.g = function0;
        this.h = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1z0)) {
            return false;
        }
        p1z0 p1z0Var = (p1z0) obj;
        return u890.j(this.a, p1z0Var.a) && this.b == p1z0Var.b && u890.j(this.c, p1z0Var.c) && u890.j(this.d, p1z0Var.d) && this.e == p1z0Var.e && u890.j(this.f, p1z0Var.f) && u890.j(this.g, p1z0Var.g) && u890.j(this.h, p1z0Var.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return this.h.hashCode() + rjx.n(ktd.g(this.f, xcg1.g((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.e), 31), 31, this.g);
    }
}
