package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e1b {
    public final v4i1 a;
    public final pqo b;

    public e1b(v4i1 v4i1Var, pqo pqoVar) {
        this.a = v4i1Var;
        this.b = pqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1b)) {
            return false;
        }
        e1b e1bVar = (e1b) obj;
        return u890.j(this.a, e1bVar.a) && u890.j(this.b, e1bVar.b);
    }

    public final int hashCode() {
        v4i1 v4i1Var = this.a;
        return this.b.hashCode() + ((v4i1Var == null ? 0 : v4i1Var.hashCode()) * 31);
    }
}
