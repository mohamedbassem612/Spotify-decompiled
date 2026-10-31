package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class occ1 {
    public final String a;
    public final lik1 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public occ1(String str, String str2, String str3, String str4, String str5, lik1 lik1Var) {
        this.a = str;
        this.b = lik1Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof occ1)) {
            return false;
        }
        occ1 occ1Var = (occ1) obj;
        return u890.j(this.a, occ1Var.a) && u890.j(this.b, occ1Var.b) && u890.j(this.c, occ1Var.c) && u890.j(this.d, occ1Var.d) && u890.j(this.e, occ1Var.e) && u890.j(this.f, occ1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
