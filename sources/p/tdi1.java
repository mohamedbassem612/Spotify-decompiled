package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tdi1 {
    public final double a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;

    public tdi1(double d, double d2, String str, String str2, String str3) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdi1)) {
            return false;
        }
        tdi1 tdi1Var = (tdi1) obj;
        return Double.compare(this.a, tdi1Var.a) == 0 && Double.compare(this.b, tdi1Var.b) == 0 && this.c.equals(tdi1Var.c) && this.d.equals(tdi1Var.d) && this.e.equals(tdi1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(xcg1.e(this.b, Double.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
