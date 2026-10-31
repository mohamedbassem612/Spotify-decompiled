package p;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vln0 extends t1f0 {
    public oe B() {
        return oe.b;
    }

    public final void F(rye0 rye0Var, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            aro.i = true;
            x(null);
            return;
        }
        if (o7h.i0(p7h.M(new String[]{"service_disabled", "AndroidAuthKillSwitchException"}), str)) {
            x(null);
            return;
        }
        if (o7h.i0(p7h.M(new String[]{"access_denied", "OAuthAccessDeniedException"}), str)) {
            x(new sye0(rye0Var, 2, null, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        x(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList), str3));
    }

    public final void H(Bundle bundle, rye0 rye0Var) {
        try {
            x(new sye0(rye0Var, 1, lyg.r(rye0Var.b, bundle, B(), rye0Var.d), lyg.s(bundle, rye0Var.Q0), null, null));
        } catch (FacebookException e) {
            String message = e.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            x(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public final boolean K(Intent intent) {
        if (intent == null || wf10.a().getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            return false;
        }
        l1f0 l1f0Var = h().c;
        rih1 rih1Var = null;
        if (l1f0Var == null) {
            l1f0Var = null;
        }
        if (l1f0Var != null) {
            pf30 pf30Var = l1f0Var.I1;
            if (pf30Var == null) {
                u890.C("launcher");
                throw null;
            }
            pf30Var.a(intent);
            rih1Var = rih1.a;
        }
        return rih1Var != null;
    }

    @Override // p.t1f0
    public final boolean n(int i, int i2, Intent intent) {
        String str;
        String string;
        Object obj;
        rye0 rye0Var = h().g;
        if (intent == null) {
            x(new sye0(rye0Var, 2, null, null, "Operation canceled", null));
            return true;
        }
        String string2 = null;
        if (i2 == 0) {
            Bundle extras = intent.getExtras();
            if (extras != null && (string = extras.getString("error")) != null) {
                str = string;
            } else if (extras != null) {
                String string3 = extras.getString("error_type");
                str = string3;
            } else {
                str = null;
            }
            String string4 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
            if (!"CONNECTION_FAILURE".equals(string4)) {
                x(new sye0(rye0Var, 2, null, null, str, null));
                return true;
            }
            if (extras != null && (string = extras.getString("error_message")) != null) {
                string2 = string;
            } else if (extras != null) {
                string2 = extras.getString("error_description");
            }
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(str);
            }
            if (string2 != null) {
                arrayList.add(string2);
            }
            x(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList), string4));
            return true;
        }
        if (i2 != -1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("Unexpected resultCode from authorization.");
            x(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList2), null));
            return true;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("Unexpected null from returned authorization data.");
            x(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList3), null));
            return true;
        }
        String string5 = extras2.getString("error");
        if (string5 == null) {
            string5 = extras2.getString("error_type");
        }
        Object obj2 = extras2.get("error_code");
        string2 = obj2 != null ? obj2.toString() : null;
        String string6 = extras2.getString("error_message");
        if (string6 == null) {
            string6 = extras2.getString("error_description");
        }
        String string7 = extras2.getString("e2e");
        if (!fpi1.y(string7)) {
            l(string7);
        }
        if (string5 != null || string2 != null || string6 != null || rye0Var == null) {
            F(rye0Var, string5, string6, string2);
            return true;
        }
        if (!extras2.containsKey("code") || fpi1.y(extras2.getString("code"))) {
            H(extras2, rye0Var);
            return true;
        }
        wf10.c().execute(new vqh0((Object) this, (Object) rye0Var, (Object) extras2, (byte) 8));
        return true;
    }

    public final void x(sye0 sye0Var) {
        if (sye0Var != null) {
            h().h(sye0Var);
        } else {
            h().s();
        }
    }
}
