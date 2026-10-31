package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ghm {
    public final iu30 a;
    public final iu30 b;

    public ghm(iu30 iu30Var, iu30 iu30Var2) {
        this.a = iu30Var;
        this.b = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghm)) {
            return false;
        }
        ghm ghmVar = (ghm) obj;
        return u890.j(this.a, ghmVar.a) && u890.j(this.b, ghmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
