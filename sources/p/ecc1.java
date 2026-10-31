package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ecc1 extends ijo1 {
    public final String c;
    public final lik1 d;
    public final String e;
    public final String f;

    public ecc1(String str, lik1 lik1Var, String str2, String str3) {
        this.c = str;
        this.d = lik1Var;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecc1)) {
            return false;
        }
        ecc1 ecc1Var = (ecc1) obj;
        return u890.j(this.c, ecc1Var.c) && u890.j(this.d, ecc1Var.d) && u890.j(this.e, ecc1Var.e) && u890.j(this.f, ecc1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d.a);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
