package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z6a1 implements ez00 {
    public final long a;
    public final long b;

    public z6a1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6a1)) {
            return false;
        }
        z6a1 z6a1Var = (z6a1) obj;
        return this.a == z6a1Var.a && this.b == z6a1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
