package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d5m1 {
    public final boolean a;
    public final boolean b;
    public final b5m1 c;
    public final boolean d;

    public d5m1(boolean z, boolean z2, b5m1 b5m1Var, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = b5m1Var;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5m1)) {
            return false;
        }
        d5m1 d5m1Var = (d5m1) obj;
        return this.a == d5m1Var.a && this.b == d5m1Var.b && this.c.equals(d5m1Var.c) && this.d == d5m1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
