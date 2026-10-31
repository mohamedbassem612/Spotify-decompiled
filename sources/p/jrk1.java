package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jrk1 implements rrk1 {
    public final String a;
    public final double b;
    public final Double c;
    public final int d;

    public jrk1(String str, double d, Double d2, int i) {
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrk1)) {
            return false;
        }
        jrk1 jrk1Var = (jrk1) obj;
        return u890.j(this.a, jrk1Var.a) && Double.compare(this.b, jrk1Var.b) == 0 && u890.j(this.c, jrk1Var.c) && this.d == jrk1Var.d;
    }

    public final int hashCode() {
        int iE = xcg1.e(this.b, this.a.hashCode() * 31, 31);
        Double d = this.c;
        int iHashCode = (iE + (d == null ? 0 : d.hashCode())) * 31;
        int i = this.d;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
