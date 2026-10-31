package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ja1 extends wa1 {
    public final String a;
    public final g4a b;

    public ja1(String str, g4a g4aVar) {
        this.a = str;
        this.b = g4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja1)) {
            return false;
        }
        ja1 ja1Var = (ja1) obj;
        return u890.j(this.a, ja1Var.a) && this.b == ja1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
