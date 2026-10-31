package p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jxp implements jly0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jxp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        Object obj = this.c;
        boolean z = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                qqp qqpVar = (qqp) obj;
                if (!z) {
                    return new mir0(((b2r0) ((jly0) qqpVar.b).get()).a());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                c2r0 c2r0Var = (c2r0) ((xts0) qqpVar.d).h.get();
                c8o.l(c2r0Var);
                wts0 wts0Var = (wts0) qqpVar.e;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return c2r0Var.e(wts0Var, yon1.G1("PHONENUMBER_PHONENUMBERENTRY", "phonenumber/phonenumberentry", 1437, "phonenumber"), (qir0) null);
            case 1:
                qqp qqpVar2 = (qqp) obj;
                if (!z) {
                    return pzm.h((mos) ((rgv0) qqpVar2.e).b.get());
                }
                if (z) {
                    return u1n0.z((q7r0) qqpVar2.d);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 2:
                aru0 aru0Var = (aru0) ((wtp) obj).d;
                if (z) {
                    if (z) {
                        return (az11) ((kly0) aru0Var.b).get();
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context = (Context) aru0Var.d;
                c8o.l(context);
                LinkedHashMap linkedHashMap = kvw0.b;
                kvw0 kvw0VarX = cev0.x(context);
                Scheduler scheduler = (Scheduler) aru0Var.c;
                c8o.l(scheduler);
                return new bvw0(kvw0VarX, scheduler);
            case 3:
                if (!z) {
                    return w7xVar;
                }
                if (z) {
                    qqp qqpVar3 = (qqp) obj;
                    return new z710((AgeAssuranceWebViewActivity) qqpVar3.d, (kt91) ((daq) qqpVar3.e).f8.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 4:
                if (!z) {
                    return w7xVar;
                }
                if (z) {
                    qqp qqpVar4 = (qqp) obj;
                    return new z710((ParentalConsentWebActivity) qqpVar4.d, (kt91) ((daq) qqpVar4.e).f8.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 5:
                if (!z) {
                    r6h1 r6h1Var = r6h1.c;
                    return new xdl0();
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                c2r0 c2r0Var2 = (c2r0) ((daq) obj).hm.get();
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return c2r0Var2.b(yon1.G1("LOGIN_MAGICLINKAUTOSEND", "login/magiclinkautosend", 956, "login"), (qir0) null);
            case 6:
                if (!z) {
                    return new alq(this);
                }
                if (z) {
                    return new wxp(this, (byte) 1);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 7:
                tjq tjqVar = (tjq) obj;
                l3q l3qVar = (l3q) tjqVar.d;
                qop qopVar = (qop) tjqVar.c;
                gl90 gl90Var = (gl90) tjqVar.b;
                if (z) {
                    if (z) {
                        return new q1p(this, b2);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                d0r d0rVar = gl90Var.b;
                String strD = qopVar.d();
                String strD2 = qopVar.d();
                rit0 rit0VarV = tjqVar.v();
                nm1 nm1VarH = tjqVar.h();
                xvu xvuVarM = tjqVar.m();
                bk90 bk90Var = gl90Var.d;
                c8o.l(bk90Var);
                q1p q1pVar = (q1p) ((jly0) tjqVar.a).get();
                nm1 nm1VarX = tjqVar.x();
                qlb qlbVar = new qlb(gl90Var.b, tjqVar.i(), (byte) 6);
                f6g1 f6g1Var = (f6g1) l3qVar.b.I8.get();
                c8o.l(f6g1Var);
                byp bypVar = new byp(strD2, rit0VarV, nm1VarH, xvuVarM, bk90Var, q1pVar, nm1VarX, qlbVar, f6g1Var);
                String strD3 = qopVar.d();
                rit0 rit0VarV2 = tjqVar.v();
                nm1 nm1VarH2 = tjqVar.h();
                xvu xvuVarM2 = tjqVar.m();
                bk90 bk90Var2 = gl90Var.d;
                c8o.l(bk90Var2);
                q1p q1pVar2 = (q1p) ((jly0) tjqVar.a).get();
                nm1 nm1VarX2 = tjqVar.x();
                qlb qlbVar2 = new qlb(gl90Var.b, tjqVar.i(), (byte) 6);
                daq daqVar = l3qVar.a;
                luk lukVar = (luk) daqVar.L1.get();
                c8o.l(lukVar);
                fp4 fp4Var = new fp4(false, lukVar);
                dxz0 dxz0Var = (dxz0) daqVar.I4.get();
                c8o.l(dxz0Var);
                ezc ezcVarG = yoi1.g(dxz0Var.e());
                zr00 zr00Var = (zr00) daqVar.f9.get();
                c8o.l(zr00Var);
                mr20 mr20Var = zr00Var.a;
                c8o.m(mr20Var);
                return new v8y0(d0rVar, strD, bypVar, new h72(strD3, rit0VarV2, nm1VarH2, xvuVarM2, bk90Var2, q1pVar2, nm1VarX2, qlbVar2, fp4Var, ezcVarG, mr20Var), l3qVar.b.h3());
            case 8:
                wtp wtpVar = (wtp) obj;
                ucz0 ucz0Var = (ucz0) wtpVar.d;
                if (z) {
                    if (z) {
                        return pzm.h((mos) ucz0Var.b.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context2 = (Context) ucz0Var.d.get();
                c8o.l(context2);
                yzh1 yzh1Var = (yzh1) ucz0Var.c.get();
                c8o.l(yzh1Var);
                yo31 yo31Var = new yo31(yzh1Var, (byte) 28);
                los losVar = (los) ((jly0) wtpVar.b).get();
                lzn0 lzn0Var = (lzn0) ucz0Var.e.get();
                c8o.l(lzn0Var);
                return new et90(context2, yo31Var, losVar, lzn0Var);
            case 9:
                if (!z) {
                    return new imq(this);
                }
                if (z) {
                    return pzm.h((mos) ((xkz0) ((jmq) obj).a).c.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 10:
                if (!z) {
                    return new kmq(this);
                }
                if (z) {
                    return new lmq(this, (byte) 0);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 11:
                yjq yjqVar = (yjq) obj;
                if (!z) {
                    return u1n0.z((q7r0) yjqVar.e);
                }
                if (z) {
                    return new i4m0(((nl01) yjqVar.c).a);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 12:
                if (!z) {
                    return new ioq(this);
                }
                if (z) {
                    return new koq(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 13:
                pr21 pr21Var = (pr21) ((jmq) obj).a;
                if (!z) {
                    gw70 gw70Var = (gw70) pr21Var.c.get();
                    c8o.l(gw70Var);
                    return new sjs(gw70Var);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                hpd0 hpd0Var = (hpd0) pr21Var.f.get();
                c8o.l(hpd0Var);
                return hpd0Var;
            case 14:
                jnq jnqVar = (jnq) obj;
                if (!z) {
                    ynb0 ynb0VarA = xqu.a((jly0) jnqVar.a);
                    q8n q8nVar = (q8n) ((u531) jnqVar.c).l.get();
                    c8o.l(q8nVar);
                    return new cz30(ynb0VarA, q8nVar);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                ttm0 ttm0VarE = cwl1.E((q7r0) jnqVar.d);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 15:
                jmq jmqVar = (jmq) obj;
                uo51 uo51Var = (uo51) jmqVar.a;
                if (z) {
                    if (z) {
                        return pzm.h((mos) uo51Var.b.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context3 = (Context) uo51Var.e.get();
                c8o.l(context3);
                yzh1 yzh1Var2 = (yzh1) uo51Var.d.get();
                c8o.l(yzh1Var2);
                yo31 yo31Var2 = new yo31(yzh1Var2, (byte) 28);
                los losVar2 = (los) ((jly0) jmqVar.b).get();
                kvs0 kvs0Var = (kvs0) uo51Var.c.get();
                c8o.l(kvs0Var);
                a0i1 a0i1Var = (a0i1) uo51Var.f.get();
                c8o.l(a0i1Var);
                return new j0a(context3, yo31Var2, losVar2, kvs0Var, a0i1Var, (byte) 1);
            case 16:
                l1r l1rVar = (l1r) ((jmq) obj).a;
                if (!z) {
                    return new ev71(new be(new CosmosTransport(new x430((RxRouter) l1rVar.c.get(), (byte) 8))), (q8n) l1rVar.e.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context4 = (Context) l1rVar.a.get();
                CosmosTransport cosmosTransport = new CosmosTransport(new x430((RxRouter) l1rVar.c.get(), (byte) 8));
                cdn0 cdn0Var = (cdn0) l1rVar.d.get();
                Context context5 = (Context) l1rVar.a.get();
                Handler handler = (Handler) l1rVar.b.get();
                llm llmVarE = smo1.e(new z8n("WiFiDisabledDetectorScope"));
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                ve01 ve01VarR = d5p1.r(new ph11(h4p1.f(new ary(tr20.a, context5, intentFilter, handler, (lnm) null, (byte) 4)), (byte) 24), llmVarE, ey71.a, 1);
                aje0 aje0Var = new aje0((Context) l1rVar.a.get(), (byte) 1);
                uo5 uo5Var = new uo5((Context) l1rVar.a.get(), (byte) 29);
                q8n q8nVar2 = (q8n) l1rVar.e.get();
                Object systemService = context4.getApplicationContext().getSystemService("wifi");
                return new a9l(new be(cosmosTransport), cdn0Var.b, new ht20(new dwv(ve01VarR, (byte) 19), new lm61(systemService instanceof WifiManager ? (WifiManager) systemService : null, (lnm) null, (byte) 18)), new tu41((mr20) aje0Var.b, (byte) 17), uo5Var, q8nVar2);
            case 17:
                jqq jqqVar = (jqq) obj;
                if (!z) {
                    return new p681(((jqq) ((iqq) jqqVar.e.get()).a.c).a, jqqVar.b);
                }
                if (z) {
                    return new iqq(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 18:
                jmq jmqVar2 = (jmq) obj;
                e691 e691Var = (e691) jmqVar2.a;
                if (z) {
                    if (z) {
                        return pzm.h((mos) e691Var.b.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context6 = (Context) e691Var.f.get();
                c8o.l(context6);
                yzh1 yzh1Var3 = (yzh1) e691Var.d.get();
                c8o.l(yzh1Var3);
                nke1 nke1Var = (nke1) e691Var.e.get();
                c8o.l(nke1Var);
                ffe1 ffe1Var = new ffe1(yzh1Var3, nke1Var, (byte) 1);
                los losVar3 = (los) ((jly0) jmqVar2.b).get();
                kvs0 kvs0Var2 = (kvs0) e691Var.c.get();
                c8o.l(kvs0Var2);
                a0i1 a0i1Var2 = (a0i1) e691Var.g.get();
                c8o.l(a0i1Var2);
                return new smp0(context6, ffe1Var, losVar3, kvs0Var2, a0i1Var2);
            case 19:
                jnq jnqVar2 = (jnq) obj;
                if (!z) {
                    return new orq(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                p0b1 p0b1Var = (p0b1) ((jbq) jnqVar2.d).b.Fh.get();
                c8o.l(p0b1Var);
                return new n0b1(p0b1Var, ((qop) jnqVar2.c).d());
            case 20:
                jnq jnqVar3 = (jnq) obj;
                qop qopVar2 = (qop) jnqVar3.b;
                l3q l3qVar2 = (l3q) jnqVar3.c;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    p0b1 p0b1Var2 = (p0b1) l3qVar2.b.Fh.get();
                    c8o.l(p0b1Var2);
                    return new n0b1(p0b1Var2, qopVar2.d());
                }
                n0b1 n0b1Var = (n0b1) ((jly0) jnqVar3.a).get();
                n0b1 n0b1Var2 = (n0b1) ((jly0) jnqVar3.a).get();
                ruz ruzVarA = ((cyp) ((uap) qopVar2.a.b).u.get()).a();
                Flowable flowable = (Flowable) l3qVar2.a.D5.get();
                c8o.l(flowable);
                return new rwj(n0b1Var, n0b1Var2, ruzVarA, flowable);
            case 21:
                if (!z) {
                    return new yrq(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                uu00 uu00Var = (uu00) ((vzp) ((jnq) obj).b).b.a5.get();
                c8o.l(uu00Var);
                return new l13(uu00Var);
            case 22:
                zib1 zib1Var = (zib1) ((jmq) obj).a;
                if (!z) {
                    return pzm.h((mos) zib1Var.c.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                g310 g310Var = (g310) zib1Var.d.get();
                c8o.l(g310Var);
                return g310Var;
            case 23:
                if (!z) {
                    return new csq(this);
                }
                if (z) {
                    return new dsq();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 24:
                if (!z) {
                    return new usq(this);
                }
                if (z) {
                    return new vsq(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 25:
                if (!z) {
                    return new vbd1();
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                luk lukVar2 = (luk) ((wsq) obj).a.b;
                c8o.l(lukVar2);
                return new wbd1(new y34(50, lukVar2));
            case 26:
                tjq tjqVar2 = (tjq) obj;
                kct kctVar = (kct) tjqVar2.b;
                if (z) {
                    if (z) {
                        return cwl1.C((q7r0) tjqVar2.e);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                lzn0 lzn0Var2 = (lzn0) kctVar.c.get();
                c8o.l(lzn0Var2);
                z710 z710Var = (z710) kctVar.d.get();
                c8o.l(z710Var);
                d0r d0rVar2 = (d0r) ((jly0) tjqVar2.a).get();
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                return new qmf1(lzn0Var2, z710Var, d0rVar2, yon1.G1("SONG_DNA_REPORT", "song-dna-report", 1923, "song-dna-report"), nik1.F6.b(((fmf1) tjqVar2.c).b));
            case 27:
                if (!z) {
                    return new ftq(this);
                }
                if (z) {
                    return new woq(this, b2);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 28:
                if (!z) {
                    return pzm.h((mos) ((eug1) ((jnq) obj).d).c.get());
                }
                if (z) {
                    return new ktq(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            default:
                yzp yzpVar = (yzp) ((jmq) obj).a;
                if (!z) {
                    pch1 pch1Var = (pch1) yzpVar.a.m8.get();
                    c8o.l(pch1Var);
                    return pch1Var;
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                ymu0 ymu0Var = (ymu0) yzpVar.a.h8.get();
                c8o.l(ymu0Var);
                return ymu0Var;
        }
    }
}
