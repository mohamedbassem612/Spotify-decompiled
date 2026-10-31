package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kqc1 {
    public static final kqc1 c = new kqc1(-9223372036854775807L, false);
    public boolean a;
    public long b;

    public kqc1(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }

    public boolean b() {
        return this.a;
    }

    public void c(boolean z) {
        this.a = z;
    }

    public void d(long j) {
        this.b = j;
    }

    public kqc1() {
    }
}
