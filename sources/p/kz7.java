package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kz7 extends lz7 {
    public final long a;
    public final long b;

    public kz7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz7)) {
            return false;
        }
        kz7 kz7Var = (kz7) obj;
        return this.a == kz7Var.a && this.b == kz7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
