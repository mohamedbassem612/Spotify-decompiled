package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q9g1 {
    public final boolean a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final gcg1 f;
    public final l9g1 g;
    public final p9g1 h;
    public final boolean i;
    public final boolean j;
    public final iu30 k;

    public q9g1(boolean z, long j, long j2, boolean z2, boolean z3, gcg1 gcg1Var, l9g1 l9g1Var, p9g1 p9g1Var, boolean z4, boolean z5, iu30 iu30Var) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = z2;
        this.e = z3;
        this.f = gcg1Var;
        this.g = l9g1Var;
        this.h = p9g1Var;
        this.i = z4;
        this.j = z5;
        this.k = iu30Var;
    }

    public static q9g1 a(q9g1 q9g1Var, boolean z, long j, long j2, boolean z2, boolean z3, gcg1 gcg1Var, l9g1 l9g1Var, p9g1 p9g1Var, boolean z4, boolean z5, iu30 iu30Var, int i) {
        if ((i & 1) != 0) {
            z = q9g1Var.a;
        }
        return new q9g1(z, (i & 2) != 0 ? q9g1Var.b : j, (i & 4) != 0 ? q9g1Var.c : j2, (i & 8) != 0 ? q9g1Var.d : z2, (i & 16) != 0 ? q9g1Var.e : z3, (i & 32) != 0 ? q9g1Var.f : gcg1Var, (i & 64) != 0 ? q9g1Var.g : l9g1Var, (i & 128) != 0 ? q9g1Var.h : p9g1Var, (i & 256) != 0 ? q9g1Var.i : z4, (i & 512) != 0 ? q9g1Var.j : z5, (i & 1024) != 0 ? q9g1Var.k : iu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9g1)) {
            return false;
        }
        q9g1 q9g1Var = (q9g1) obj;
        return this.a == q9g1Var.a && this.b == q9g1Var.b && this.c == q9g1Var.c && this.d == q9g1Var.d && this.e == q9g1Var.e && u890.j(this.f, q9g1Var.f) && u890.j(this.g, q9g1Var.g) && u890.j(this.h, q9g1Var.h) && this.i == q9g1Var.i && this.j == q9g1Var.j && u890.j(this.k, q9g1Var.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + xcg1.g(xcg1.g(cy30.f(cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e)) * 31)) * 31)) * 31, 31, this.i), 31, this.j);
        iu30 iu30Var = this.k;
        return iG + (iu30Var == null ? 0 : iu30Var.hashCode());
    }

    public /* synthetic */ q9g1(gcg1 gcg1Var) {
        this(false, -1L, -1L, false, false, gcg1Var, h9g1.a, o9g1.a, false, false, null);
    }
}
