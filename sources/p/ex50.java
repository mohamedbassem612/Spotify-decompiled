package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ex50 {
    public final xw50 a;
    public final cx50 b;
    public final bkj0 c;

    public ex50(xw50 xw50Var, cx50 cx50Var, bkj0 bkj0Var) {
        this.a = xw50Var;
        this.b = cx50Var;
        this.c = bkj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex50)) {
            return false;
        }
        ex50 ex50Var = (ex50) obj;
        return this.a.equals(ex50Var.a) && u890.j(this.b, ex50Var.b) && u890.j(this.c, ex50Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cx50 cx50Var = this.b;
        int iHashCode2 = (iHashCode + (cx50Var == null ? 0 : cx50Var.hashCode())) * 31;
        bkj0 bkj0Var = this.c;
        return iHashCode2 + (bkj0Var != null ? bkj0Var.hashCode() : 0);
    }
}
