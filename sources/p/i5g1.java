package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i5g1 implements wpw {
    public final js20 X;
    public final i7h1 Y;
    public final y1c1 a;
    public final d0r b;
    public final vun c;
    public final ggv d;
    public final gw70 e;
    public final yqg f;
    public final aod g;
    public final ylt0 h;
    public final nsw i = jch0.j(new zyf1(this, (byte) 2));
    public final o3r t;

    public i5g1(y1c1 y1c1Var, d0r d0rVar, vun vunVar, ggv ggvVar, gw70 gw70Var, yqg yqgVar, aod aodVar, ylt0 ylt0Var, a5m a5mVar, lc20 lc20Var, t0b t0bVar) {
        this.a = y1c1Var;
        this.b = d0rVar;
        this.c = vunVar;
        this.d = ggvVar;
        this.e = gw70Var;
        this.f = yqgVar;
        this.g = aodVar;
        this.h = ylt0Var;
        uyf1 uyf1Var = uyf1.c1;
        this.t = q3p1.n(p7h.M(new o3r[]{t0bVar.b, a5mVar.a, (o3r) lc20Var.d, w3p1.o(new l4r(hjx0.a, 2, uyf1.e1, new j4r(uyf1Var), h5g1.b), uyf1.d1)}), new qrk(1, (byte) 10));
        this.X = w3p1.q(new g5g1(this, (byte) 0), new g5g1(this, (byte) 1), new lda1(2, this, i5g1.class, "toState", "toState(Lcom/spotify/creativeworkelements/trailer/TrailerElement$Props;Lcom/spotify/creativeworkelements/trailerimpl/TrailerElementImpl$ExternalState;)Lcom/spotify/creativeworkelements/trailer/TrailerElement$State;", 0, (byte) 4), (o8n) null, new g5g1(this, (byte) 2), 8);
        this.Y = new i7h1(vrf1.S0, vrf1.T0);
    }

    public final rqw a() {
        return this.Y;
    }

    public final rsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.X;
    }
}
