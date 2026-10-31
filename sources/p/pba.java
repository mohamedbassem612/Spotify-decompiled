package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class pba implements vjh0 {
    public final long b;
    public final long c;
    public long d;

    public pba(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
    }

    public final void d() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            hhg1.k();
        }
    }

    @Override // p.vjh0
    public final boolean next() {
        long j = this.d + 1;
        this.d = j;
        return !(j > this.c);
    }
}
