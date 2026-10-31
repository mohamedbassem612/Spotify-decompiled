package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a5d1 implements g5d1 {
    public final g7d1 a;

    public a5d1(g7d1 g7d1Var) {
        this.a = g7d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5d1) && this.a.equals(((a5d1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
