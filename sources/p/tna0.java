package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tna0 {
    public final sna0 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public tna0(sna0 sna0Var, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = sna0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tna0)) {
            return false;
        }
        tna0 tna0Var = (tna0) obj;
        return this.a.equals(tna0Var.a) && this.b == tna0Var.b && this.c == tna0Var.c && this.d == tna0Var.d && this.e == tna0Var.e && this.f == tna0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
