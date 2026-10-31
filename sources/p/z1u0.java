package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z1u0 {
    public final long a;
    public final long b;

    public z1u0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1u0)) {
            return false;
        }
        z1u0 z1u0Var = (z1u0) obj;
        return jfv.f(this.a, z1u0Var.a) && jfv.f(this.b, z1u0Var.b);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
