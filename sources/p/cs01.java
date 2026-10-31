package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cs01 extends vxo1 {
    public final String c;
    public final String d;
    public final y6b1 e;
    public final st01 f;

    public cs01(String str, String str2, y6b1 y6b1Var, st01 st01Var) {
        this.c = str;
        this.d = str2;
        this.e = y6b1Var;
        this.f = st01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs01)) {
            return false;
        }
        cs01 cs01Var = (cs01) obj;
        return u890.j(this.c, cs01Var.c) && u890.j(this.d, cs01Var.d) && u890.j(this.e, cs01Var.e) && this.f.equals(cs01Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        y6b1 y6b1Var = this.e;
        return this.f.hashCode() + ((iD + (y6b1Var == null ? 0 : y6b1Var.hashCode())) * 31);
    }
}
