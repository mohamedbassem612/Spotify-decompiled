package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class za41 extends gf30 {
    public final zw11 b;
    public long c;

    public za41(c291 c291Var, zw11 zw11Var) {
        super(c291Var);
        this.b = zw11Var;
    }

    public final void B0(nac nacVar, long j) {
        super.B0(nacVar, j);
        long j2 = this.c + j;
        this.c = j2;
        this.b.invoke(Long.valueOf(j2));
    }
}
