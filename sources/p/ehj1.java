package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ehj1 extends khj1 {
    public final String a;
    public final String b;
    public final s171 c;
    public final String d;
    public final jlw0 e;

    public ehj1(String str, String str2, s171 s171Var, String str3, jlw0 jlw0Var) {
        this.a = str;
        this.b = str2;
        this.c = s171Var;
        this.d = str3;
        this.e = jlw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehj1)) {
            return false;
        }
        ehj1 ehj1Var = (ehj1) obj;
        return u890.j(this.a, ehj1Var.a) && u890.j(this.b, ehj1Var.b) && u890.j(this.c, ehj1Var.c) && u890.j(this.d, ehj1Var.d) && u890.j(this.e, ehj1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jlw0 jlw0Var = this.e;
        return iHashCode2 + (jlw0Var != null ? jlw0Var.hashCode() : 0);
    }
}
