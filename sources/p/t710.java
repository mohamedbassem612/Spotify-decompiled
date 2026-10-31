package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t710 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public t710(String str, int i, String str2, String str3, boolean z, String str4) {
        boolean z2 = (i & 16) != 0;
        str4 = (i & 32) != 0 ? null : str4;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t710)) {
            return false;
        }
        t710 t710Var = (t710) obj;
        return u890.j(this.a, t710Var.a) && u890.j(this.b, t710Var.b) && u890.j(this.c, t710Var.c) && this.d == t710Var.d && this.e == t710Var.e && u890.j(this.f, t710Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
