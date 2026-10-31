package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yw20 {
    public final xw20 a;
    public final nx20 b;

    public yw20(xw20 xw20Var, nx20 nx20Var) {
        this.a = xw20Var;
        this.b = nx20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw20)) {
            return false;
        }
        yw20 yw20Var = (yw20) obj;
        return this.a.equals(yw20Var.a) && u890.j(this.b, yw20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
