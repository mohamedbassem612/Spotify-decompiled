package p;

import java.math.BigInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fds implements fn51 {
    public final /* synthetic */ gds a;

    public fds(gds gdsVar) {
        this.a = gdsVar;
    }

    @Override // p.fn51
    public final en51 b(long j) {
        gds gdsVar = this.a;
        long j2 = (((long) gdsVar.d.i) * j) / 1000000;
        long j3 = gdsVar.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = gdsVar.c;
        pn51 pn51Var = new pn51(j, zoi1.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(gdsVar.f)).longValue() + j3) - 30000, gdsVar.b, j4 - 1));
        return new en51(pn51Var, pn51Var);
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.fn51
    public final long g() {
        gds gdsVar = this.a;
        return (gdsVar.f * 1000000) / ((long) gdsVar.d.i);
    }
}
