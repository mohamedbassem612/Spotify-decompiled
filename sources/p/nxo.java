package p;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nxo implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nxo(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                oxo oxoVar = (oxo) obj;
                switch (b2) {
                    case 0:
                        return wg0.l((Application) oxoVar.a.a.get());
                    case 1:
                        return wg0.C();
                    case 2:
                        return new jjh1();
                    case 3:
                        jly0 jly0Var = oxoVar.d;
                        c42 c42Var = oxoVar.a;
                        return new ao0((jjh1) jly0Var.get(), new jo0((re00) oxoVar.e.get(), c42Var.b(), oxoVar.a(), (yqg) c42Var.f19p.get()), c42Var.b());
                    case 4:
                        return f580.h(oxoVar.a.a());
                    case 5:
                        return new ko0((qi0) oxoVar.a.n.get(), (w5b1) oxoVar.a.f.get(), oxoVar.a());
                    case 6:
                        jly0 jly0Var2 = oxoVar.h;
                        c42 c42Var2 = oxoVar.a;
                        return new qq0(new dh30((d780) jly0Var2.get(), c42Var2.b(), (byte) 25), c42Var2.b());
                    case 7:
                        return f580.l(oxoVar.a.a());
                    case 8:
                        return f580.a(oxoVar.a.a());
                    case 9:
                        return new lxo(this);
                    case 10:
                        return f580.q(oxoVar.a.a());
                    case 11:
                        return f580.u(oxoVar.a.a());
                    case 12:
                        return new by0();
                    case 13:
                        jly0 jly0Var3 = oxoVar.h;
                        c42 c42Var3 = oxoVar.a;
                        return new i42(new dh30((d780) jly0Var3.get(), c42Var3.b(), (byte) 25), (m7p0) c42Var3.h.get(), (q8n) c42Var3.e.get());
                    case 14:
                        i72 i72Var = new i72();
                        i72Var.b = "";
                        return i72Var;
                    case 15:
                        return new wbh(oxoVar.q, oxoVar.r);
                    case 16:
                        return new vbh((Application) oxoVar.a.a.get());
                    case 17:
                        return (Handler) oxoVar.a.b.get();
                    case 18:
                        return f580.g(oxoVar.a.a());
                    case 19:
                        jly0 jly0Var4 = oxoVar.u;
                        c42 c42Var4 = oxoVar.a;
                        return new i210(new zsc(new np61((oo61) jly0Var4.get(), c42Var4.b()), (nfa0) ((kly0) c42Var4.r).get()), (bqb1) oxoVar.w.get(), (h241) c42Var4.m.get(), new e42((luk) ((kly0) c42Var4.q).get()), c42Var4.b());
                    case 20:
                        return f580.p(oxoVar.a.a());
                    case 21:
                        jly0 jly0Var5 = oxoVar.v;
                        c42 c42Var5 = oxoVar.a;
                        return new bqb1(new xob1((wob1) jly0Var5.get(), c42Var5.b()), c42Var5.b());
                    case 22:
                        return f580.r(oxoVar.a.a());
                    case 23:
                        return f580.i(oxoVar.a.a());
                    case 24:
                        return new liv0(oxoVar.b(), oxoVar.a.b());
                    case 25:
                        return wg0.B();
                    case 26:
                        return new mxo();
                    case 27:
                        return f580.s(oxoVar.a.a());
                    case 28:
                        return f580.d(oxoVar.a.a());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 1:
                g5p g5pVar = (g5p) obj;
                switch (b2) {
                    case 0:
                        return yne.D(g5pVar.a);
                    case 1:
                        return yne.s(g5pVar.c);
                    case 2:
                        String strA = yne.a(g5pVar.a);
                        zgq zgqVarT = g5pVar.b.t();
                        c8o.l(zgqVarT);
                        return yne.q(strA, zgqVarT);
                    case 3:
                        return new cif();
                    case 4:
                        return new y4p(this);
                    case 5:
                        return new i2j0();
                    case 6:
                        return yne.v((lik1) g5pVar.e.get());
                    case 7:
                        t8u0 t8u0VarN0 = g5pVar.b.n0();
                        c8o.l(t8u0VarN0);
                        return yne.w(g5pVar.c, t8u0VarN0);
                    case 8:
                        kt91 kt91VarD0 = g5pVar.b.D0();
                        c8o.l(kt91VarD0);
                        return kt91VarD0;
                    case 9:
                        return yne.r(g5pVar.c);
                    case 10:
                        q7r0 q7r0Var = g5pVar.c;
                        yff yffVar = g5pVar.b;
                        iac0 iac0VarT = yne.t(q7r0Var);
                        String strA2 = yne.a(g5pVar.a);
                        oj3 oj3VarC = yffVar.c();
                        c8o.l(oj3VarC);
                        qut0 qut0VarM0 = yffVar.m0();
                        c8o.l(qut0VarM0);
                        xrc0 xrc0VarS = yffVar.S();
                        c8o.l(xrc0VarS);
                        hku0 hku0Var = new hku0(xrc0VarS);
                        g7h g7hVarX = yffVar.x();
                        c8o.l(g7hVarX);
                        dp5 dp5Var = new dp5((Object) g7hVarX, (byte) 10);
                        mwm1 mwm1VarM0 = yffVar.M0();
                        c8o.l(mwm1VarM0);
                        w4h w4hVarW = yffVar.w();
                        c8o.l(w4hVarW);
                        qpj1 qpj1Var = new qpj1(mwm1VarM0, w4hVarW, (byte) 26);
                        w4h w4hVarW2 = yffVar.w();
                        c8o.l(w4hVarW2);
                        il00 il00Var = new il00(w4hVarW2, (byte) 25);
                        qut0 qut0VarM1 = yffVar.m0();
                        c8o.l(qut0VarM1);
                        y1t0 y1t0Var = new y1t0(qut0VarM1, (byte) 1);
                        cig1 cig1VarK0 = yffVar.K0();
                        c8o.l(cig1VarK0);
                        el3 el3VarD = yffVar.d();
                        c8o.l(el3VarD);
                        ffe1 ffe1Var = new ffe1(cig1VarK0, el3VarD, (byte) 13);
                        w4h w4hVarW3 = yffVar.w();
                        c8o.l(w4hVarW3);
                        cp70 cp70Var = new cp70(w4hVarW3);
                        q8n q8nVarE = yffVar.E();
                        c8o.l(q8nVarE);
                        qlw qlwVar = new qlw(oj3VarC, qut0VarM0, hku0Var, dp5Var, qpj1Var, il00Var, y1t0Var, ffe1Var, cp70Var, q8nVarE);
                        q8n q8nVarQ = yffVar.Q();
                        c8o.l(q8nVarQ);
                        q8n q8nVarE2 = yffVar.E();
                        c8o.l(q8nVarE2);
                        return new llo(iac0VarT, strA2, qlwVar, q8nVarQ, q8nVarE2);
                    case 11:
                        return new z4p();
                    case 12:
                        return new a5p(this);
                    case 13:
                        return new pbr0();
                    case 14:
                        g310 g310VarM = g5pVar.b.M();
                        c8o.l(g310VarM);
                        return g310VarM;
                    case 15:
                        return new b5p(this);
                    case 16:
                        return new c5p(this);
                    case 17:
                        return new d5p(this);
                    case 18:
                        return yne.n(g5pVar.c);
                    case 19:
                        return new e5p(this);
                    case 20:
                        return yne.u(g5pVar.c);
                    case 21:
                        return new rzo(this, (byte) 1);
                    case 22:
                        return wyj.m();
                    case 23:
                        return new f5p(this);
                    case 24:
                        return new v4p(this);
                    case 25:
                        return new w4p(this);
                    case 26:
                        return new x4p(this);
                    case 27:
                        loo0 loo0VarE0 = g5pVar.b.e0();
                        c8o.l(loo0VarE0);
                        return loo0VarE0;
                    case 28:
                        return new fw71();
                    case 29:
                        return new kl80();
                    default:
                        jah.e(b2);
                        return null;
                }
            case 2:
                fdp fdpVar = (fdp) obj;
                switch (b2) {
                    case 0:
                        return ce7.l((RxRouter) ((kly0) fdpVar.a.g).get());
                    case 1:
                        return new ddp(this);
                    case 2:
                        return new vr4();
                    case 3:
                        return new fpu(w2x.t((RetrofitMaker) ((kly0) fdpVar.a.c).get()), new b1y(new lm4((luk) ((kly0) fdpVar.a.l).get())));
                    case 4:
                        return new edp(this);
                    case 5:
                        return (Random) ((kly0) fdpVar.a.m).get();
                    case 6:
                        return (wen0) fdpVar.h.get();
                    case 7:
                        return rt71.n();
                    case 8:
                        return new tdf0((wz3) fdpVar.b.get());
                    case 9:
                        return new hrj0();
                    case 10:
                        return rt71.B((mr20) fdpVar.i.get(), (x8c0) ((kly0) fdpVar.a.j).get());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 3:
                k9k k9kVar = (k9k) obj;
                g0f0 g0f0Var = (g0f0) k9kVar.c;
                if (b2 == 0) {
                    fmy0 fmy0VarB = g0f0Var.b();
                    c8o.l(fmy0VarB);
                    return hl20.w(fmy0VarB);
                }
                if (b2 == 1) {
                    c2r0 c2r0VarA = g0f0Var.a();
                    c8o.l(c2r0VarA);
                    return uge0.s(c2r0VarA, (k1f0) k9kVar.b);
                }
                if (b2 == 2) {
                    return uge0.t((b2r0) ((jly0) k9kVar.e).get());
                }
                jah.e(b2);
                return null;
            case 4:
                uy2 uy2Var = ((erp) obj).a;
                if (b2 == 0) {
                    return f42.n(uy2Var.d());
                }
                if (b2 == 1) {
                    return new gy2(uy2Var.b(), uy2Var.c(), uy2Var.a());
                }
                if (b2 == 2) {
                    return new dlf(uy2Var.b(), uy2Var.c(), uy2Var.a());
                }
                if (b2 == 3) {
                    return cpm.n();
                }
                if (b2 == 4) {
                    return new yrn();
                }
                jah.e(b2);
                return null;
            case 5:
                jzo jzoVar = (jzo) obj;
                switch (b2) {
                    case 0:
                        return new psp(this);
                    case 1:
                        return b8j0.r(jzoVar.a);
                    case 2:
                        return new qsp(this);
                    case 3:
                        return new rsp();
                    case 4:
                        return new ssp();
                    case 5:
                        return new tsp(this);
                    case 6:
                        return u1n0.z(jzoVar.a);
                    case 7:
                        return new usp(this);
                    case 8:
                        return new xsk((ryj0) jzoVar.e);
                    case 9:
                        return new cbk0((c0k0) jzoVar.d);
                    case 10:
                        return new ulk0();
                    case 11:
                        return new vsp(this);
                    case 12:
                        return new oyb();
                    case 13:
                        q7r0 q7r0Var2 = jzoVar.a;
                        rxj0 rxj0VarD = ((ryj0) jzoVar.e).d();
                        c8o.l(rxj0VarD);
                        return b0k0.o(q7r0Var2, rxj0VarD);
                    case 14:
                        return new j3u();
                    case 15:
                        return new wsp();
                    case 16:
                        return new xsp(this);
                    case 17:
                        return new hsp(this);
                    case 18:
                        return new isp();
                    case 19:
                        return new jsp();
                    case 20:
                        return new ksp(this);
                    case 21:
                        return new lsp(this);
                    case 22:
                        return new msp(this);
                    case 23:
                        return new nsp(this);
                    case 24:
                        return new osp(this);
                    case 25:
                        q7e0 q7e0VarG = ((ryj0) jzoVar.e).g();
                        c8o.l(q7e0VarG);
                        return new yuj(q7e0VarG, jzoVar.d());
                    case 26:
                        xzj0 xzj0VarA = jzoVar.a();
                        ryj0 ryj0Var = (ryj0) jzoVar.e;
                        l4k0 l4k0VarB = jzoVar.b();
                        q8n q8nVarA = ryj0Var.a();
                        c8o.l(q8nVarA);
                        q8n q8nVarC = ryj0Var.c();
                        c8o.l(q8nVarC);
                        return new a0k0(xzj0VarA, l4k0VarB, q8nVarA, q8nVarC);
                    case 27:
                        b9q b9qVarK = ((ryj0) jzoVar.e).k();
                        c8o.l(b9qVarK);
                        return b0k0.p(b9qVarK, jzoVar.c());
                    case 28:
                        return new nt50();
                    case 29:
                        ryj0 ryj0Var2 = (ryj0) jzoVar.e;
                        ryj0 ryj0Var3 = (ryj0) jzoVar.e;
                        m1k0 m1k0VarE = ryj0Var2.e();
                        c8o.l(m1k0VarE);
                        zlk0 zlk0VarO = ryj0Var3.o();
                        c8o.l(zlk0VarO);
                        vkk0 vkk0VarN = ryj0Var3.n();
                        c8o.l(vkk0VarN);
                        pnk0 pnk0VarP = ryj0Var3.p();
                        c8o.l(pnk0VarP);
                        y5k0 y5k0VarI = ryj0Var3.i();
                        c8o.l(y5k0VarI);
                        c6k0 c6k0VarJ = ryj0Var3.j();
                        c8o.l(c6k0VarJ);
                        rjk0 rjk0VarM = ryj0Var3.m();
                        c8o.l(rjk0VarM);
                        return b0k0.n(m1k0VarE, zlk0VarO, vkk0VarN, pnk0VarP, y5k0VarI, c6k0VarJ, rjk0VarM);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 6:
                switch (b2) {
                    case 0:
                        return new nxp(this);
                    case 1:
                        return new o3p(this, (byte) 4);
                    case 2:
                        return new oxp(this);
                    case 3:
                        return new ve20();
                    case 4:
                        return new ul7();
                    case 5:
                        return new pxp(this);
                    case 6:
                        return new qxp(this);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 7:
                pbq pbqVar = (pbq) obj;
                if (b2 == 0) {
                    return new fv01(pbqVar.i0(), pbqVar.g0(), pbqVar.h0(), pbqVar.W());
                }
                if (b2 == 1) {
                    Scheduler schedulerG = pbq.f(pbqVar).g();
                    c8o.l(schedulerG);
                    zhq0 zhq0VarZ = pbqVar.Z();
                    tyt0 tyt0VarB0 = pbqVar.b0();
                    wr00 wr00VarE = pbqVar.E();
                    in8 in8VarJ0 = pbqVar.j0();
                    vgm vgmVarA = pbq.f(pbqVar).a();
                    c8o.l(vgmVarA);
                    t001 t001VarJ = pbq.f(pbqVar).j();
                    c8o.l(t001VarJ);
                    return new yu01(schedulerG, zhq0VarZ, tyt0VarB0, wr00VarE, in8VarJ0, vgmVarA, t001VarJ, pbqVar.o());
                }
                if (b2 == 2) {
                    return new nnq(this);
                }
                if (b2 == 3) {
                    q7r0 q7r0VarD = pbq.d(pbqVar);
                    t8u0 t8u0VarH = pbq.f(pbqVar).h();
                    c8o.l(t8u0VarH);
                    return q901.l(q7r0VarD, t8u0VarH);
                }
                if (b2 == 4) {
                    return new vu01((wu01) ((jly0) pbqVar.d).get(), (lr01) ((jly0) pbqVar.c).get(), pbqVar.Y(), pbq.e(pbqVar));
                }
                if (b2 != 5) {
                    jah.e(b2);
                    return null;
                }
                a8e0 a8e0VarA = pbq.b(pbqVar).a();
                c8o.l(a8e0VarA);
                return new hvj(a8e0VarA, pbqVar.y0());
            default:
                wpq wpqVar = (wpq) obj;
                switch (b2) {
                    case 0:
                        return (Context) wpqVar.a.a.get();
                    case 1:
                        Context context = (Context) wpqVar.b.get();
                        Context contextF = yx61.f((Context) wpqVar.b.get());
                        g420 g420Var = (g420) wpqVar.c.get();
                        c42 c42Var6 = wpqVar.a;
                        return yx61.t(new mzr0(context, contextF, g420Var, (ajg) c42Var6.n.get(), (cxc) c42Var6.g.get(), (yqg) c42Var6.k.get(), (q8n) wpqVar.d.get()));
                    case 2:
                        return (g420) wpqVar.a.f.get();
                    case 3:
                        return (q8n) wpqVar.a.b.get();
                    case 4:
                        return yne.p();
                    case 5:
                        return j310.n((hhp) wpqVar.g.get());
                    case 6:
                        return j310.p(new dqu((q8n) wpqVar.a.d.get(), (byte) 16));
                    case 7:
                        return j310.o((hhp) wpqVar.g.get());
                    case 8:
                        return d1j1.u(new hce1(wpqVar.b, wpqVar.d, wpqVar.j, wpqVar.c, (byte) 25));
                    case 9:
                        return (kma) wpqVar.a.e.get();
                    default:
                        jah.e(b2);
                        return null;
                }
        }
    }
}
