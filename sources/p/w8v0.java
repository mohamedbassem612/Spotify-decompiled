package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w8v0 {
    public final p620 a;
    public final xfa1 b;
    public final n8z c;

    public w8v0(p620 p620Var, xfa1 xfa1Var, n8z n8zVar) {
        this.a = p620Var;
        this.b = xfa1Var;
        this.c = n8zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8v0)) {
            return false;
        }
        w8v0 w8v0Var = (w8v0) obj;
        return this.a.equals(w8v0Var.a) && this.b.equals(w8v0Var.b) && this.c.equals(w8v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
