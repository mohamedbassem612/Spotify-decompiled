package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pe6 {
    public final ne6 a;
    public final ne6 b;

    public pe6(ne6 ne6Var, ne6 ne6Var2) {
        this.a = ne6Var;
        this.b = ne6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe6)) {
            return false;
        }
        pe6 pe6Var = (pe6) obj;
        return this.a == pe6Var.a && this.b == pe6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
