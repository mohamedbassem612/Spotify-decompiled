package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uwi1 extends vwi1 {
    public final ywi1 a;

    public uwi1(ywi1 ywi1Var) {
        this.a = ywi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwi1) && this.a.equals(((uwi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
