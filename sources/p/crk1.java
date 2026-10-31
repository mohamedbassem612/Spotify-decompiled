package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class crk1 implements rrk1 {
    public final b32 a;
    public final double b;
    public final Double c;

    public crk1(b32 b32Var, double d, Double d2) {
        this.a = b32Var;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crk1)) {
            return false;
        }
        crk1 crk1Var = (crk1) obj;
        return this.a.equals(crk1Var.a) && Double.compare(this.b, crk1Var.b) == 0 && u890.j(this.c, crk1Var.c);
    }

    public final int hashCode() {
        int iE = xcg1.e(this.b, this.a.hashCode() * 31, 31);
        Double d = this.c;
        return iE + (d == null ? 0 : d.hashCode());
    }
}
