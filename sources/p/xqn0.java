package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xqn0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public xqn0(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqn0)) {
            return false;
        }
        xqn0 xqn0Var = (xqn0) obj;
        return u890.j(this.a, xqn0Var.a) && this.b.equals(xqn0Var.b) && u890.j(this.c, xqn0Var.c) && this.d == xqn0Var.d && this.e == xqn0Var.e && this.f == xqn0Var.f && this.g == xqn0Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(kaa0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f);
    }
}
