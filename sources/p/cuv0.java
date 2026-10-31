package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cuv0 implements euv0 {
    public final mvv0 a;

    public cuv0(mvv0 mvv0Var) {
        this.a = mvv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuv0) && this.a.equals(((cuv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
