package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qtf1 {
    public final long a;
    public final long b;

    public qtf1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtf1)) {
            return false;
        }
        qtf1 qtf1Var = (qtf1) obj;
        return this.a == qtf1Var.a && this.b == qtf1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
