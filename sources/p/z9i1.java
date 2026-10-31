package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z9i1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public z9i1(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9i1)) {
            return false;
        }
        z9i1 z9i1Var = (z9i1) obj;
        return u890.j(this.a, z9i1Var.a) && u890.j(this.b, z9i1Var.b) && this.c == z9i1Var.c && u890.j(this.d, z9i1Var.d) && u890.j(this.e, z9i1Var.e) && this.f == z9i1Var.f && u890.j(this.g, z9i1Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG2 = xcg1.g(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }
}
