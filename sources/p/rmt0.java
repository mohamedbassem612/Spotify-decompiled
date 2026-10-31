package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rmt0 implements nmt0 {
    public final zob1 a;
    public final clm b;
    public final nwt c;
    public final ycm d;
    public final myq0 e;
    public final js20 f;
    public final ia00 g;
    public final psw h;

    public rmt0(zob1 zob1Var, clm clmVar, nwt nwtVar, gw70 gw70Var, l0x0 l0x0Var, lzn0 lzn0Var, ycm ycmVar, vgm vgmVar, myq0 myq0Var) {
        this.a = zob1Var;
        this.b = clmVar;
        this.c = nwtVar;
        this.d = ycmVar;
        this.e = myq0Var;
        idd1 idd1Var = new idd1(new kks0(this, (byte) 10));
        idd1 idd1Var2 = new idd1(new u6j0(this, (byte) 28));
        this.f = lmt0.q(this, new fgs0(this, (byte) 13), lzn0Var, vgmVar);
        this.g = l0p1.n(this, l0x0Var);
        this.h = j0p1.v(this, gw70Var, (idm) idd1Var.getValue(), (hft0) idd1Var2.getValue(), qmt0.a);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
