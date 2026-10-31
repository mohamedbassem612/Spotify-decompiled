package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wdi0 implements cvl1, xpw {
    public final gw70 a;
    public final lo60 b;
    public final iuj c;
    public final vgm d;
    public final nwt e;
    public final vun f;
    public final idm g;
    public final js20 h = x3p1.n(new xy50(this, (byte) 14), new udi0(this, (byte) 0), new yih0(this, (byte) 7), (o8n) null, new udi0(this, (byte) 1), 8);
    public final hy00 i = n3o1.r(this).c(h40.T0, ytg0.V0);
    public final psw t;

    public wdi0(gw70 gw70Var, lo60 lo60Var, iuj iujVar, vgm vgmVar, nwt nwtVar, vun vunVar, fns fnsVar, idm idmVar) {
        this.a = gw70Var;
        this.b = lo60Var;
        this.c = iujVar;
        this.d = vgmVar;
        this.e = nwtVar;
        this.f = vunVar;
        this.g = idmVar;
        j2i j2iVarJ = apo.j(-714571103, new vdi0(this, fnsVar), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVarJ, (byte) 0);
    }

    @Override // p.avl1
    public final rqw a() {
        return this.i;
    }

    @Override // p.maa
    public final jsw c() {
        return this.t;
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.h;
    }
}
