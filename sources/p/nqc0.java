package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nqc0 {
    public final x4i1 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public nqc0(x4i1 x4i1Var, boolean z, int i, int i2, int i3) {
        this.a = x4i1Var;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqc0)) {
            return false;
        }
        nqc0 nqc0Var = (nqc0) obj;
        return this.a.equals(nqc0Var.a) && this.b == nqc0Var.b && this.c == nqc0Var.c && this.d == nqc0Var.d && this.e == nqc0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
