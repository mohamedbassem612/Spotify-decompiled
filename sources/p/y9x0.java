package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y9x0 extends yax0 {
    public final j8x0 a;

    public y9x0(j8x0 j8x0Var) {
        this.a = j8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9x0) && this.a.equals(((y9x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
