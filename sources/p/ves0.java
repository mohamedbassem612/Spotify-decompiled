package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ves0 extends ses0 {
    public long f;

    public final void e(int i) {
        this.f |= 1 << i;
    }

    public final boolean f(int i) {
        return ((1 << i) & this.f) != 0;
    }

    public final void j(long j) {
        this.f = j;
    }

    public final long l() {
        return this.f;
    }

    public final void m() {
        this.f = 0L;
    }
}
