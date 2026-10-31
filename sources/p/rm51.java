package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rm51 {
    public final long a;
    public final ixg b;

    public rm51(long j, ixg ixgVar) {
        this.a = j;
        this.b = ixgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rm51) {
            rm51 rm51Var = (rm51) obj;
            return this.a == rm51Var.a && this.b == rm51Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
