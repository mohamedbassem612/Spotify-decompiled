package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hj0 {
    public final String a;
    public final String b;
    public final String c;
    public final ji0 d;
    public final lj0 e;

    public hj0(String str, String str2, String str3, ji0 ji0Var, lj0 lj0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ji0Var;
        this.e = lj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj0)) {
            return false;
        }
        hj0 hj0Var = (hj0) obj;
        return this.a.equals(hj0Var.a) && this.b.equals(hj0Var.b) && this.c.equals(hj0Var.c) && this.d.equals(hj0Var.d) && u890.j(this.e, hj0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        lj0 lj0Var = this.e;
        return iHashCode + (lj0Var == null ? 0 : lj0Var.hashCode());
    }
}
