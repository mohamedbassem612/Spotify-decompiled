package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class osk1 implements qsk1 {
    public final xl61 a;
    public final boolean b;
    public final double c;
    public final Double d;

    public osk1(xl61 xl61Var, boolean z, double d, Double d2) {
        this.a = xl61Var;
        this.b = z;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osk1)) {
            return false;
        }
        osk1 osk1Var = (osk1) obj;
        return this.a.equals(osk1Var.a) && this.b == osk1Var.b && Double.compare(this.c, osk1Var.c) == 0 && u890.j(this.d, osk1Var.d);
    }

    public final int hashCode() {
        int iE = xcg1.e(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        Double d = this.d;
        return iE + (d == null ? 0 : d.hashCode());
    }
}
