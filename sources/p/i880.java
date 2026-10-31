package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i880 implements k880 {
    public final qdg1 a;

    public i880(qdg1 qdg1Var) {
        this.a = qdg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i880) && this.a.equals(((i880) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
