package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w3k1 implements y3k1 {
    public final d4k1 a;
    public final xkk1 b;
    public final llg c;
    public final long d;
    public final String e;
    public final String f;

    public w3k1(d4k1 d4k1Var, xkk1 xkk1Var, llg llgVar, long j, String str, String str2) {
        this.a = d4k1Var;
        this.b = xkk1Var;
        this.c = llgVar;
        this.d = j;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3k1)) {
            return false;
        }
        w3k1 w3k1Var = (w3k1) obj;
        return u890.j(this.a, w3k1Var.a) && u890.j(this.b, w3k1Var.b) && u890.j(this.c, w3k1Var.c) && this.d == w3k1Var.d && u890.j(this.e, w3k1Var.e) && u890.j(this.f, w3k1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        llg llgVar = this.c;
        int iF = cy30.f((iHashCode2 + (llgVar == null ? 0 : llgVar.hashCode())) * 31, this.d, 31);
        String str = this.e;
        int iHashCode3 = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
