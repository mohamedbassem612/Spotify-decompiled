package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kw21 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final hlk0 e;
    public final boolean f;

    public kw21(String str, boolean z, String str2, boolean z2, hlk0 hlk0Var, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = hlk0Var;
        this.f = z3;
    }

    public static kw21 a(kw21 kw21Var, String str, String str2, hlk0 hlk0Var, int i) {
        if ((i & 1) != 0) {
            str = kw21Var.a;
        }
        String str3 = str;
        boolean z = (i & 2) != 0 ? kw21Var.b : true;
        if ((i & 4) != 0) {
            str2 = kw21Var.c;
        }
        String str4 = str2;
        boolean z2 = (i & 8) != 0 ? kw21Var.d : true;
        if ((i & 16) != 0) {
            hlk0Var = kw21Var.e;
        }
        return new kw21(str3, z, str4, z2, hlk0Var, (i & 32) != 0 ? kw21Var.f : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw21)) {
            return false;
        }
        kw21 kw21Var = (kw21) obj;
        return u890.j(this.a, kw21Var.a) && this.b == kw21Var.b && u890.j(this.c, kw21Var.c) && this.d == kw21Var.d && u890.j(this.e, kw21Var.e) && this.f == kw21Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iG2 = xcg1.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        hlk0 hlk0Var = this.e;
        return Boolean.hashCode(this.f) + ((iG2 + (hlk0Var != null ? hlk0Var.hashCode() : 0)) * 31);
    }
}
