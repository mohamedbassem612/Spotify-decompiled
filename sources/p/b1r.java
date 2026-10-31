package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b1r extends g3p1 {
    public final jh5 c;
    public final e3r d;

    public b1r(jh5 jh5Var, e3r e3rVar) {
        this.c = jh5Var;
        this.d = e3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1r)) {
            return false;
        }
        b1r b1rVar = (b1r) obj;
        return u890.j(this.c, b1rVar.c) && this.d.equals(b1rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.c * 31);
    }
}
