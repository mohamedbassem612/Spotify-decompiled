package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a001 implements b001 {
    public final String a;
    public final xzz0 b;
    public final boolean c;
    public final String d;
    public final qzz0 e;

    public a001(String str, xzz0 xzz0Var, boolean z, String str2, qzz0 qzz0Var) {
        this.a = str;
        this.b = xzz0Var;
        this.c = z;
        this.d = str2;
        this.e = qzz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a001)) {
            return false;
        }
        a001 a001Var = (a001) obj;
        return u890.j(this.a, a001Var.a) && this.b.equals(a001Var.b) && this.c == a001Var.c && u890.j(this.d, a001Var.d) && this.e.equals(a001Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
