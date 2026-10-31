package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hgc0 {
    public final hqm1 a;

    public hgc0(hqm1 hqm1Var) {
        this.a = hqm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgc0) && this.a.equals(((hgc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
