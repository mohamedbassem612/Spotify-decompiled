package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzr {
    public final lzn0 a;
    public final zxl b;
    public final ptf1 c;
    public final jqd0 d;
    public final Scheduler e;
    public final goq f;

    public hzr(lzn0 lzn0Var, zxl zxlVar, ptf1 ptf1Var, jqd0 jqd0Var, Scheduler scheduler, ffe1 ffe1Var, zqp zqpVar) {
        this.a = lzn0Var;
        this.b = zxlVar;
        this.c = ptf1Var;
        this.d = jqd0Var;
        this.e = scheduler;
        y0o y0oVar = new y0o(ffe1Var, this, (byte) 20);
        h72 h72Var = (h72) zqpVar.a.c;
        gj5 gj5Var = (gj5) ((csg0) h72Var.b).c.get();
        c8o.l(gj5Var);
        nw40 nw40Var = new nw40(gj5Var);
        gj5 gj5Var2 = (gj5) ((csg0) h72Var.b).c.get();
        c8o.l(gj5Var2);
        this.f = new goq(nw40Var, gj5Var2, y0oVar);
    }
}
