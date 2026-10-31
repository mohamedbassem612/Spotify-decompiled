package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ds2 {
    public final String a;
    public final String b;
    public final es2 c;
    public final ns2 d;
    public final ns2 e;
    public final nt2 f;

    public ds2(String str, String str2, es2 es2Var, ns2 ns2Var, ns2 ns2Var2, nt2 nt2Var, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        es2Var = (i & 4) != 0 ? null : es2Var;
        ns2Var = (i & 8) != 0 ? null : ns2Var;
        ns2Var2 = (i & 16) != 0 ? null : ns2Var2;
        nt2Var = (i & 32) != 0 ? null : nt2Var;
        this.a = str;
        this.b = str2;
        this.c = es2Var;
        this.d = ns2Var;
        this.e = ns2Var2;
        this.f = nt2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds2)) {
            return false;
        }
        ds2 ds2Var = (ds2) obj;
        return u890.j(this.a, ds2Var.a) && u890.j(this.b, ds2Var.b) && u890.j(this.c, ds2Var.c) && u890.j(this.d, ds2Var.d) && u890.j(this.e, ds2Var.e) && u890.j(this.f, ds2Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        es2 es2Var = this.c;
        int iHashCode3 = (iHashCode2 + (es2Var == null ? 0 : es2Var.hashCode())) * 31;
        ns2 ns2Var = this.d;
        int iHashCode4 = (iHashCode3 + (ns2Var == null ? 0 : ns2Var.hashCode())) * 31;
        ns2 ns2Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (ns2Var2 == null ? 0 : ns2Var2.hashCode())) * 31;
        nt2 nt2Var = this.f;
        return iHashCode5 + (nt2Var != null ? nt2Var.hashCode() : 0);
    }
}
