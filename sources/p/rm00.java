package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rm00 {
    public final long a;
    public final long b;

    public rm00(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public final double a() {
        return this.a / this.b;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }

    public rm00(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}
