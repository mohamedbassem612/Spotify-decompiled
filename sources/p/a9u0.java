package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9u0 extends g3p1 {
    public final tv80 c;

    public a9u0(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9u0) && u890.j(this.c, ((a9u0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
