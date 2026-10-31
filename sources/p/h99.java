package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h99 {
    public final s2c1 a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public h99(s2c1 s2c1Var, boolean z, int i, boolean z2) {
        this.a = s2c1Var;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h99)) {
            return false;
        }
        h99 h99Var = (h99) obj;
        return u890.j(this.a, h99Var.a) && this.b == h99Var.b && this.c == h99Var.c && this.d == h99Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
