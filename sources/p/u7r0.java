package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u7r0 {
    public final s6t0 a;
    public final g4h1 b;
    public final iu30 c;
    public final boolean d;
    public final aye1 e;
    public final aye1 f;
    public final boolean g;

    public u7r0(s6t0 s6t0Var, g4h1 g4h1Var, iu30 iu30Var, boolean z, boolean z2, int i) {
        s6t0Var = (i & 1) != 0 ? null : s6t0Var;
        g4h1Var = (i & 2) != 0 ? null : g4h1Var;
        iu30Var = (i & 4) != 0 ? null : iu30Var;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        this.a = s6t0Var;
        this.b = g4h1Var;
        this.c = iu30Var;
        this.d = z;
        this.e = null;
        this.f = null;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7r0)) {
            return false;
        }
        u7r0 u7r0Var = (u7r0) obj;
        return u890.j(this.a, u7r0Var.a) && u890.j(this.b, u7r0Var.b) && u890.j(this.c, u7r0Var.c) && this.d == u7r0Var.d && u890.j(this.e, u7r0Var.e) && u890.j(this.f, u7r0Var.f) && this.g == u7r0Var.g;
    }

    public final int hashCode() {
        s6t0 s6t0Var = this.a;
        int iHashCode = (s6t0Var == null ? 0 : s6t0Var.hashCode()) * 31;
        g4h1 g4h1Var = this.b;
        int iHashCode2 = (iHashCode + (g4h1Var == null ? 0 : g4h1Var.hashCode())) * 31;
        iu30 iu30Var = this.c;
        int iG = xcg1.g((iHashCode2 + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31, 31, this.d);
        aye1 aye1Var = this.e;
        int iHashCode3 = (iG + (aye1Var == null ? 0 : aye1Var.hashCode())) * 31;
        aye1 aye1Var2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode3 + (aye1Var2 != null ? aye1Var2.hashCode() : 0)) * 31);
    }
}
