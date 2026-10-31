package p;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.spotify.appauthorization.externallogin.LoginRedirectActivity;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cj8 implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(Object obj) {
        uwf xwfVar;
        Object obj2;
        String string;
        eh0 wh0Var;
        byte b = this.a;
        boolean z = true;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                dj8 dj8Var = (dj8) obj3;
                dj8Var.Z1 = 1;
                dj8Var.b1();
                return;
            case 1:
                swf swfVar = (swf) obj;
                lwf lwfVar = (lwf) obj3;
                if (swfVar.equals(pwf.a)) {
                    xwfVar = uwf.a;
                } else if (swfVar.equals(qwf.a)) {
                    xwfVar = wwf.a;
                } else {
                    if (!swfVar.equals(rwf.a)) {
                        eg.o();
                        return;
                    }
                    Object value = lwfVar.b.getValue();
                    twf twfVar = value instanceof twf ? (twf) value : null;
                    String str = twfVar != null ? twfVar.a : null;
                    if (str == null) {
                        str = "";
                    }
                    xwfVar = new xwf(str);
                }
                bpb1 bpb1Var = lwfVar.b;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, xwfVar);
                return;
            case 2:
                Map map = (Map) obj;
                urt urtVar = (urt) obj3;
                iu30 iu30Var = urtVar.d;
                int i = urtVar.e;
                urtVar.d = null;
                urtVar.e = 0;
                if (iu30Var == null || i == 0) {
                    return;
                }
                Object obj4 = map.get("android.permission.ACCESS_FINE_LOCATION");
                Boolean bool = Boolean.TRUE;
                if (!u890.j(obj4, bool) && !u890.j(map.get("android.permission.ACCESS_COARSE_LOCATION"), bool)) {
                    z = false;
                }
                if (z) {
                    hma1 hma1VarEdit = urtVar.b.edit();
                    hma1VarEdit.a(urt.g, false);
                    hma1VarEdit.g();
                }
                urtVar.c.d(map.isEmpty() ? i : urtVar.c(), i, urtVar.a());
                iu30Var.invoke(Boolean.valueOf(z));
                return;
            case 3:
                oj81 oj81Var = (pj81) obj;
                u250 u250Var = (u250) obj3;
                ((t2u) u250Var).L1 = false;
                Dialog dialog = ((t2u) u250Var).Q1;
                if (dialog != null) {
                    dialog.setCancelable(false);
                }
                if (!(oj81Var instanceof oj81)) {
                    if (!(oj81Var instanceof nj81)) {
                        eg.o();
                        return;
                    }
                    r5o r5oVarI1 = u250Var.i1();
                    int i2 = ((nj81) oj81Var).a;
                    r5oVarI1.c(String.valueOf(i2));
                    if (i2 != 12501) {
                        u250Var.j2.setValue(y1a1.A(u250Var.P0(), new t250(u250Var, (byte) 0), new t250(u250Var, (byte) 1), new t250(u250Var, (byte) 2)));
                        return;
                    } else {
                        u250Var.j1().a(true);
                        return;
                    }
                }
                x250 x250Var = u250Var.W1;
                if (x250Var == null) {
                    u890.C("viewBinderListener");
                    throw null;
                }
                GoogleSignInAccount googleSignInAccount = oj81Var.a;
                String str2 = googleSignInAccount.c;
                if (str2 != null) {
                    x250Var.a(googleSignInAccount, str2);
                    return;
                }
                View view = x250Var.a.h2;
                if (view == null) {
                    u890.C("loadingView");
                    throw null;
                }
                view.setVisibility(8);
                x250Var.c();
                r5o r5oVar = x250Var.c;
                r5oVar.b.a(new jhv0(r5oVar.a.a, "third_party_auth_no_email", "google_auth_button", "google_legacy_api"));
                return;
            case 4:
                ah0 ah0Var = (ah0) obj;
                LoginRedirectActivity loginRedirectActivity = (LoginRedirectActivity) obj3;
                if (loginRedirectActivity.b1 instanceof i2f0) {
                    loginRedirectActivity.b1 = new j2f0(ah0Var.a);
                    return;
                }
                return;
            case 5:
                Map map2 = (Map) obj;
                boolean zJ = u890.j(map2.get("android.permission.POST_NOTIFICATIONS"), Boolean.TRUE);
                fso0 fso0Var = (fso0) obj3;
                boolean z2 = !zJ && (map2.isEmpty() || fso0Var.Y0().b == ag0.C0(fso0Var.N0(), "android.permission.POST_NOTIFICATIONS"));
                kqi0 kqi0Var = fso0Var.F1;
                if (kqi0Var == null) {
                    u890.C("notificationPermissionPromptStatusWrapper");
                    throw null;
                }
                dma1 dma1Var = ((efp0) kqi0Var.d).a;
                boolean z3 = !z2 || dma1Var.l(efp0.c, 0) < 2;
                if (z3 && !z2) {
                    bma1 bma1Var = efp0.c;
                    int iL = dma1Var.l(bma1Var, 0) + 1;
                    hma1 hma1VarEdit2 = dma1Var.edit();
                    hma1VarEdit2.b(bma1Var, iL);
                    hma1VarEdit2.h();
                }
                if (!z3) {
                    obj2 = bxy0.a;
                } else if (zJ) {
                    obj2 = axy0.a;
                } else {
                    obj2 = z2 ? wwy0.a : zwy0.a;
                }
                gso0 gso0VarY0 = fso0Var.Y0();
                gso0VarY0.b = false;
                gso0VarY0.c = false;
                Bundle bundle = ((zf30) fso0Var).f;
                if (bundle != null && (string = bundle.getString("request_id")) != null) {
                    twy0 twy0Var = fso0Var.H1;
                    if (twy0Var == null) {
                        u890.C("pushPermissionActiveRequestDelegate");
                        throw null;
                    }
                    twy0Var.a(string);
                }
                nu9 nu9Var = new nu9(fso0Var.j0());
                nu9Var.m(fso0Var);
                nu9Var.g(true, true);
                fxy0 fxy0Var = fso0Var.G1;
                if (fxy0Var != null) {
                    fxy0Var.a.m((Object) null, obj2);
                    return;
                } else {
                    u890.C("pushPermissionRequestOutcomeDelegate");
                    throw null;
                }
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((y3o0) obj3).invoke(bool2);
                return;
            case 7:
                PageActivityProxy pageActivityProxy = (PageActivityProxy) obj3;
                int i3 = PageActivityProxy.f1;
                Intent intent = new Intent();
                amy0 amy0Var = pageActivityProxy.c1;
                if (amy0Var == null) {
                    u890.C("proxyResultRepository");
                    throw null;
                }
                tan tanVar = amy0Var.a;
                amy0Var.a = null;
                intent.putExtra("EXTRA_RESULT", (Parcelable) tanVar);
                pageActivityProxy.setResult(-1, intent);
                pageActivityProxy.finish();
                return;
            case 8:
                ((wvq0) obj3).invoke((Map) obj);
                return;
            case 9:
                ah0 ah0Var2 = (ah0) obj;
                int i4 = ah0Var2.a;
                if (i4 != -1) {
                    wh0Var = i4 != 0 ? eh0.b : eh0.a;
                } else {
                    wh0Var = new wh0(ah0Var2.b);
                }
                ((xy50) obj3).invoke(wh0Var);
                return;
            case 10:
                ah0 ah0Var3 = (ah0) obj;
                if (ah0Var3.a == -1) {
                    Intent intent2 = ah0Var3.b;
                    m0d m0dVar = intent2 != null ? (m0d) intent2.getParcelableExtra("calling-code") : null;
                    yts0 yts0VarZ0 = ((wts0) obj3).Z0();
                    if (m0dVar != null) {
                        yts0VarZ0.X = m0dVar;
                        yts0VarZ0.a.a1(m0dVar);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                iqv0 iqv0Var = PremiumCheckoutActivity.o1;
                ((MobiusLoopViewModel) ((PremiumCheckoutActivity) obj3).g1.getValue()).U(new yqv0(!(((swf) obj) instanceof pwf)));
                return;
            case 12:
                im21 im21Var = (im21) obj3;
                if (((ah0) obj).a == -1) {
                    ((f0i) im21Var.N0()).a.a(new d8l(im21Var, (byte) 4));
                    return;
                }
                th30 th30VarE0 = im21Var.N0().e0();
                th30VarE0.getClass();
                nu9 nu9Var2 = new nu9(th30VarE0);
                nu9Var2.m(im21Var);
                nu9Var2.f();
                return;
            default:
                tan tanVar2 = (tan) obj;
                if (tanVar2 != null) {
                    int i5 = SpotifyCheckoutActivity.D1;
                    ((SpotifyCheckoutActivity) obj3).m0().U(new oxz(tanVar2));
                    return;
                }
                return;
        }
    }
}
