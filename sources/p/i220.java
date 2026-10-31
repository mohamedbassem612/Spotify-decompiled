package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i220 {
    public final tr80 a;
    public final xwx0 b;

    public i220(tr80 tr80Var, xwx0 xwx0Var) {
        this.a = tr80Var;
        this.b = xwx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i220)) {
            return false;
        }
        i220 i220Var = (i220) obj;
        return u890.j(this.a, i220Var.a) && this.b.equals(i220Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
