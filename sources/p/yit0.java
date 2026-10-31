package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yit0 extends ljt0 {
    public final long a;
    public final long b;

    public yit0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yit0)) {
            return false;
        }
        yit0 yit0Var = (yit0) obj;
        return this.a == yit0Var.a && this.b == yit0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
