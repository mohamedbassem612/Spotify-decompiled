package p;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qi1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi1(l2u0 l2u0Var, wat watVar, tm51 tm51Var, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, wfx0 wfx0Var, ven0 ven0Var3) {
        super(1);
        this.a = (byte) 8;
        this.d = l2u0Var;
        this.e = watVar;
        this.f = tm51Var;
        this.g = c9nVar;
        this.c = ven0Var;
        this.h = ven0Var2;
        this.b = wfx0Var;
        this.i = ven0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x035d  */
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        Object obj3 = this.b;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.c;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                rtb0 rtb0Var = (rtb0) obj;
                gj1 gj1Var = (gj1) obj5;
                rtb0.c(rtb0Var, (Object) null, new j2i(-1705110311, new wf((v361) obj6, gj1Var, (byte) 9), true), 3);
                c380 c380Var = (c380) obj9;
                gv51 gv51Var = (gv51) obj4;
                iu30 iu30Var = (iu30) obj3;
                rtb0Var.e(c380Var.size(), new qf1(c380Var, (byte) 4), new qf1(c380Var, (byte) 5), new j2i(2039820996, new oi1(c380Var, gv51Var, gj1Var, iu30Var, (byte) 0), true));
                c380 c380Var2 = (c380) obj8;
                if (!c380Var2.isEmpty()) {
                    rtb0.c(rtb0Var, (Object) null, m4i.b, 3);
                }
                rtb0Var.e(c380Var2.size(), new qf1(c380Var2, (byte) 6), new qf1(c380Var2, (byte) 7), new j2i(2039820996, new pi1(c380Var2, (c380) obj9, (nbh) obj2, gv51Var, gj1Var, iu30Var, (ven0) obj7, (byte) 0), true));
                return rih1Var;
            case 1:
                String str = (String) obj;
                err0 err0Var = (hdn0) obj2;
                l96 l96Var = (l96) obj9;
                iu30 iu30Var2 = (iu30) obj3;
                ven0 ven0Var = (ven0) obj7;
                ((ven0) obj5).setValue((String) ven0Var.getValue());
                ven0 ven0Var2 = (ven0) obj4;
                y86 y86Var = ((fa6) obj6).a;
                ven0Var2.setValue(!str.equals(y86Var.c) ? str : null);
                ven0Var.setValue(str);
                iu30Var2.invoke(new x76(str));
                upx0 upx0VarI = l96Var.g.i();
                ((axx0) obj8).getClass();
                r4o1.R(upx0VarI, axx0.b(str), y86Var.k, l96Var.a, iu30Var2);
                err0 err0Var2 = err0Var;
                int iS = err0Var2.s();
                err0Var2.t(iS + 1);
                return Integer.valueOf(iS);
            case 2:
                ven0 ven0Var3 = (ven0) obj7;
                if (mrf.a((tob1) obj8, (ven0) obj6, (tob1) obj5, (tob1) obj4, ven0Var3, (tob1) obj3, (tob1) obj2, ((Offset) obj).a)) {
                    Function0 function0 = (Function0) ven0Var3.getValue();
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    ((Function0) ((ven0) obj9).getValue()).invoke();
                }
                return rih1Var;
            case 3:
                List list = (List) obj;
                return ((ev30) obj9).invoke(((l4r) obj8).e.invoke(list.get(0)), ((l4r) obj6).e.invoke(list.get(1)), ((l4r) obj5).e.invoke(list.get(2)), ((l4r) obj4).e.invoke(list.get(3)), ((l4r) obj3).e.invoke(list.get(4)), ((l4r) obj2).e.invoke(list.get(5)), ((l4r) obj7).e.invoke(list.get(6)));
            case 4:
                mxr mxrVar = (mxr) obj9;
                suu suuVar = (suu) obj8;
                xab1 xab1VarT = fn31.T(cto1.q((dg30) mxrVar.a), (o8n) null, 0, new ymu(suuVar, mxrVar, (lnm) null, (byte) 5), 3);
                String str2 = (String) obj4;
                lik1 lik1Var = (lik1) obj2;
                drj0 drj0Var = (drj0) obj7;
                suuVar.b((xwp0) obj6, (v1v) obj5, new a680(xab1VarT, mxrVar, str2, (umb) obj3, lik1Var, drj0Var), new tjq(xab1VarT, mxrVar, lik1Var, str2, drj0Var));
                return rih1Var;
            case 5:
                ArrayList arrayList = ((le00) obj9).a;
                ((rtb0) obj).e(arrayList.size(), new ry4(arrayList, (byte) 19), new ry4(arrayList, (byte) 20), new j2i(2039820996, new hkn(arrayList, (d0r) obj8, (fod0) obj6, (k7p) obj5, (q7p) obj4, (cfp) obj3, (afp) obj2, (u9u0) obj7), true));
                return rih1Var;
            case 6:
                mey0 mey0Var = (mey0) obj;
                eci0 eci0Var = (eci0) obj8;
                return new x010(z8p1.n(mey0Var, (clm) obj5, (ymd0) obj4, (nwt) obj3, (kko) ((rwj) obj9).d, eci0Var.a, ((yy4) obj6).g(), true, eci0Var.c, false, eci0Var.d, eci0Var.f, eci0Var.g, eci0Var.i, (ytp0) obj2, (uvy) null, false, eci0Var.k, eci0Var.l, 824832), f7p1.n((zob1) ((p1f0) obj7).h, mey0Var.c, eci0Var.j), new vv70(3, (lnm) null, (byte) 20), (byte) 1);
            case 7:
                return new u7p0(new v6n0((q8n) obj9, (Context) obj8, (r961) obj6, (gqg) obj5, new eea0((k3i0) obj4, (byte) 28), (t8r0) obj3, (wh71) obj2, (oud) obj), new lz9((g2z) obj7, (byte) 2));
            case 8:
                float fFloatValue = ((Number) obj).floatValue();
                ven0 ven0Var4 = (ven0) obj7;
                l2u0 l2u0Var = (l2u0) obj9;
                long j = l2u0Var != null ? l2u0Var.c : 0L;
                Locale locale = new Locale(upn1.m());
                ytw0 ytw0Var = jfv.b;
                ngv ngvVar = ngv.d;
                long jL0 = fdg1.l0((long) (j * fFloatValue), ngvVar);
                ngv ngvVar2 = ngv.f;
                String str3 = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jfv.u(jL0, ngvVar2)), Integer.valueOf(jfv.l(jL0))}, 2));
                long jL1 = fdg1.l0(j, ngvVar);
                ven0Var4.setValue(str3 + " / " + String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jfv.u(jL1, ngvVar2)), Integer.valueOf(jfv.l(jL1))}, 2)));
                long j2 = l2u0Var != null ? l2u0Var.c : 0L;
                long j3 = l2u0Var != null ? l2u0Var.d : 0L;
                if (l2u0Var != null) {
                    Integer num = l2u0Var.i;
                    Integer num2 = l2u0Var.h;
                    if (num2 == null || num == null || num2.intValue() <= num.intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                wat watVar = (wat) obj8;
                tm51 tm51Var = (tm51) obj6;
                wwm0 wwm0Var = tm51Var != null ? (wwm0) tm51Var.a.getValue() : null;
                c9n c9nVar = (c9n) obj5;
                abh0 abh0Var = new abh0((ven0) obj4, (byte) 29);
                hzu0 hzu0Var = new hzu0((wfx0) obj3, (ven0) obj2, (byte) 28);
                if (wwm0Var != null) {
                    mmr0 mmr0Var = z ? new mmr0(170, 96) : new mmr0(96, 170);
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    int iIntValue2 = ((Number) mmr0Var.b).intValue();
                    int iX0 = (int) watVar.X0(iIntValue);
                    int iX1 = (int) watVar.X0(iIntValue2);
                    long j4 = j3 + ((long) (j2 * fFloatValue));
                    w590 w590VarA = wwm0Var.a.a();
                    rm51 rm51VarM = w590VarA != null ? w590VarA.m(iX0, j4, iX1) : null;
                    if (rm51VarM != null) {
                        abh0Var.invoke(Long.valueOf(rm51VarM.a));
                        fn31.T(c9nVar, (o8n) null, 0, new wn2(rm51VarM, hzu0Var, j4, (lnm) null, (byte) 15), 3);
                    }
                }
                return rih1Var;
            case 9:
                oud oudVar = (oud) obj;
                wh71 wh71Var = (wh71) obj3;
                q8n q8nVar = (q8n) obj7;
                return new u7p0(new f70((byte) 13), new uq7(oudVar, wh71Var, q8nVar, new xay0(new o3e0(new pux0((xrc0) obj9, (uu00) obj8, b2), (m27) obj6, (Context) obj5, (byte) 0), new ogr(oudVar, (byte) 23), new xmu0((bhf) obj4, wh71Var, (gqg) obj2), q8nVar)));
            case 10:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((ven0) obj7).setValue(Boolean.TRUE);
                ((frr0) obj6).t(((Number) ((Function0) obj9).invoke()).longValue());
                ven0 ven0Var5 = (ven0) obj5;
                faa0 faa0Var = (faa0) ven0Var5.getValue();
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ven0Var5.setValue(fn31.T((c9n) obj8, (o8n) null, 0, new wj40(fFloatValue2, (upb0) obj4, (tob1) obj3, (drr0) obj2, (lnm) null), 3));
                return rih1Var;
            case 11:
                dnc0 dnc0Var = (dnc0) obj;
                two1.v(dnc0Var, (m441) obj9, true, new t3t0((ls11) obj8, (zs11) obj6, (toc) obj5, (it8) obj4, (hpc) obj2, (lzn0) obj7, (byte) 4));
                ((iu30) obj3).invoke(dnc0Var);
                return rih1Var;
            case 12:
                float fFloatValue3 = ((Number) obj).floatValue();
                ((ven0) obj7).setValue(Boolean.TRUE);
                ((ven0) obj6).setValue(Long.valueOf(((kzt) obj9).a.b()));
                fn31.T((c9n) obj8, (o8n) null, 0, new nzr(fFloatValue3, (xtb0) obj5, (tob1) obj4, (tob1) obj3, (ven0) obj2, (lnm) null), 3);
                return rih1Var;
            case 13:
                xzq xzqVar = new xzq((w6a1) obj9, new iv81((u7h) obj5, (s6a1) obj4, (byte) 16));
                h9a1 h9a1Var = h9a1.d;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(pic1.class, new r3r(xzqVar, h9a1Var, 4));
                tva1 tva1Var = (tva1) obj8;
                linkedHashMap.put(iic1.class, new r3r(new xzq(tva1Var, y8a1.a1), h9a1.e, 4));
                linkedHashMap.put(lic1.class, new r3r(new xzq(tva1Var, y8a1.b1), h9a1.f, 4));
                linkedHashMap.put(ric1.class, r4o1.Q(y8a1.c1, w7x.a, new inc0((cm0) obj3, (Context) obj2, (byte) 1), h9a1.g));
                n0o n0oVar = (n0o) obj6;
                b9u0 b9u0Var = (b9u0) obj7;
                linkedHashMap.put(mic1.class, new r3r(new xzq(n0oVar, new g9a1(b9u0Var, (byte) 0)), yd81.e1, 4));
                linkedHashMap.put(nic1.class, new r3r(new xzq(n0oVar, new g9a1(b9u0Var, (byte) 1)), h9a1.b, 4));
                linkedHashMap.put(lic1.class, new r3r(new xzq(tva1Var, y8a1.Z0), h9a1.c, 4));
                return rih1Var;
            case 14:
                e261 e261Var = (e261) obj;
                vpg1 vpg1Var = (vpg1) obj9;
                List listI0 = f46.i0(new String[]{vpg1Var.h, vpg1Var.e, (String) obj8, vpg1Var.f});
                ArrayList arrayList2 = new ArrayList();
                for (Object obj10 : listI0) {
                    if (!ihc1.y0((String) obj10)) {
                        arrayList2.add(obj10);
                    }
                }
                b261.n(e261Var, o7h.y0(arrayList2, ". ", (String) null, (String) null, (iu30) null, 62));
                String str4 = (String) obj4;
                b261.p(e261Var, f46.i0(new epo[]{new epo((String) obj6, new uuc1((Function0) obj3, (byte) 22)), new epo((String) obj5, new uuc1((Function0) obj2, (byte) 23)), str4 != null ? new epo(str4, new uuc1((Function0) obj7, (byte) 24)) : null}));
                return rih1Var;
            default:
                WebView webView = new WebView((Context) obj);
                WebView.setWebContentsDebuggingEnabled(false);
                webView.setBackgroundColor(-16777216);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.setWebChromeClient(new o7b1(new boc0((Function0) obj9), new ezb1((vu30) obj8, (byte) 23), lcl1.h));
                webView.setWebViewClient(new uag((ven0) obj7, (ven0) obj6, (ven0) obj5, (ven0) obj4, (ven0) obj3));
                webView.loadUrl("https://about-recommendations.spotify.com/");
                ((ven0) obj2).setValue(webView);
                return webView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi1(Object obj, Object obj2, ven0 ven0Var, ven0 ven0Var2, Object obj3, Object obj4, tob1 tob1Var, ven0 ven0Var3, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = ven0Var;
        this.f = ven0Var2;
        this.g = obj3;
        this.h = obj4;
        this.b = tob1Var;
        this.i = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi1(iu30 iu30Var, l96 l96Var, axx0 axx0Var, fa6 fa6Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, hdn0 hdn0Var) {
        super(1);
        this.a = (byte) 1;
        this.b = iu30Var;
        this.d = l96Var;
        this.e = axx0Var;
        this.f = fa6Var;
        this.c = ven0Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
        this.i = hdn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi1(ven0 ven0Var, ven0 ven0Var2, tob1 tob1Var, ven0 ven0Var3, tob1 tob1Var2, tob1 tob1Var3, tob1 tob1Var4, tob1 tob1Var5) {
        super(1);
        this.a = (byte) 2;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = tob1Var;
        this.f = ven0Var3;
        this.g = tob1Var2;
        this.h = tob1Var3;
        this.b = tob1Var4;
        this.i = tob1Var5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.b = obj6;
        this.i = obj7;
        this.c = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi1(m441 m441Var, iu30 iu30Var, ls11 ls11Var, zs11 zs11Var, toc tocVar, it8 it8Var, hpc hpcVar, lzn0 lzn0Var) {
        super(1);
        this.a = (byte) 11;
        this.d = m441Var;
        this.b = iu30Var;
        this.e = ls11Var;
        this.f = zs11Var;
        this.g = tocVar;
        this.h = it8Var;
        this.i = hpcVar;
        this.c = lzn0Var;
    }
}
