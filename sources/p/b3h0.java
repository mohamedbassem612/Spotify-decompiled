package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b3h0 implements e4h0 {
    public final String a;
    public final ls50 b;

    public b3h0(String str, ls50 ls50Var) {
        this.a = str;
        this.b = ls50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3h0)) {
            return false;
        }
        b3h0 b3h0Var = (b3h0) obj;
        return u890.j(this.a, b3h0Var.a) && u890.j(this.b, b3h0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ls50 ls50Var = this.b;
        return iHashCode + (ls50Var == null ? 0 : ls50Var.hashCode());
    }
}
