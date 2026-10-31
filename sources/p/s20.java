package p;

import android.app.Activity;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.spotify.contribution.repositoryimpl.c;
import com.spotify.contribution.repositoryimpl.f;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import io.reactivex.rxjava3.core.Observable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s20(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException, IOException {
        qbk qbkVarG;
        ni20 ni20VarA;
        ni20 ni20VarA2;
        zkt0 zkt0Var;
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        lnm lnmVarB = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (epb1) obj2;
            case 1:
                List<mmr0> list = (List) obj;
                s60 s60Var = (s60) obj2;
                gnq0 gnq0Var = s60Var.l.c;
                if (gnq0Var.a.isEmpty()) {
                    s60Var.d(sqg0.T(list));
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    s60Var.k = linkedHashSet;
                    try {
                        xkg0 xkg0Var = new xkg0();
                        for (mmr0 mmr0Var : list) {
                            jh5 jh5Var = (jh5) mmr0Var.a;
                            k3r k3rVar = (k3r) mmr0Var.b;
                            if (!gnq0Var.b.containsKey(jh5Var)) {
                                linkedHashSet.add(jh5Var);
                                if (gnq0Var.a.remove(jh5Var) != null) {
                                    gnq0Var.b(jh5Var);
                                }
                                xkg0Var.put(jh5Var, k3rVar);
                            }
                        }
                        xkg0 xkg0VarB = xkg0Var.b();
                        s60Var.k = null;
                        if (!xkg0VarB.isEmpty()) {
                            s60Var.d(xkg0VarB);
                        }
                    } catch (Throwable th) {
                        s60Var.k = null;
                        throw th;
                    }
                }
                return rih1Var;
            case 2:
                j0b j0bVar = (j0b) obj2;
                return bqn1.u(new hp9(j0bVar, (byte) 9), new gaa(j0bVar, (byte) 11));
            case 3:
                return new h3h1(new cb1((r6h1) obj2, (byte) 8));
            case 4:
                return new p3v(((vzq0) obj).b((flb0) obj2));
            case 5:
                udk udkVar = (udk) obj;
                tdk tdkVar = (tdk) obj2;
                return hu20.e(h5p1.s(hu20.e(d3p1.H(tdkVar.S0, tdkVar.V0, udkVar), new b7c((lnm) null, tdkVar, (byte) 13)), tdkVar.c.w(udkVar.a()), tdkVar.U0, new r20(tdkVar, (lnm) null, (byte) 12)), new kdk(tdkVar, new l811(), new p811(), udkVar, (lnm) null, (byte) 0));
            case 6:
                wcm wcmVar = (wcm) obj;
                idm idmVar = (idm) obj2;
                o241 o241Var = idmVar.d;
                String str = wcmVar.a;
                String str2 = wcmVar.j;
                Set set = s4b1.f;
                boolean zG = uic.g(str, blc0.ti);
                f8b f8bVar = idmVar.c;
                if (zG) {
                    List listX = k4p1.x(new p7b(str, (str2 == null || ihc1.y0(str2)) ? m7b.a : new n7b(str2)));
                    f8bVar.getClass();
                    qbkVarG = new qbk(h4p1.l(new vs0(listX, f8bVar, false, (lnm) null, (byte) 13)), str, (byte) 15);
                } else {
                    qbkVarG = yoi1.g(f8bVar.a(k4p1.x(str)).map(new k9p1(str, (byte) 5)));
                }
                Observable observableA = ((p241) o241Var).a("obfuscate-restricted-tracks", "0");
                j561 j561Var = j561.T0;
                Observable map = observableA.map(j561Var);
                Boolean bool = Boolean.FALSE;
                return h5p1.r(qbkVarG, yoi1.g(map.onErrorReturnItem(bool)), idmVar.a.a(), hu20.e(yoi1.g(((p241) o241Var).a("obfuscate-restricted-tracks", "0").map(j561Var).onErrorReturnItem(bool)), new qd0((lnm) null, wcmVar, idmVar, (byte) 10)), new ddm(wcmVar, (lnm) null, (byte) 0));
            case 7:
                Set set2 = (Set) obj;
                Set<mqm> set3 = set2;
                ArrayList arrayList = new ArrayList(q7h.U(set3, 10));
                for (mqm mqmVar : set3) {
                    arrayList.add(new jpm(mqmVar.b(), mqmVar.a()));
                }
                f fVar = (f) ((qum) obj2);
                fVar.getClass();
                return new epm(h4p1.l(new c(fVar, arrayList, (lnm) null)), set2, (byte) 2);
            case 8:
                return h4p1.l(new fmn((bmn) obj, (gmn) obj2, null));
            case 9:
                yjo yjoVar = (yjo) obj;
                hko hkoVar = (hko) obj2;
                kko kkoVar = hkoVar.d;
                return h5p1.s(new iib(kkoVar.a(), yjoVar, (byte) 4), hkoVar.e ? new qbk(kkoVar.a(), yjoVar, (byte) 23) : yoi1.g(hkoVar.a.c(yjoVar.a, k4p1.x(yjoVar.c), true).map(new sun(yjoVar, (byte) 1))), yoi1.g(((p241) hkoVar.c).b("disable-blocked-content").map(fkj0.N0)), new eko(4, lnmVarB, b2));
            case 10:
                return Boolean.valueOf(u890.j(((gmc) ((mmr0) obj).a).a, ((elc) obj2).a.a));
            case 11:
                ((rzq) obj2).n(sqg0.T((List) obj));
                return rih1Var;
            case 12:
                Boolean bool2 = (hoj0) ((Map) obj).get(((aq21) obj2).a);
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                return Boolean.valueOf(bool2 instanceof goj0);
            case 13:
                PointF pointF = (PointF) obj;
                akr akrVar = (akr) obj2;
                nxb nxbVarA = akrVar.f().a();
                vu30 vu30VarE = nxbVarA != null ? nxbVarA.e() : null;
                if (pointF != null && vu30VarE != null) {
                    lnmVarB = (Boolean) vu30VarE.invoke(Float.valueOf(pointF.x), Float.valueOf(pointF.y));
                }
                if (!u890.j(lnmVarB, Boolean.TRUE) && akrVar.c() && akrVar.p) {
                    akrVar.x = new gxb(3);
                    akrVar.z.add(akrVar.e.b());
                    akrVar.l(5);
                }
                return rih1Var;
            case 14:
                if (!((s7v0) obj).equals(s7v0.a)) {
                    eg.o();
                    return null;
                }
                y0o y0oVarG = tjq.g((tjq) obj2);
                if (y0oVarG != null) {
                    y0oVarG.invoke(x7v0.b);
                    return rih1Var;
                }
                u890.C("eventHandler");
                throw null;
            case 15:
                rau rauVar = (rau) obj2;
                return rauVar.c.a((cir0) obj, rauVar.d);
            case 16:
                String str3 = (String) ((Map) obj2).get(ihc1.e1((String) ((mbh0) obj).a().get(1)).toString());
                return str3 == null ? "" : str3;
            case 17:
                gvu gvuVar = (gvu) obj;
                ovu ovuVar = (ovu) obj2;
                h2v h2vVar = (h2v) ((k2v) ovuVar.a.getStatus().getValue()).a.get(gvuVar.d());
                if (h2vVar == null) {
                    h2vVar = f2v.a;
                }
                h2v h2vVar2 = h2vVar;
                List list2 = ovuVar.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Object obj3 = (qlq0) ((rlq0) ((slq0) it.next()).getStatus().getValue()).a().get(gvuVar.d());
                    if (obj3 == null) {
                        obj3 = olq0.a;
                    }
                    arrayList2.add(obj3);
                }
                return new ivu(h2vVar2, arrayList2, gvuVar.d(), gvuVar.a(), gvuVar.c(), gvuVar.b() ? xuu.a : xuu.b);
            case 18:
                dtw dtwVar = (dtw) obj2;
                t8r0 t8r0Var = dtwVar.x;
                if (t8r0Var == null) {
                    return rih1Var;
                }
                if (((rl1) t8r0Var.b).w()) {
                    t8r0Var = null;
                }
                if (t8r0Var == null) {
                    return rih1Var;
                }
                rl1 rl1Var = (rl1) t8r0Var.b;
                sqw sqwVar = dtwVar.l;
                Object obj4 = dtwVar.f;
                obj4.getClass();
                Object objB = sqwVar.a.a().b(obj4, rl1Var.x(), obj, sqwVar.b());
                if (objB != null) {
                    ztw ztwVarC = sqwVar.c();
                    if (ztwVarC == null) {
                        hhg1.n("Logger factory is not provided by the environment. You can provide it by calling ViewTreeInstrumentationEnvironment.set(view, InstrumentationLoggerFactory) on the root of the page");
                        return null;
                    }
                    lnmVarB = ztwVarC.b(objB);
                }
                rl1Var.q(obj, lnmVarB);
                return rih1Var;
            case 19:
                return j6x.e((j6x) obj2).a((l0i) null);
            case 20:
                e261 e261Var = (e261) obj;
                max maxVar = (max) obj2;
                if (maxVar instanceof hax) {
                    b261.A(e261Var, ((hax) maxVar).a);
                    b261.a(e261Var);
                }
                return rih1Var;
            case 21:
                ((p5t0) obj).f((q5t0) obj2, 0, 0, 0.0f);
                return rih1Var;
            case 22:
                dhg1 dhg1Var = (dhg1) obj;
                aby abyVar = (aby) obj2;
                pay payVar = pay.a;
                pay payVar2 = pay.b;
                if (dhg1Var.f(payVar, payVar2)) {
                    eb91 eb91Var = abyVar.S0.a.b;
                    return (eb91Var == null || (ni20VarA2 = eb91Var.a()) == null) ? xay.d : ni20VarA2;
                }
                if (!dhg1Var.f(payVar2, pay.c)) {
                    return xay.d;
                }
                eb91 eb91Var2 = abyVar.T0.a.b;
                return (eb91Var2 == null || (ni20VarA = eb91Var2.a()) == null) ? xay.d : ni20VarA;
            case 23:
                yly ylyVar = (yly) obj;
                lly llyVar = (lly) obj2;
                EncoreListRow encoreListRow = llyVar.c;
                lvx.s(encoreListRow, ylyVar, llyVar.b, llyVar.d, new yky(llyVar, (byte) 2));
                lnmVarB = ylyVar != null ? op71.j(ylyVar.d) : null;
                if (lnmVarB == null) {
                    lnmVarB = ulb0.a;
                }
                encoreListRow.setVariableMediaWidth(lnmVarB);
                return rih1Var;
            case 24:
                mmr0 mmr0Var2 = (mmr0) obj;
                wxy wxyVar = (wxy) mmr0Var2.a;
                kyy kyyVar = (kyy) obj2;
                yjq yjqVar = kyyVar.U0;
                int iOrdinal = wxyVar.ordinal();
                zkt0 zkt0Var2 = zkt0.c;
                if (iOrdinal == 0) {
                    zkt0Var = zkt0.a;
                } else if (iOrdinal == 1) {
                    zkt0Var = zkt0Var2;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    zkt0Var = zkt0Var2;
                } else {
                    zkt0Var = zkt0.b;
                }
                PlayIndicatorComposeView playIndicatorComposeView = kyyVar.Z0;
                if (zkt0Var != zkt0Var2) {
                    if (playIndicatorComposeView == null) {
                        PlayIndicatorComposeView playIndicatorComposeView2 = new PlayIndicatorComposeView(kyyVar.getContext(), null, 0, 6, null);
                        playIndicatorComposeView2.setId(2131430403);
                        playIndicatorComposeView2.setDuplicateParentStateEnabled(true);
                        playIndicatorComposeView2.setVisibility(8);
                        kyyVar.Z0 = playIndicatorComposeView2;
                        FrameLayout frameLayout = (FrameLayout) yjqVar.d;
                        int i = kyyVar.V0;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                        layoutParams.setMarginEnd(kyyVar.W0);
                        layoutParams.topMargin = kyyVar.X0;
                        frameLayout.addView(playIndicatorComposeView2, 0, layoutParams);
                        playIndicatorComposeView = playIndicatorComposeView2;
                    }
                    playIndicatorComposeView.z(zkt0Var);
                } else if (playIndicatorComposeView != null) {
                    playIndicatorComposeView.z(zkt0Var);
                }
                if (wxyVar == wxy.a || wxyVar == wxy.c) {
                    ((EncoreIconView) yjqVar.e).setVisibility(8);
                    return rih1Var;
                }
                ((EncoreIconView) yjqVar.e).setVisibility(8);
                return rih1Var;
            case 25:
                ((Number) obj).intValue();
                return ((n8h1) obj2).b();
            case 26:
                dc00 dc00Var = (dc00) obj;
                FileOutputStream fileOutputStreamOpenFileOutput = fc00.a((fc00) obj2).a.openFileOutput(dc00Var.getFileName(), 0);
                try {
                    dc00Var.a(fileOutputStreamOpenFileOutput);
                    fileOutputStreamOpenFileOutput.close();
                    return rih1Var;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        u890.p(fileOutputStreamOpenFileOutput, th2);
                        throw th3;
                    }
                }
            case 27:
                cir0 cir0Var = (cir0) obj;
                kpn kpnVar = (kpn) obj2;
                if (kpnVar.b) {
                    j0p1.w(kpnVar.c, fa00.f);
                }
                lbp lbpVar = ((mfp) kpnVar.e).a;
                q7r0 q7r0Var = lbp.a(lbpVar).b;
                Activity activityA = lbp.a(lbpVar).a.a();
                c8o.l(activityA);
                iac0 iac0VarQ = tk00.q(lbp.a(lbpVar).b);
                wgp wgpVarA = lbp.a(lbpVar);
                wgpVarA.getClass();
                qk00 qk00Var = wgpVarA.a;
                ij81 ij81Var = new ij81(sk00.c(wgpVarA.c()), (byte) 17);
                vz20 vz20Var = (vz20) wgpVarA.d.get();
                vz20 vz20Var2 = (vz20) wgpVarA.d.get();
                iac0 iac0VarQ2 = tk00.q(wgpVarA.b);
                luk lukVarB = qk00Var.b();
                c8o.l(lukVarB);
                dgb dgbVar = new dgb(vz20Var2, iac0VarQ2, sk00.a(new b35(lukVarB)), wgpVarA.c());
                luk lukVarB2 = qk00Var.b();
                c8o.l(lukVarB2);
                ho60 ho60Var = new ho60(ij81Var, vz20Var, dgbVar, sk00.a(new b35(lukVarB2)), wgpVarA.c());
                bn70 bn70VarN = tk00.n(lbp.a(lbpVar).c);
                tp60 tp60VarJ = lbp.a(lbpVar).a.j();
                c8o.l(tp60VarJ);
                ur41 ur41Var = (ur41) lbp.a(lbpVar).a.i0.get();
                c8o.l(ur41Var);
                w25 w25VarC = lbp.a(lbpVar).c();
                nhc nhcVar = new nhc((byte) 16);
                c711 c711Var = new c711(lbp.a(lbpVar).k(), (byte) 2);
                uk00 uk00VarK = lbp.a(lbpVar).k();
                lad1 lad1Var = (lad1) lbp.a(lbpVar).a.w1.get();
                c8o.l(lad1Var);
                i8h1 i8h1VarZ = u1n0.z(lbp.a(lbpVar).b);
                ie11 ie11Var = (ie11) lbp.a(lbpVar).a.x1.get();
                c8o.l(ie11Var);
                wen0 wen0Var = (wen0) lbp.a(lbpVar).a.c.get();
                c8o.l(wen0Var);
                return new fl00(activityA, iac0VarQ, ho60Var, bn70VarN, tp60VarJ, ur41Var, w25VarC, nhcVar, c711Var, uk00VarK, lad1Var, i8h1VarZ, ie11Var, wen0Var, f7z.i(lbp.a(lbpVar).c), tk00.z(lbp.a(lbpVar).c), (wk00) lbp.a(lbpVar).e.get(), (cd91) lbp.a(lbpVar).h.get(), lbp.a(lbpVar).f(), cir0Var);
            default:
                return ((um30) obj2).d;
        }
    }
}
