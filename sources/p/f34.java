package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f34 implements mj00 {
    public final gw70 a;
    public final lo60 b;
    public final sp00 c;
    public final p5x0 d;
    public final h30 e;
    public final vgm f;
    public final r860 g;
    public final c35 h;
    public final lmo i;

    public f34(gw70 gw70Var, lo60 lo60Var, sp00 sp00Var, p5x0 p5x0Var, h30 h30Var, vgm vgmVar, r860 r860Var, c35 c35Var, lmo lmoVar) {
        this.a = gw70Var;
        this.b = lo60Var;
        this.c = sp00Var;
        this.d = p5x0Var;
        this.e = h30Var;
        this.f = vgmVar;
        this.g = r860Var;
        this.h = c35Var;
        this.i = lmoVar;
    }

    @Override // p.mj00
    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        n2 n2Var = new n2(this, xk00Var, (byte) 28);
        Map mapA = this.e.a();
        ji50Var.b.put(v24.class, new vw21(xj.e, mapA, r4o1.X(n2Var), v30.d, null));
        return ji50Var;
    }
}
