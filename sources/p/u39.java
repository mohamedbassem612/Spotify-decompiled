package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u39 {
    public final String a;
    public final af5 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public u39(String str, af5 af5Var, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = af5Var;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u39)) {
            return false;
        }
        u39 u39Var = (u39) obj;
        return this.a.equals(u39Var.a) && this.b.equals(u39Var.b) && this.c == u39Var.c && this.d == u39Var.d && this.e == u39Var.e && this.f == u39Var.f && this.g == u39Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }
}
