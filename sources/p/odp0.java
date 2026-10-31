package p;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class odp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ odp0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke() {
        xzc0 xzc0Var;
        ba11 ba11Var;
        fp80 fp80VarB;
        switch (this.a) {
            case 0:
                return new g9r((jqt) ((bcp0) this.b).invoke(), (p3n1) ((bcp0) this.c).invoke(), (xte0) ((bcp0) this.d).invoke(), (kly0) ((yap0) this.e).invoke());
            case 1:
                Context context = (Context) ((cdp0) this.b).invoke();
                fn20 fn20Var = (fn20) ((ycp0) this.c).invoke();
                y4m1 y4m1Var = (y4m1) ((ycp0) this.d).invoke();
                q8n q8nVar = (q8n) ((cdp0) this.e).invoke();
                boolean zB = fn20Var.a.b();
                f2g1 f2g1Var = new f2g1(new s0o1(context, jz40.c), (byte) 15);
                if (!zB) {
                    return new u1b1((Object) null, (byte) 8);
                }
                llm llmVarH = us71.h(q8nVar);
                fn31.T(llmVarH, (o8n) null, 0, new cyl1(y4m1Var, f2g1Var, (lnm) null, (byte) 0), 3);
                fn31.T(llmVarH, (o8n) null, 0, new cyl1(f2g1Var, y4m1Var, (lnm) null, (byte) 1), 3);
                fn31.T(llmVarH, (o8n) null, 0, new cyl1(y4m1Var, f2g1Var, (lnm) null, (byte) 2), 3);
                fn31.T(llmVarH, (o8n) null, 0, new cyl1(f2g1Var, y4m1Var, (lnm) null, (byte) 3), 3);
                return new u1b1(llmVarH, (byte) 8);
            case 2:
                ((ovd) this.d).invoke(Float.valueOf((((-qui1.d(((tui1) this.b).b())) / ((Number) ((gf6) this.c).invoke()).floatValue()) * 0.05f) + ((Number) ((o95) this.e).e()).floatValue()));
                return rih1.a;
            case 3:
                der0 der0Var = (der0) this.b;
                return new air0(der0Var.d, der0Var.a.l, der0Var.c, (mr20) null, (Context) this.c, (ViewGroup) this.d, (Bundle) null, (x8c0) this.e, 8);
            case 4:
                if (((hxa0) this.b).c instanceof xxa0) {
                    ((iu30) this.e).invoke(new axa0(((qwr0) this.d).a(((xk) this.c).f(dl.b).a)));
                    return rih1.a;
                }
                eg.m("ParentalControlPageContentV2 only supports ParentalConsent flows");
                return null;
            case 5:
                phi0 phi0Var = (phi0) this.b;
                fn31.T(cto1.q((dg30) phi0Var.b), (q8n) phi0Var.f, 0, new zvu0(phi0Var, (String) this.c, (dwu0) this.d, (rss) this.e, (lnm) null, (byte) 1), 2);
                return rih1.a;
            case 6:
                qzu0 qzu0Var = (qzu0) this.b;
                y131 y131Var = (y131) this.c;
                c6h1 c6h1Var = (c6h1) this.d;
                z2r z2rVar = (z2r) this.e;
                y2r y2rVar = z2rVar.a;
                gzu0 gzu0Var = new gzu0();
                List list = qzu0Var.q0;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ml90) ((j0v0) it.next()).c.g(gzu0Var)).create());
                }
                Set setP1 = o7h.p1(q7h.V(arrayList));
                List list2 = qzu0Var.p0;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((akj0) ((j0v0) it2.next()).c.g(gzu0Var)).create());
                }
                joc0 joc0Var = new joc0(setP1, o7h.p1(q7h.V(arrayList2)));
                rrc0 rrc0Var = new rrc0(dm61.B0(new dlc0[]{dlc0.b, dlc0.d, dlc0.c, dlc0.e, dlc0.g, dlc0.t, dlc0.a, y2rVar.e ? dlc0.f : null}));
                r3d0 r3d0VarA = qzu0Var.j.a(y131Var.d);
                qzu0Var.k.a = r3d0VarA;
                haa0 haa0VarA = qzu0Var.m.a.a(y131Var.d);
                qzu0Var.p.a = haa0VarA;
                jpp jppVar = qzu0Var.D;
                Bundle bundle = qzu0Var.E0;
                boolean z = qzu0Var.l.a() instanceof ybr;
                uap uapVar = (uap) jppVar.a.c;
                b7n b7nVar = (b7n) ((zyc0) uapVar.I).j.get();
                c8o.l(b7nVar);
                String strH = uapVar.h();
                zyc0 zyc0Var = (zyc0) uapVar.I;
                xrc0 xrc0Var = (xrc0) zyc0Var.p.get();
                c8o.l(xrc0Var);
                iac0 iac0Var = ((q7r0) uapVar.H).d.c;
                c8o.m(iac0Var);
                u9c0 u9c0VarQ = cto1.q(iac0Var);
                iz00 iz00Var = (iz00) zyc0Var.D.get();
                c8o.l(iz00Var);
                ezu0 ezu0Var = (ezu0) zyc0Var.X.get();
                c8o.l(ezu0Var);
                roc0 roc0Var = new roc0(b7nVar, strH, xrc0Var, u9c0VarQ, iz00Var, ezu0Var, (wen0) uapVar.i.get(), r3d0VarA, haa0VarA, bundle, z, joc0Var, z2rVar, rrc0Var);
                qzu0Var.G0 = roc0Var;
                wp20 wp20Var = qzu0Var.h;
                String str = y131Var.b;
                c8c0 c8c0Var = y131Var.h;
                Set set = y2rVar.g;
                boolean z2 = y2rVar.c;
                b0d0 b0d0Var = (b0d0) wp20Var.d;
                EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) wp20Var.e;
                huz huzVar = new huz(z6x.a, (byte) 10);
                iac0 iac0Var2 = (iac0) wp20Var.b;
                ruz ruzVar = (ruz) wp20Var.a;
                huz huzVar2 = new huz(set, (byte) 10);
                huz huzVar3 = new huz(b7x.a, (byte) 10);
                bnj1 bnj1Var = (bnj1) wp20Var.c;
                mr20 mr20VarU = rqt0.u(new mnc0(rqt0.u(hu20.e(bnj1Var.b, new vmj1((byte) 0, bnj1Var, str, (lnm) null))), (byte) 6));
                huz huzVar4 = new huz(rrc0Var, (byte) 10);
                pd00 pd00Var = new pd00(haa0VarA.o(str), z2, (byte) 2);
                if (c8c0Var == c8c0.d) {
                    xzc0Var = xzc0.a;
                } else {
                    xzc0Var = c8c0Var == c8c0.a ? xzc0.b : xzc0.c;
                }
                qzu0Var.D0 = b0d0Var.a(str, pd00Var, huzVar, iac0Var2, ruzVar, new huz(xzc0Var, (byte) 10), r3d0VarA.c(str), huzVar2, playOrigin, huzVar3, mr20VarU, huzVar4);
                hpp hppVar = qzu0Var.B;
                n6r0 n6r0Var = c6h1Var.a;
                pix0 pix0Var = (pix0) ((zyc0) ((uap) hppVar.a.c).I).i0.get();
                c8o.l(pix0Var);
                l0x0 l0x0Var = new l0x0(pix0Var, roc0Var, n6r0Var);
                qzu0Var.H0 = l0x0Var;
                qzu0Var.v.a = (bpb1) l0x0Var.c;
                ipp ippVar = qzu0Var.C;
                String str2 = y131Var.d;
                String str3 = y131Var.b;
                uap uapVar2 = (uap) ippVar.a.c;
                zyc0 zyc0Var2 = (zyc0) uapVar2.I;
                yqg yqgVar = (yqg) zyc0Var2.e.get();
                c8o.l(yqgVar);
                Context context2 = (Context) zyc0Var2.f.get();
                c8o.l(context2);
                ye90 ye90Var = new ye90(context2, yqgVar);
                zyc0 zyc0Var3 = (zyc0) uapVar2.I;
                yqg yqgVar2 = (yqg) zyc0Var3.e.get();
                c8o.l(yqgVar2);
                q8n q8nVar2 = (q8n) zyc0Var3.c.get();
                c8o.l(q8nVar2);
                q8n q8nVarB = zyc0Var3.b();
                c8o.l(q8nVarB);
                cgb0 cgb0Var = new cgb0(ye90Var, yqgVar2, q8nVar2, q8nVarB, str2, str3);
                qzu0Var.b(cgb0Var, "internal last visited component");
                qzu0Var.I0 = cgb0Var;
                qzu0Var.b(new pzu0(qzu0Var, y131Var), "internal player");
                return rih1.a;
            case 7:
                n3z n3zVar = (n3z) this.e;
                g4v0 g4v0Var = (g4v0) this.b;
                if (!g4v0Var.g) {
                    j7s j7sVar = g4v0Var.e;
                    return j7sVar.b ? qmo1.t(new ian0(j7sVar, (lnm) null, (byte) 14)) : w6d1.q(t5p1.j(yoi1.g(((o241) j7sVar.c).a.map(qs10.e1)), 3), new hzu0(n3zVar.h, j7sVar, (byte) 13));
                }
                eep eepVar = g4v0Var.f;
                d0r d0rVar = (d0r) this.c;
                String str4 = ((wto) this.d).a;
                eepVar.getClass();
                o3r o3rVarO = w3p1.o(new l4r(new xv00(rc11.a.b(l1z.class)), 2, t5b0.b, new j4r(jqa0.c1), t5b0.c), jqa0.d1);
                d1z d1zVar = n3zVar.h;
                return w6d1.q(d3p1.E(d0rVar, o3rVarO, str4), jqa0.e1);
            case 8:
                tob1 tob1Var = (tob1) this.d;
                vhv0 vhv0Var = (vhv0) this.b;
                long j = 0;
                if (vhv0Var.g > 0 && ((Boolean) tob1Var.getValue()).booleanValue() && ((xhv0) this.c).g.b()) {
                    j = 259200000;
                }
                String str5 = vhv0Var.a;
                String str6 = vhv0Var.b;
                String str7 = vhv0Var.c;
                String str8 = vhv0Var.d;
                dq70 dq70Var = vhv0Var.e;
                civ0 civ0Var = new civ0(dq70Var.a, dq70Var.b);
                dq70 dq70Var2 = vhv0Var.f;
                return new div0(str5, str6, str7, str8, ((Boolean) ((tob1) this.e).getValue()).booleanValue(), civ0Var, new civ0(dq70Var2.a, dq70Var2.b), vhv0Var.g + j, vhv0Var.h, ((Boolean) tob1Var.getValue()).booleanValue());
            case 9:
                ven0 ven0Var = (ven0) this.c;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    fn31.T((c9n) this.b, (o8n) null, 0, new glu0((vu30) this.d, (y7e1) this.e, ven0Var, (lnm) null, (byte) 17), 3);
                }
                return rih1.a;
            case 10:
                iu30 iu30Var = (iu30) this.b;
                ea11 ea11Var = (ea11) this.c;
                if (ea11Var.b) {
                    ba11Var = new ba11((String) this.d);
                } else {
                    ba11Var = !ea11Var.a ? new ba11((String) this.e) : aa11.a;
                }
                iu30Var.invoke(ba11Var);
                return rih1.a;
            case 11:
                s531 s531Var = (s531) this.b;
                i8h1 i8h1Var = s531Var.h;
                g5l0 g5l0Var = (g5l0) this.c;
                x6h1 x6h1VarC = g5l0Var.c.c();
                x6h1VarC.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                d631 d631Var = (d631) this.d;
                ((Handler) this.e).postDelayed(new sl21(s531Var, d631Var, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", d631Var.v), new mmr0("share_id", "fast-track-share-id")})), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null), (byte) 2), 160L);
                return rih1.a;
            case 12:
                String str9 = (String) this.b;
                qe41 qe41Var = (qe41) this.c;
                maa maaVar = (maa) this.d;
                return new rcc(str9, qe41Var, maaVar.getBehavior().c(), maaVar.c().b(), maaVar.getBehavior().b((Object) null, (dts) null, (String) null), this.e);
            case 13:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                int iIncrementAndGet = atomicInteger.incrementAndGet();
                p811 p811Var = (p811) this.c;
                faa0 faa0Var = (faa0) p811Var.a;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ssw0 ssw0Var = (ssw0) this.d;
                p811Var.a = fn31.T(ssw0Var, (o8n) null, 4, new fe6((mr20) this.e, atomicInteger, iIncrementAndGet, ssw0Var, (lnm) null, (byte) 13), 1);
                return rih1.a;
            case 14:
                xtb0 xtb0Var = (xtb0) this.b;
                ptb0 ptb0VarH = xtb0Var.h();
                i25 i25Var = xtb0Var.e;
                qtb0 qtb0Var = (qtb0) o7h.s0(ptb0VarH.l);
                float fIntValue = 0.0f;
                if (qtb0Var != null) {
                    wat watVar = (wat) this.c;
                    tob1 tob1Var2 = (tob1) this.d;
                    tob1 tob1Var3 = (tob1) this.e;
                    int iS = ((err0) i25Var.c).s() + (((err0) i25Var.b).s() * qtb0Var.q);
                    if (((Number) tob1Var2.getValue()).intValue() != 0) {
                        fIntValue = ((((Number) tob1Var3.getValue()).intValue() / ((Number) tob1Var2.getValue()).intValue()) * iS) / watVar.h();
                    }
                }
                return new p3v(fIntValue);
            case 15:
                wat watVar2 = (wat) this.e;
                erl1 erl1Var = (erl1) this.d;
                Integer num = (Integer) this.b;
                return Integer.valueOf(((num != null ? num.intValue() : (int) (((xtb0) this.c).h().g() & 4294967295L)) - erl1Var.c(watVar2)) - erl1Var.d(watVar2));
            case 16:
                ((ven0) this.b).setValue(Boolean.FALSE);
                b6t b6tVar = (k6a1) this.c;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                c4p1.q((y7e1) this.d);
                ((iu30) this.e).invoke(new ncv(""));
                return rih1.a;
            case 17:
                ((ven0) this.d).setValue((kn61) this.b);
                ((ven0) this.e).setValue((Object) null);
                ((hrr0) ((y441) this.c).d).setValue((Object) null);
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((iu30) this.b).invoke(zza1.a);
                fn31.T((c9n) this.c, (o8n) null, 0, new dk01((vy71) this.d, (ven0) this.e, (lnm) null, (byte) 1), 3);
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                xhm1 xhm1Var = (xhm1) this.b;
                if (xhm1Var != null) {
                    ((gdf1) this.d).d.a(xhm1Var, (sjz) this.e);
                }
                ((Function0) this.c).invoke();
                return rih1.a;
            case 20:
                if (((Boolean) ((z2k1) this.b).b.getValue()).booleanValue() && ((d3k) ((ven0) this.e).getValue()) == null) {
                    Function0 function0 = (Function0) this.c;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    ((z2k1) this.b).a.setValue(Boolean.TRUE);
                    ((gdf1) this.d).l = true;
                }
                return rih1.a;
            case 21:
                ((ven0) this.b).setValue(Boolean.FALSE);
                iu30 iu30Var2 = (iu30) this.c;
                guf1 guf1Var = (guf1) this.d;
                iu30Var2.invoke(guf1Var.e ? new duf1(ebp1.o(guf1Var.f, Long.valueOf(((yqg) ((yup0) this.e).c).b()))) : cuf1.a);
                return rih1.a;
            case 22:
                r3g1 r3g1Var = (r3g1) this.b;
                r3g1Var.d = (ArrayList) this.c;
                Iterator it3 = ((ArrayList) this.d).iterator();
                while (it3.hasNext()) {
                    ((Runnable) it3.next()).run();
                }
                Iterator it4 = ((ArrayList) this.e).iterator();
                while (it4.hasNext()) {
                    r3g1Var.i(((Number) it4.next()).intValue());
                }
                return rih1.a;
            case 23:
                Boolean boolValueOf = Boolean.valueOf((((xtb0) this.b).j.b() || ((fgz0) this.c).b()) && !((Boolean) ((ven0) this.d).getValue()).booleanValue());
                Boolean bool = (Boolean) ((tob1) this.e).getValue();
                bool.booleanValue();
                return new mmr0(boolValueOf, bool);
            case 24:
                wph1 wph1Var = (wph1) this.b;
                fn31.T(wph1Var.e, (o8n) null, 0, new wba1((mvh1) this.c, wph1Var, (vph1) this.d, (ven0) this.e, (lnm) null, (byte) 11), 3);
                return rih1.a;
            case 25:
                ven0 ven0Var2 = (ven0) this.d;
                if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                    o0i o0iVar = (o0i) ((q9l1) this.b).c.getValue();
                    hp80 hp80Var = o0iVar != null ? o0iVar.e : null;
                    ven0 ven0Var3 = (ven0) this.e;
                    bcl1 bcl1Var = (bcl1) this.c;
                    if (hp80Var != null) {
                        bcl1Var.getClass();
                        fp80VarB = hp80Var.b();
                    } else {
                        fp80VarB = null;
                    }
                    p3m0 p3m0VarH = bcl1Var.h(fp80VarB);
                    x6h1 x6h1VarC2 = p3m0VarH.a.c();
                    x6h1VarC2.i.add(new a7h1("watch_feed_component", "vertical_onboarding", (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = p3m0VarH.b.b.c;
                    ven0Var3.setValue(bcl1Var.b.p(k7h1Var.a(), Collections.singleton(c3h1.b)));
                }
                return rih1.a;
            case 26:
                ((ven0) this.b).setValue(ckl1.a);
                ((ven0) this.c).setValue(Boolean.TRUE);
                ven0 ven0Var4 = (ven0) this.d;
                ven0Var4.setValue(Integer.valueOf(((Number) ven0Var4.getValue()).intValue() + 1));
                WebView webView = (WebView) ((ven0) this.e).getValue();
                if (webView != null) {
                    webView.reload();
                }
                return rih1.a;
            case 27:
                l8m1 l8m1Var = (l8m1) this.c;
                if (((Boolean) ((ven0) this.d).getValue()).booleanValue() && ((Boolean) ((ven0) this.e).getValue()).booleanValue()) {
                    ((o0i) this.b).d.A();
                    m0t.a(l8m1Var.g, 7);
                    l8m1Var.i.a(dcl1.a);
                }
                return rih1.a;
            case 28:
                String str10 = (String) this.b;
                if (str10 != null) {
                    fn31.T((c9n) this.c, (o8n) null, 0, new xoh1((lbm1) this.d, str10, (ven0) this.e, (lnm) null, (byte) 12), 3);
                }
                return rih1.a;
            default:
                ((ContentResolver) this.b).unregisterContentObserver((sp7) this.c);
                ((AccessibilityManager) this.d).removeTouchExplorationStateChangeListener((vcm1) this.e);
                return rih1.a;
        }
    }
}
