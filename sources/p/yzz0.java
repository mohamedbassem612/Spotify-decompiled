package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yzz0 implements b001 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final xzz0 d;
    public final String e;
    public final String f;
    public final qzz0 g;

    public yzz0(String str, boolean z, boolean z2, xzz0 xzz0Var, String str2, String str3, qzz0 qzz0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = xzz0Var;
        this.e = str2;
        this.f = str3;
        this.g = qzz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzz0)) {
            return false;
        }
        yzz0 yzz0Var = (yzz0) obj;
        return u890.j(this.a, yzz0Var.a) && this.b == yzz0Var.b && this.c == yzz0Var.c && this.d.equals(yzz0Var.d) && u890.j(this.e, yzz0Var.e) && u890.j(this.f, yzz0Var.f) && this.g.equals(yzz0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d((this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }
}
