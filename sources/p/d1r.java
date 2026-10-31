package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d1r extends g3p1 {
    public final jh5 c;

    public d1r(jh5 jh5Var) {
        this.c = jh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1r) && u890.j(this.c, ((d1r) obj).c);
    }

    public final int hashCode() {
        return this.c.c;
    }
}
