package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h081 {
    public final l081 a;
    public final d081 b;
    public final iix0 c;

    public h081(l081 l081Var, d081 d081Var, iix0 iix0Var) {
        this.a = l081Var;
        this.b = d081Var;
        this.c = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h081)) {
            return false;
        }
        h081 h081Var = (h081) obj;
        return u890.j(this.a, h081Var.a) && u890.j(this.b, h081Var.b) && u890.j(this.c, h081Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
