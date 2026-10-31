package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nsk1 implements qsk1 {
    public final b32 a;
    public final boolean b;
    public final double c;
    public final Double d;

    public nsk1(b32 b32Var, boolean z, double d, Double d2) {
        this.a = b32Var;
        this.b = z;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsk1)) {
            return false;
        }
        nsk1 nsk1Var = (nsk1) obj;
        return this.a.equals(nsk1Var.a) && this.b == nsk1Var.b && Double.compare(this.c, nsk1Var.c) == 0 && u890.j(this.d, nsk1Var.d);
    }

    public final int hashCode() {
        int iE = xcg1.e(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        Double d = this.d;
        return iE + (d == null ? 0 : d.hashCode());
    }
}
