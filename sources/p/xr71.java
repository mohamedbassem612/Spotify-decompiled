package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xr71 {
    public final wr71 a;
    public final hr71 b;

    public xr71(wr71 wr71Var, hr71 hr71Var) {
        this.a = wr71Var;
        this.b = hr71Var;
    }

    public static xr71 a(xr71 xr71Var, wr71 wr71Var, hr71 hr71Var, int i) {
        if ((i & 1) != 0) {
            wr71Var = xr71Var.a;
        }
        if ((i & 2) != 0) {
            hr71Var = xr71Var.b;
        }
        return new xr71(wr71Var, hr71Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr71)) {
            return false;
        }
        xr71 xr71Var = (xr71) obj;
        return this.a.equals(xr71Var.a) && u890.j(this.b, xr71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
