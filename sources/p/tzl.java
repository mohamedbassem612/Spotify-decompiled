package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tzl extends zzl {
    public final txs0 a;

    public tzl(txs0 txs0Var) {
        this.a = txs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzl) && this.a.equals(((tzl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
