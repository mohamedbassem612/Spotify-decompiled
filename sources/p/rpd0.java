package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rpd0 {
    public final long a;
    public final byte b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public rpd0(long j, long j2) {
        this.a = j;
        this.b = (int) j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpd0)) {
            return false;
        }
        rpd0 rpd0Var = (rpd0) obj;
        return this.a == rpd0Var.a && ((long) this.b) == ((long) rpd0Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
