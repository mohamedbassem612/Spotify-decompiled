package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xnx0 {
    public final String a;
    public final String b;
    public final x360 c;
    public final n1x d;

    public xnx0(String str, String str2, x360 x360Var, n1x n1xVar) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = n1xVar;
    }

    public final n1x a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnx0)) {
            return false;
        }
        xnx0 xnx0Var = (xnx0) obj;
        return u890.j(this.a, xnx0Var.a) && u890.j(this.b, xnx0Var.b) && u890.j(this.c, xnx0Var.c) && u890.j(this.d, xnx0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.d.hashCode() + ((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
