package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class me20 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public me20(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = str5;
    }

    public static me20 a(me20 me20Var, boolean z, boolean z2, int i) {
        String str = me20Var.a;
        String str2 = me20Var.b;
        if ((i & 4) != 0) {
            z = me20Var.c;
        }
        boolean z3 = z;
        String str3 = me20Var.d;
        String str4 = me20Var.e;
        if ((i & 32) != 0) {
            z2 = me20Var.f;
        }
        String str5 = me20Var.g;
        me20Var.getClass();
        return new me20(str, str2, str3, str4, str5, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me20)) {
            return false;
        }
        me20 me20Var = (me20) obj;
        return u890.j(this.a, me20Var.a) && u890.j(this.b, me20Var.b) && this.c == me20Var.c && u890.j(this.d, me20Var.d) && u890.j(this.e, me20Var.e) && this.f == me20Var.f && u890.j(this.g, me20Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG2 = xcg1.g(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }
}
