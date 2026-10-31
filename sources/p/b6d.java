package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b6d implements mj00 {
    public final lo60 a;
    public final kly0 b;
    public final gw70 c;
    public final nwt d;
    public final h30 e;
    public final uk00 f;
    public final hj31 g;
    public final tym0 h;
    public final lk31 i;
    public final l0x0 j;
    public final mbm1 k;

    public b6d(lo60 lo60Var, lbp lbpVar, gw70 gw70Var, nwt nwtVar, h30 h30Var, uk00 uk00Var, hj31 hj31Var, tym0 tym0Var, lk31 lk31Var, l0x0 l0x0Var, mbm1 mbm1Var) {
        b3s b3sVar = b3s.c;
        this.a = lo60Var;
        this.b = lbpVar;
        this.c = gw70Var;
        this.d = nwtVar;
        this.e = h30Var;
        this.f = uk00Var;
        this.g = hj31Var;
        this.h = tym0Var;
        this.i = lk31Var;
        this.j = l0x0Var;
        this.k = mbm1Var;
    }

    @Override // p.mj00
    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        cka ckaVar = new cka(this, (byte) 17);
        Map mapA = this.e.a();
        ji50Var.b.put(y5d.class, new vw21(xj.P0, mapA, r4o1.X(ckaVar), v30.h, null));
        return ji50Var;
    }
}
