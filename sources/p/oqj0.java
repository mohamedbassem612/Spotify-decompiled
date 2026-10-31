package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oqj0 {
    public final npj0 a;
    public final nqj0 b;
    public final rqj0 c;

    public oqj0(npj0 npj0Var, nqj0 nqj0Var, rqj0 rqj0Var) {
        this.a = npj0Var;
        this.b = nqj0Var;
        this.c = rqj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqj0)) {
            return false;
        }
        oqj0 oqj0Var = (oqj0) obj;
        return u890.j(this.a, oqj0Var.a) && u890.j(this.b, oqj0Var.b) && this.c.equals(oqj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
