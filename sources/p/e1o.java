package p;

import android.content.Context;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e1o {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f9p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public e1o(mjk mjkVar, njk njkVar, q7r0 q7r0Var) {
        this.a = mjkVar;
        this.b = q7r0Var;
        this.c = njkVar;
        this.d = new d7p(this, 0, (byte) 2);
        this.e = new d7p(this, 2, (byte) 2);
        this.f = new d7p(this, 3, (byte) 2);
        this.g = xqu.b(new d7p(this, 1, (byte) 2));
        this.h = new d7p(this, 4, (byte) 2);
        this.i = new d7p(this, 5, (byte) 2);
        this.j = new d7p(this, 6, (byte) 2);
        this.k = xqu.b(new d7p(this, 7, (byte) 2));
        this.l = new d7p(this, 9, (byte) 2);
        this.m = new d7p(this, 8, (byte) 2);
        this.n = iy81.a(new d7p(this, 10, (byte) 2));
        this.o = new d7p(this, 13, (byte) 2);
        this.f9p = new d7p(this, 14, (byte) 2);
        this.q = new d7p(this, 16, (byte) 2);
        this.r = new d7p(this, 17, (byte) 2);
        this.s = new d7p(this, 18, (byte) 2);
        this.t = new d7p(this, 19, (byte) 2);
        this.u = new d7p(this, 15, (byte) 2);
        this.v = new d7p(this, 21, (byte) 2);
        this.w = new d7p(this, 22, (byte) 2);
        this.x = new d7p(this, 25, (byte) 2);
        this.y = xqu.b(new d7p(this, 24, (byte) 2));
        this.z = iy81.a(new d7p(this, 23, (byte) 2));
        this.A = new d7p(this, 26, (byte) 2);
        this.B = iy81.a(new d7p(this, 20, (byte) 2));
        this.C = new d7p(this, 27, (byte) 2);
        this.D = new d7p(this, 28, (byte) 2);
        this.E = iy81.a(new d7p(this, 12, (byte) 2));
        this.F = iy81.a(new d7p(this, 29, (byte) 2));
        this.G = iy81.a(new d7p(this, 11, (byte) 2));
        this.H = xqu.b(new d7p(this, 30, (byte) 2));
        this.I = xqu.b(new d7p(this, 31, (byte) 2));
        this.J = xqu.b(new d7p(this, 32, (byte) 2));
    }

    public qfl1 a() {
        Context context = (Context) ((mjk) this.a).l.get();
        c8o.l(context);
        return new qfl1(context);
    }

    public iac0 b() {
        iac0 iac0Var = ((q7r0) this.b).d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public aru0 c() {
        mjk mjkVar = (mjk) this.a;
        gw70 gw70Var = (gw70) mjkVar.B.get();
        c8o.l(gw70Var);
        luk lukVar = (luk) mjkVar.k.get();
        c8o.l(lukVar);
        m35 m35Var = new m35(false, lukVar);
        ycm ycmVar = (ycm) mjkVar.m.get();
        c8o.l(ycmVar);
        return new aru0(gw70Var, m35Var, ycmVar, (byte) 21);
    }

    public sw9 d() {
        mjk mjkVar = (mjk) this.a;
        Context context = (Context) mjkVar.l.get();
        c8o.l(context);
        njk njkVar = (njk) this.c;
        ut71 ut71Var = (ut71) mjkVar.d0.get();
        c8o.l(ut71Var);
        xrk xrkVar = (xrk) ((d7p) this.e).get();
        String str = njkVar.c;
        return new sw9(ut71Var.b(context, str), xrkVar.c, (byte) 23);
    }

    public ytp0 e() {
        mjk mjkVar = (mjk) this.a;
        yh2 yh2Var = (yh2) mjkVar.c.get();
        c8o.l(yh2Var);
        vb2 vb2Var = (vb2) mjkVar.b.get();
        c8o.l(vb2Var);
        qns0 qns0Var = (qns0) mjkVar.S.get();
        c8o.l(qns0Var);
        zr00 zr00Var = (zr00) mjkVar.v.get();
        c8o.l(zr00Var);
        y390 y390Var = (y390) mjkVar.w.get();
        c8o.l(y390Var);
        return new ytp0(yh2Var, zr00Var, y390Var.a(b(), r6h1.c), qns0Var, vb2Var, (byte) 11);
    }

    public u9u0 f() {
        cyp cypVar = (cyp) ((d7p) this.h).get();
        mjk mjkVar = (mjk) this.a;
        b7r0 b7r0Var = (b7r0) mjkVar.R.get();
        c8o.l(b7r0Var);
        w9u0 w9u0Var = (w9u0) ((d7p) this.i).get();
        Flowable flowable = (Flowable) mjkVar.X.get();
        c8o.l(flowable);
        return new u9u0(cypVar, b7r0Var, w9u0Var, flowable);
    }

    public aru0 g() {
        return new aru0((yqg) ((d7p) this.f).get(), (nwt) ((d7p) this.o).get(), (clm) ((d7p) this.f9p).get(), (byte) 20);
    }

    public y1t0 h() {
        mjk mjkVar = (mjk) this.a;
        c8o.l((Context) mjkVar.l.get());
        c8o.l((dg30) mjkVar.z.get());
        xh71 xh71Var = (xh71) mjkVar.c0.get();
        c8o.l(xh71Var);
        return new y1t0(xh71Var, (byte) 12);
    }

    public e1o(yqg yqgVar, Context context, gw70 gw70Var, lzn0 lzn0Var, vgm vgmVar, htr htrVar, luk lukVar, ycm ycmVar, c3s c3sVar, nwt nwtVar, mr20 mr20Var, ov20 ov20Var, b7r0 b7r0Var, xrc0 xrc0Var, zut0 zut0Var, h5q h5qVar, n3d0 n3d0Var, ojv0 ojv0Var, d7p d7pVar, g3q0 g3q0Var, e9g1 e9g1Var, ugn0 ugn0Var, dma1 dma1Var, xfx xfxVar, agc0 agc0Var, String str, p6r0 p6r0Var, lik1 lik1Var, cyp cypVar, iac0 iac0Var, qns0 qns0Var, vb2 vb2Var, yh2 yh2Var, zr00 zr00Var, y390 y390Var, upp0 upp0Var, nfa0 nfa0Var) {
        this.a = yqgVar;
        this.b = context;
        this.c = gw70Var;
        this.d = lzn0Var;
        this.e = vgmVar;
        this.f = lukVar;
        this.g = ycmVar;
        this.h = c3sVar;
        this.i = nwtVar;
        this.j = mr20Var;
        this.k = ov20Var;
        this.l = b7r0Var;
        this.m = xrc0Var;
        this.n = zut0Var;
        this.o = h5qVar;
        this.f9p = n3d0Var;
        this.q = ojv0Var;
        this.r = d7pVar;
        this.s = g3q0Var;
        this.t = e9g1Var;
        this.u = ugn0Var;
        this.v = dma1Var;
        this.w = xfxVar;
        this.x = agc0Var;
        this.y = str;
        this.z = p6r0Var;
        this.A = lik1Var;
        this.B = cypVar;
        this.C = iac0Var;
        this.D = qns0Var;
        this.E = vb2Var;
        this.F = yh2Var;
        this.G = zr00Var;
        this.H = y390Var;
        this.I = upp0Var;
        this.J = nfa0Var;
    }

    public e1o(yqg yqgVar, Context context, gw70 gw70Var, lzn0 lzn0Var, vgm vgmVar, htr htrVar, luk lukVar, ycm ycmVar, ov20 ov20Var, b7r0 b7r0Var, xrc0 xrc0Var, zut0 zut0Var, h5q h5qVar, n3d0 n3d0Var, i8h1 i8h1Var, g3q0 g3q0Var, ugn0 ugn0Var, dma1 dma1Var, xfx xfxVar, agc0 agc0Var, t8u0 t8u0Var, iac0 iac0Var, qns0 qns0Var, vb2 vb2Var, yh2 yh2Var, zr00 zr00Var, y390 y390Var, upp0 upp0Var, mr20 mr20Var, e9g1 e9g1Var, c3s c3sVar, nwt nwtVar, nfa0 nfa0Var, String str, bn70 bn70Var, PlayOrigin playOrigin) {
        this.a = yqgVar;
        this.b = context;
        this.c = gw70Var;
        this.d = lzn0Var;
        this.e = vgmVar;
        this.q = htrVar;
        this.f = lukVar;
        this.g = ycmVar;
        this.k = ov20Var;
        this.l = b7r0Var;
        this.m = xrc0Var;
        this.n = zut0Var;
        this.o = h5qVar;
        this.f9p = n3d0Var;
        this.r = i8h1Var;
        this.s = g3q0Var;
        this.u = ugn0Var;
        this.v = dma1Var;
        this.w = xfxVar;
        this.x = agc0Var;
        this.z = t8u0Var;
        this.C = iac0Var;
        this.D = qns0Var;
        this.E = vb2Var;
        this.F = yh2Var;
        this.G = zr00Var;
        this.H = y390Var;
        this.I = upp0Var;
        this.j = mr20Var;
        this.t = e9g1Var;
        this.h = c3sVar;
        this.i = nwtVar;
        this.J = nfa0Var;
        this.A = bn70Var;
        this.B = playOrigin;
        this.y = str;
    }
}
