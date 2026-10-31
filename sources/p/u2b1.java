package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u2b1 {
    public final t2b1 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final o4b1 e;
    public final boolean f;
    public final boolean g;

    public u2b1(t2b1 t2b1Var, boolean z, boolean z2, String str, o4b1 o4b1Var, boolean z3, boolean z4) {
        this.a = t2b1Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = o4b1Var;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2b1)) {
            return false;
        }
        u2b1 u2b1Var = (u2b1) obj;
        return this.a.equals(u2b1Var.a) && this.b == u2b1Var.b && this.c == u2b1Var.c && this.d.equals(u2b1Var.d) && this.e.equals(u2b1Var.e) && this.f == u2b1Var.f && this.g == u2b1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g((this.e.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(false) * 31, 31, this.b), 31, this.c), 31, false), 31, this.d)) * 31, 31, this.f);
    }
}
