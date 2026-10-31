package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iba0 implements kba0 {
    public final String a;
    public final List b;
    public final no90 c;
    public final no90 d;
    public final boolean e;
    public final oa10 f;
    public final xea0 g;
    public final boolean h;
    public final boolean i;

    public iba0(String str, smc0 smc0Var, no90 no90Var, no90 no90Var2, boolean z, oa10 oa10Var, xea0 xea0Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = smc0Var;
        this.c = no90Var;
        this.d = no90Var2;
        this.e = z;
        this.f = oa10Var;
        this.g = xea0Var;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iba0)) {
            return false;
        }
        iba0 iba0Var = (iba0) obj;
        return this.a.equals(iba0Var.a) && this.b.equals(iba0Var.b) && this.c.equals(iba0Var.c) && this.d.equals(iba0Var.d) && this.e == iba0Var.e && u890.j(this.f, iba0Var.f) && this.g == iba0Var.g && this.h == iba0Var.h && this.i == iba0Var.i;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.d.hashCode() + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        oa10 oa10Var = this.f;
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + ((iG + (oa10Var == null ? 0 : oa10Var.hashCode())) * 31)) * 31, 31, this.h);
    }
}
