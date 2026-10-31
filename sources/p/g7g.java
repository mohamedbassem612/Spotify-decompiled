package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g7g implements q7g {
    public final j331 a;
    public final j331 b;

    public g7g(j331 j331Var, j331 j331Var2) {
        this.a = j331Var;
        this.b = j331Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7g)) {
            return false;
        }
        g7g g7gVar = (g7g) obj;
        return this.a.equals(g7gVar.a) && this.b.equals(g7gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
