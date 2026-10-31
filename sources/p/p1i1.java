package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p1i1 {
    public final String a;
    public final String b;
    public final azh1 c;
    public final o1i1 d;
    public final o1i1 e;
    public final zyh1 f;

    public p1i1(String str, String str2, azh1 azh1Var, o1i1 o1i1Var, o1i1 o1i1Var2, zyh1 zyh1Var) {
        this.a = str;
        this.b = str2;
        this.c = azh1Var;
        this.d = o1i1Var;
        this.e = o1i1Var2;
        this.f = zyh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1i1)) {
            return false;
        }
        p1i1 p1i1Var = (p1i1) obj;
        return u890.j(this.a, p1i1Var.a) && u890.j(this.b, p1i1Var.b) && u890.j(this.c, p1i1Var.c) && this.d.equals(p1i1Var.d) && u890.j(this.e, p1i1Var.e) && u890.j(this.f, p1i1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        azh1 azh1Var = this.c;
        int iHashCode = (this.d.hashCode() + ((iD + (azh1Var == null ? 0 : azh1Var.hashCode())) * 31)) * 31;
        o1i1 o1i1Var = this.e;
        int iHashCode2 = (iHashCode + (o1i1Var == null ? 0 : o1i1Var.hashCode())) * 31;
        zyh1 zyh1Var = this.f;
        return iHashCode2 + (zyh1Var != null ? zyh1Var.hashCode() : 0);
    }
}
