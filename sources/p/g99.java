package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g99 {
    public final s2c1 a;
    public final int b;
    public final boolean c;
    public final String d;

    public g99(s2c1 s2c1Var, int i, boolean z, String str) {
        this.a = s2c1Var;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g99)) {
            return false;
        }
        g99 g99Var = (g99) obj;
        return u890.j(this.a, g99Var.a) && this.b == g99Var.b && this.c == g99Var.c && this.d.equals(g99Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
