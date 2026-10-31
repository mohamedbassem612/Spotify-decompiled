package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.player.model.Suppressions$Providers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pcp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pcp0(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke() {
        wso0 t0r0Var;
        String str;
        e73 e73Var;
        k0i k0iVar;
        byte b = this.a;
        byte b2 = 3;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                RxRouter rxRouter = (RxRouter) ((ddp0) obj3).invoke();
                yqg yqgVar = (yqg) ((y52) obj2).invoke();
                ((idp0) obj).invoke();
                qqp qqpVar = new qqp(new sjq0(rxRouter, yqgVar, (byte) 23));
                ywp ywpVar = (ywp) qqpVar.c;
                xqu.a((ywp) qqpVar.e);
                xqu.a((ywp) qqpVar.b);
                return new tau0(ywpVar);
            case 1:
                Context context = (Context) ((abp0) obj3).invoke();
                lw21 lw21Var = (lw21) ((abp0) obj2).invoke();
                return new prw0(context, new xb4(false, 3, 10000, 1000, lw21Var), new yb4(250, lw21Var).a(), (q8n) ((abp0) obj).invoke());
            case 2:
                return new ez11(((yap0) obj3).b.b(), (lw21) ((jdp0) obj2).invoke(), ((kdp0) obj).b.h());
            case 3:
                return new vl61((q7b1) ((zbp0) obj3).invoke(), (Scheduler) ((zbp0) obj2).invoke(), (x8c0) ((zbp0) obj).invoke());
            case 4:
                return new h7h1(((gbp0) obj3).b.i, (Observable) ((cbp0) obj2).invoke(), (Scheduler) ((cbp0) obj).invoke());
            case 5:
                oo70 oo70Var = (oo70) ((abp0) obj3).invoke();
                crd crdVar = (crd) ((abp0) obj2).invoke();
                Observable observable = (Observable) ((abp0) obj).invoke();
                c8o.l(oo70Var);
                c8o.l(crdVar);
                c8o.l(observable);
                return new g9r(oo70Var, crdVar, observable);
            case 6:
                return new m0i1(((ybp0) obj3).b.t, ((ybp0) obj2).b.u, (y2g0) ((bcp0) obj).invoke());
            case 7:
                return new xjl1((Context) ((dcp0) obj3).invoke(), (q8n) ((dcp0) obj2).invoke(), (luk) ((dcp0) obj).invoke());
            case 8:
                return new mg5((bql1) ((bcp0) obj2).invoke(), (sn40) ((bcp0) obj3).invoke(), (q8n) ((bcp0) obj).invoke());
            case 9:
                Context context2 = (Context) ((ldp0) obj3).invoke();
                q8n q8nVar = (q8n) ((ldp0) obj2).invoke();
                f95 f95Var = (f95) ((ldp0) obj).invoke();
                jmq jmqVar = new jmq(new fyh1(context2, q8nVar, f95Var));
                return new vmm1(new nbc((byte) 0), (ttq) jmqVar.b, (ttq) jmqVar.c, q8nVar, f95Var);
            case 10:
                return ((ut71) obj3).b((Activity) obj2, ((fkp0) obj).b);
            case 11:
                iu30 iu30Var = (iu30) obj3;
                iu30Var.invoke(y2q0.a);
                int i = ((b3q0) obj2).b;
                tro0 tro0Var = new tro0(iu30Var, (byte) 21);
                tro0 tro0Var2 = new tro0(iu30Var, (byte) 22);
                u2q0 u2q0Var = new u2q0();
                Bundle bundle = new Bundle();
                bundle.putInt("days_remaining", i);
                u2q0Var.T0(bundle);
                u2q0Var.a2 = tro0Var;
                u2q0Var.b2 = tro0Var2;
                u2q0Var.g1((th30) ((et90) obj).e, "OnDemandInfoBottomSheet");
                return rih1Var;
            case 12:
                ((Function0) obj3).invoke();
                ((nwb) obj2).b.invoke((hxb) ((ven0) obj).getValue());
                return rih1Var;
            case 13:
                th30 th30Var = (th30) obj3;
                w0r0 w0r0Var = (w0r0) obj2;
                p811 p811Var = (p811) obj;
                th30Var.getClass();
                nu9 nu9Var = new nu9(th30Var);
                yun0 yun0Var = w0r0Var.d;
                xun0 xun0VarH = yun0Var.h();
                akr akrVar = w0r0Var.c;
                th30 th30Var2 = w0r0Var.g;
                yun0Var.j(nu9Var, false, akrVar, th30Var2);
                vun0 vun0VarH = yun0Var.h();
                if (vun0VarH != null) {
                    vun0 vun0Var = vun0VarH instanceof vun0 ? vun0VarH : null;
                    if (vun0Var != null) {
                        zf30 zf30Var = vun0Var.a;
                        t0r0Var = new mdp0(0, w0r0Var, w0r0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 29);
                        xg30 xg30Var = vun0Var.b;
                        if (xg30Var.d instanceof b6w0) {
                            wso0 wso0Var = wso0.c1;
                            akrVar.h(zf30Var, xg30Var.c, new mdp0(0, w0r0Var, w0r0.class, "popFragment", "popFragment()V", 0, (byte) 27), new mdp0(0, w0r0Var, w0r0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 28));
                            t0r0Var = wso0Var;
                        } else {
                            nu9Var.n(w0r0Var.b, zf30Var, (String) null);
                        }
                    } else {
                        t0r0Var = wso0.d1;
                    }
                } else if (xun0VarH != null) {
                    if (xun0VarH.a().d instanceof b6w0) {
                        akrVar.n = new shq0(w0r0Var, th30Var, (byte) 4);
                        akrVar.x = new gxb(2);
                        akrVar.z.add(akrVar.e.b());
                        akrVar.l(5);
                    } else if (th30Var2.U() || (yun0Var.i().isEmpty() && yun0Var.h() == null)) {
                        w0r0Var.a.finish();
                    } else {
                        th30Var.y(new qh30(th30Var, (String) null, -1, 0), false);
                    }
                    t0r0Var = new t0r0(0, w0r0Var, w0r0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 0);
                } else {
                    t0r0Var = wso0.e1;
                }
                p811Var.a = t0r0Var;
                nu9Var.f();
                return rih1Var;
            case 14:
                ven0 ven0Var = (ven0) obj2;
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                if (zBooleanValue) {
                    fn31.T((c9n) obj3, (o8n) null, 0, new pw1((xtb0) obj, (lnm) null, (byte) 6), 3);
                }
                return rih1Var;
            case 15:
                fn31.T((c9n) obj3, (o8n) null, 0, new dvq0((iu30) obj2, (lp61) obj, lnmVar, b2), 3);
                return rih1Var;
            case 16:
                poj0 poj0Var = (poj0) obj3;
                i8h1 i8h1Var = (i8h1) ((idd1) poj0Var.d).getValue();
                b8l0 b8l0Var = (b8l0) ((idd1) poj0Var.e).getValue();
                b8l0Var.getClass();
                x6h1 x6h1VarC = b8l0Var.b.c();
                x6h1VarC.i.add(new a7h1("account_management_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://spotify.com/account")), x6h1VarC.a(), b8l0Var.a, System.currentTimeMillis()), (xj61) null);
                ((ven0) obj).setValue(Boolean.FALSE);
                ((Function0) obj2).invoke();
                return rih1Var;
            case 17:
                str0 str0Var = (str0) obj3;
                i8h1 i8h1Var2 = (i8h1) str0Var.d.getValue();
                x6h1 x6h1VarC2 = str0Var.b.b.c();
                x6h1VarC2.i.add(new a7h1("add_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String str2 = ((lik1) obj2).a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                ((iu30) obj).invoke(new x000(i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 18:
                yxa0 yxa0Var = ((hxa0) obj3).c;
                if (u890.j(yxa0Var, txa0.a)) {
                    str = nik1.A3.a;
                } else {
                    if (!(yxa0Var instanceof uxa0)) {
                        if (yxa0Var instanceof xxa0) {
                            eg.m("ParentalControlPageContent only supports AccountCreation/AccountTransition flows");
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    str = nik1.N3.a;
                }
                ((iu30) obj).invoke(new axa0(((qwr0) obj2).a(str)));
                return rih1Var;
            case 19:
                ((vng) obj3).a().setPrimaryClip(ClipData.newPlainText("plain text", nb51.p(new af5((String) obj2))));
                ((ven0) obj).setValue(Boolean.TRUE);
                return rih1Var;
            case 20:
                mpt0 mpt0Var = (mpt0) obj;
                ept0 ept0Var = (ept0) obj3;
                rgg rggVar = ept0Var.e;
                if (rggVar != null) {
                    boolean z = ept0Var.f;
                    ipt0 ipt0Var = ept0Var.c;
                    if (z && ((pe) mpt0Var.Z.h).b(7)) {
                        if (!(rggVar instanceof rgg)) {
                            eg.o();
                            return null;
                        }
                        boolean zJ = u890.j(ipt0Var, gpt0.a);
                        Context context3 = mpt0Var.Y;
                        int dimensionPixelSize = zJ ? context3.getResources().getDimensionPixelSize(2131166516) : context3.getResources().getDimensionPixelSize(2131165318);
                        int i2 = rggVar.a;
                        LottieAnimationView lottieAnimationView = mpt0Var.t;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                        layoutParams.gravity = 17;
                        lottieAnimationView.setLayoutParams(layoutParams);
                        lottieAnimationView.setAnimation(i2);
                        lottieAnimationView.setVisibility(0);
                        lottieAnimationView.g();
                    }
                }
                ((iu30) obj2).invoke(mpt0Var.g ? bpt0.b : bpt0.a);
                return rih1Var;
            case 21:
                return ((ut71) obj3).b((Activity) obj2, ((tku0) obj).b);
            case 22:
                j0v0 j0v0Var = (j0v0) obj3;
                yu50 yu50Var = (yu50) j0v0Var.c.g((rbt) obj2);
                ((qzu0) obj).a(yu50Var, j0v0Var, "Header");
                return yu50Var;
            case 23:
                j0v0 j0v0Var2 = (j0v0) obj3;
                anc0 anc0Var = (anc0) j0v0Var2.c.g((act) obj2);
                ((qzu0) obj).a(anc0Var, j0v0Var2, "List Component");
                return anc0Var;
            case 24:
                j0v0 j0v0Var3 = (j0v0) obj3;
                mk90 mk90Var = (mk90) j0v0Var3.c.g((zbt) obj2);
                ((qzu0) obj).a(mk90Var, j0v0Var3, "Item List Row Interaction");
                return mk90Var;
            case 25:
                j0v0 j0v0Var4 = (j0v0) obj3;
                py50 py50Var = (py50) j0v0Var4.c.g((pbt) obj2);
                ((qzu0) obj).a(py50Var, j0v0Var4, "Header Configuration");
                return py50Var;
            case 26:
                y2r y2rVar = (y2r) obj;
                switch (((xne) ((j0v0) obj3).c.g((gzu0) obj2)).a) {
                    case 0:
                        return y2r.a(y2rVar, (x2r) null, (Set) null, 125);
                    case 1:
                        return y2r.a(y2rVar, (x2r) null, (Set) null, 111);
                    case 2:
                        return y2r.a(y2rVar, (x2r) null, (Set) null, 115);
                    case 3:
                        return y2r.a(y2rVar, (x2r) null, Collections.singleton(Suppressions$Providers.MFT), 55);
                    default:
                        return y2r.a(y2rVar, new x2r(), (Set) null, 95);
                }
            case 27:
                k0i k0iVar2 = (k0i) obj;
                j0v0 j0v0Var5 = ((qzu0) obj3).k0;
                if (j0v0Var5 == null || (e73Var = (e73) j0v0Var5.c.g((gzu0) obj2)) == null) {
                    return k0iVar2;
                }
                switch (e73Var.a) {
                    case 0:
                        k0iVar = new k0i(false);
                        break;
                    default:
                        k0iVar = new k0i(false);
                        break;
                }
                return k0iVar;
            case 28:
                xmu0 xmu0Var = ((d0v0) obj3).b;
                String str3 = ((udx0) obj2).a;
                String strF = f4i1.f("spotify:user:", (String) obj, ":playlists");
                i8h1 i8h1Var3 = (i8h1) xmu0Var.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-profile-entity";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str3;
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "profile");
                x6h1VarR.i.add(new a7h1("public_playlists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                x6h1 x6h1VarC3 = x6h1VarR.a().c();
                x6h1VarC3.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((lzn0) xmu0Var.b).a(strF, i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            default:
                s3p s3pVar = (s3p) obj3;
                ouz ouzVar = (ouz) s3pVar.X0;
                String str4 = (String) s3pVar.S0;
                return new qop(new tzo((uap) ((uq8) ouzVar.b).b, (byte) 1), str4, (c8c0) s3pVar.T0, (n6r0) s3pVar.U0, ((ut71) obj2).b((Context) obj, str4));
        }
    }
}
