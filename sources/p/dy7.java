package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.settings.settings.SettingsDelegate;
import com.spotify.share.audioparamstestpage.a;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dy7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy7(Function0 function0, tm21 tm21Var, ArrayList arrayList, y7e1 y7e1Var, scx scxVar, ven0 ven0Var) {
        super(0);
        this.a = (byte) 9;
        this.c = function0;
        this.e = tm21Var;
        this.f = arrayList;
        this.b = y7e1Var;
        this.g = scxVar;
        this.d = ven0Var;
    }

    public final Object invoke() {
        Object eff0Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = 4;
        int i2 = 3;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        int i3 = 0;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj4;
                ven0Var.setValue((Object) null);
                fn31.T((c9n) obj5, (o8n) null, 0, new wc5((a) obj, new iy7(((y7e1) obj6).d().d.toString(), ((tx7) ((ven0) obj3).getValue()).b, (sx7) ((ven0) obj2).getValue()), ven0Var, (lnm) null, (byte) 16), 3);
                return rih1Var;
            case 1:
                fta ftaVar = (fta) obj6;
                fn31.T(cto1.q((dg30) ftaVar.b), (o8n) null, 0, new af0(ftaVar, (String) obj5, (String) obj4, (syf) obj3, (String) obj2, (ahh) obj, (lnm) null), 3);
                return rih1Var;
            case 2:
                wwk0 wwk0Var = (wwk0) obj5;
                wwk0Var.getClass();
                x6h1 x6h1VarC = wwk0Var.b.c();
                x6h1VarC.i.add(new a7h1("discard_changes_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) obj6).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), wwk0Var.a, System.currentTimeMillis()), (xj61) null);
                ((ven0) obj4).setValue(Boolean.TRUE);
                ((ven0) obj3).setValue(Boolean.FALSE);
                b6t b6tVar = (k6a1) obj2;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((Function0) obj).invoke();
                return rih1Var;
            case 3:
                asn asnVar = (asn) obj6;
                i8h1 i8h1Var = (i8h1) asnVar.c;
                zql0 zql0Var = (zql0) obj4;
                zql0Var.getClass();
                x6h1 x6h1VarC2 = zql0Var.a.c();
                x6h1VarC2.i.add(new a7h1("turn_off_update_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = (String) obj3;
                fn31.T((c9n) obj5, (o8n) null, 0, new dio(asnVar, str, (Function0) obj2, (iu30) obj, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), null, (byte) 1), 3);
                return rih1Var;
            case 4:
                Boolean bool = Boolean.FALSE;
                ((ven0) obj4).setValue(bool);
                o95 o95Var = (o95) obj6;
                c9n c9nVar = (c9n) obj5;
                if (((Number) o95Var.e()).floatValue() > 80.0f) {
                    fn31.T(c9nVar, (o8n) null, 0, new clo((ven0) obj3, o95Var, (lnm) null, (byte) 4), 3);
                    ((iu30) obj).invoke(mvj0.a);
                    ((ven0) obj2).setValue(bool);
                } else {
                    fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 8), 3);
                }
                return rih1Var;
            case 5:
                String str2 = (String) obj;
                Bundle bundle = (Bundle) obj2;
                ods odsVar = (ods) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj6;
                if (str4 == null) {
                    odsVar.b.d(str3, (tv80) obj3, bundle);
                } else {
                    c690 c690Var = odsVar.c;
                    if (bundle == null) {
                        c690Var.b(str4, str3, str2);
                    } else {
                        c690Var.c(bundle, str4, str3, str2);
                    }
                }
                return rih1Var;
            case 6:
                if (!((Boolean) ((ven0) obj4).getValue()).booleanValue() && !((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    if (!((Boolean) ((tob1) obj5).getValue()).booleanValue() || ((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                        ((Function0) obj6).invoke();
                    } else {
                        ((ven0) obj).setValue(Boolean.TRUE);
                    }
                }
                return rih1Var;
            case 7:
                ViewParent parent = ((View) obj6).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                bw91 bw91Var = (bw91) obj;
                bw91Var.getClass();
                ((iu30) obj5).invoke(pv91.r(bw91Var.a, bw91Var).c);
                ((ven0) obj4).setValue((Object) null);
                kaa0.j(0L, (ven0) obj3);
                ((ven0) obj2).setValue((Object) null);
                return rih1Var;
            case 8:
                yyc0 yyc0Var = (yyc0) obj6;
                byp bypVar = yyc0Var.e;
                k331 k331Var = ((zou0) obj5).Y;
                cbr0 cbr0Var = yyc0Var.f;
                qzu0 qzu0Var = yyc0Var.b;
                bve0 bve0Var = yyc0Var.d;
                ViewGroup viewGroup = (ViewGroup) obj4;
                Bundle bundle2 = (Bundle) obj3;
                LayoutInflater layoutInflater = (LayoutInflater) obj2;
                cir0 cir0Var = (cir0) obj;
                n6r0 n6r0Var = bve0Var.c;
                if (n6r0Var == null) {
                    n57.e("PageIdentifier is null when creating UIHolder");
                } else {
                    cbr0Var.a(new bn70(n6r0Var, bve0Var.getViewUri(), (nar0) null));
                    t8h1 t8h1VarI = cwl1.I(cir0Var.g());
                    if (t8h1VarI != null) {
                        t8h1.l(t8h1VarI, n6r0Var, bve0Var.getViewUri().a());
                    }
                }
                if (!(k331Var instanceof y131)) {
                    eg.n("Unexpected Result ", k331Var, " in loaded path.");
                    return null;
                }
                return (f4h1) ((l5d0) bypVar.b).c(h5d0.e1, new dbp0(bypVar, cir0Var, k331Var, qzu0Var, viewGroup, bundle2, layoutInflater, cbr0Var, (byte) 7));
            case 9:
                ((Function0) obj5).invoke();
                ven0 ven0Var2 = (ven0) obj4;
                tm21 tm21Var = (tm21) obj3;
                if (tm21Var instanceof sm21) {
                    ArrayList arrayList = (ArrayList) obj2;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((y7e1) it.next()).d().d.toString());
                    }
                    eff0Var = new fff0(arrayList2);
                } else {
                    if (!u890.j(tm21Var, rm21.a)) {
                        eg.o();
                        return null;
                    }
                    eff0Var = new eff0(((y7e1) obj6).d().d.toString());
                }
                ven0Var2.setValue(eff0Var);
                ((scx) obj).a();
                return rih1Var;
            case 10:
                ceo ceoVar = uvg0.a;
                ((ven0) obj4).setValue(Boolean.FALSE);
                ven0 ven0Var3 = (ven0) obj3;
                float fG = uvg0.g(ven0Var3);
                ven0 ven0Var4 = (ven0) obj2;
                float fH = uvg0.h(ven0Var4);
                Float fValueOf = Float.valueOf(0.0f);
                ven0Var3.setValue(fValueOf);
                ven0Var4.setValue(fValueOf);
                fn31.T((c9n) obj5, (o8n) null, 0, new ovg0((o95) obj6, fG, (o95) obj, fH, null, (byte) 2), 3);
                return rih1Var;
            case 11:
                f6h0 f6h0Var = (f6h0) obj5;
                cnc0 cnc0Var = (cnc0) new fad0(new hvp0((q7r0) ((zl5) ((frp) obj6).a.c).d, (byte) 4), f6h0Var.l, new ntf0(obj3, (Object) f6h0Var, obj2, obj, (byte) 4)).c;
                h3h1 h3h1Var = f6h0Var.s;
                zl5 zl5Var = (zl5) ((jrp) obj4).a.c;
                b6h0 b6h0Var = (b6h0) ((h6h0) zl5Var.b).h.get();
                c8o.l(b6h0Var);
                m6q m6qVar = (m6q) ((h6h0) zl5Var.b).x.get();
                c8o.l(m6qVar);
                h6h0 h6h0Var = (h6h0) zl5Var.b;
                o6q o6qVar = (o6q) h6h0Var.y.get();
                c8o.l(o6qVar);
                kvp kvpVar = (kvp) h6h0Var.i0.get();
                c8o.l(kvpVar);
                mpa1 mpa1Var = (mpa1) ((jly0) zl5Var.w).get();
                g38 g38Var = (g38) h6h0Var.Z.get();
                c8o.l(g38Var);
                r3d r3dVar = (r3d) h6h0Var.j0.get();
                c8o.l(r3dVar);
                x6h0 x6h0Var = (x6h0) zl5Var.c;
                i8h1 i8h1Var2 = (i8h1) h6h0Var.X.get();
                c8o.l(i8h1Var2);
                j2e0 j2e0Var = new j2e0(i8h1Var2);
                lzn0 lzn0Var = (lzn0) h6h0Var.S.get();
                c8o.l(lzn0Var);
                ruz ruzVarA = ((cyp) ((jly0) zl5Var.h).get()).a();
                p7h0 p7h0Var = (p7h0) h6h0Var.R.get();
                c8o.l(p7h0Var);
                return new n7h0(b6h0Var, m6qVar, o6qVar, kvpVar, mpa1Var, g38Var, r3dVar, x6h0Var, j2e0Var, lzn0Var, ruzVarA, p7h0Var, cnc0Var, h3h1Var);
            case 12:
                err0 err0Var = (hdn0) obj6;
                ven0 ven0Var5 = (ven0) obj4;
                faa0 faa0Var = (faa0) ven0Var5.getValue();
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                err0 err0Var2 = err0Var;
                err0Var2.t(err0Var2.s() + 1);
                if (err0Var2.s() == 3) {
                    ((Function0) ((ven0) obj3).getValue()).invoke();
                }
                ven0Var5.setValue(fn31.T((c9n) obj5, (o8n) null, 0, new wkk0(err0Var, (ven0) obj2, (ven0) obj, null, (byte) 9), 3));
                return rih1Var;
            case 13:
                r091 r091Var = (r091) ((ven0) obj4).getValue();
                if (r091Var != null) {
                    r091Var.c();
                }
                ((ttm0) obj6).b((zau0) obj5);
                Boolean bool2 = Boolean.FALSE;
                ((ven0) obj3).setValue(bool2);
                ((ven0) obj2).setValue(bool2);
                ((ven0) obj).setValue(bool2);
                return rih1Var;
            case 14:
                return new dj(((obp0) obj6).b.Q1, ((obp0) obj5).b.l, ((obp0) obj4).b.k2, ((obp0) obj3).b.F1, ((obp0) obj2).b.c, (q8n) ((ibp0) obj).invoke());
            case 15:
                return new vf2((q44) ((qbp0) obj6).invoke(), (Flowable) ((qbp0) obj5).invoke(), (ov20) ((qbp0) obj4).invoke(), (qns0) ((qbp0) obj3).invoke(), (t8u0) ((qbp0) obj2).invoke(), (q8n) ((qbp0) obj).invoke());
            case 16:
                Context context = (Context) ((edp0) obj6).invoke();
                ((edp0) obj5).invoke();
                wzn wznVar = new wzn(new zwg(context, (r5h) ((edp0) obj4).invoke(), (i8h1) ((edp0) obj3).invoke(), (iyc0) ((edp0) obj2).invoke(), (agc0) ((edp0) obj).invoke()), false);
                return new p4h((b2p) wznVar.b, (b2p) wznVar.c, (b2p) wznVar.d, brt.y());
            case 17:
                ((xcp0) obj6).invoke();
                Observable observable = (Observable) ((xcp0) obj5).invoke();
                o1r o1rVar = (o1r) ((xcp0) obj4).invoke();
                t1r t1rVar = (t1r) ((xcp0) obj3).invoke();
                s1r s1rVar = (s1r) ((xcp0) obj2).invoke();
                Scheduler scheduler = (Scheduler) ((xcp0) obj).invoke();
                j7p j7pVar = new z2p(new lo9(observable, o1rVar, t1rVar, s1rVar, scheduler)).a;
                a680 a680Var = new a680();
                a680Var.a = t1rVar;
                a680Var.b = o1rVar;
                a680Var.c = observable;
                a680Var.d = scheduler;
                a680Var.e = new idd1(new l1k(0, j7pVar, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21));
                a680Var.f = new vku();
                return new w(a680Var);
            case 18:
                return new km0((Context) ((abp0) obj6).invoke(), ((ry9) obj5).b.a, ((ry9) obj4).b.L, ((ry9) obj3).b.M, ((ry9) obj2).b.d0, ((ry9) obj).b.r);
            case 19:
                g0l g0lVar = (g0l) ((fdp0) obj6).invoke();
                ((fdp0) obj5).invoke();
                t8u0 t8u0Var = (t8u0) ((fdp0) obj4).invoke();
                ((fdp0) obj3).invoke();
                ar51 ar51Var = (ar51) ((fdp0) obj2).invoke();
                i8h1 i8h1Var3 = (i8h1) ((fdp0) obj).invoke();
                return new c1y(ar51Var.a(((cyp) new z2p(new qmr(g0lVar, t8u0Var, ar51Var, i8h1Var3)).a.get()).a()), new aod(i8h1Var3), g0lVar);
            case 20:
                return new ed30((qrt) ((zcp0) obj6).invoke(), (t2j0) ((zcp0) obj5).invoke(), (vfb0) ((zcp0) obj4).invoke(), (yqg) ((zcp0) obj3).invoke(), (md4) ((zcp0) obj2).invoke(), (y2g0) ((zcp0) obj).invoke());
            case 21:
                ov20 ov20Var = (ov20) ((fdp0) obj6).invoke();
                kly0 kly0Var = (kly0) ((hbp0) obj5).invoke();
                ez11 ez11Var = (ez11) ((hbp0) obj4).invoke();
                krh krhVar = (krh) ((fdp0) obj3).invoke();
                t2j0 t2j0Var = (t2j0) ((fdp0) obj2).invoke();
                llm llmVarE = smo1.e(flo1.l(guo1.B(), (q8n) ((fdp0) obj).invoke()).y(new z8n("GatingSessionService")));
                return new u940(llmVarE, new s940(ov20Var, (h2i1) null, ez11Var, krhVar, llmVarE, kly0Var, t2j0Var, new xj4(false, false, ez11Var), Optional.empty()));
            case 22:
                return new g9r((bz81) ((abp0) obj6).invoke(), (ltp0) ((abp0) obj5).invoke(), ((ry9) obj4).b.g0, (ecl) ((abp0) obj3).invoke(), (hb4) ((abp0) obj2).invoke(), (q8n) ((abp0) obj).invoke());
            case 23:
                return new km0((r2b1) ((wbp0) obj6).invoke(), (g3s0) ((wbp0) obj5).invoke(), (n2b1) ((wbp0) obj4).invoke(), (g0l) ((wbp0) obj3).invoke(), (Scheduler) ((wbp0) obj2).invoke(), (Scheduler) ((wbp0) obj).invoke());
            case 24:
                luk lukVar = (luk) ((xbp0) obj6).invoke();
                phi0 phi0Var = new phi0(lukVar, (o241) ((xbp0) obj5).invoke(), (luw0) ((xbp0) obj4).invoke(), ((rbp0) obj3).b.z(), (dma1) ((xbp0) obj2).invoke(), (Scheduler) ((xbp0) obj).invoke(), (byte) 4);
                cp31 cp31Var = new cp31();
                cp31Var.a = phi0Var;
                cp31Var.b = new ywp(cp31Var, i3, b2);
                cp31Var.c = new ywp(cp31Var, b2, b2);
                cp31Var.d = new ywp(cp31Var, 2, b2);
                cp31Var.e = new ywp(cp31Var, i2, b2);
                cp31Var.f = new ywp(cp31Var, i, b2);
                return new bxp0(new fw4(false, lukVar), (ywp) cp31Var.b, (ywp) cp31Var.c, (ywp) cp31Var.d, (ywp) cp31Var.e, (ywp) cp31Var.f);
            case 25:
                return new g8u0((yqg) ((gdp0) obj6).invoke(), (kly0) ((hdp0) obj5).invoke(), (zuw0) ((hdp0) obj4).invoke(), (add) ((gdp0) obj3).invoke(), (Flowable) ((gdp0) obj2).invoke(), (q8n) ((idp0) obj).invoke());
            case 26:
                return new p1v0(new dw4(false, true, (luk) ((qcp0) obj6).invoke()), (onf0) ((qcp0) obj5).invoke(), (pmf0) ((qcp0) obj4).invoke(), (nmf0) ((qcp0) obj3).invoke(), (kyl1) ((qcp0) obj2).invoke(), (Scheduler) ((qcp0) obj).invoke());
            case 27:
                return new vf2((r0z0) ((zbp0) obj6).invoke(), (r0z0) ((zbp0) obj5).invoke(), ((sap0) obj4).b.d(), (xxy0) ((zbp0) obj3).invoke(), (zg4) ((zbp0) obj2).invoke(), (rvy0) ((zbp0) obj).invoke());
            case 28:
                xrc0 xrc0Var = ((ybp0) obj6).b.d;
                p241 p241Var = (o241) ((zbp0) obj5).invoke();
                ((zbp0) obj4).invoke();
                rpm1 rpm1Var = (rpm1) ((zbp0) obj3).invoke();
                ((zbp0) obj2).invoke();
                r241 r241Var = (r241) ((zbp0) obj).invoke();
                c8o.l(rpm1Var);
                xaz0 xaz0Var = new xaz0(rpm1Var, (byte) 10);
                c8o.l(xrc0Var);
                zzx zzxVar = new zzx(xrc0Var);
                c8o.l(p241Var);
                c8o.l(r241Var);
                return new km0(xaz0Var, zzxVar, p241Var.a("your-episodes-remove-played-episodes", "never").map(rtw0.d).map(o9x0.g));
            default:
                return new eu61((a8n) ((xap0) obj6).invoke(), (SharedCosmosRouterApi) ((xap0) obj5).invoke(), (p5n) ((xap0) obj4).invoke(), (obl) ((xap0) obj3).invoke(), (String) ((y52) obj2).invoke(), (SettingsDelegate) ((bbp0) obj).invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy7(Object obj, Object obj2, Object obj3, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.g = obj3;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy7(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(0);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy7(c9n c9nVar, ven0 ven0Var, hdn0 hdn0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4) {
        super(0);
        this.a = (byte) 12;
        this.c = c9nVar;
        this.d = ven0Var;
        this.b = hdn0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = ven0Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy7(c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, o95 o95Var, o95 o95Var2) {
        super(0);
        this.a = (byte) 10;
        this.c = c9nVar;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.b = o95Var;
        this.g = o95Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy7(i8h1 i8h1Var, wwk0 wwk0Var, k6a1 k6a1Var, Function0 function0, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 2;
        this.b = i8h1Var;
        this.c = wwk0Var;
        this.f = k6a1Var;
        this.g = function0;
        this.d = ven0Var;
        this.e = ven0Var2;
    }
}
