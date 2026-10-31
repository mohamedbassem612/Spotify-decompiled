package p;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;
import com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity;
import com.spotify.payment.callback.PaymentCallbackActivity;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k9k implements qkd, dl4, qjd {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public k9k(rvo0 rvo0Var, qvo0 qvo0Var) {
        this.a = (byte) 18;
        this.b = rvo0Var;
        this.c = xqu.b(new bsp(this, 1, (byte) 20));
        this.d = xqu.b(new bsp(this, 2, (byte) 20));
        this.e = iy81.a(new bsp(this, 0, (byte) 20));
        this.f = iy81.a(new bsp(this, 3, (byte) 20));
    }

    public static k9k d(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624499, (ViewGroup) null, false);
        int i = 2131428229;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428229);
        if (textView != null) {
            i = 2131428438;
            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131428438);
            if (textView2 != null) {
                i = 2131431115;
                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                if (textView3 != null) {
                    i = 2131431356;
                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                    if (textView4 != null) {
                        return new k9k((Object) constraintLayoutInflate, (Object) textView, (Object) textView2, (Object) textView3, (Object) textView4, (byte) 4);
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static boolean f(zkm zkmVar, sbw0 sbw0Var) {
        if (sbw0Var == null) {
            return false;
        }
        ksm0 ksm0Var = sbw0Var.d.b;
        return p2o1.t(zkmVar, ksm0Var.c, ksm0Var.e, sbw0Var.j);
    }

    public nkd a() {
        return (nkd) ((jly0) this.f).get();
    }

    public njd b() {
        return (njd) ((jly0) this.f).get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        if (r3.f(r1, r5) == r13) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.nak r19, p.onm r20) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k9k.c(p.nak, p.onm):java.lang.Object");
    }

    public void e(k1f0 k1f0Var) {
        k1f0 k1f0Var2 = (k1f0) this.b;
        tac0 tac0Var = ((zf30) k1f0Var2).s1;
        g0f0 g0f0Var = (g0f0) this.c;
        wwf0 wwf0Var = (wwf0) g0f0Var.c.get();
        c8o.l(wwf0Var);
        boolean z = ((gmy0) ((jly0) this.d).get()).j;
        caq caqVar = g0f0Var.d;
        ohv0 ohv0Var = (ohv0) caqVar.get();
        c8o.l(ohv0Var);
        b2r0 b2r0Var = (b2r0) ((jly0) this.e).get();
        r6h1 r6h1Var = r6h1.c;
        uo5 uo5Var = new uo5(ohv0Var, b2r0Var, new xdl0(), (byte) 25);
        Activity activity = (Activity) g0f0Var.f.a;
        c8o.l(activity);
        ogr ogrVar = new ogr(activity, new bvw());
        s2q s2qVar = g0f0Var.g;
        g1f0 g1f0Var = (g1f0) s2qVar.get();
        c8o.l(g1f0Var);
        k1f0Var.G1 = new h2f0(k1f0Var2, tac0Var, wwf0Var, z, uo5Var, ogrVar, g1f0Var);
        ohv0 ohv0Var2 = (ohv0) caqVar.get();
        c8o.l(ohv0Var2);
        k1f0Var.H1 = ohv0Var2;
        k1f0Var.I1 = (b2r0) ((jly0) this.e).get();
        kg0 kg0Var = (kg0) g0f0Var.a.get();
        c8o.l(kg0Var);
        k1f0Var.J1 = kg0Var;
        lg0 lg0Var = (lg0) g0f0Var.b.get();
        c8o.l(lg0Var);
        k1f0Var.K1 = lg0Var;
        k1f0Var.L1 = (mir0) ((jly0) this.f).get();
        g1f0 g1f0Var2 = (g1f0) s2qVar.get();
        c8o.l(g1f0Var2);
        k1f0Var.M1 = g1f0Var2;
        k1f0Var.N1 = new bvw();
    }

    public ytp0 g() {
        bur0 bur0Var = (bur0) this.d;
        Activity activity = (Activity) bur0Var.h.get();
        c8o.l(activity);
        pur0 pur0Var = (pur0) this.b;
        xk xkVar = (xk) bur0Var.f.get();
        c8o.l(xkVar);
        w0g w0gVar = (w0g) bur0Var.g.get();
        c8o.l(w0gVar);
        mr20 mr20Var = (mr20) bur0Var.e.get();
        c8o.l(mr20Var);
        return new ytp0(activity, pur0Var, xkVar, w0gVar, mr20Var, (byte) 4);
    }

    public gp41 h() {
        Bundle bundle = ((zf30) ((u250) this.b)).f;
        pjt parcelable = bundle != null ? bundle.getParcelable("launched_from_screen") : null;
        int i = parcelable == null ? -1 : v250.a[parcelable.ordinal()];
        if (i != 1) {
            return i != 2 ? gp41.X : gp41.t;
        }
        return gp41.i;
    }

    public void i(String str) {
        ((kt91) this.d).k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 22:
                AuthorizationCommandProxyActivity authorizationCommandProxyActivity = (AuthorizationCommandProxyActivity) obj;
                daq daqVar = (daq) obj2;
                ((t3b1) authorizationCommandProxyActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) authorizationCommandProxyActivity).c1 = new tuk(xqu.a((p2p) this.f));
                authorizationCommandProxyActivity.f1 = (pp8) daqVar.Uo.get();
                break;
            case 23:
            case 24:
            default:
                ujf1 ujf1Var = (ujf1) obj;
                teq teqVar = (teq) this.d;
                ((hip) ujf1Var).F1 = (jgu) teqVar.b.u.get();
                daq daqVar2 = (daq) obj2;
                ujf1Var.I1 = (gw70) daqVar2.d8.get();
                ujf1Var.H1 = new lvc1((i8h1) daqVar2.A5.get(), (String) ((jly0) this.e).get(), (b2r0) ((jly0) this.f).get());
                ujf1Var.G1 = (lzn0) teqVar.i.get();
                ujf1Var.J1 = (rh41) daqVar2.Jq.get();
                break;
            case 25:
                HelpWebViewActivity helpWebViewActivity = (HelpWebViewActivity) obj;
                ((t3b1) helpWebViewActivity).b1 = (jgu) ((daq) obj2).a.g0.get();
                ((t3b1) helpWebViewActivity).c1 = new tuk(xqu.a((s2q) this.f));
                break;
            case 26:
                LearnMoreWebActivity learnMoreWebActivity = (LearnMoreWebActivity) obj;
                ((t3b1) learnMoreWebActivity).b1 = (jgu) ((daq) obj2).a.g0.get();
                ((t3b1) learnMoreWebActivity).c1 = new tuk(xqu.a((s2q) this.f));
                break;
            case 27:
                OfflineDeviceLimitReachedActivity offlineDeviceLimitReachedActivity = (OfflineDeviceLimitReachedActivity) obj;
                daq daqVar3 = (daq) obj2;
                ((t3b1) offlineDeviceLimitReachedActivity).b1 = (jgu) daqVar3.a.g0.get();
                ((t3b1) offlineDeviceLimitReachedActivity).c1 = new tuk(xqu.a((s2q) this.f));
                offlineDeviceLimitReachedActivity.f1 = (i8h1) daqVar3.A5.get();
                offlineDeviceLimitReachedActivity.g1 = new ix7((mt8) daqVar3.Co.get(), (Scheduler) daqVar3.z1.get());
                offlineDeviceLimitReachedActivity.h1 = new iu4(false, (luk) daqVar3.L1.get());
                break;
            case 28:
                PaymentCallbackActivity paymentCallbackActivity = (PaymentCallbackActivity) obj;
                daq daqVar4 = (daq) obj2;
                paymentCallbackActivity.a1 = (jgu) daqVar4.a.g0.get();
                paymentCallbackActivity.b1 = daqVar4.D1();
                paymentCallbackActivity.e1 = (lzn0) ((s2q) this.f).get();
                paymentCallbackActivity.d1 = new xcs0((dma1) daqVar4.C5.get(), (yqg) daqVar4.J1.get(), (nfa0) daqVar4.b2.get());
                paymentCallbackActivity.c1 = new rlk1(new xas0(new hbs0(daqVar4.D1())), (Scheduler) daqVar4.r3.get(), (Scheduler) daqVar4.z1.get());
                break;
        }
    }

    public k9k(daq daqVar, qma qmaVar) {
        this.a = (byte) 24;
        this.b = daqVar;
        byte b = 25;
        this.c = xqu.b(new p2p(daqVar, this, 0, b));
        this.d = new p2p(daqVar, this, 1, b);
        this.e = new p2p(daqVar, this, 2, b);
        this.f = xqu.b(new p2p(daqVar, this, 3, b));
    }

    public k9k(q8n q8nVar, q8n q8nVar2, clm clmVar, ugn0 ugn0Var) {
        this.a = (byte) 2;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = clmVar;
        this.e = ugn0Var;
        this.f = gio1.b((Object) null);
    }

    public k9k(d7p d7pVar, q8n q8nVar) {
        this.a = (byte) 3;
        this.b = d7pVar;
        this.c = q8nVar;
        this.d = new idd1(new j3m((Object) this, (byte) 22));
    }

    public k9k(ConstraintLayout constraintLayout, CalendarIconView calendarIconView, EncoreAddToButtonView encoreAddToButtonView, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.a = (byte) 1;
        this.b = calendarIconView;
        this.c = encoreAddToButtonView;
        this.d = textView;
        this.e = textView2;
        this.f = constraintLayout2;
    }

    public k9k(bxd bxdVar) {
        this.a = (byte) 6;
        this.b = bxdVar;
        byte b = 28;
        this.c = new b2p(this, 1, b);
        this.d = new b2p(this, 2, b);
        this.e = iy81.a(new b2p(this, 0, b));
        this.f = iy81.a(new b2p(this, 3, b));
    }

    public k9k(t2q t2qVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 20;
        this.b = jbtVar;
        this.c = qopVar;
        this.d = t2qVar;
        byte b = 25;
        this.e = new dlp(this, 1, b);
        this.f = new dlp(this, 0, b);
    }

    public k9k(zwg zwgVar) {
        this.a = (byte) 5;
        this.b = zwgVar;
        this.c = new fwo(this, 0, (byte) 19);
        this.d = new fwo(this, 2, (byte) 19);
        this.e = new fwo(this, 1, (byte) 19);
        this.f = new fwo(this, 3, (byte) 19);
    }

    public k9k(uzp uzpVar, qop qopVar, tbt tbtVar) {
        this.a = (byte) 13;
        this.b = tbtVar;
        this.c = qopVar;
        this.d = uzpVar;
        byte b = 8;
        this.e = iy81.a(new dlp(this, 1, b));
        this.f = iy81.a(new dlp(this, 0, b));
    }

    public k9k(lgy lgyVar, laz lazVar) {
        this.a = (byte) 10;
        this.b = lgyVar;
        this.c = lazVar;
        this.d = new lbp(this, 2, (byte) 16);
        this.e = iy81.a(new lbp(this, 1, (byte) 16));
        this.f = iy81.a(new lbp(this, 0, (byte) 16));
    }

    public k9k(g0f0 g0f0Var, k1f0 k1f0Var) {
        this.a = (byte) 15;
        this.b = k1f0Var;
        this.c = g0f0Var;
        this.d = xqu.b(new nxo(this, 0, (byte) 3));
        this.e = xqu.b(new nxo(this, 1, (byte) 3));
        this.f = xqu.b(new nxo(this, 2, (byte) 3));
    }

    public k9k(s250 s250Var, u250 u250Var) {
        this.a = (byte) 11;
        this.b = u250Var;
        this.c = s250Var;
        byte b = 14;
        this.d = xqu.b(new chp(this, 1, b));
        this.e = xqu.b(new chp(this, 0, b));
        this.f = xqu.b(new chp(this, 2, b));
    }

    public /* synthetic */ k9k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public k9k(bur0 bur0Var, pur0 pur0Var, q7r0 q7r0Var) {
        this.a = (byte) 21;
        this.b = pur0Var;
        this.c = q7r0Var;
        this.d = bur0Var;
        byte b = 28;
        this.e = new dlp(this, 1, b);
        this.f = xqu.b(new dlp(this, 0, b));
    }

    public k9k(ja90 ja90Var, ka90 ka90Var, q7r0 q7r0Var) {
        this.a = (byte) 12;
        this.b = ja90Var;
        this.c = q7r0Var;
        byte b = 26;
        this.d = xqu.b(new chp(this, 0, b));
        this.e = xqu.b(new chp(this, 2, b));
        this.f = xqu.b(new chp(this, 1, b));
    }

    public k9k(ctm ctmVar, ryj ryjVar, etm etmVar, q7r0 q7r0Var) {
        this.a = (byte) 8;
        this.b = ctmVar;
        this.c = q7r0Var;
        this.d = xqu.b(new d7p(this, 0, (byte) 13));
        this.e = xqu.b(new d7p(this, 1, (byte) 13));
        this.f = new d7p(this, 2, (byte) 13);
    }

    public k9k(lpn lpnVar, hmn hmnVar, ryj ryjVar, mpn mpnVar) {
        this.a = (byte) 9;
        this.b = lpnVar;
        this.c = hmnVar;
        this.d = mpnVar;
        byte b = 7;
        this.e = new i8p(this, 0, b);
        this.f = new i8p(this, 1, b);
    }

    public k9k(bne0 bne0Var, lyj lyjVar, dne0 dne0Var, q7r0 q7r0Var) {
        byte b = 14;
        this.a = (byte) 14;
        this.b = bne0Var;
        this.c = q7r0Var;
        this.d = xqu.b(new blp(this, 0, b));
        this.e = xqu.b(new blp(this, 1, b));
        this.f = new blp(this, 2, b);
    }

    public k9k(w5k0 w5k0Var, zuj zujVar, x5k0 x5k0Var, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.b = w5k0Var;
        this.c = q7r0Var;
        this.d = xqu.b(new bsp(this, 0, (byte) 9));
        this.e = xqu.b(new bsp(this, 2, (byte) 9));
        this.f = new bsp(this, 1, (byte) 9);
    }

    public k9k(cel celVar, zuj zujVar, zel zelVar) {
        this.a = (byte) 7;
        this.b = celVar;
        this.c = iy81.a(new d7p(this, 0, (byte) 6));
        this.d = iy81.a(new d7p(this, 1, (byte) 6));
        this.e = iy81.a(new d7p(this, 2, (byte) 6));
        this.f = xqu.b(new d7p(this, 3, (byte) 6));
    }

    public k9k(asl0 asl0Var) {
        this.a = (byte) 17;
        this.b = asl0Var;
        this.c = new bsp(this, 0, (byte) 12);
        this.d = xqu.b(new bsp(this, 2, (byte) 12));
        this.e = xqu.b(new bsp(this, 1, (byte) 12));
        this.f = xqu.b(new bsp(this, 3, (byte) 12));
    }

    public k9k(nwp nwpVar, q2p0 q2p0Var) {
        this.a = (byte) 19;
        this.c = nwpVar;
        this.b = q2p0Var;
        byte b = 2;
        this.d = iy81.a(new p2p(nwpVar, this, b, b));
        this.e = iy81.a(new p2p(nwpVar, this, 1, b));
        this.f = iy81.a(new p2p(nwpVar, this, 0, b));
    }

    public k9k(daq daqVar, LearnMoreWebActivity learnMoreWebActivity) {
        this.a = (byte) 26;
        this.c = daqVar;
        this.b = learnMoreWebActivity;
        this.d = xqu.b(new s2q(daqVar, this, 2, (byte) 9));
        this.e = xqu.b(new s2q(daqVar, this, 1, (byte) 9));
        this.f = new s2q(daqVar, this, 0, (byte) 9);
    }

    public k9k(daq daqVar, HelpWebViewActivity helpWebViewActivity) {
        this.a = (byte) 25;
        this.c = daqVar;
        this.b = helpWebViewActivity;
        this.d = xqu.b(new s2q(daqVar, this, 2, (byte) 5));
        this.e = xqu.b(new s2q(daqVar, this, 1, (byte) 5));
        this.f = new s2q(daqVar, this, 0, (byte) 5);
    }

    public k9k(daq daqVar, OfflineDeviceLimitReachedActivity offlineDeviceLimitReachedActivity) {
        this.a = (byte) 27;
        this.c = daqVar;
        this.b = offlineDeviceLimitReachedActivity;
        this.d = xqu.b(new s2q(daqVar, this, 2, (byte) 19));
        this.e = xqu.b(new s2q(daqVar, this, 1, (byte) 19));
        this.f = new s2q(daqVar, this, 0, (byte) 19);
    }

    public k9k(daq daqVar, PaymentCallbackActivity paymentCallbackActivity) {
        this.a = (byte) 28;
        this.c = daqVar;
        this.b = paymentCallbackActivity;
        this.d = xqu.b(new s2q(daqVar, this, 2, (byte) 22));
        this.e = xqu.b(new s2q(daqVar, this, 1, (byte) 22));
        this.f = new s2q(daqVar, this, 0, (byte) 22);
    }

    public k9k(daq daqVar, AuthorizationCommandProxyActivity authorizationCommandProxyActivity) {
        this.a = (byte) 22;
        this.c = daqVar;
        this.b = authorizationCommandProxyActivity;
        byte b = 16;
        this.d = xqu.b(new p2p(daqVar, this, 2, b));
        this.e = xqu.b(new p2p(daqVar, this, 1, b));
        this.f = new p2p(daqVar, this, 0, b);
    }

    public k9k(daq daqVar, v5q v5qVar, q2p0 q2p0Var) {
        byte b = 23;
        this.a = (byte) 23;
        this.c = daqVar;
        this.b = q2p0Var;
        this.d = iy81.a(new p2p(daqVar, this, 2, b));
        this.e = iy81.a(new p2p(daqVar, this, 1, b));
        this.f = iy81.a(new p2p(daqVar, this, 0, b));
    }

    public k9k(daq daqVar, teq teqVar, ujf1 ujf1Var) {
        this.a = (byte) 29;
        this.c = daqVar;
        this.d = teqVar;
        this.b = ujf1Var;
        this.e = xqu.b(new x0q(daqVar, this, 0, (byte) 5));
        this.f = xqu.b(new x0q(daqVar, this, 1, (byte) 5));
    }
}
