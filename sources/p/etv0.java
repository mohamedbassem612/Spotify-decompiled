package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class etv0 extends ayq0 {
    public final String b;
    public final String c;
    public final int d;
    public final uqg0 e;
    public final ave0 f;

    public etv0(String str, String str2, int i, uqg0 uqg0Var, ave0 ave0Var) {
        super(4);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = uqg0Var;
        this.f = ave0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etv0)) {
            return false;
        }
        etv0 etv0Var = (etv0) obj;
        return u890.j(this.b, etv0Var.b) && u890.j(this.c, etv0Var.c) && this.d == etv0Var.d && u890.j(this.e, etv0Var.e) && u890.j(this.f, etv0Var.f);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iK = ab80.k(this.d, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        uqg0 uqg0Var = this.e;
        int iHashCode2 = (iK + (uqg0Var == null ? 0 : uqg0Var.hashCode())) * 31;
        ave0 ave0Var = this.f;
        return iHashCode2 + (ave0Var != null ? ave0Var.hashCode() : 0);
    }
}
