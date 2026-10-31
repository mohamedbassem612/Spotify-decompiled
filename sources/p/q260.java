package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q260 {
    public final String a;
    public final gv50 b;

    public q260(String str, gv50 gv50Var) {
        this.a = str;
        this.b = gv50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q260)) {
            return false;
        }
        q260 q260Var = (q260) obj;
        return u890.j(this.a, q260Var.a) && this.b == q260Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gv50 gv50Var = this.b;
        return iHashCode + (gv50Var == null ? 0 : gv50Var.hashCode());
    }
}
