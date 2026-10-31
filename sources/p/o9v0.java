package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o9v0 {
    public final vn90 a;
    public final boolean b;
    public final n6v0 c;
    public final boolean d;
    public final boolean e;

    public o9v0(vn90 vn90Var, boolean z, n6v0 n6v0Var, boolean z2, boolean z3) {
        this.a = vn90Var;
        this.b = z;
        this.c = n6v0Var;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9v0)) {
            return false;
        }
        o9v0 o9v0Var = (o9v0) obj;
        return this.a.equals(o9v0Var.a) && this.b == o9v0Var.b && this.c.equals(o9v0Var.c) && this.d == o9v0Var.d && this.e == o9v0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
