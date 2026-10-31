package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tm91 implements xpw {
    public final n6r0 a;
    public final ki91 b;
    public final ggx0 c;
    public final js20 d = x3p1.n(new d061(1, this, tm91.class, "getState", "getState(Lcom/spotify/smartshuffle/smartshuffleelement/SmartShuffleElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 14), new rm91(this, (byte) 0), yd81.T0, (o8n) null, new rm91(this, (byte) 1), 8);
    public final ia00 e = n3o1.q(this).a(new cq61(this, (byte) 23), v691.W0);
    public final rbc0 f;
    public final mr20 g;
    public final bm91 h;
    public final om91 i;

    public tm91(p1f0 p1f0Var, idq idqVar, n6r0 n6r0Var, ki91 ki91Var, mr20 mr20Var, ggx0 ggx0Var) {
        this.a = n6r0Var;
        this.b = ki91Var;
        this.c = ggx0Var;
        this.f = new rbc0(n6r0Var, p1f0Var, idqVar, (byte) 2);
        this.g = mr20Var == null ? new huz(Boolean.TRUE, (byte) 10) : mr20Var;
        rp91 rp91Var = rp91.b;
        this.h = new bm91(rp91Var, rp91Var, 4, false, true);
        this.i = new om91("", rp91Var, rp91Var, 4, 0, false, false, true);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
