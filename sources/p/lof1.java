package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lof1 {
    public final String a;
    public final iu30 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;

    public lof1(String str, iu30 iu30Var, boolean z, boolean z2, boolean z3, String str2, String str3) {
        this.a = str;
        this.b = iu30Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lof1)) {
            return false;
        }
        lof1 lof1Var = (lof1) obj;
        return u890.j(this.a, lof1Var.a) && u890.j(this.b, lof1Var.b) && this.c == lof1Var.c && this.d == lof1Var.d && this.e == lof1Var.e && u890.j(this.f, lof1Var.f) && u890.j(this.g, lof1Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(ktd.g(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ lof1(int i, String str, iu30 iu30Var, boolean z) {
        this(str, iu30Var, z, false, false, null, null);
    }
}
