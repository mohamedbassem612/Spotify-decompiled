package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jlj0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public jlj0(int i, String str, boolean z, boolean z2, boolean z3) {
        boolean z4 = (i & 2) == 0;
        z2 = (i & 4) != 0 ? true : z2;
        boolean z5 = (i & 8) != 0;
        boolean z6 = (i & 16) == 0;
        str = (i & 32) != 0 ? null : str;
        z3 = (i & 256) != 0 ? false : z3;
        this.a = z;
        this.b = z4;
        this.c = z2;
        this.d = z5;
        this.e = z6;
        this.f = str;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlj0)) {
            return false;
        }
        jlj0 jlj0Var = (jlj0) obj;
        return this.a == jlj0Var.a && this.b == jlj0Var.b && this.c == jlj0Var.c && this.d == jlj0Var.d && this.e == jlj0Var.e && u890.j(this.f, jlj0Var.f) && this.g == jlj0Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iG + (str == null ? 0 : str.hashCode())) * 29791);
    }
}
