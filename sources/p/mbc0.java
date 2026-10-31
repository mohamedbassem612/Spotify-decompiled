package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mbc0 implements xpw {
    public final epb1 a;
    public final lh2 b;
    public final vu30 c;
    public final xu30 d;
    public final vu30 e;
    public final yt11 f;
    public final poy0 g = f2p1.p(new lbc0(1, this, mbc0.class, "externalState", "externalState(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseStructuredData;)Landroidx/lifecycle/LiveData;", 0, (byte) 0), hyb0.R0, new c4z(2, this, mbc0.class, "mapState", "mapState(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseStructuredData;Lcom/spotify/home/evopage/element/lighttrackrow/LightTrackRowElement$ExternalState;)Lcom/spotify/creativeworkplatform/releaserowelement/State;", 0, (byte) 18), new pdb0(this, (byte) 12), 8);
    public final ia00 h;
    public final rbc0 i;

    public mbc0(epb1 epb1Var, lh2 lh2Var, vu30 vu30Var, xu30 xu30Var, vu30 vu30Var2, yt11 yt11Var, rtw0 rtw0Var, gw70 gw70Var, kpg0 kpg0Var, fqg0 fqg0Var) {
        this.a = epb1Var;
        this.b = lh2Var;
        this.c = vu30Var;
        this.d = xu30Var;
        this.e = vu30Var2;
        this.f = yt11Var;
        this.h = n3o1.q(this).a(new i6a(rtw0Var, (byte) 5), new g001(rtw0Var, (byte) 25));
        this.i = new rbc0(gw70Var, kpg0Var, fqg0Var, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
