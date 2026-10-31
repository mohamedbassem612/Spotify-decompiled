package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ljd0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ljd0(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljd0)) {
            return false;
        }
        ljd0 ljd0Var = (ljd0) obj;
        return u890.j(this.a, ljd0Var.a) && this.b == ljd0Var.b && u890.j(this.c, ljd0Var.c) && u890.j(this.d, ljd0Var.d) && u890.j(this.e, ljd0Var.e) && this.f == ljd0Var.f && this.g == ljd0Var.g && this.h == ljd0Var.h;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(cy30.d(cy30.d((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
