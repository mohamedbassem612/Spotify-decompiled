package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lr11 {
    public final pr11 a;
    public final jwn b;
    public final id2 c;

    public lr11(pr11 pr11Var, jwn jwnVar, id2 id2Var) {
        this.a = pr11Var;
        this.b = jwnVar;
        this.c = id2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr11)) {
            return false;
        }
        lr11 lr11Var = (lr11) obj;
        return u890.j(this.a, lr11Var.a) && u890.j(this.b, lr11Var.b) && u890.j(this.c, lr11Var.c);
    }

    public final int hashCode() {
        pr11 pr11Var = this.a;
        int iHashCode = (this.b.hashCode() + ((pr11Var == null ? 0 : pr11Var.hashCode()) * 31)) * 31;
        id2 id2Var = this.c;
        return iHashCode + (id2Var != null ? id2Var.hashCode() : 0);
    }
}
