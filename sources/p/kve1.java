package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kve1 implements wc31 {
    public final long b;
    public final wc31 c;

    public kve1(long j, wc31 wc31Var) {
        o0c.k("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = wc31Var;
    }

    @Override // p.wc31
    public final uc31 a(r4d r4dVar) {
        uc31 uc31VarA = this.c.a(r4dVar);
        long j = this.b;
        return (j <= 0 || r4dVar.b < j - ((long) uc31VarA.a)) ? uc31VarA : uc31.d;
    }

    @Override // p.wc31
    public final long b() {
        return this.b;
    }
}
