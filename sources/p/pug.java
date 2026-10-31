package p;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;
import com.spotify.campfire.share.impl.ShareSheetOnPlatformSectionImpl;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.share.sheet.sections.offplatform.impl.ShareSheetOffPlatformSectionImpl;
import com.spotify.share.sheet.sections.preview.disclosure.impl.ShareSheetDisclosureSectionImpl;
import com.spotify.share.sheet.sections.preview.previewrow.impl.ShareSheetPreviewSectionImpl;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pug {
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
    public final Object f67p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;

    public pug(ytw0 ytw0Var, r5n1 r5n1Var, gtv0 gtv0Var, zov0 zov0Var, Application application, String str) {
        this.g = application;
        this.h = str;
        this.a = xqu.b(new urq(ytw0Var, (byte) 7));
        this.t = jo80.a(application);
        this.u = jo80.a(str);
        this.b = xqu.b(new n1p(r5n1Var, (jo80) this.t));
        this.c = xqu.b(new urq(r5n1Var, (byte) 6));
        byte b = 1;
        jly0 jly0VarB = xqu.b(new u(r5n1Var, xqu.b(new fnc(r5n1Var, (jo80) this.t, (jly0) this.b, (jly0) this.c, xqu.b(new urq(r5n1Var, (byte) 4)), (byte) 1)), (jo80) this.u, b));
        byte b2 = 0;
        jly0 jly0VarB2 = xqu.b(new h6n1((byte) 0, ytw0Var, jly0VarB));
        this.d = jly0VarB2;
        jo80 jo80Var = (jo80) this.t;
        jo80 jo80Var2 = (jo80) this.u;
        this.e = xqu.b(new fnc(ytw0Var, jo80Var2, jo80Var, new j6n1(ytw0Var, jo80Var, jo80Var2, jly0VarB2, (byte) 0), new j6n1(ytw0Var, jo80Var, jo80Var2, jly0VarB2, (byte) 1), (byte) 0));
        byte b3 = 3;
        this.f = xqu.b(new u(ytw0Var, (jo80) this.t, xqu.b(new ycp(ytw0Var)), b3));
        jly0 jly0VarB3 = xqu.b(new d7n1(ytw0Var, (jo80) this.t, b));
        this.i = jly0VarB3;
        this.j = xqu.b(new q7n1(ytw0Var, (jly0) this.f, jly0VarB3, b2));
        jo80 jo80Var3 = (jo80) this.t;
        this.v = new d7n1(gtv0Var, jo80Var3, (byte) 4);
        this.w = new d7n1(zov0Var, jo80Var3, (byte) 2);
        this.k = xqu.b(new fnc(ytw0Var, (d7n1) this.v, (jly0) this.e, xqu.b(new k6n1(ytw0Var, (d7n1) this.v, (d7n1) this.w, xqu.b(new urq(ytw0Var, (byte) 5)), (jly0) this.i, (jly0) this.e)), (jly0) this.i, (byte) 2));
        this.l = xqu.b(new urq(ytw0Var, (byte) 3));
        this.m = xqu.b(new d7n1(ytw0Var, (jo80) this.t, b3));
        this.n = xqu.b(new u(ytw0Var, (jo80) this.t, (jly0) this.l, b2));
        this.o = xqu.b(new d7n1(ytw0Var, (jo80) this.t, (byte) 5));
        this.f67p = xqu.b(new g6n1(ytw0Var, (jo80) this.t, (jly0) this.e, (jly0) this.j, (jly0) this.k, (jly0) this.l, (jly0) this.m, (jly0) this.n, (jly0) this.o, xqu.b(new d7n1(ytw0Var, (jo80) this.t, b2))));
        jly0 jly0VarB4 = xqu.b(new urq(ytw0Var, (byte) 11));
        this.q = jly0VarB4;
        this.r = xqu.b(new h6n1((byte) 2, ytw0Var, xqu.b(new h6n1((byte) 4, ytw0Var, jly0VarB4))));
        this.s = xqu.b(new h6n1((byte) 1, ytw0Var, (jly0) this.a));
    }

    public n15 a() {
        luk lukVar = (luk) ((fj71) this.u).v.get();
        c8o.l(lukVar);
        return new n15(lukVar);
    }

    public zxa b() {
        fj71 fj71Var = (fj71) this.u;
        Context contextA = fj71Var.a();
        c8o.l(contextA);
        Object obj = this.c;
        gya gyaVarG = yx61.g((xpq) ((jly0) obj).get());
        eyh0 eyh0VarV = yx61.v((xpq) ((jly0) obj).get());
        o771 o771VarP = p();
        Context contextA2 = fj71Var.a();
        c8o.l(contextA2);
        return new zxa(contextA, gyaVarG, eyh0VarV, o771VarP, upu.r(contextA2));
    }

    public q59 c() {
        Set setSingleton;
        luk lukVar = (luk) ((fj71) this.u).v.get();
        c8o.l(lukVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new iya(t571.c, rq61.e1));
        arrayList.add(new iya(u571.c, s571.b));
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        c8o.l(setSingleton);
        return new q59(setSingleton, lukVar);
    }

    public smc0 d() {
        yjq yjqVar = new yjq(r());
        Object obj = yjqVar.b;
        axp axpVar = (axp) ((jly0) obj).get();
        jxp0 jxp0VarB = axpVar.b();
        i7d i7dVar = axpVar.a;
        xm41 xm41Var = (xm41) i7dVar.b;
        opl0 opl0VarA = axpVar.a();
        i8h1 i8h1Var = (i8h1) i7dVar.f;
        add addVar = (add) i7dVar.e;
        k7d k7dVar = (k7d) i7dVar.d;
        ynb0 ynb0VarA = xqu.a(axpVar.c);
        g871 g871Var = (g871) i7dVar.a;
        wh71 wh71Var = (wh71) i7dVar.Z;
        c8o.l(wh71Var);
        lzn0 lzn0Var = (lzn0) i7dVar.X;
        a1r0 a1r0Var = (a1r0) axpVar.b.get();
        q8n q8nVar = (q8n) i7dVar.O0;
        ol71 ol71Var = (ol71) i7dVar.Q0;
        c8o.l(ol71Var);
        ShareSheetOnPlatformSectionImpl shareSheetOnPlatformSectionImpl = new ShareSheetOnPlatformSectionImpl(new aj71(jxp0VarB, xm41Var, opl0VarA, i8h1Var, addVar, k7dVar, ynb0VarA, g871Var, wh71Var, lzn0Var, a1r0Var, q8nVar, ol71Var));
        axp axpVar2 = (axp) ((jly0) obj).get();
        i7d i7dVar2 = axpVar2.a;
        rzo0 rzo0Var = new rzo0((xm41) i7dVar2.b, (k7d) i7dVar2.d, axpVar2.d, (byte) 12);
        pwp pwpVar = (pwp) ((jly0) yjqVar.e).get();
        ayl0 ayl0Var = (ayl0) pwpVar.b.get();
        s24 s24Var = pwpVar.a;
        gmt gmtVar = new gmt((za71) s24Var.i, (Set) s24Var.Z, (byte) 0);
        wh71 wh71Var2 = (wh71) s24Var.Y;
        c8o.l(wh71Var2);
        drj0 drj0Var = (drj0) s24Var.e;
        bnj0 bnj0Var = new bnj0(wh71Var2, drj0Var, (byte) 24);
        c8o.l(wh71Var2);
        yfc0 yfc0Var = new yfc0(new pt(ayl0Var, gmtVar, bnj0Var, wh71Var2, (Context) s24Var.d, drj0Var, new ulc((byte) 7)), (byte) 29);
        it8 it8Var = (it8) s24Var.t;
        dn81 dn81Var = new dn81((aq91) ((RetrofitMaker) s24Var.h).createWebgateService(aq91.class, "android-share-destinations-smartsorting"), (byte) 4);
        sjb sjbVar = new sjb((byte) 25);
        g871 g871Var2 = (g871) s24Var.c;
        kp00 kp00Var = new kp00(it8Var, new ua91(dn81Var, sjbVar, g871Var2, (u690) s24Var.g, (byte) 10), (byte) 12);
        ayl0 ayl0Var2 = (ayl0) pwpVar.b.get();
        i8h1 i8h1Var2 = (i8h1) s24Var.b;
        gmt gmtVar2 = new gmt((za71) s24Var.i, (Set) s24Var.Z, (byte) 0);
        q8n q8nVar2 = (q8n) s24Var.X;
        ol71 ol71Var2 = (ol71) s24Var.N0;
        c8o.l(ol71Var2);
        ShareSheetOffPlatformSectionImpl shareSheetOffPlatformSectionImpl = new ShareSheetOffPlatformSectionImpl(new ki71(yfc0Var, kp00Var, ayl0Var2, i8h1Var2, gmtVar2, g871Var2, wh71Var2, q8nVar2, ol71Var2));
        mta mtaVar = new mta((byte) 18);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new sl71(shareSheetOnPlatformSectionImpl, rzo0Var));
        smc0VarN.add(new sl71(shareSheetOffPlatformSectionImpl, mtaVar));
        smc0 smc0VarK = k4p1.k(smc0VarN);
        c8o.m(smc0VarK);
        return smc0VarK;
    }

    public xap e() {
        fj71 fj71Var = (fj71) this.u;
        Context contextA = fj71Var.a();
        c8o.l(contextA);
        zg0 zg0Var = (zg0) fj71Var.a.get();
        c8o.l(zg0Var);
        r7n0 r7n0Var = (r7n0) fj71Var.A.get();
        c8o.l(r7n0Var);
        DisplayMetrics displayMetrics = (DisplayMetrics) fj71Var.k.get();
        c8o.l(displayMetrics);
        boolean zN = a().n();
        boolean zS = a().s();
        boolean zR = a().r();
        boolean zP = a().p();
        boolean zO = a().o();
        boolean zQ = a().q();
        boolean zI = a().i();
        int iF = a().f();
        int iG = a().g();
        Object obj = this.c;
        eyh0 eyh0VarV = yx61.v((xpq) ((jly0) obj).get());
        o771 o771VarP = p();
        cn3 cn3VarI = yx61.i((xpq) ((jly0) obj).get());
        uo5 uo5VarK = yx61.k((xpq) ((jly0) obj).get());
        t7y t7yVarH = yx61.h((xpq) ((jly0) obj).get());
        gya gyaVarG = yx61.g((xpq) ((jly0) obj).get());
        gw70 gw70VarB = ((ryj) this.g).b();
        c8o.l(gw70VarB);
        zxa zxaVarB = b();
        Context contextA2 = fj71Var.a();
        c8o.l(contextA2);
        jyu jyuVarR = upu.r(contextA2);
        y1t0 y1t0VarO = yx61.o((xpq) ((jly0) obj).get());
        q8n q8nVar = (q8n) fj71Var.z.get();
        c8o.l(q8nVar);
        q8n q8nVarB = fj71Var.b();
        c8o.l(q8nVarB);
        t680 t680Var = (t680) fj71Var.d0.get();
        c8o.l(t680Var);
        return new xap(new mnt(contextA, zg0Var, r7n0Var, displayMetrics, zN, zS, zR, zP, zO, zQ, zI, iF, iG, eyh0VarV, o771VarP, cn3VarI, uo5VarK, t7yVarH, gyaVarG, gw70VarB, zxaVarB, jyuVarR, y1t0VarO, q8nVar, q8nVarB, t680Var), (byte) 0);
    }

    public yfu f() {
        vx40 vx40Var = (vx40) h().b;
        return new yfu((q8n) vx40Var.c, (ContentResolver) vx40Var.b, (byte) 9);
    }

    public zo5 g() {
        return (zo5) this.n;
    }

    public vun h() {
        fj71 fj71Var = (fj71) this.u;
        ContentResolver contentResolver = (ContentResolver) fj71Var.e.get();
        c8o.l(contentResolver);
        q8n q8nVarB = fj71Var.b();
        c8o.l(q8nVarB);
        return new vun(new vx40(contentResolver, q8nVarB, (byte) 16), (byte) 3);
    }

    public n4b i() {
        fj71 fj71Var = (fj71) this.u;
        zwz0 zwz0Var = (zwz0) fj71Var.s.get();
        c8o.l(zwz0Var);
        t2j0 t2j0Var = (t2j0) fj71Var.C.get();
        c8o.l(t2j0Var);
        return new n4b(new yfu(zwz0Var, t2j0Var, (byte) 26), (byte) 22);
    }

    public void j(pvz0 pvz0Var) {
        pvz0Var.c = (zdp0) ((jly0) this.a).get();
        pvz0Var.d = (u6n1) ((jly0) this.f67p).get();
        pvz0Var.e = (rug) ((jly0) this.r).get();
        pvz0Var.f = (ydp0) ((jly0) this.k).get();
        pvz0Var.g = (tug) ((jly0) this.q).get();
        pvz0Var.h = (sug) ((jly0) this.l).get();
        pvz0Var.i = (kvg) ((jly0) this.s).get();
        pvz0Var.j = new xdf0((Application) this.g, (String) this.h, (c7n1) ((jly0) this.d).get(), (byte) 1);
        pvz0Var.k = (o9b0) ((jly0) this.e).get();
    }

    public aru0 k() {
        e1o e1oVar = (e1o) this.g;
        gw70 gw70Var = (gw70) e1oVar.c;
        c8o.l(gw70Var);
        luk lukVar = (luk) e1oVar.f;
        c8o.l(lukVar);
        m35 m35Var = new m35(false, lukVar);
        ycm ycmVar = (ycm) e1oVar.g;
        c8o.l(ycmVar);
        return new aru0(gw70Var, m35Var, ycmVar, (byte) 21);
    }

    public ytp0 l() {
        e1o e1oVar = (e1o) this.g;
        yh2 yh2Var = (yh2) e1oVar.F;
        c8o.l(yh2Var);
        vb2 vb2Var = (vb2) e1oVar.E;
        c8o.l(vb2Var);
        qns0 qns0Var = (qns0) e1oVar.D;
        c8o.l(qns0Var);
        zr00 zr00Var = (zr00) e1oVar.G;
        c8o.l(zr00Var);
        y390 y390Var = (y390) e1oVar.H;
        c8o.l(y390Var);
        return new ytp0(yh2Var, zr00Var, y390Var.a((iac0) e1oVar.C, r6h1.c), qns0Var, vb2Var, (byte) 11);
    }

    public aru0 m() {
        return new aru0((yqg) ((ywp) this.h).get(), (nwt) ((ywp) this.i).get(), (clm) ((ywp) this.j).get(), (byte) 20);
    }

    public smc0 n() {
        yjq yjqVar = new yjq(r());
        vyp vypVar = (vyp) ((jly0) yjqVar.f).get();
        wmy wmyVar = vypVar.a;
        flw0 flw0Var = (flw0) wmyVar.c;
        c8o.l(flw0Var);
        wh71 wh71Var = (wh71) wmyVar.d;
        c8o.l(wh71Var);
        za71 za71Var = (za71) wmyVar.e;
        q8n q8nVar = (q8n) wmyVar.b;
        bk71 bk71Var = new bk71(wh71Var, za71Var, q8nVar);
        hyl0 hyl0Var = (hyl0) wmyVar.a;
        c8o.l(hyl0Var);
        c8o.l(flw0Var);
        y441 y441Var = new y441(new nn61(q8nVar, flw0Var, false, (byte) 6), wh71Var, hyl0Var, flw0Var);
        cl71 cl71Var = (cl71) vypVar.b.get();
        flw0 flw0Var2 = (flw0) wmyVar.c;
        c8o.l(flw0Var2);
        wh71 wh71Var2 = (wh71) wmyVar.d;
        c8o.l(wh71Var2);
        ShareSheetPreviewSectionImpl shareSheetPreviewSectionImpl = new ShareSheetPreviewSectionImpl(new tk71(flw0Var, bk71Var, hyl0Var, y441Var, cl71Var, new cfd(flw0Var2, wh71Var2, (byte) 4)));
        v9c v9cVar = new v9c((byte) 20);
        Object obj = yjqVar.d;
        ShareSheetDisclosureSectionImpl shareSheetDisclosureSectionImpl = new ShareSheetDisclosureSectionImpl(new t7u((wna0) ((zap) ((jly0) obj).get()).a.b));
        sua suaVar = new sua((wna0) ((zap) ((jly0) obj).get()).a.b, (byte) 8);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new sl71(shareSheetPreviewSectionImpl, v9cVar));
        smc0VarN.add(new sl71(shareSheetDisclosureSectionImpl, suaVar));
        smc0 smc0VarK = k4p1.k(smc0VarN);
        c8o.m(smc0VarK);
        return smc0VarK;
    }

    public nn61 o() {
        fj71 fj71Var = (fj71) this.u;
        xrc0 xrc0Var = (xrc0) fj71Var.H.get();
        c8o.l(xrc0Var);
        iyc0 iyc0Var = (iyc0) fj71Var.K.get();
        c8o.l(iyc0Var);
        c8o.l((uu00) fj71Var.u.get());
        return new nn61(xrc0Var, iyc0Var, new vhc((byte) 16), a().c());
    }

    public o771 p() {
        return yx61.u((xpq) ((jly0) this.c).get());
    }

    public g871 q() {
        return i().A();
    }

    public bf71 r() {
        g871 g871VarQ = q();
        fj71 fj71Var = (fj71) this.u;
        xm41 xm41Var = (xm41) fj71Var.B.get();
        c8o.l(xm41Var);
        m971 m971Var = (m971) fj71Var.f.get();
        c8o.l(m971Var);
        k7d k7dVar = (k7d) fj71Var.G.get();
        c8o.l(k7dVar);
        add addVar = (add) fj71Var.q.get();
        c8o.l(addVar);
        q7r0 q7r0Var = (q7r0) this.t;
        i8h1 i8h1VarZ = u1n0.z(q7r0Var);
        xxl0 xxl0Var = (xxl0) ((jly0) this.i).get();
        Context contextA = fj71Var.a();
        c8o.l(contextA);
        a1r0 a1r0Var = (a1r0) fj71Var.t.get();
        c8o.l(a1r0Var);
        i3j0 i3j0Var = (i3j0) fj71Var.m.get();
        c8o.l(i3j0Var);
        lzn0 lzn0Var = (lzn0) fj71Var.g.get();
        c8o.l(lzn0Var);
        dg30 dg30Var = (dg30) fj71Var.l.get();
        c8o.l(dg30Var);
        xap xapVarE = e();
        it8 it8Var = new it8(xapVarE.g(), ((mnt) xapVarE.b).z, (byte) 3);
        drj0 drj0VarG = e().g();
        e();
        fjb fjbVar = new fjb((byte) 18);
        u690 u690VarU = uge0.u(i());
        RetrofitMaker retrofitMakerC = fj71Var.c();
        c8o.l(retrofitMakerC);
        dma1 dma1Var = (dma1) fj71Var.y.get();
        c8o.l(dma1Var);
        za71 za71Var = new za71(dma1Var);
        q8n q8nVar = (q8n) fj71Var.D.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) fj71Var.z.get();
        c8o.l(q8nVar2);
        flw0 flw0Var = (flw0) ((jly0) this.f).get();
        wh71 wh71Var = (wh71) ((jly0) this.d).get();
        hyl0 hyl0Var = (hyl0) ((jly0) this.j).get();
        Set setC = c().c(t571.c);
        wna0 wna0Var = new wna0();
        pni1 pni1Var = (pni1) fj71Var.w0.get();
        c8o.l(pni1Var);
        return new bf71(g871VarQ, xm41Var, m971Var, k7dVar, addVar, i8h1VarZ, xxl0Var, contextA, a1r0Var, i3j0Var, lzn0Var, dg30Var, it8Var, drj0VarG, fjbVar, u690VarU, retrofitMakerC, za71Var, q8nVar, q8nVar2, flw0Var, wh71Var, hyl0Var, setC, wna0Var, q7r0Var, pni1Var, (ol71) ((jly0) this.k).get());
    }

    public ij71 s() {
        fj71 fj71Var = (fj71) this.u;
        zg0 zg0Var = (zg0) fj71Var.a.get();
        c8o.l(zg0Var);
        w13 w13Var = (w13) fj71Var.a0.get();
        c8o.l(w13Var);
        t680 t680Var = (t680) fj71Var.d0.get();
        c8o.l(t680Var);
        zxa zxaVarB = b();
        Object obj = this.c;
        gya gyaVarG = yx61.g((xpq) ((jly0) obj).get());
        CallbackRouter callbackRouter = (CallbackRouter) fj71Var.q0.get();
        c8o.l(callbackRouter);
        qmg qmgVar = (qmg) fj71Var.f0.get();
        c8o.l(qmgVar);
        yqg yqgVar = (yqg) fj71Var.b.get();
        c8o.l(yqgVar);
        Context contextA = fj71Var.a();
        c8o.l(contextA);
        xrk xrkVar = (xrk) fj71Var.x0.get();
        c8o.l(xrkVar);
        DisplayMetrics displayMetrics = (DisplayMetrics) fj71Var.k.get();
        c8o.l(displayMetrics);
        Context contextA2 = fj71Var.a();
        c8o.l(contextA2);
        jyu jyuVarR = upu.r(contextA2);
        ggv ggvVar = (ggv) fj71Var.m0.get();
        c8o.l(ggvVar);
        boolean zBooleanValue = ((Boolean) fj71Var.s0.get()).booleanValue();
        uvy uvyVar = (uvy) fj71Var.h0.get();
        c8o.l(uvyVar);
        uu00 uu00Var = (uu00) fj71Var.u.get();
        c8o.l(uu00Var);
        t7y t7yVarH = yx61.h((xpq) ((jly0) obj).get());
        uo5 uo5VarK = yx61.k((xpq) ((jly0) obj).get());
        cn3 cn3VarI = yx61.i((xpq) ((jly0) obj).get());
        me30 me30Var = (me30) fj71Var.J.get();
        c8o.l(me30Var);
        gw70 gw70VarB = ((ryj) this.g).b();
        c8o.l(gw70VarB);
        int iF = a().f();
        boolean zBooleanValue2 = ((Boolean) fj71Var.i0.get()).booleanValue();
        boolean zH = a().h();
        q8n q8nVarB = fj71Var.b();
        c8o.l(q8nVarB);
        xrc0 xrc0Var = (xrc0) fj71Var.H.get();
        c8o.l(xrc0Var);
        bhf0 bhf0Var = (bhf0) fj71Var.z0.get();
        c8o.l(bhf0Var);
        lnf0 lnf0Var = (lnf0) fj71Var.A0.get();
        c8o.l(lnf0Var);
        luk lukVar = (luk) fj71Var.v.get();
        c8o.l(lukVar);
        nfa0 nfa0Var = (nfa0) fj71Var.y0.get();
        c8o.l(nfa0Var);
        boolean zJ = a().j();
        q8n q8nVar = (q8n) fj71Var.z.get();
        c8o.l(q8nVar);
        cxc cxcVar = (cxc) fj71Var.p0.get();
        c8o.l(cxcVar);
        r7n0 r7n0Var = (r7n0) fj71Var.A.get();
        c8o.l(r7n0Var);
        Flowable flowable = (Flowable) fj71Var.e0.get();
        c8o.l(flowable);
        xmu0 xmu0Var = new xmu0(yx61.k((xpq) ((jly0) obj).get()), p(), (byte) 2);
        RetrofitMaker retrofitMakerC = fj71Var.c();
        c8o.l(retrofitMakerC);
        o241 o241Var = (o241) fj71Var.c0.get();
        c8o.l(o241Var);
        Flowable flowable2 = (Flowable) fj71Var.g0.get();
        c8o.l(flowable2);
        y1t0 y1t0VarO = yx61.o((xpq) ((jly0) obj).get());
        o771 o771VarP = p();
        eyh0 eyh0VarV = yx61.v((xpq) ((jly0) obj).get());
        gma1 gma1Var = (gma1) fj71Var.i.get();
        c8o.l(gma1Var);
        int iG = a().g();
        boolean zI = a().i();
        hre1 hre1Var = (hre1) fj71Var.j0.get();
        c8o.l(hre1Var);
        boolean zBooleanValue3 = ((Boolean) fj71Var.k0.get()).booleanValue();
        etf1 etf1Var = (etf1) fj71Var.b0.get();
        c8o.l(etf1Var);
        boolean zN = a().n();
        boolean zO = a().o();
        boolean zP = a().p();
        boolean zQ = a().q();
        boolean zR = a().r();
        lag1 lag1Var = (lag1) fj71Var.l0.get();
        c8o.l(lag1Var);
        boolean zB = a().b();
        a().c();
        boolean zS = a().s();
        npm1 npm1Var = (npm1) fj71Var.B0.get();
        c8o.l(npm1Var);
        i3b i3bVar = new i3b(new sj71(zg0Var, w13Var, t680Var, zxaVarB, gyaVarG, callbackRouter, qmgVar, yqgVar, contextA, xrkVar, displayMetrics, jyuVarR, ggvVar, zBooleanValue, uvyVar, uu00Var, t7yVarH, uo5VarK, cn3VarI, me30Var, gw70VarB, iF, zBooleanValue2, zH, q8nVarB, xrc0Var, bhf0Var, lnf0Var, lukVar, nfa0Var, zJ, q8nVar, cxcVar, r7n0Var, flowable, xmu0Var, retrofitMakerC, o241Var, flowable2, y1t0VarO, o771VarP, eyh0VarV, gma1Var, iG, zI, hre1Var, zBooleanValue3, etf1Var, zN, zO, zP, zQ, zR, lag1Var, zB, zS, npm1Var), (byte) 28);
        b4x0 b4x0Var = new b4x0((byte) 27);
        List list = c471.a;
        c8o.m(list);
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(v471.d);
        int iIndexOf = arrayList.indexOf(z471.d);
        if (iIndexOf == -1) {
            iIndexOf = arrayList.size();
        }
        p471 p471Var = p471.d;
        arrayList.add(iIndexOf, p471Var);
        cmt cmtVar = new cmt(arrayList, 3);
        new jma((byte) 6);
        dn3 dn3Var = new dn3();
        dn3Var.a = contextA;
        jnq jnqVar = new jnq(me30Var, cmtVar, contextA, dn3Var);
        jl00 jl00Var = new jl00(new zsc(contextA, new il00(new pf60((qf60) retrofitMakerC.createWebgateService(qf60.class, "android-highlightsstats-dataimpl")), (byte) 11), new of60(o241Var), q8nVarB, (byte) 12), (byte) 15);
        hpd0 hpd0VarP = qid0.p(new byp(contextA, zxaVarB, xrkVar, uu00Var, gw70VarB, xmu0Var, retrofitMakerC, flowable2, q8nVarB));
        x15 x15Var = new x15(contextA);
        ox1 ox1Var = new ox1(contextA);
        i2n0 i2n0Var = new i2n0(new hce1(uu00Var, new no7(uu00Var), new ko71(uu00Var), etf1Var, (byte) 8), (byte) 0);
        fan0 fan0Var = new fan0(new d4e0(new ug4(lukVar), (byte) 17));
        xaz0 xaz0VarK = i3bVar.k();
        wh41 wh41Var = new wh41(uvyVar, new x2z(uu00Var), hre1Var, zBooleanValue3, (byte) 3);
        dc31 dc31Var = new dc31(new x2z(uu00Var), new u271(uu00Var, (byte) 1), (byte) 24);
        vr51 vr51Var = new vr51(ggvVar, (byte) 5);
        lqr lqrVar = new lqr(new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 3))), (byte) 29);
        xid xidVar = new xid(contextA, new vr51(ggvVar, (byte) 5), (byte) 13);
        x2z x2zVar = new x2z(uu00Var);
        yzu yzuVar = new yzu(new h0y(new amd(uu00Var), (byte) 4), uu00Var, qmgVar, new o2b1(lag1Var, (byte) 15));
        u271 u271Var = new u271(uu00Var, (byte) 2);
        aod aodVar = new aod(uu00Var, flowable2, (byte) 12);
        lgy lgyVar = new lgy();
        lgyVar.b = yzuVar;
        lgyVar.c = wh41Var;
        lgyVar.d = flowable;
        lgyVar.e = yqgVar;
        lgyVar.f = lqrVar;
        lgyVar.g = dc31Var;
        lgyVar.h = u271Var;
        lgyVar.i = aodVar;
        lgyVar.a = zH;
        vr51 vr51Var2 = new vr51(new nsm0(2, new xbz(lgyVar, p7h.M(new vbz(contextA, vr51Var, uvyVar, x2zVar, zBooleanValue2), new fle(contextA), new pwe1(contextA, xidVar))), xbz.class, "load", "load(Lcom/spotify/share/models/ShareMenuData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 24), (byte) 6);
        g931 g931Var = new g931(new fn20(new fj4(lukVar)), new g931(new xyl1(new fn20(new fj4(lukVar)), new ytw0((byte) 21)), contextA, hl20.D(gma1Var), flowable2, q8nVarB), new s041(xrc0Var), (byte) 5);
        xq81 xq81Var = new xq81(new mxr(new n381((zea1) retrofitMakerC.createWebgateService(zea1.class, "android-songdna-share-entrypointimpl"), xmu0Var, (byte) 26), new q59(new ic9(gw70VarB, zxaVarB, (byte) 13), new h0y(zxaVarB, (byte) 19), (byte) 7), new rcy(uu00Var), contextA), (byte) 5);
        xjc1 xjc1Var = new xjc1();
        j7s j7sVar = new j7s();
        j7sVar.a = zJ;
        j7sVar.b = zBooleanValue;
        xaz0 xaz0Var = new xaz0(new f1g1(contextA, new w6e0(contextA, lnf0Var, new v1k(flowable, yqgVar, bhf0Var, (byte) 21), j7sVar, (byte) 11), j7sVar, new hce1(uu00Var, new no7(uu00Var), new ko71(uu00Var), etf1Var, (byte) 8), q8nVarB, new jo8(uu00Var), new vr51(ggvVar, (byte) 5)), (byte) 29);
        eoc eocVar = new eoc((byte) 16);
        xap xapVarL = i3bVar.l();
        LinkedHashMap linkedHashMapC0 = d0p1.c0(3);
        new eoc((byte) 3);
        linkedHashMapC0.put(jgo.class, new kgo());
        dy71 dy71Var = (dy71) retrofitMakerC.createWebgateService(dy71.class, "android-fandomcollectibles-share");
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        linkedHashMapC0.put(w371.class, new dl10(new x371(dy71Var, yqgVar), (byte) 0));
        linkedHashMapC0.put(phm1.class, new dl10(xapVarL, (byte) 1));
        q3e q3eVar = new q3e(linkedHashMapC0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapC0));
        a3l1 a3l1Var = new a3l1(contextA);
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.remove(g571.d);
        arrayList2.add(p471Var);
        tj71 tj71Var = new tj71(new qpj1(i3bVar.k(), nfa0Var, (byte) 24), xaz0VarK, g931Var, jnqVar, new qpj1(contextA, new cmt(o7h.l1(arrayList2), 1), (byte) 7), xaz0Var, xjc1Var, vr51Var2, i2n0Var, xq81Var, new hwb(new nfb((byte) 7, false), (byte) 24), hpd0VarP, x15Var, eocVar, ox1Var, new q3c(), new ccm1(), fan0Var, b4x0Var, q3eVar, a3l1Var, jl00Var, new h5a1(i3bVar.l().j(), (byte) 28));
        jj71 jj71Var = new jj71();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jj71Var.a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        jj71Var.b = linkedHashMap2;
        tj71Var.invoke(jj71Var);
        nj71 nj71Var = jj71Var.c;
        if (nj71Var != null) {
            return new ij71(linkedHashMap, linkedHashMap2, nj71Var, jj71Var.d, jj71Var.e);
        }
        hhg1.n("Fallback for share entrypoint config cannot be null");
        return null;
    }

    public jqd0 t() {
        boolean zL = a().l();
        RetrofitMaker retrofitMakerC = ((fj71) this.u).c();
        c8o.l(retrofitMakerC);
        yfu yfuVarF = f();
        h();
        return new jqd0(zL, new nt21((sz61) retrofitMakerC.createWebgateService(sz61.class, "android-sharecard-config-wiring"), yfuVarF, new pob((byte) 16, false)), q(), (byte) 25);
    }

    public /* synthetic */ pug(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, Object obj23) {
        this.g = obj;
        this.h = obj2;
        this.a = obj3;
        this.b = obj4;
        this.c = obj5;
        this.d = obj6;
        this.e = obj7;
        this.f = obj8;
        this.i = obj9;
        this.j = obj10;
        this.k = obj11;
        this.l = obj12;
        this.m = obj13;
        this.n = obj14;
        this.o = obj15;
        this.f67p = obj16;
        this.q = obj17;
        this.r = obj18;
        this.s = obj19;
        this.t = obj20;
        this.u = obj21;
        this.v = obj22;
        this.w = obj23;
    }

    public pug(e1o e1oVar) {
        this.g = e1oVar;
        this.h = new ywp(this, 2, (byte) 24);
        this.i = new ywp(this, 3, (byte) 24);
        this.j = new ywp(this, 4, (byte) 24);
        this.k = new ywp(this, 7, (byte) 24);
        this.l = new ywp(this, 6, (byte) 24);
        this.m = new ywp(this, 8, (byte) 24);
        this.n = new ywp(this, 9, (byte) 24);
        this.o = new ywp(this, 10, (byte) 24);
        this.f67p = new ywp(this, 11, (byte) 24);
        this.q = new ywp(this, 5, (byte) 24);
        this.r = new ywp(this, 13, (byte) 24);
        this.s = new ywp(this, 14, (byte) 24);
        this.t = new ywp(this, 17, (byte) 24);
        this.a = xqu.b(new ywp(this, 16, (byte) 24));
        this.b = iy81.a(new ywp(this, 15, (byte) 24));
        this.u = new ywp(this, 18, (byte) 24);
        this.c = iy81.a(new ywp(this, 12, (byte) 24));
        this.v = new ywp(this, 19, (byte) 24);
        this.w = new ywp(this, 20, (byte) 24);
        this.d = iy81.a(new ywp(this, 1, (byte) 24));
        this.e = iy81.a(new ywp(this, 21, (byte) 24));
        this.f = iy81.a(new ywp(this, 0, (byte) 24));
    }

    public pug(fj71 fj71Var, ryj ryjVar, gj71 gj71Var, q7r0 q7r0Var) {
        this.g = ryjVar;
        this.h = gj71Var;
        this.t = q7r0Var;
        this.u = fj71Var;
        this.a = xqu.b(new ipq(this, 2, (byte) 10));
        this.b = xqu.b(new ipq(this, 1, (byte) 10));
        this.c = iy81.a(new ipq(this, 6, (byte) 10));
        this.d = xqu.b(new ipq(this, 7, (byte) 10));
        this.e = xqu.b(new ipq(this, 8, (byte) 10));
        this.f = xqu.b(new ipq(this, 9, (byte) 10));
        this.i = xqu.b(new ipq(this, 11, (byte) 10));
        this.j = xqu.b(new ipq(this, 10, (byte) 10));
        this.k = xqu.b(new ipq(this, 12, (byte) 10));
        this.l = xqu.b(new ipq(this, 5, (byte) 10));
        this.m = xqu.b(new ipq(this, 4, (byte) 10));
        this.n = xqu.b(new ipq(this, 13, (byte) 10));
        this.o = xqu.b(new ipq(this, 15, (byte) 10));
        this.f67p = iy81.a(new ipq(this, 17, (byte) 10));
        this.q = iy81.a(new ipq(this, 16, (byte) 10));
        this.r = xqu.b(new ipq(this, 18, (byte) 10));
        this.s = iy81.a(new ipq(this, 14, (byte) 10));
        this.v = iy81.a(new ipq(this, 3, (byte) 10));
        this.w = xqu.b(new ipq(this, 0, (byte) 10));
    }
}
