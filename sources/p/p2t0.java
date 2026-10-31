package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p2t0 {
    public final a3t0 a;

    public p2t0(a3t0 a3t0Var) {
        this.a = a3t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2t0) && this.a == ((p2t0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
