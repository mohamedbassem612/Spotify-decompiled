package p;

import android.os.Bundle;
import android.webkit.WebView;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.liveevents.ontourdisclosure.OnTourDisclosureWebFragment;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ydb extends m1q0 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydb(wh81 wh81Var) {
        super(String.valueOf(wh81Var.Z).equals(wh81Var.t));
        this.d = (byte) 26;
        this.e = wh81Var;
        mma0[] mma0VarArr = wh81.R0;
    }

    public final void b() {
        byte b = this.d;
        b7x b7xVar = b7x.a;
        byte b2 = 1;
        Object obj = this.e;
        switch (b) {
            case 0:
                zdb zdbVar = (zdb) obj;
                bbb bbbVar = zdbVar.L1;
                if (bbbVar == null) {
                    u890.C("blueprintActionsButtonProvider");
                    throw null;
                }
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-login-and-sign-up-screen";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                nyn1.Q(bbbVar.c, new yrn0(bbbVar.f.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis())).a));
                String str = zdbVar.b2;
                if (str == null || zdbVar.j0().L() != 0) {
                    f(false);
                    zdbVar.N0().J().d();
                    return;
                }
                dg30 dg30VarN0 = zdbVar.N0();
                dv dvVar = zdbVar.M1;
                if (dvVar != null) {
                    dg30VarN0.startActivity(dv.b(dvVar, zdbVar.N0(), str));
                    return;
                } else {
                    u890.C("accountSwitcherUI");
                    throw null;
                }
            case 1:
                pmc pmcVar = (pmc) obj;
                int i = pmc.Z1;
                if (pmcVar.d1()) {
                    return;
                }
                pmcVar.N0().finish();
                return;
            case 2:
                ((CallingCodePickerActivity) obj).m0().a();
                return;
            case 3:
                ((CarouselFragment) obj).Y0().U(jyd.a);
                return;
            case 4:
                ((ContentPickerFragment) obj).d1().U(ozl.a);
                return;
            case 5:
                akr akrVar = (akr) obj;
                if (akrVar.c()) {
                    akrVar.x = new gxb(2);
                    akrVar.z.add(akrVar.e.b());
                    akrVar.l(5);
                    return;
                }
                return;
            case 6:
                ((Consumer) obj).accept(uzv.a);
                return;
            case 7:
                evw evwVar = (evw) obj;
                wvw wvwVar = (wvw) evwVar.K1.getValue();
                jut jutVar = wvwVar.c;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC2 = ((h4l0) jutVar.b).b.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                wvwVar.W(new mhv0("email_otp", "back_button", ew80.c, (String) null));
                f(false);
                evwVar.N0().J().d();
                return;
            case 8:
                ErrorFragment errorFragment = (ErrorFragment) obj;
                j3h1 j3h1Var = errorFragment.H1;
                if (j3h1Var == null) {
                    u890.C("pickerLogger");
                    throw null;
                }
                to41 to41Var = errorFragment.J1;
                if (to41Var == null) {
                    u890.C("screen");
                    throw null;
                }
                j3h1Var.b(to41Var.a);
                Bundle bundle = new Bundle();
                bundle.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new jp41("User pressed back button"));
                sap1.m(errorFragment, "ALLBOARDING_SCREEN_RESPONSE", bundle);
                return;
            case 9:
                ((ForcedGraduationLockActivity) obj).finishAffinity();
                return;
            case 10:
                i660 i660Var = (i660) obj;
                int i2 = i660.V1;
                if (i660Var.d1()) {
                    return;
                }
                i660Var.N0().finish();
                return;
            case 11:
                c580 c580VarP0 = ((InAppBrowserActivity) obj).p0();
                idd1 idd1Var = c580VarP0.b.c;
                if (((WebView) idd1Var.getValue()).canGoBack()) {
                    ((WebView) idd1Var.getValue()).goBack();
                    return;
                } else {
                    c580VarP0.a.finish();
                    return;
                }
            case 12:
                xwb0 xwb0Var = (xwb0) obj;
                int i3 = xwb0.W1;
                if (xwb0Var.d1()) {
                    return;
                }
                xwb0Var.N0().finish();
                return;
            case 13:
                f(false);
                ((k1f0) obj).N0().J().d();
                return;
            case 14:
                ((PublishSubject) ((fsg0) obj).d).onNext(Boolean.TRUE);
                return;
            case 15:
                ivg0 ivg0VarZ0 = ((mwg0) obj).Z0();
                cyg0 cyg0Var = ivg0VarZ0.g;
                iug0 iug0Var = ivg0VarZ0.a;
                cyg0Var.b(iug0Var.a, false);
                ao0.c(ivg0VarZ0.e, co0.g, iug0Var.a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
                mwg0 mwg0Var = ivg0VarZ0.n;
                if (mwg0Var != null) {
                    mwg0Var.a1(new evg0(ivg0VarZ0, b2));
                    return;
                } else {
                    u890.C("viewBinder");
                    throw null;
                }
            case 16:
                ((gon0) obj).t();
                return;
            case 17:
                dg30 dg30VarF0 = ((sso0) obj).f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.finish();
                    return;
                }
                return;
            case 18:
                ((iu30) obj).invoke(this);
                return;
            case 19:
                OnTourDisclosureWebFragment onTourDisclosureWebFragment = (OnTourDisclosureWebFragment) obj;
                int i4 = OnTourDisclosureWebFragment.W1;
                if (onTourDisclosureWebFragment.d1()) {
                    return;
                }
                onTourDisclosureWebFragment.N0().finish();
                return;
            case 20:
                c1s0 c1s0Var = ((u0s0) obj).G1;
                c1s0Var.a(c1s0Var.h, 4, "");
                return;
            case 21:
                wts0 wts0Var = (wts0) obj;
                yts0 yts0VarZ0 = wts0Var.Z0();
                i8h1 i8h1Var2 = yts0VarZ0.e;
                h4l0 h4l0Var = yts0VarZ0.h;
                h4l0Var.getClass();
                x6h1 x6h1VarC3 = h4l0Var.b.c();
                x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                nyn1.Q(yts0VarZ0.f, new yrn0(i8h1Var2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis())).a));
                f(false);
                wts0Var.N0().J().d();
                return;
            case 22:
                w1t0 w1t0Var = (w1t0) obj;
                int i5 = w1t0.Z1;
                if (w1t0Var.d1()) {
                    return;
                }
                w1t0Var.N0().finish();
                return;
            case 23:
                ypv0 ypv0Var = (ypv0) obj;
                int i6 = ypv0.Z1;
                if (ypv0Var.d1()) {
                    return;
                }
                ypv0Var.N0().finish();
                return;
            case 24:
                fmx0 fmx0Var = (fmx0) obj;
                if (fmx0Var.d1()) {
                    return;
                }
                a1r0 a1r0Var = fmx0Var.W1;
                if (a1r0Var != null) {
                    a1r0Var.g();
                    return;
                } else {
                    u890.C("pageActivityNavigator");
                    throw null;
                }
            case 25:
                lm21 lm21Var = (lm21) obj;
                int i7 = lm21.Y1;
                if (lm21Var.d1()) {
                    return;
                }
                lm21Var.N0().setResult(0);
                lm21Var.N0().finish();
                return;
            case 26:
                wh81 wh81Var = (wh81) obj;
                wh81Var.b.b.e(mqn1.h());
                wh81Var.a.t();
                return;
            default:
                ((fq81) obj).U1.onNext(Boolean.TRUE);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydb(Object obj, boolean z, byte b) {
        super(false);
        this.d = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydb(Object obj, byte b) {
        super(true);
        this.d = b;
        this.e = obj;
    }
}
