package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vyq implements yyq {
    public final jh5 a;

    public vyq(jh5 jh5Var) {
        this.a = jh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyq) && u890.j(this.a, ((vyq) obj).a);
    }

    @Override // p.yyq
    public final String getMessage() {
        return "No source for key: " + this.a;
    }

    public final int hashCode() {
        return this.a.c;
    }

    public final String toString() {
        jh5 jh5Var = this.a;
        return "NoSource(table=" + jh5Var.a + ", key=" + jh5Var.b + ")";
    }
}
