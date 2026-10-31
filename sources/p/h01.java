package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h01 {
    public final e01 a;
    public final e01 b;

    public h01(e01 e01Var, e01 e01Var2) {
        this.a = e01Var;
        this.b = e01Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h01)) {
            return false;
        }
        h01 h01Var = (h01) obj;
        return this.a.equals(h01Var.a) && u890.j(this.b, h01Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e01 e01Var = this.b;
        return iHashCode + (e01Var == null ? 0 : e01Var.hashCode());
    }
}
