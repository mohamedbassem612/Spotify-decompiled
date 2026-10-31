package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cbo0 {
    public final String a;
    public final String b;
    public final bbo0 c;
    public final bbo0 d;

    public cbo0(String str, String str2, bbo0 bbo0Var, bbo0 bbo0Var2) {
        this.a = str;
        this.b = str2;
        this.c = bbo0Var;
        this.d = bbo0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbo0)) {
            return false;
        }
        cbo0 cbo0Var = (cbo0) obj;
        return u890.j(this.a, cbo0Var.a) && u890.j(this.b, cbo0Var.b) && u890.j(this.c, cbo0Var.c) && u890.j(this.d, cbo0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        bbo0 bbo0Var = this.c;
        int iHashCode = (iD + (bbo0Var == null ? 0 : bbo0Var.hashCode())) * 31;
        bbo0 bbo0Var2 = this.d;
        return iHashCode + (bbo0Var2 != null ? bbo0Var2.hashCode() : 0);
    }

    public /* synthetic */ cbo0(String str, String str2, bbo0 bbo0Var, int i) {
        this(str, str2, (i & 4) != 0 ? null : bbo0Var, (bbo0) null);
    }
}
