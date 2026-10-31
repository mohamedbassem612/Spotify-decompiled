package p;

import android.os.Bundle;
import com.spotify.mobius.MobiusLoop;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i5w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5w(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 14;
        byte b3 = 7;
        byte b4 = 8;
        byte b5 = 2;
        ni20 ni20Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hw2 hw2Var = (hw2) obj2;
                return new vvu(d3p1.F(hw2Var.b, hw2Var.c, (k5w) obj), (byte) 7);
            case 1:
                x5w x5wVar = (x5w) obj;
                h6w h6wVar = (h6w) obj2;
                return hu20.e(d3p1.F(h6wVar.b, h6wVar.c, x5wVar), new qd0((lnm) ni20Var, (Object) h6wVar, (Object) x5wVar, b2));
            case 2:
                return new rxc0((String) ((ca3) obj2).b);
            case 3:
                return new k6r((c9n) obj2, b5);
            case 4:
                return new k6r((guj) obj2, (byte) 5);
            case 5:
                return new k6r((ttw) obj2, (byte) 6);
            case 6:
                xwe0 xwe0Var = (xwe0) obj;
                kg0 kg0Var = ((evw) obj2).G1;
                if (kg0Var != null) {
                    kg0Var.d(new zit(xwe0Var), true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            case 7:
                ad80 ad80Var = (g0x) obj;
                if (ad80Var instanceof ad80) {
                    d1x.b((d1x) ((pzw) obj2).t, 2, ad80Var.a, (Map) null, (String) null, 12);
                }
                return rih1Var;
            case 8:
                return (x6d1) obj2;
            case 9:
                ji0 ji0Var = (ji0) obj;
                jut jutVar = ((l2x) obj2).g;
                Set set = s4b1.f;
                String str = ji0Var.e;
                if (uic.u(str)) {
                    ((lzn0) jutVar.b).h(str);
                } else {
                    a1r0.j((a1r0) jutVar.c, "spotify:internal:split-video-ad-browser", (String) null, mno1.h(new mmr0[]{new mmr0("split_browser_parameters", new fya1(ji0Var))}), false, 10);
                }
                return rih1Var;
            case 10:
                a1r0.j((a1r0) obj2, "spotify:internal:split-video-ad-browser", (String) null, mno1.h(new mmr0[]{new mmr0("split_browser_parameters", new fya1((ki0) obj))}), false, 10);
                return rih1Var;
            case 11:
                ((qtr) obj).b(new kr((u6x) obj2, (lnm) null, (byte) 14));
                return rih1Var;
            case 12:
                scx scxVar = (scx) obj2;
                scxVar.b = true;
                return new k6r(scxVar, b3);
            case 13:
                i451 i451Var = (j451) obj;
                lbc0 lbc0Var = (lbc0) obj2;
                if (i451Var instanceof i451) {
                    lbc0Var.invoke(new kh20(i451Var.a));
                } else if (i451Var.equals(h451.a)) {
                    lbc0Var.invoke(ih20.a);
                } else {
                    if (!i451Var.equals(h451.b)) {
                        eg.o();
                        return null;
                    }
                    lbc0Var.invoke(gh20.a);
                }
                return rih1Var;
            case 14:
                e261 e261Var = (e261) obj;
                b261.A(e261Var, ((hax) obj2).a);
                b261.a(e261Var);
                return rih1Var;
            case 15:
                rwq0.z((qtr) obj, new uzx((vzx) obj2, (byte) 0));
                return rih1Var;
            case 16:
                a1r0.m((a1r0) ((efr) obj2).b, nik1.F4.a, (tv80) obj, (Bundle) null, 12);
                return rih1Var;
            case 17:
                jut jutVar2 = (jut) obj2;
                ((ni30) sqg0.G(j3y.class, (gg11) jutVar2.c)).a().g1(((dg30) jutVar2.b).e0(), (String) null);
                return rih1Var;
            case 18:
                a1r0.j((a1r0) ((gmt) obj2).b, nik1.E4.a, (String) null, (Bundle) null, false, 14);
                return rih1Var;
            case 19:
                return new k6r((rtm0) obj2, b4);
            case 20:
                ((esg) obj2).a.a(pro1.t("djVoiceImprovements"), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 21:
                return ((x7y) obj2).d;
            case 22:
                dhg1 dhg1Var = (dhg1) obj;
                aby abyVar = (aby) obj2;
                pay payVar = pay.a;
                pay payVar2 = pay.b;
                if (dhg1Var.f(payVar, payVar2)) {
                    cfe cfeVar = abyVar.S0.a.c;
                    if (cfeVar != null) {
                        ni20Var = cfeVar.c;
                    }
                } else if (dhg1Var.f(payVar2, pay.c)) {
                    cfe cfeVar2 = abyVar.T0.a.c;
                    if (cfeVar2 != null) {
                        ni20Var = cfeVar2.c;
                    }
                } else {
                    ni20Var = xay.e;
                }
                return ni20Var == null ? xay.e : ni20Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (zob1) ((ldo) obj2).c;
            case 24:
                return new cc3((hv4) obj2);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new a2n0();
            case 26:
                ((a7m0) obj).a = new moy((xoy) obj2, (byte) 1);
                return rih1Var;
            case 27:
                MobiusLoop mobiusLoop = ((qpy) obj2).Z0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 28:
                return new any(t5p1.i((ymd0) ((uuy) obj2).invoke((String) obj, (Object) null)), (byte) 3);
            default:
                m441 m441Var = new m441(new y2k(2, (lnm) null, (byte) 1));
                vbm[] vbmVarArr = q601.a;
                return new x010(new kge((Flowable) obj2), m441Var, new xx0(3, (lnm) null, (byte) 8), (byte) 1);
        }
    }
}
