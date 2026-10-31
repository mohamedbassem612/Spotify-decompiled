package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wyq implements yyq {
    public final jh5 a;
    public final e3r b;

    public wyq(jh5 jh5Var, e3r e3rVar) {
        this.a = jh5Var;
        this.b = e3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyq)) {
            return false;
        }
        wyq wyqVar = (wyq) obj;
        return u890.j(this.a, wyqVar.a) && this.b.equals(wyqVar.b);
    }

    @Override // p.yyq
    public final String getMessage() {
        return "Source failed for " + this.a + ": " + this.b.getMessage();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.c * 31);
    }

    public final String toString() {
        jh5 jh5Var = this.a;
        return "SourceFailure(table=" + jh5Var.a + ", key=" + jh5Var.b + ", error=" + this.b + ")";
    }
}
