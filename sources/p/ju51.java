package p;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ju51 implements drb {
    public final d0r a;
    public final lzn0 b;
    public final u9c0 c;
    public final String d;
    public final Context e;
    public final ykq f;
    public final ykq g;
    public final waz0 h;
    public final ykq i;
    public final ykq j;
    public final cpq k;
    public final bpb1 l = gio1.b(Boolean.FALSE);
    public final LinkedHashMap m = new LinkedHashMap();
    public final String n;
    public final yd91 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mr20 f21p;
    public final xe01 q;
    public final m441 r;
    public final idd1 s;
    public final zt51 t;
    public final o3r u;
    public final a5m v;

    public ju51(koc0 koc0Var, d0r d0rVar, lzn0 lzn0Var, u9c0 u9c0Var, String str, Context context, ykq ykqVar, ykq ykqVar2, waz0 waz0Var, ykq ykqVar3, ykq ykqVar4, cpq cpqVar) {
        this.a = d0rVar;
        this.b = lzn0Var;
        this.c = u9c0Var;
        this.d = str;
        this.e = context;
        this.f = ykqVar;
        this.g = ykqVar2;
        this.h = waz0Var;
        this.i = ykqVar3;
        this.j = ykqVar4;
        this.k = cpqVar;
        roc0 roc0Var = (roc0) koc0Var;
        mr20 mr20VarU = rqt0.u(new kr41(roc0Var.d(), (byte) 1));
        mr20 mr20VarU2 = rqt0.u(new kr41(roc0Var.d(), (byte) 2));
        o3r o3rVarO = w3p1.o(new l4r(pwc0.D, 2, wu51.X0, new j4r(wu51.Z0), wu51.Y0), wu51.a1);
        rih1 rih1Var = rih1.a;
        cly0 cly0Var = new cly0(d3p1.F(d0rVar, o3rVarO, rih1Var), (byte) 6);
        lnm lnmVar = null;
        mr20 mr20VarU3 = rqt0.u(new x010(new ht20(waz0Var.e(), new lc41(this, (lnm) null, (byte) 20)), new x010(cly0Var, roc0Var.c(), new bu51(3, lnmVar, (byte) 0), (byte) 1), new dwf0(this, lnmVar, (byte) 19), (byte) 1));
        this.n = "select";
        this.o = new yd91(3, new au51(this, (byte) 1));
        this.f21p = rqt0.u(new kr41(roc0Var.d(), (byte) 3));
        this.q = d5p1.t(new ht20(h5p1.r(cly0Var, mr20VarU, mr20VarU3, mr20VarU2, new mrs(this, (lnm) null, (byte) 2)), new kdt0(this, (lnm) null, (byte) 20)), u9c0Var, new alb1(0L, Long.MAX_VALUE), new rrb(1, fg91.b));
        this.r = new m441(new n641(rqt0.u(new cly0(d3p1.F(d0rVar, ujo1.t(), rih1Var), (byte) 7)), this, (lnm) null, (byte) 16));
        this.s = new idd1(new au51(this, (byte) 0));
        this.t = new zt51(this, (byte) 0);
        this.u = w3p1.o(new l4r(pwc0.b, 1, wp51.c1, new j4r(new zt51(this, (byte) 1)), wp51.d1), wp51.a1);
        this.v = new a5m(this);
    }

    public final Object a(onm onmVar) {
        pwc0 pwc0Var = pwc0.D;
        cz51 cz51Var = new cz51();
        d0r d0rVar = this.a;
        rih1 rih1Var = rih1.a;
        Object objD = d0r.d(d0rVar, pwc0Var, rih1Var, cz51Var, onmVar);
        return objD == d9n.a ? objD : rih1Var;
    }

    @Override // p.xe91
    public final l381 c() {
        return this.v;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.o;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.f21p;
    }

    @Override // p.drb
    public final mr20 l() {
        return this.r;
    }

    @Override // p.drb
    public final Object o(qrb qrbVar, hsb hsbVar) {
        Object objA;
        boolean z = qrbVar.a;
        Boolean boolValueOf = Boolean.valueOf(z);
        bpb1 bpb1Var = this.l;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
        return (z || (objA = a(hsbVar)) != d9n.a) ? rih1.a : objA;
    }

    @Override // p.drb
    public final iu30 p() {
        return this.t;
    }

    @Override // p.drb
    public final xe01 r() {
        return this.q;
    }

    @Override // p.drb
    public final String v() {
        return this.n;
    }
}
