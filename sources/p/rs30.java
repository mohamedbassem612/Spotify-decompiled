package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rs30 {
    public final wr21 a;
    public final String b;
    public final pxk0 c;

    public rs30(wr21 wr21Var, String str, pxk0 pxk0Var) {
        this.a = wr21Var;
        this.b = str;
        this.c = pxk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs30)) {
            return false;
        }
        rs30 rs30Var = (rs30) obj;
        return u890.j(this.a, rs30Var.a) && u890.j(this.b, rs30Var.b) && u890.j(this.c, rs30Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        pxk0 pxk0Var = this.c;
        return iD + (pxk0Var == null ? 0 : pxk0Var.hashCode());
    }
}
