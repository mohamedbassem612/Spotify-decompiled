package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tui1 {
    public final d18 a = new d18((byte) 5);

    public final void a(long j, long j2) {
        this.a.f(j, j2);
    }

    public final long b() {
        return c(j2h1.g(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j) {
        if (qui1.d(j) <= 0.0f || qui1.e(j) <= 0.0f) {
            qf80.c("maximumVelocity should be a positive value. You specified=".concat(qui1.i(j)));
        }
        d18 d18Var = this.a;
        return j2h1.g(((sui1) d18Var.b).c(qui1.d(j)), ((sui1) d18Var.c).c(qui1.e(j)));
    }

    public final void d() {
        d18 d18Var = this.a;
        sui1 sui1Var = (sui1) d18Var.b;
        f46.h0(sui1Var.d, (Object) null);
        sui1Var.e = 0;
        sui1 sui1Var2 = (sui1) d18Var.c;
        f46.h0(sui1Var2.d, (Object) null);
        sui1Var2.e = 0;
        d18Var.a = 0L;
    }
}
