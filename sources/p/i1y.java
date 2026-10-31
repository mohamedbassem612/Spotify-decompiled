package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i1y {
    public final s4b1 a;

    public i1y(s4b1 s4b1Var) {
        this.a = s4b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1y) && this.a.equals(((i1y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
