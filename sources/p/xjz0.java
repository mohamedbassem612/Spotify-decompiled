package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xjz0 {
    public final c380 a;
    public final iu30 b;

    public xjz0(c380 c380Var, iu30 iu30Var) {
        this.a = c380Var;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjz0)) {
            return false;
        }
        xjz0 xjz0Var = (xjz0) obj;
        return this.a.equals(xjz0Var.a) && u890.j(this.b, xjz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
