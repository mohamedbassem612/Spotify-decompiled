package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yv6 implements h0r0 {
    public final lik1 a;
    public final hvj b;
    public final fw6 c;
    public final em0 d;
    public final q7r0 e;
    public final iac0 f;
    public final b0d0 g;
    public final ruz h;
    public final pbq i;
    public final u961 j;
    public final mxa1 k;
    public final d0p l;
    public final e0p m;
    public final f0p n;
    public final g0p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rg51 f86p;
    public final q8n q;
    public final myq0 r;
    public final mw6 s;
    public final bqk0 t;
    public final kly0 u;
    public final cbr0 v;
    public final yu3 w;

    /* JADX WARN: Multi-variable type inference failed */
    public yv6(lik1 lik1Var, p6r0 p6r0Var, yxe1 yxe1Var, hvj hvjVar, fw6 fw6Var, em0 em0Var, e5b0 e5b0Var, q7r0 q7r0Var, iac0 iac0Var, b0d0 b0d0Var, ruz ruzVar, pbq pbqVar, u961 u961Var, mxa1 mxa1Var, d0p d0pVar, e0p e0pVar, f0p f0pVar, g0p g0pVar, rg51 rg51Var, q8n q8nVar, myq0 myq0Var, mw6 mw6Var, bqk0 bqk0Var, fwo fwoVar) {
        b3s b3sVar = b3s.c;
        this.a = lik1Var;
        this.b = hvjVar;
        this.c = fw6Var;
        this.d = em0Var;
        this.e = q7r0Var;
        this.f = iac0Var;
        this.g = b0d0Var;
        this.h = ruzVar;
        this.i = pbqVar;
        this.j = u961Var;
        this.k = mxa1Var;
        this.l = d0pVar;
        this.m = e0pVar;
        this.n = f0pVar;
        this.o = g0pVar;
        this.f86p = rg51Var;
        this.q = q8nVar;
        this.r = myq0Var;
        this.s = mw6Var;
        this.t = bqk0Var;
        this.u = fwoVar;
        cbr0 cbr0Var = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0Var, lik1Var, new nar0(bqk0Var)), new q1r0(false), new t1r0(true), new s9h1(12, true, true, false), e5b0Var}, false);
        this.v = cbr0Var;
        this.w = new yu3(cbr0Var, em0Var, new i26(this, (byte) 10));
    }

    public final cbr0 a() {
        return this.v;
    }

    public final p2r0 b() {
        iac0 iac0Var = this.f;
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        yu3 yu3Var = this.w;
        xab1 xab1Var = (xab1) yu3Var.e;
        lnm lnmVar = null;
        if (xab1Var == null || !xab1Var.isActive()) {
            yu3Var.e = fn31.T(u9c0VarQ, (o8n) null, 0, new vk6(yu3Var, (lnm) null, (byte) 0), 3);
        }
        PlayOrigin playOriginBuild = this.r.get().toBuilder().featureIdentifier("discography").build();
        em0 em0Var = this.d;
        xe01 xe01Var = (xe01) em0Var.X;
        xg6 xg6Var = new xg6(this, playOriginBuild, (byte) 11);
        q8n q8nVar = this.q;
        vv6 vv6Var = new vv6(xe01Var, q8nVar, xg6Var);
        l4p1.u(cto1.q(iac0Var), o4p1.r(new fu20(xe01Var, new ry5(vv6Var, lnmVar, (byte) 8), (byte) 1), q8nVar));
        d0r d0rVarC = cwl1.C(this.e);
        String str = this.c.b;
        boolean zA = ((f54) this.u.get()).a();
        u9c0 u9c0VarQ2 = cto1.q(iac0Var);
        b3s b3sVar = b3s.c;
        return hvj.b(this.b, f4p1.g(new bv6(d0rVarC, em0Var, str, zA, u9c0VarQ2)), new j2i(-552007376, new n891(this, vv6Var, playOriginBuild, (byte) 19), true));
    }
}
