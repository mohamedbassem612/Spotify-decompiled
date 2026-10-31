package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class spd0 {
    public final long a;
    public final byte b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public spd0(long j, long j2) {
        this.a = j;
        this.b = (int) j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spd0)) {
            return false;
        }
        spd0 spd0Var = (spd0) obj;
        return this.a == spd0Var.a && ((long) this.b) == ((long) spd0Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
