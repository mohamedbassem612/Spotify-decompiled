package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h060 {
    public final ioj0 a;
    public final v17 b;

    public h060(ioj0 ioj0Var, v17 v17Var) {
        this.a = ioj0Var;
        this.b = v17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h060)) {
            return false;
        }
        h060 h060Var = (h060) obj;
        return u890.j(this.a, h060Var.a) && u890.j(this.b, h060Var.b);
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + (this.b == null ? 0 : Integer.hashCode(2131952446));
    }
}
