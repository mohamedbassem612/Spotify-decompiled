package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uax0 extends yax0 {
    public final j8x0 a;

    public uax0(j8x0 j8x0Var) {
        this.a = j8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uax0) && this.a.equals(((uax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
