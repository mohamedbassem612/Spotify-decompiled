package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class etj1 extends ktj1 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public etj1(int i, String str, String str2, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etj1)) {
            return false;
        }
        etj1 etj1Var = (etj1) obj;
        return this.a == etj1Var.a && u890.j(this.b, etj1Var.b) && u890.j(this.c, etj1Var.c) && this.d == etj1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
