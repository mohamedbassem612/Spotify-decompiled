package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class trx0 extends ktx0 {
    public final cwi0 a;
    public final boolean b;

    public trx0(cwi0 cwi0Var, boolean z) {
        this.a = cwi0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trx0)) {
            return false;
        }
        trx0 trx0Var = (trx0) obj;
        return this.a.equals(trx0Var.a) && this.b == trx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
