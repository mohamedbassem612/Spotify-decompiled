package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nzf1 {
    public final String a;
    public final int b;
    public final gzf1 c;
    public final iu30 d;

    public nzf1(String str, int i, gzf1 gzf1Var, iu30 iu30Var) {
        this.a = str;
        this.b = i;
        this.c = gzf1Var;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzf1)) {
            return false;
        }
        nzf1 nzf1Var = (nzf1) obj;
        return this.a.equals(nzf1Var.a) && this.b == nzf1Var.b && this.c.equals(nzf1Var.c) && u890.j(this.d, nzf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
