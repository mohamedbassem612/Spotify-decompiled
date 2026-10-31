package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mvd1 {
    public final String a;
    public final String b;
    public final k1p1 c;
    public final int d;

    public mvd1(String str, String str2, k1p1 k1p1Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = k1p1Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvd1)) {
            return false;
        }
        mvd1 mvd1Var = (mvd1) obj;
        return this.a.equals(mvd1Var.a) && this.b.equals(mvd1Var.b) && this.c.equals(mvd1Var.c) && this.d == mvd1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
