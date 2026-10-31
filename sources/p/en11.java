package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class en11 implements bn11 {
    public final lzn0 a;
    public final kko b;
    public final epb1 c;
    public final js20 d = x3p1.n(new dn11(this, (byte) 0), hm11.Q0, h211.W0, (o8n) null, new dn11(this, (byte) 1), 8);
    public final nw2 e;
    public final psw f;

    public en11(gw70 gw70Var, yvp yvpVar, lzn0 lzn0Var, kko kkoVar, lik1 lik1Var, epb1 epb1Var) {
        nw2 nw2Var;
        this.a = lzn0Var;
        this.b = kkoVar;
        this.c = epb1Var;
        switch (yvpVar.a) {
            case 0:
                nw2Var = new nw2(lik1Var);
                break;
            default:
                nw2Var = new nw2(lik1Var);
                break;
        }
        this.e = nw2Var;
        j2i j2iVar = new j2i(1812902566, new t20(gw70Var, this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
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
