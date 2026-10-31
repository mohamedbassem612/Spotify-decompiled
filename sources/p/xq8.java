package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xq8 {
    public final wq8 a;
    public final fr8 b;

    public xq8(wq8 wq8Var, fr8 fr8Var) {
        this.a = wq8Var;
        this.b = fr8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq8)) {
            return false;
        }
        xq8 xq8Var = (xq8) obj;
        return u890.j(this.a, xq8Var.a) && this.b.equals(xq8Var.b);
    }

    public final int hashCode() {
        wq8 wq8Var = this.a;
        return this.b.hashCode() + ((wq8Var == null ? 0 : wq8Var.hashCode()) * 31);
    }
}
