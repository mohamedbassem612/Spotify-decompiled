package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ko0 {
    public final w5b1 a;
    public final xn0 b;

    public ko0(qi0 qi0Var, w5b1 w5b1Var, xn0 xn0Var) {
        this.a = w5b1Var;
        this.b = xn0Var;
    }

    public final void a(String str, String str2) {
        ln21 ln21Var;
        if (str.length() == 0) {
            return;
        }
        try {
            ne neVar = new ne((byte) 9);
            neVar.t();
            neVar.e0(str);
            ln21Var = new ln21(neVar);
        } catch (IllegalArgumentException unused) {
            this.b.a(new u4g0(str2, str));
            ln21Var = null;
        }
        if (ln21Var == null) {
            return;
        }
        this.a.d.c().a(ln21Var).d(new eyh0(this, str2, str, (byte) 11));
    }

    public final void b(Activity activity, ki0 ki0Var) {
        try {
            a580 a580Var = new a580(ki0Var.g(), ki0Var.a(), ki0Var.j(), ki0Var.h());
            InAppBrowserActivity.s1.getClass();
            activity.startActivity(nfb.g(activity, a580Var));
        } catch (ActivityNotFoundException e) {
            Logger.e(e, "Could not open ad: %s", gq0.a(ki0Var.a()));
        }
    }

    public final void c(Activity activity, a580 a580Var) {
        try {
            InAppBrowserActivity.s1.getClass();
            activity.startActivity(nfb.g(activity, a580Var));
        } catch (ActivityNotFoundException e) {
            Logger.e(e, "Could not open ad: %s", a580Var.a());
        }
    }
}
