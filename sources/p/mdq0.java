package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mdq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public mdq0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdq0)) {
            return false;
        }
        mdq0 mdq0Var = (mdq0) obj;
        return u890.j(this.a, mdq0Var.a) && u890.j(this.b, mdq0Var.b) && u890.j(this.c, mdq0Var.c) && this.d.equals(mdq0Var.d) && this.e == mdq0Var.e;
    }

    public final int hashCode() {
        int iK = ab80.k(2, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, false), 31);
        String str = this.c;
        return Boolean.hashCode(this.e) + cy30.d((iK + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }
}
