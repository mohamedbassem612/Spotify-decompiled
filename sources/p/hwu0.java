package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hwu0 {
    public final long a;
    public final long b;

    public hwu0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwu0)) {
            return false;
        }
        hwu0 hwu0Var = (hwu0) obj;
        return this.a == hwu0Var.a && this.b == hwu0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
