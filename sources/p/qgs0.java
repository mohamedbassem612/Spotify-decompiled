package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qgs0 {
    public final pgs0 a;
    public final String b;
    public final j16 c;

    public qgs0(pgs0 pgs0Var, String str, j16 j16Var) {
        this.a = pgs0Var;
        this.b = str;
        this.c = j16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgs0)) {
            return false;
        }
        qgs0 qgs0Var = (qgs0) obj;
        return u890.j(this.a, qgs0Var.a) && u890.j(this.b, qgs0Var.b) && this.c == qgs0Var.c;
    }

    public final int hashCode() {
        pgs0 pgs0Var = this.a;
        return this.c.hashCode() + cy30.d((pgs0Var == null ? 0 : pgs0Var.hashCode()) * 31, 31, this.b);
    }
}
