package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c5d1 implements g5d1 {
    public final g7d1 a;
    public final g7d1 b;
    public final p6d1 c;

    public c5d1(g7d1 g7d1Var, g7d1 g7d1Var2, p6d1 p6d1Var) {
        this.a = g7d1Var;
        this.b = g7d1Var2;
        this.c = p6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5d1)) {
            return false;
        }
        c5d1 c5d1Var = (c5d1) obj;
        return this.a.equals(c5d1Var.a) && this.b.equals(c5d1Var.b) && this.c.equals(c5d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
