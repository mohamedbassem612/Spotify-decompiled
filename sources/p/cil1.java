package p;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class cil1 extends t1f0 {
    public String c;

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    public final Bundle B(rye0 rye0Var) {
        dg30 dg30VarJ;
        Bundle bundle = new Bundle();
        Set set = rye0Var.b;
        if (set != null && !set.isEmpty()) {
            String strJoin = TextUtils.join(",", rye0Var.b);
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        int i = rye0Var.c;
        if (i == 0) {
            i = 1;
        }
        bundle.putString("default_audience", eqq.i(i));
        bundle.putString("state", g(rye0Var.g));
        Date date = xd.Y;
        xd xdVarS = fuo1.s();
        String str = xdVarS != null ? xdVarS.e : null;
        if (str == null) {
            dg30VarJ = h().j();
            if (dg30VarJ != null) {
                fpi1.c(dg30VarJ);
            }
            a("access_token", "0");
        } else {
            Context contextJ = h().j();
            if (contextJ == null) {
                contextJ = wf10.a();
            }
            if (str.equals(contextJ.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                a("access_token", "1");
            } else {
                dg30VarJ = h().j();
                if (dg30VarJ != null) {
                    fpi1.c(dg30VarJ);
                }
                a("access_token", "0");
            }
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        wf10 wf10Var = wf10.a;
        bundle.putString("ies", wgi1.c() ? "1" : "0");
        return bundle;
    }

    public String F() {
        return null;
    }

    public oe H() {
        return oe.d;
    }

    public final void K(rye0 rye0Var, Bundle bundle, FacebookException facebookException) {
        sye0 sye0Var;
        sye0 sye0Var2;
        tye0 tye0VarH = h();
        String strValueOf = null;
        this.c = null;
        String str = rye0Var.e;
        if (str != null && str.length() != 0 && !str.equals(k())) {
            if (facebookException instanceof FacebookOperationCanceledException) {
                tye0VarH.h(new sye0(tye0VarH.g, 2, null, null, "User canceled log in.", null));
                return;
            }
            if (facebookException != null) {
                this.c = null;
                String message = facebookException.getMessage();
                if (facebookException instanceof FacebookServiceException) {
                    lf10 lf10Var = ((FacebookServiceException) facebookException).b;
                    strValueOf = String.valueOf(lf10Var.b);
                    message = lf10Var.toString();
                }
                String str2 = strValueOf;
                rye0 rye0Var2 = tye0VarH.g;
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                tye0VarH.h(new sye0(rye0Var2, 3, null, null, TextUtils.join(": ", arrayList), str2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.c = bundle.getString("e2e");
            }
            try {
                xd xdVarR = lyg.r(rye0Var.b, bundle, H(), rye0Var.d);
                sye0Var2 = new sye0(tye0VarH.g, 1, xdVarR, lyg.s(bundle, rye0Var.Q0), null, null);
                if (tye0VarH.j() != null) {
                    try {
                        CookieSyncManager.createInstance(tye0VarH.j()).sync();
                    } catch (Exception unused) {
                    }
                    if (xdVarR != null) {
                        String str3 = xdVarR.e;
                        Context contextJ = h().j();
                        if (contextJ == null) {
                            contextJ = wf10.a();
                        }
                        contextJ.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str3).apply();
                    }
                }
            } catch (FacebookException e) {
                rye0 rye0Var3 = tye0VarH.g;
                String message2 = e.getMessage();
                ArrayList arrayList2 = new ArrayList();
                if (message2 != null) {
                    arrayList2.add(message2);
                }
                sye0Var = new sye0(rye0Var3, 3, null, null, TextUtils.join(": ", arrayList2), null);
                sye0Var2 = sye0Var;
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            sye0Var2 = new sye0(tye0VarH.g, 2, null, null, "User canceled log in.", null);
        } else {
            this.c = null;
            String message3 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                lf10 lf10Var2 = ((FacebookServiceException) facebookException).b;
                strValueOf = String.valueOf(lf10Var2.b);
                message3 = lf10Var2.toString();
            }
            String str4 = strValueOf;
            rye0 rye0Var4 = tye0VarH.g;
            ArrayList arrayList3 = new ArrayList();
            if (message3 != null) {
                arrayList3.add(message3);
            }
            sye0Var = new sye0(rye0Var4, 3, null, null, TextUtils.join(": ", arrayList3), str4);
            sye0Var2 = sye0Var;
        }
        if (!fpi1.y(this.c)) {
            l(this.c);
        }
        tye0VarH.h(sye0Var2);
    }

    public void x(Bundle bundle, rye0 rye0Var) {
        int i = rye0Var.N0;
        String strK = rye0Var.e;
        if (strK == null || strK.length() == 0) {
            strK = k();
        }
        bundle.putString("redirect_uri", strK);
        boolean z = i == 2;
        String str = rye0Var.d;
        if (z) {
            bundle.putString("app_id", str);
        } else {
            bundle.putString("client_id", str);
        }
        bundle.putString("e2e", mod.m());
        if (i == 2) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (rye0Var.b.contains("openid")) {
                bundle.putString("nonce", rye0Var.Q0);
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", rye0Var.S0);
        int i2 = rye0Var.T0;
        bundle.putString("code_challenge_method", i2 != 0 ? ktd.u(i2) : null);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", rye0Var.t);
        bundle.putString("login_behavior", g5d0.s(rye0Var.a));
        wf10 wf10Var = wf10.a;
        bundle.putString("sdk", "android-18.2.3");
        if (F() != null) {
            bundle.putString("sso", F());
        }
        bundle.putString("cct_prefetching", wf10.n ? "1" : "0");
        if (rye0Var.O0) {
            bundle.putString("fx_app", pze0.b(i));
        }
        if (rye0Var.P0) {
            bundle.putString("skip_dedupe", "true");
        }
        String str2 = rye0Var.Y;
        if (str2 != null) {
            bundle.putString("messenger_page_id", str2);
            bundle.putString("reset_messenger_state", rye0Var.Z ? "1" : "0");
        }
    }
}
