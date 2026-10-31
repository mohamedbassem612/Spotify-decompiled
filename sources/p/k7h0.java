package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider;
import com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k7h0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7h0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((n7h0) obj4).g.a(new k5r((ven0) obj3, (ven0) obj2, (ven0) obj, (byte) 1));
                return rih1Var;
            case 1:
                p410 p410Var = (p410) obj4;
                String str = (String) obj3;
                ItemAlternative itemAlternative = (ItemAlternative) obj2;
                String previewId = itemAlternative.getPreviewId();
                String entityUri = itemAlternative.getEntityUri();
                String str2 = (String) obj;
                ynb0 ynb0Var = (ynb0) p410Var.b;
                bpb1 bpb1Var = (bpb1) p410Var.g;
                if (u890.j(((tah0) bpb1Var.getValue()).a, str)) {
                    p410Var.D();
                } else {
                    if (str2.length() <= 0 || previewId.length() <= 0) {
                        str2 = null;
                    }
                    String strW = str2 != null ? nhc1.W(nhc1.W(str2, "{id}", previewId), "{fmt}", "mp3") : null;
                    if (strW == null) {
                        p410Var.D();
                    } else {
                        zau0 zau0VarC = (zau0) p410Var.d;
                        if (zau0VarC == null) {
                            zau0VarC = ((ttm0) ynb0Var.get()).c(false);
                            p410Var.d = zau0VarC;
                        }
                        if (!((Boolean) zau0VarC.b.getValue()).booleanValue()) {
                            ((ttm0) ynb0Var.get()).a(zau0VarC);
                        }
                        r091 r091VarR = q3p1.r(zau0VarC, (r091) p410Var.e);
                        p410Var.e = r091VarR;
                        if (r091VarR == null) {
                            p410Var.D();
                        } else {
                            xab1 xab1Var = (xab1) p410Var.f;
                            if (xab1Var != null) {
                                xab1Var.d((CancellationException) null);
                            }
                            bpb1Var.m((Object) null, new tah0(str, 14));
                            lsm0 lsm0Var = new lsm0(strW, new ksm0(fec1.c, entityUri, null, "audio-preview", entityUri, null, 484), false, false, new jsm0(0L, 10000L), 0L, (ism0) null, (String) null, false, 0, 2028);
                            r091VarR.b(lsm0Var);
                            r091VarR.k();
                            r091.f(r091VarR, (tv80) null, (Long) null, ljy0.a, 7);
                            p410Var.f = fn31.T((c9n) p410Var.c, (o8n) null, 0, new z290(r091VarR, p410Var, lsm0Var, str, (lnm) null, (byte) 25), 3);
                        }
                    }
                }
                return rih1Var;
            case 2:
                ((wph0) obj4).a((String) obj3, (kxh0) obj2, (vu30) obj);
                return rih1Var;
            case 3:
                ((hrr0) obj).setValue(Boolean.FALSE);
                wmy wmyVar = (wmy) obj4;
                i8h1 i8h1Var = (i8h1) wmyVar.a;
                q1m0 q1m0Var = (q1m0) ((idd1) wmyVar.f).getValue();
                q1m0Var.getClass();
                x6h1 x6h1VarC = q1m0Var.b.c();
                x6h1VarC.i.add(new a7h1("send_invite_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, q1m0Var.a, System.currentTimeMillis()), (xj61) null);
                wmyVar.l();
                String str3 = (String) obj3;
                fn31.T(cto1.q((dg30) wmyVar.b), (o8n) null, 0, new z290(wmyVar, l1d.m("spotify:user:", str3), (String) obj2, str3, (lnm) null, (byte) 28), 3);
                return rih1Var;
            case 4:
                int iS = (((hdn0) obj3).s() + ((hdn0) obj4).s()) - ((hdn0) obj2).s();
                return Integer.valueOf((((hdn0) obj).s() * 2) + (iS >= 0 ? iS : 0));
            case 5:
                return new t98((t8u0) ((bcp0) obj4).invoke(), (zrh) ((bcp0) obj3).invoke(), ((ybp0) obj2).b.A2, (q54) ((bcp0) obj).invoke());
            case 6:
                Scheduler scheduler = (Scheduler) ((edp0) obj4).invoke();
                v5u0 v5u0Var = (v5u0) ((hbp0) obj3).invoke();
                Observable observable = (Observable) ((edp0) obj2).invoke();
                return new tjb((b3p) ((jly0) new ham(new it8(scheduler, v5u0Var, observable, (g510) ((edp0) obj).invoke())).c).get(), observable, scheduler);
            case 7:
                return new vvc(((obp0) obj4).b.D2, (Context) ((qbp0) obj3).invoke(), ((obp0) obj2).b.q, (q8n) ((sbp0) obj).invoke());
            case 8:
                RxRouter rxRouterZ = ((rbp0) obj4).b.z();
                fnh0 fnh0Var = (fnh0) ((zcp0) obj3).invoke();
                ((zcp0) obj2).invoke();
                luk lukVar = (luk) ((zcp0) obj).invoke();
                c8o.l(fnh0Var);
                c8o.l(rxRouterZ);
                c8o.l(lukVar);
                return new mtt(fnh0Var, ce7.p(rxRouterZ, lukVar), new m54(lukVar));
            case 9:
                return new g9r((q8n) ((cbp0) obj4).invoke(), new le4(false, ((yap0) obj3).b.j()), (Flowable) ((cbp0) obj2).invoke(), ((gbp0) obj).b.q);
            case 10:
                return new zy10((Context) ((ubp0) obj4).invoke(), (ov20) ((ubp0) obj3).invoke(), (trd1) ((ubp0) obj2).invoke(), (q8n) ((ubp0) obj).invoke());
            case 11:
                return new g9r(((ui8) ((u6j0) obj4).b).d(), ((sap0) obj3).b.c(), (q8n) ((y52) obj2).invoke(), (t2j0) ((zcp0) obj).invoke());
            case 12:
                return new mg5((zwz0) ((ubp0) obj4).invoke(), ((obp0) obj3).b.T2, (hb4) ((ubp0) obj2).invoke(), (q8n) ((ubp0) obj).invoke());
            case 13:
                return new g9r((bz81) ((zcp0) obj4).invoke(), (Observable) ((zcp0) obj3).invoke(), (Scheduler) ((zcp0) obj2).invoke(), ((sap0) obj).b.d());
            case 14:
                zip0 zip0Var = (zip0) ((ccp0) obj4).invoke();
                q3s0 q3s0Var = (q3s0) ((ccp0) obj3).invoke();
                q8n q8nVar = (q8n) ((ccp0) obj2).invoke();
                qq4 qq4Var = (qq4) ((ybp0) obj).b.q1.get();
                return new rkd0(zip0Var, q3s0Var, q8nVar, qq4Var.h(), qq4Var.d(), qq4Var.g(), new n4t((byte) 0, qq4Var.e()));
            case 15:
                return new ord0(((vbp0) obj4).b.b(), (n350) ((ubp0) obj3).invoke(), (hq90) ((ubp0) obj2).invoke(), (q8n) ((wbp0) obj).invoke());
            case 16:
                Context context = (Context) ((cbp0) obj4).invoke();
                qtj0 qtj0Var = (qtj0) ((cbp0) obj3).invoke();
                xz11 xz11VarJ = ((yap0) obj2).b.j();
                ((cbp0) obj).invoke();
                s9e s9eVar = new s9e((byte) 4);
                tpl1.a(context, MiuiDynamicNpvWidgetProvider.class, new n85(false, xz11VarJ).a() && u890.j(qtj0Var.a.b(), "com.miui.home"));
                return s9eVar;
            case 17:
                return new km0((o241) ((gcp0) obj4).invoke(), (eur) ((gcp0) obj3).invoke(), (Context) ((gcp0) obj2).invoke(), (Scheduler) ((gcp0) obj).invoke());
            case 18:
                return new mtt((q8n) ((abp0) obj4).invoke(), (v4g1) ((abp0) obj3).invoke(), (yqg) ((abp0) obj2).invoke(), (ax4) ((abp0) obj).invoke());
            case 19:
                return new km0((Flowable) ((wbp0) obj4).invoke(), ((obp0) obj3).b.Z0, (nu4) ((wbp0) obj2).invoke(), (q8n) ((xbp0) obj).invoke());
            case 20:
                return new g9r((Context) ((xbp0) obj4).invoke(), (vno0) ((xbp0) obj3).invoke(), (kly0) ((sap0) obj2).invoke(), (zg4) ((xbp0) obj).invoke());
            case 21:
                return new fiq0((eiq0) ((xbp0) obj4).invoke(), ((ybp0) obj3).b.Z, ((ybp0) obj2).b.q, (q8n) ((xbp0) obj).invoke());
            case 22:
                Flowable flowable = (Flowable) ((y52) obj4).invoke();
                yqg yqgVar = (yqg) ((gdp0) obj3).invoke();
                tau0 tau0Var = (tau0) ((hbp0) obj2).invoke();
                i8h1 i8h1Var2 = (i8h1) ((gdp0) obj).invoke();
                return new evs0((xrp) new d3p(new tym0(flowable, yqgVar, tau0Var, i8h1Var2)).b, flowable, yqgVar, new t8r0(i8h1Var2, (byte) 4));
            case 23:
                return new mtt(new zsc(new wyt0((Context) ((xbp0) obj4).invoke(), (ut71) ((xbp0) obj2).invoke()), (zeu0) ((xbp0) obj3).invoke(), (o241) ((xbp0) obj).invoke()));
            case 24:
                return new mtt(((ry9) obj4).b.g0, (q8n) ((abp0) obj3).invoke(), (r3b1) ((abp0) obj2).invoke(), (Context) ((abp0) obj).invoke());
            case 25:
                uu00 uu00Var = (uu00) ((jdp0) obj4).invoke();
                add addVar = (add) ((ldp0) obj3).invoke();
                tz61 tz61Var = (tz61) ((ldp0) obj2).invoke();
                q8n q8nVar2 = (q8n) ((ldp0) obj).invoke();
                c8o.l(uu00Var);
                c8o.l(addVar);
                fza fzaVar = new fza((byte) 23);
                c8o.l(tz61Var);
                c8o.l(q8nVar2);
                return new lc71(uu00Var, addVar, fzaVar, tz61Var, q8nVar2);
            case 26:
                Context context2 = (Context) ((cbp0) obj4).invoke();
                do40 do40Var = (co40) ((cbp0) obj3).invoke();
                xz11 xz11Var = (xz11) ((yap0) obj2).invoke();
                ((cbp0) obj).invoke();
                hjg hjgVar = new hjg((byte) 2);
                tpl1.a(context2, TranssionCardWidgetProvider.class, new r85(false, xz11Var).a() && o7h.i0(wog1.a, do40Var.b()));
                return hjgVar;
            case 27:
                return new j8h1((rfb0) ((cdp0) obj4).invoke(), (Flowable) ((cdp0) obj3).invoke(), (sfb0) ((cdp0) obj2).invoke(), (Scheduler) ((cdp0) obj).invoke());
            case 28:
                return new pch1((nfa0) ((ldp0) obj4).invoke(), (iyc0) ((ldp0) obj3).invoke(), (q940) ((hdp0) obj2).invoke(), (RetrofitMaker) ((ldp0) obj).invoke());
            default:
                return new ndi1((Context) ((ldp0) obj4).invoke(), ((sap0) obj3).b.f(), ((ex01) ((mcp0) obj2).b).a, (q8n) ((ldp0) obj).invoke());
        }
    }
}
