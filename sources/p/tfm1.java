package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tfm1 {
    public final nfm1 a;
    public final ela1 b;
    public final z771 c;
    public final int d;

    public tfm1(int i, z771 z771Var, ela1 ela1Var, nfm1 nfm1Var) {
        this.a = nfm1Var;
        this.b = ela1Var;
        this.c = z771Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfm1)) {
            return false;
        }
        tfm1 tfm1Var = (tfm1) obj;
        return this.a.equals(tfm1Var.a) && u890.j(this.b, tfm1Var.b) && u890.j(this.c, tfm1Var.c) && this.d == tfm1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xvj1.j(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
