package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e2h0 implements e4h0 {
    public final long a;
    public final boolean b;

    public e2h0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2h0)) {
            return false;
        }
        e2h0 e2h0Var = (e2h0) obj;
        return this.a == e2h0Var.a && this.b == e2h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
