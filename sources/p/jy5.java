package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jy5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;

    public jy5(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy5)) {
            return false;
        }
        jy5 jy5Var = (jy5) obj;
        return u890.j(this.a, jy5Var.a) && u890.j(this.b, jy5Var.b) && u890.j(this.c, jy5Var.c) && this.d == jy5Var.d && u890.j(this.e, jy5Var.e) && this.f == jy5Var.f && u890.j(this.g, jy5Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ jy5(String str, String str2, String str3, String str4, boolean z) {
        this(7000, str, str2, str3, str4, null, z);
    }
}
