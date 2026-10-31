package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import com.spotify.encoreconsumermobile.elements.settings.SettingsButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mwh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwh(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qtr qtrVar = (qtr) obj;
                owh owhVar = (owh) obj2;
                qtrVar.c(new ew0(owhVar, (lnm) null, (byte) 10));
                qtrVar.d = new j1(2, owhVar, owh.class, "updateExternalState", "updateExternalState(Lcom/spotify/companioncontent/carousel/CompanionContentCarouselElement$Props;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 19);
                qtrVar.c = true;
                qtrVar.b(new ep0(owhVar, (lnm) null, (byte) 13));
                return rih1Var;
            case 1:
                return ((cwh) ((l2a) ((exh) obj2).b).b).a((iac0) obj).element();
            case 2:
                hux huxVar = ((al70) obj2).a;
                d261 d261Var = jzd1.b;
                mma0 mma0Var = jzd1.a[0];
                d261Var.getClass();
                ((e261) obj).b(d261Var, huxVar);
                return rih1Var;
            case 3:
                b9m b9mVar = (b9m) obj;
                iu30 iu30Var = ((f9m) obj2).i;
                if (iu30Var != null) {
                    iu30Var.invoke(b9mVar);
                }
                return rih1Var;
            case 4:
                ((SettingsButton) obj).setContentDescription(((gm61) obj2).a);
                return rih1Var;
            case 5:
                km61.a((km61) obj2, "privateSessionExplainer", (Bundle) null, false, 2);
                return rih1Var;
            case 6:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 3);
                b261.y(e261Var, ((t591) obj2).e);
                return rih1Var;
            case 7:
                e261 e261Var2 = (e261) obj;
                b261.t(e261Var2, 0);
                b261.c(e261Var2);
                String str = ((wlc1) obj2).e;
                if (str != null) {
                    b261.A(e261Var2, str);
                }
                return rih1Var;
            case 8:
                DownloadButtonView downloadButtonView = (DownloadButtonView) obj;
                sru sruVar = (sru) obj2;
                sru sruVar2 = downloadButtonView.e;
                if (sruVar2 == null) {
                    downloadButtonView.e = sruVar;
                    sruVar2 = sruVar;
                }
                downloadButtonView.b(sruVar2, sruVar);
                return rih1Var;
            case 9:
                return new rm((sfn0) obj2, (byte) 24);
            case 10:
                ((Number) obj).intValue();
                return ((w3l0) ((toj0) obj2).c).b();
            case 11:
                return Boolean.valueOf(((w1k) obj2).b.G((jh5) obj) != null);
            case 12:
                b261.k((e261) obj, new d4h(1, ((x5k) obj2).b.size()));
                return rih1Var;
            case 13:
                ((qv00) obj).a(((a7k) obj2).a, xkk1.class, false);
                return rih1Var;
            case 14:
                ((a7m0) obj).a = new boj((pt) obj2, (byte) 13);
                return rih1Var;
            case 15:
                qv00 qv00Var = (qv00) obj;
                r9k r9kVar = (r9k) obj2;
                qv00Var.a(r9kVar.a, jek.class, false);
                qv00Var.a(r9kVar.a, eek.class, false);
                return rih1Var;
            case 16:
                return ((lak) obj2).c;
            case 17:
                ((lzn0) ((p2o0) obj2).f).h((String) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return yoi1.g(((sd41) ((fna) obj2).b).c(((efk) obj).a));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((hjk) obj2).c;
            case 20:
                ((Number) obj).intValue();
                return ((rxk0) obj2).b();
            case 21:
                ((nns) ((View) obj).getTag()).f((zj51) obj2);
                return rih1Var;
            case 22:
                return new fok(((lok) obj2).c.a, "");
            case 23:
                em0 em0Var = (em0) ((jpk) obj2).f.a.c;
                p7p p7pVar = (p7p) ((jly0) em0Var.h).get();
                npk npkVar = (npk) em0Var.c;
                kpk kpkVar = (kpk) em0Var.d;
                bnr bnrVar = (bnr) kpkVar.g.get();
                c8o.l(bnrVar);
                nmr nmrVar = (nmr) kpkVar.f.get();
                c8o.l(nmrVar);
                return new tpk(p7pVar, npkVar, new g1i(bnrVar, nmrVar, (q7p) ((jly0) em0Var.i).get(), (d7p) em0Var.t, (q7r0) em0Var.e, (byte) 1), (cir0) obj, (byte) 0);
            case 24:
                ((kjk) obj2).invoke(xok.a);
                return rih1Var;
            case 25:
                ((Number) obj).intValue();
                return ((ksk0) ((spk) obj2).h).b();
            case 26:
                oqk oqkVar = (oqk) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                return new oqk(oqkVar.a, oqkVar.d, oqkVar.b, oqkVar.e, bool.booleanValue());
            case 27:
                krk krkVar = (krk) obj;
                erk erkVar = (erk) obj2;
                return krkVar.c.isEmpty() ? new huz(z6x.a, (byte) 10) : new vd0(d3p1.G(erkVar.e(), erkVar.e, krkVar), krkVar, erkVar, (byte) 22);
            case 28:
                return rqt0.u(new nwd(((grk) obj2).c, (byte) 19));
            default:
                j2l j2lVar = (j2l) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Context context = j2lVar.b;
                    String string = context.getString(2131952362);
                    String string2 = context.getString(2131952361);
                    String string3 = context.getString(2131952360);
                    th30 th30Var = (th30) j2lVar.d.b;
                    if (!th30Var.L && !th30Var.U()) {
                        k2l k2lVar = new k2l();
                        Bundle bundleF = pzm.f("title", string, "body", string2);
                        bundleF.putString("button_text", string3);
                        k2lVar.T0(bundleF);
                        new opg(0, (byte) 5);
                        k2lVar.g1(th30Var, "AppInstallationDialogFragment");
                    }
                }
                return rih1Var;
        }
    }
}
