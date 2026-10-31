package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yo80 implements zo80 {
    public final long a;
    public final int b;

    public yo80(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // p.zo80
    public final lo80 toInstant() {
        lo80 lo80Var = lo80.c;
        long jA = n9p1.r().a();
        long j = this.a;
        if (j >= jA && j <= n9p1.q().a()) {
            return n9p1.p(this.b, j);
        }
        throw new oo80("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
