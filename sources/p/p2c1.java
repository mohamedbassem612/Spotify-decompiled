package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p2c1 {
    public final s2c1 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public p2c1(s2c1 s2c1Var, int i, boolean z, boolean z2, boolean z3) {
        this.a = s2c1Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2c1)) {
            return false;
        }
        p2c1 p2c1Var = (p2c1) obj;
        return u890.j(this.a, p2c1Var.a) && this.b == p2c1Var.b && this.c == p2c1Var.c && this.d == p2c1Var.d && this.e == p2c1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
