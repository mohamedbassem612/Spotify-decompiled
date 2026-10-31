package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pf3 {
    public final String a;
    public final String b;
    public final g07 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public pf3(String str, String str2, g07 g07Var, String str3, boolean z, boolean z2, String str4) {
        this.a = str;
        this.b = str2;
        this.c = g07Var;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf3)) {
            return false;
        }
        pf3 pf3Var = (pf3) obj;
        return u890.j(this.a, pf3Var.a) && u890.j(this.b, pf3Var.b) && u890.j(this.c, pf3Var.c) && u890.j(this.d, pf3Var.d) && this.e == pf3Var.e && this.f == pf3Var.f && u890.j(this.g, pf3Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(xcg1.g(cy30.d((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ pf3(String str, String str2, g07 g07Var, String str3, boolean z, boolean z2, int i) {
        this(str, str2, g07Var, str3, z, (i & 32) != 0 ? false : z2, (String) null);
    }
}
