package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qjp {
    public final Object a;
    public final Object b;
    public final Object c;

    public qjp(af70 af70Var) {
        this.b = af70Var;
        this.a = xqu.b(new i8p(this, 0, (byte) 23));
        this.c = xqu.b(new i8p(this, 1, (byte) 23));
    }

    public iir a() {
        lca0 lca0Var = (lca0) this.b;
        mr20 mr20Var = (mr20) lca0Var.d.get();
        c8o.l(mr20Var);
        v5n v5nVar = (v5n) lca0Var.e.get();
        c8o.l(v5nVar);
        g0l g0lVar = (g0l) lca0Var.f.get();
        c8o.l(g0lVar);
        c9c0 c9c0Var = (c9c0) lca0Var.n.get();
        c8o.l(c9c0Var);
        qo90 qo90Var = ((kca0) this.c).a.a;
        c8o.m(qo90Var);
        xvo xvoVar = (xvo) lca0Var.f23p.get();
        c8o.l(xvoVar);
        Context context = (Context) lca0Var.g.get();
        c8o.l(context);
        return new iir(mr20Var, v5nVar, g0lVar, c9c0Var, qo90Var, xvoVar, context);
    }

    public uo5 b() {
        cne0 cne0Var = (cne0) this.b;
        kly0 kly0Var = cne0Var.a;
        RetrofitMaker retrofitMaker = (RetrofitMaker) kly0Var.get();
        c8o.l(retrofitMaker);
        cpd0 cpd0Var = (cpd0) retrofitMaker.createWebgateService(cpd0.class, "android-liveevents-datasource");
        RetrofitMaker retrofitMaker2 = (RetrofitMaker) kly0Var.get();
        c8o.l(retrofitMaker2);
        wlk wlkVar = (wlk) retrofitMaker2.createWebgateService(wlk.class, "android-liveevents-datasource");
        xrk xrkVar = (xrk) cne0Var.c.get();
        c8o.l(xrkVar);
        return new uo5(cpd0Var, wlkVar, xrkVar, (byte) 24);
    }

    public qjp(nzp nzpVar, qop qopVar) {
        this.b = nzpVar;
        this.c = qopVar;
        this.a = xqu.b(new xrp(this, (byte) 3));
    }

    public qjp(ozp ozpVar, qop qopVar) {
        this.b = ozpVar;
        this.a = qopVar;
        this.c = new ikp(this, (byte) 19);
    }

    public qjp(a0q a0qVar, tbt tbtVar) {
        this.b = tbtVar;
        this.c = a0qVar;
        this.a = iy81.a(new ikp(this, (byte) 9));
    }

    public qjp(y0q y0qVar, gl90 gl90Var) {
        this.b = gl90Var;
        this.c = y0qVar;
        this.a = iy81.a(new xrp(this, (byte) 7));
    }

    public qjp(kzp kzpVar, qop qopVar, bct bctVar) {
        this.b = qopVar;
        this.c = kzpVar;
        this.a = iy81.a(new ikp(this, (byte) 13));
    }

    public qjp(g2z g2zVar) {
        this.b = g2zVar;
        this.c = new dlp(this, 1, (byte) 20);
        this.a = xqu.b(new dlp(this, 0, (byte) 20));
    }

    public qjp(k3d0 k3d0Var, l3d0 l3d0Var) {
        this.b = k3d0Var;
        this.a = xqu.b(new dlp(this, 0, (byte) 9));
        this.c = new dlp(this, 1, (byte) 9);
    }

    public qjp(zsj0 zsj0Var) {
        this.b = zsj0Var;
        this.a = xqu.b(new dlp(this, 1, (byte) 3));
        this.c = xqu.b(new dlp(this, 0, (byte) 3));
    }

    public qjp(f880 f880Var, r880 r880Var) {
        this.b = f880Var;
        this.c = r880Var;
        this.a = iy81.a(new xep(this, (byte) 28));
    }

    public qjp(sse0 sse0Var, ryj ryjVar) {
        this.b = sse0Var;
        this.a = new dlp(this, 0, (byte) 13);
        this.c = new dlp(this, 1, (byte) 13);
    }

    public qjp(c890 c890Var, d890 d890Var, q7r0 q7r0Var) {
        this.b = c890Var;
        this.c = q7r0Var;
        this.a = xqu.b(new ikp(this, (byte) 1));
    }

    public qjp(tva0 tva0Var, jwa jwaVar) {
        this.b = tva0Var;
        this.c = jwaVar;
        this.a = iy81.a(new ikp(this, (byte) 11));
    }

    public qjp(emi0 emi0Var, gmi0 gmi0Var) {
        this.b = emi0Var;
        this.c = gmi0Var;
        this.a = iy81.a(new ikp(this, (byte) 28));
    }

    public qjp(vzp vzpVar, qop qopVar, bct bctVar) {
        this.b = vzpVar;
        this.c = new i8p(this, 0, (byte) 24);
        this.a = iy81.a(new i8p(this, 1, (byte) 24));
    }

    public qjp(cth0 cth0Var, zsh0 zsh0Var) {
        this.b = cth0Var;
        this.a = xqu.b(new dlp(this, 0, (byte) 18));
        this.c = xqu.b(new dlp(this, 1, (byte) 18));
    }

    public qjp(qqm0 qqm0Var, rqm0 rqm0Var, q7r0 q7r0Var) {
        this.b = qqm0Var;
        this.a = iy81.a(new dlp(this, 0, (byte) 21));
        this.c = iy81.a(new dlp(this, 1, (byte) 21));
    }

    public qjp(rcb0 rcb0Var) {
        this.b = rcb0Var;
        this.a = xqu.b(new dlp(this, 1, (byte) 5));
        this.c = xqu.b(new dlp(this, 0, (byte) 5));
    }

    public qjp(lca0 lca0Var, kca0 kca0Var) {
        this.b = lca0Var;
        this.c = kca0Var;
        this.a = xqu.b(new ikp(this, (byte) 7));
    }

    public qjp(rxa0 rxa0Var, rmc1 rmc1Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new dlp(this, 1, (byte) 0);
        this.a = xqu.b(new dlp(this, 0, (byte) 0));
    }

    public qjp(a2c0 a2c0Var, o2c0 o2c0Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new dlp(this, 1, (byte) 6);
        this.a = xqu.b(new dlp(this, 0, (byte) 6));
    }

    public qjp(chg0 chg0Var, zuj zujVar, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.a = iy81.a(new dlp(this, 0, (byte) 17));
        this.c = new dlp(this, 1, (byte) 17);
    }

    public qjp(zva0 zva0Var, e4n e4nVar, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new i8p(this, 1, (byte) 25);
        this.a = xqu.b(new i8p(this, 0, (byte) 25));
    }

    public qjp(kxa0 kxa0Var, lxa0 lxa0Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new i8p(this, 1, (byte) 28);
        this.a = xqu.b(new i8p(this, 0, (byte) 28));
    }

    public qjp(owa0 owa0Var, pwa0 pwa0Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new i8p(this, 1, (byte) 26);
        this.a = xqu.b(new i8p(this, 0, (byte) 26));
    }

    public qjp(nxa0 nxa0Var, z1t0 z1t0Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new i8p(this, 1, (byte) 29);
        this.a = xqu.b(new i8p(this, 0, (byte) 29));
    }

    public qjp(uya0 uya0Var, thg1 thg1Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new dlp(this, 1, (byte) 1);
        this.a = xqu.b(new dlp(this, 0, (byte) 1));
    }

    public qjp(oye0 oye0Var, zuj zujVar, pye0 pye0Var, q7r0 q7r0Var) {
        this.b = q7r0Var;
        this.c = new dlp(this, 1, (byte) 14);
        this.a = xqu.b(new dlp(this, 0, (byte) 14));
    }

    public qjp(cne0 cne0Var, zuj zujVar, ene0 ene0Var, q7r0 q7r0Var) {
        this.b = cne0Var;
        this.a = q7r0Var;
        this.c = new ikp(this, (byte) 23);
    }

    public qjp(ipi0 ipi0Var, zuj zujVar, kpi0 kpi0Var) {
        this.b = ipi0Var;
        this.a = xqu.b(new dlp(this, 1, (byte) 19));
        this.c = xqu.b(new dlp(this, 0, (byte) 19));
    }
}
