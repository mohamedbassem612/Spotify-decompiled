package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uq7 implements mqw {
    public final /* synthetic */ byte a = 10;
    public final /* synthetic */ e7m0 b;

    public uq7(cg71 cg71Var, ug71 ug71Var, ol71 ol71Var, mar0 mar0Var) {
        zg71 zg71Var = new zg71(gl71.a, ug71Var.b, null, se71.a, wg71.a, null, null, null);
        dq7 dq7Var = new dq7(new u841(ug71Var, (byte) 28), (byte) 25);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        m021 m021Var = cg71Var.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        pf71 pf71Var = new pf71(m021Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kh71.class), runSequentially.a(pf71Var));
        v6a0 v6a0Var = cg71Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rf71(v6a0Var)));
        j2e0 j2e0Var = cg71Var.c;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tf71(j2e0Var)));
        lc20 lc20Var = cg71Var.d;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ch71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kf71(lc20Var)));
        pug pugVar = (pug) cg71Var.e.a.c;
        drj0 drj0VarG = pugVar.e().g();
        twb twbVar = new twb((byte) 24);
        yfu yfuVarF = pugVar.f();
        fj71 fj71Var = (fj71) pugVar.u;
        RetrofitMaker retrofitMakerC = fj71Var.c();
        c8o.l(retrofitMakerC);
        pugVar.h();
        ilh1 ilh1Var = new ilh1(new eea0(new v6a0((wjc0) retrofitMakerC.createWebgateService(wjc0.class, "android-share-linkpreview-wiring"), new upa0(yfuVarF, new pob((byte) 16, false)), (byte) 17), new zlw0()), pugVar.q(), (byte) 3);
        jqd0 jqd0VarT = pugVar.t();
        Context contextA = fj71Var.a();
        c8o.l(contextA);
        dg30 dg30Var = (dg30) fj71Var.l.get();
        c8o.l(dg30Var);
        m771 m771VarV = uge0.v(pugVar.i());
        bo71 bo71Var = (bo71) fj71Var.E.get();
        c8o.l(bo71Var);
        q8n q8nVar = (q8n) fj71Var.F.get();
        c8o.l(q8nVar);
        phi0 phi0Var = new phi0(drj0VarG, twbVar, ilh1Var, jqd0VarT, new ewn0(new ne(dg30Var, m771VarV, contextA, bo71Var, q8nVar), (byte) 19), mar0Var);
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ih71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vf71(phi0Var)));
        ki20 ki20Var = cg71Var.f;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lf71(ki20Var)));
        rjs0 rjs0Var = cg71Var.g;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xf71(rjs0Var)));
        bb01 bb01Var = cg71Var.h;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mf71(bb01Var)));
        z8c0 z8c0Var = cg71Var.i;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nf71(z8c0Var)));
        dr41 dr41Var = cg71Var.j;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zf71(dr41Var)));
        khc khcVar = cg71Var.k;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bh71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bg71()));
        this.b = sbl.z(zg71Var, dq7Var, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI), ea71.c, new ah71(ol71Var, (byte) 1));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        byte b = this.a;
        e7m0 e7m0Var = this.b;
        switch (b) {
            case 0:
                return e7m0Var.a((or7) obj, ipb1Var);
            case 1:
                return e7m0Var.a((jqa) obj, ipb1Var);
            case 2:
                return e7m0Var.a((o6h) obj, ipb1Var);
            case 3:
                return e7m0Var.a((vt30) obj, ipb1Var);
            case 4:
                return e7m0Var.a((n5i0) obj, ipb1Var);
            case 5:
                return e7m0Var.a((iby0) obj, ipb1Var);
            case 6:
                return e7m0Var.a((mh21) obj, ipb1Var);
            case 7:
                return e7m0Var.a((cp11) obj, ipb1Var);
            case 8:
                return e7m0Var.a((ug71) obj, ipb1Var);
            case 9:
                return e7m0Var.a((xgb1) obj, ipb1Var);
            case 10:
                return e7m0Var.a((z2e1) obj, ipb1Var);
            case 11:
                return e7m0Var.a((r5k1) obj, ipb1Var);
            default:
                return e7m0Var.a((tfm1) obj, ipb1Var);
        }
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        byte b = this.a;
        e7m0 e7m0Var = this.b;
        switch (b) {
            case 0:
                return e7m0Var.b((pr7) obj, dtsVar, str);
            case 1:
                return e7m0Var.b((nqa) obj, dtsVar, str);
            case 2:
                return e7m0Var.b((s6h) obj, dtsVar, str);
            case 3:
                return e7m0Var.b((au30) obj, dtsVar, str);
            case 4:
                return e7m0Var.b((u5i0) obj, dtsVar, str);
            case 5:
                return e7m0Var.b((mby0) obj, dtsVar, str);
            case 6:
                return e7m0Var.b((qh21) obj, dtsVar, str);
            case 7:
                return e7m0Var.b((ep61) obj, dtsVar, str);
            case 8:
                return e7m0Var.b((zg71) obj, dtsVar, str);
            case 9:
                return e7m0Var.b((bhb1) obj, dtsVar, str);
            case 10:
                return e7m0Var.b((a3e1) obj, dtsVar, str);
            case 11:
                return e7m0Var.b((s5k1) obj, dtsVar, str);
            default:
                return e7m0Var.b((ufm1) obj, dtsVar, str);
        }
    }

    public final mc41 c() {
        byte b = this.a;
        e7m0 e7m0Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return e7m0Var.c();
    }

    public final Object d(Object obj) {
        byte b = this.a;
        e7m0 e7m0Var = this.b;
        switch (b) {
            case 0:
                return (pr7) e7m0Var.a.invoke((or7) obj);
            case 1:
                return (nqa) e7m0Var.a.invoke((jqa) obj);
            case 2:
                return (s6h) e7m0Var.a.invoke((o6h) obj);
            case 3:
                return (au30) e7m0Var.a.invoke((vt30) obj);
            case 4:
                return (u5i0) e7m0Var.a.invoke((n5i0) obj);
            case 5:
                return (mby0) e7m0Var.a.invoke((iby0) obj);
            case 6:
                return (qh21) e7m0Var.a.invoke((mh21) obj);
            case 7:
                return (ep61) e7m0Var.a.invoke((cp11) obj);
            case 8:
                return (zg71) e7m0Var.a.invoke((ug71) obj);
            case 9:
                return (bhb1) e7m0Var.a.invoke((xgb1) obj);
            case 10:
                return (a3e1) e7m0Var.a.invoke((z2e1) obj);
            case 11:
                return (s5k1) e7m0Var.a.invoke((r5k1) obj);
            default:
                return (ufm1) e7m0Var.a.invoke((tfm1) obj);
        }
    }

    public uq7(oud oudVar, wh71 wh71Var, q8n q8nVar, l0r l0rVar, xpa xpaVar) {
        yda ydaVar = yda.X0;
        n4 n4Var = n4.p;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        vpa vpaVar = new vpa(xpaVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zpa.class), runSequentially.a(vpaVar));
        vxv0 vxv0Var = xpaVar.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aqa.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wpa(vxv0Var)));
        this.b = sbl.A(ydaVar, n4Var, new a(xpaVar.c, coroutinesSubtypeEffectHandlerBuilderI), vq9.P0, new spa(oudVar, wh71Var, l0rVar, q8nVar, (byte) 0));
    }

    public uq7(oud oudVar, wh71 wh71Var, q8n q8nVar, l0r l0rVar, c6h c6hVar) {
        m4h m4hVar = m4h.S0;
        n4 n4Var = n4.w;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        h3x h3xVar = c6hVar.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        z5h z5hVar = new z5h(h3xVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e6h.class), runSequentially.a(z5hVar));
        g3x g3xVar = c6hVar.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d6h.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a6h(g3xVar)));
        vxv0 vxv0Var = c6hVar.c;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f6h.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b6h(vxv0Var)));
        this.b = sbl.A(m4hVar, n4Var, new a(c6hVar.d, coroutinesSubtypeEffectHandlerBuilderI), rng.X, new spa(oudVar, wh71Var, l0rVar, q8nVar, (byte) 1));
    }

    public uq7(oud oudVar, wh71 wh71Var, q8n q8nVar, l0r l0rVar, lt30 lt30Var) {
        gq30 gq30Var = gq30.T0;
        t2m t2mVar = t2m.w;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        jt30 jt30Var = new jt30(lt30Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mt30.class), runSequentially.a(jt30Var));
        vxv0 vxv0Var = lt30Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nt30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kt30(vxv0Var)));
        this.b = sbl.A(gq30Var, t2mVar, new a(lt30Var.c, coroutinesSubtypeEffectHandlerBuilderI), bp30.t, new spa(oudVar, wh71Var, l0rVar, q8nVar, (byte) 2));
    }

    public uq7(oud oudVar, wh71 wh71Var, q8n q8nVar, l0r l0rVar, mgb1 mgb1Var) {
        cgb1 cgb1Var = cgb1.f;
        gp71 gp71Var = gp71.j;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        kgb1 kgb1Var = new kgb1(mgb1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ngb1.class), runSequentially.a(kgb1Var));
        tzr0 tzr0Var = mgb1Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ogb1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lgb1(tzr0Var)));
        this.b = sbl.A(cgb1Var, gp71Var, new a(mgb1Var.c, coroutinesSubtypeEffectHandlerBuilderI), nva1.N0, new spa(oudVar, wh71Var, l0rVar, q8nVar, (byte) 3));
    }

    public uq7(smt0 smt0Var, xg21 xg21Var) {
        ma21 ma21Var = ma21.W0;
        t7p0 t7p0Var = t7p0.w;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ug21 ug21Var = new ug21(xg21Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qg21.class), runSequentially.a(ug21Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kg21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wg21(xg21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jg21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rg21(smt0Var, xg21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ig21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new sg21(smt0Var, xg21Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        rs11 rs11Var = rs11.U0;
        w6m0 w6m0Var = new w6m0(t7p0Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = rs11.V0;
        this.b = new e7m0(ma21Var, w6m0Var, aVar, rs11Var, casVar);
    }

    public uq7(y1c1 y1c1Var, lzn0 lzn0Var, q8n q8nVar) {
        this.b = sbl.B(new ep61(true, "", false), t7p0.B, new qn(lzn0Var, y1c1Var, (byte) 12), qr51.W0, new c861(y1c1Var, q8nVar, (byte) 4));
    }

    public uq7(oud oudVar, q8n q8nVar, s4k1 s4k1Var, vr51 vr51Var, Context context) {
        a0k1 a0k1Var = a0k1.a1;
        t7i1 t7i1Var = new t7i1(new eq7(context, vr51Var, (byte) 4), (byte) 5);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        dxy dxyVar = s4k1Var.c;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        p4k1 p4k1Var = new p4k1(dxyVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w4k1.class), runSequentially.a(p4k1Var));
        d18 d18Var = s4k1Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x4k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r4k1(d18Var)));
        fey feyVar = s4k1Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v4k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i4k1(feyVar)));
        ezb1 ezb1Var = s4k1Var.d;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a5k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j4k1(ezb1Var)));
        g3x g3xVar = s4k1Var.e;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u4k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k4k1(g3xVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z4k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l4k1(s4k1Var)));
        aru0 aru0Var = s4k1Var.g;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y4k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m4k1(aru0Var)));
        n4b n4bVar = s4k1Var.h;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t4k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n4k1(n4bVar)));
        this.b = sbl.A(a0k1Var, t7i1Var, new a(s4k1Var.i, coroutinesSubtypeEffectHandlerBuilderI), olj1.O0, new ss7(oudVar, q8nVar, context, (byte) 2));
    }

    public uq7(Context context, vr51 vr51Var, q8n q8nVar, oud oudVar, g2e1 g2e1Var) {
        vxd1 vxd1Var = vxd1.S0;
        dq7 dq7Var = new dq7(new eq7(context, vr51Var, (byte) 2), (byte) 29);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        z1e1 z1e1Var = new z1e1(g2e1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j2e1.class), runSequentially.a(z1e1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k2e1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a2e1(g2e1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i2e1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f2e1(g2e1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m2e1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b2e1(g2e1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h2e1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c2e1(g2e1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l2e1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d2e1(g2e1Var)));
        this.b = sbl.A(vxd1Var, dq7Var, new a(g2e1Var.e, coroutinesSubtypeEffectHandlerBuilderI), ppd1.X, new ss7(oudVar, q8nVar, context, (byte) 1));
    }

    public uq7(q8n q8nVar, t84 t84Var, wh71 wh71Var, oud oudVar, e4p e4pVar, iac0 iac0Var, o771 o771Var, g871 g871Var, yqg yqgVar) {
        b3s b3sVar = b3s.c;
        gbm1 gbm1Var = gbm1.O0;
        gp71 gp71Var = gp71.B;
        boolean zA = t84Var.a();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(rfm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nmw(wh71Var, zA, e4pVar, iac0Var, o771Var, g871Var, yqgVar)));
        this.b = sbl.A(gbm1Var, gp71Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), u5l1.d1, new r7j0(new lud(oudVar, q8nVar, new bz9(wh71Var, null, (byte) 3)), (byte) 22));
    }

    public uq7(oud oudVar, q8n q8nVar, br7 br7Var) {
        rq7 rq7Var = rq7.c;
        n4 n4Var = n4.k;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        o860 o860Var = br7Var.c;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ar7 ar7Var = new ar7(o860Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gbw.class), runSequentially.a(ar7Var));
        yqu0 yqu0Var = br7Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wq7(yqu0Var)));
        dqu dquVar = br7Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xaw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xq7(dquVar)));
        g3x g3xVar = br7Var.d;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vgw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yq7(g3xVar)));
        this.b = sbl.A(rq7Var, n4Var, new a(br7Var.e, coroutinesSubtypeEffectHandlerBuilderI), c37.O0, new xg6(oudVar, q8nVar, (byte) 24));
    }

    public uq7(oud oudVar, wh71 wh71Var, q8n q8nVar, xay0 xay0Var) {
        e6y0 e6y0Var = e6y0.b1;
        t7p0 t7p0Var = t7p0.q;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        o3e0 o3e0Var = xay0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        way0 way0Var = new way0(o3e0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zay0.class), runSequentially.a(way0Var));
        ogr ogrVar = xay0Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yay0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tay0(ogrVar)));
        xmu0 xmu0Var = xay0Var.c;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aby0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uay0(xmu0Var)));
        this.b = sbl.A(e6y0Var, t7p0Var, new a(xay0Var.d, coroutinesSubtypeEffectHandlerBuilderI), j8y0.h, new cz9(oudVar, wh71Var, q8nVar));
    }

    public uq7(tbr0 tbr0Var, sm51 sm51Var, srp srpVar) {
        u5i0 u5i0Var = new u5i0(new v5i0(0L, 80), z6x.a, p5i0.a, "", new o5i0(new uvg1(0L, 0L)), 2, 2, false, false, true, false, false, (String) null, 0L, 0L, (t5i0) null, 1044480);
        xxb0 xxb0Var = xxb0.t;
        qq qqVar = (qq) srpVar.a.c;
        trp trpVar = (trp) ((jly0) qqVar.k).get();
        jkp0 jkp0Var = new jkp0((b7i0) ((jly0) qqVar.i).get(), (byte) 14);
        y6i0 y6i0Var = (y6i0) qqVar.a;
        yqg yqgVar = (yqg) y6i0Var.h.get();
        c8o.l(yqgVar);
        ykf0 ykf0Var = (ykf0) y6i0Var.d.get();
        c8o.l(ykf0Var);
        q8n q8nVar = (q8n) y6i0Var.j.get();
        c8o.l(q8nVar);
        m4i0 m4i0Var = new m4i0(tbr0Var, sm51Var, trpVar, jkp0Var, yqgVar, ykf0Var, q8nVar);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        b4i0 b4i0Var = new b4i0(m4i0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n4i0.class), runSequentially.a(b4i0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c4i0(m4i0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d4i0(m4i0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e4i0(m4i0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f4i0(m4i0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k4i0(m4i0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new i4i0(m4i0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p4i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g4i0(m4i0Var)));
        this.b = sbl.z(u5i0Var, xxb0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), ish0.c, l2i0.U0);
    }
}
