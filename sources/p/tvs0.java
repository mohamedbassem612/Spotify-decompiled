package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tvs0 implements vvs0 {
    public final txs0 a;

    public tvs0(txs0 txs0Var) {
        this.a = txs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvs0) && this.a.equals(((tvs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
