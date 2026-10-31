package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sws0 implements uws0 {
    public final txs0 a;

    public sws0(txs0 txs0Var) {
        this.a = txs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sws0) && this.a.equals(((sws0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
