package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzz0 {
    public final vzz0 a;
    public final vzz0 b;
    public final String c;
    public final boolean d;

    public xzz0(vzz0 vzz0Var, vzz0 vzz0Var2, String str, boolean z) {
        this.a = vzz0Var;
        this.b = vzz0Var2;
        this.c = str;
        this.d = z;
    }

    public final boolean a() {
        return u890.j(this.a.a, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzz0)) {
            return false;
        }
        xzz0 xzz0Var = (xzz0) obj;
        return this.a.equals(xzz0Var.a) && this.b.equals(xzz0Var.b) && u890.j(this.c, xzz0Var.c) && this.d == xzz0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
