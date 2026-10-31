package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h2h0 implements e4h0 {
    public final long a;
    public final o7h0 b;

    public h2h0(long j, o7h0 o7h0Var) {
        this.a = j;
        this.b = o7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2h0)) {
            return false;
        }
        h2h0 h2h0Var = (h2h0) obj;
        return this.a == h2h0Var.a && this.b.equals(h2h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
