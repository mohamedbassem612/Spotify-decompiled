package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class erl implements grl {
    public final c380 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final zs2 f;

    public erl(c380 c380Var, String str, String str2, String str3, String str4, zs2 zs2Var) {
        this.a = c380Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = zs2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erl)) {
            return false;
        }
        erl erlVar = (erl) obj;
        return u890.j(this.a, erlVar.a) && this.b.equals(erlVar.b) && this.c.equals(erlVar.c) && u890.j(this.d, erlVar.d) && u890.j(this.e, erlVar.e) && u890.j(this.f, erlVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zs2 zs2Var = this.f;
        return iHashCode2 + (zs2Var != null ? zs2Var.hashCode() : 0);
    }
}
