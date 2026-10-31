package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lhh {
    public final c380 a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public lhh(c380 c380Var, int i, String str, String str2, String str3) {
        this.a = c380Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhh)) {
            return false;
        }
        lhh lhhVar = (lhh) obj;
        return u890.j(this.a, lhhVar.a) && this.b == lhhVar.b && u890.j(this.c, lhhVar.c) && u890.j(this.d, lhhVar.d) && u890.j(this.e, lhhVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
