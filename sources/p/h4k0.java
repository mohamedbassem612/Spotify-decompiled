package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h4k0 implements k4k0 {
    public final ijf1 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public h4k0(ijf1 ijf1Var, int i, boolean z, boolean z2, int i2) {
        this.a = ijf1Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4k0)) {
            return false;
        }
        h4k0 h4k0Var = (h4k0) obj;
        return this.a == h4k0Var.a && this.b == h4k0Var.b && this.c == h4k0Var.c && this.d == h4k0Var.d && this.e == h4k0Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
