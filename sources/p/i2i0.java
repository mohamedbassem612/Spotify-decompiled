package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i2i0 {
    public final long a;
    public final long b;

    public i2i0(long j) {
        this.a = j;
        this.b = j * 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return i2i0.class.equals(obj != null ? obj.getClass() : null) && Math.abs(this.a - ((i2i0) obj).a) < 1000;
    }

    public final int hashCode() {
        return Long.hashCode(this.a / 1000);
    }
}
