package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class es2 {
    public final h290 a;
    public final String b;
    public final at2 c;

    public es2(h290 h290Var, String str, at2 at2Var) {
        this.a = h290Var;
        this.b = str;
        this.c = at2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es2)) {
            return false;
        }
        es2 es2Var = (es2) obj;
        return this.a.equals(es2Var.a) && u890.j(this.b, es2Var.b) && u890.j(this.c, es2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        at2 at2Var = this.c;
        return iHashCode2 + (at2Var != null ? at2Var.hashCode() : 0);
    }
}
