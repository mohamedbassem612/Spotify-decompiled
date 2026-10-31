package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j8o0 implements l8o0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public j8o0(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8o0)) {
            return false;
        }
        j8o0 j8o0Var = (j8o0) obj;
        return this.a == j8o0Var.a && this.b == j8o0Var.b && this.c == j8o0Var.c && this.d == j8o0Var.d && this.e == j8o0Var.e && this.f == j8o0Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = this.e;
        return l1d.C(this.f) + ((iG + (i == 0 ? 0 : l1d.C(i))) * 31);
    }
}
