package p;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yyp0 implements l270 {
    public final azp0 a;
    public final List b;
    public final v360 c;
    public final List d;
    public final idd1 e;

    public yyp0(azp0 azp0Var, List list, v360 v360Var, List list2) {
        this.a = azp0Var;
        this.b = list;
        this.c = v360Var;
        this.d = list2;
        this.e = new idd1(new pdp0(this, (byte) 17));
    }

    public final yyp0 a(m270 m270Var) {
        return new yyp0(this.a, this.b, this.c, o7h.O0(m270Var, this.d));
    }

    public final yyp0 b(p090 p090Var) {
        return d(new cnp0(p090Var, (byte) 13));
    }

    public final cxc c() {
        return (cxc) this.e.getValue();
    }

    public final yyp0 d(iu30 iu30Var) {
        return new yyp0(this.a, o7h.O0(iu30Var, this.b), this.c, this.d);
    }

    public final yyp0 e() {
        return d(cwp0.d);
    }

    public final yyp0 f(long j, TimeUnit timeUnit) {
        return d(new n82(j, timeUnit, (byte) 9));
    }

    public final yyp0 g(long j, TimeUnit timeUnit) {
        return d(new xyp0(j, timeUnit, (byte) 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yyp0(azp0 azp0Var) {
        v360 v360VarV = dm5.V(new String[0]);
        z6x z6xVar = z6x.a;
        this(azp0Var, z6xVar, v360VarV, z6xVar);
    }
}
