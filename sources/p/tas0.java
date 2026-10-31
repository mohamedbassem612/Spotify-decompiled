package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class tas0 {
    public static final Set a = f46.S0(new String[]{"www.paypal.com", "www.sandbox.paypal.com"});
    public static final Set b = Collections.singleton("com.paypal.android.p2pmobile");
    public static final Set c = f46.S0(new String[]{"com.squareup.cash", "com.squareup.cashsandbox"});
    public static final se11 d = new se11("checkoutshopper-(test|live(-[a-z]+)?)\\.adyen\\.com");

    public static Set a(String str) {
        if (str.equals("paypal")) {
            return b;
        }
        return str.equals("adyen_cashapp") ? c : w7x.a;
    }

    public static boolean b(String str, String str2) {
        String host;
        Uri uri = Uri.parse(str);
        if (str2.equals("paypal")) {
            if (!nhc1.S(uri.getScheme(), "https", true)) {
                return false;
            }
            Set set = a;
            String host2 = uri.getHost();
            if (!o7h.i0(set, host2 != null ? host2.toLowerCase(Locale.ROOT) : null) || !u890.j(o7h.s0(uri.getPathSegments()), "app-switch-checkout")) {
                return false;
            }
        } else {
            if (!str2.equals("adyen_cashapp") || !nhc1.S(uri.getScheme(), "https", true) || (host = uri.getHost()) == null) {
                return false;
            }
            if (!d.e(host.toLowerCase(Locale.ROOT)) || !u890.j(uri.getPath(), "/checkoutshopper/checkoutPaymentRedirect")) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !a(str).isEmpty();
    }

    public static int d(Context context, String str, Intent intent) {
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        if (o7h.i0(a(str), packageName)) {
            return 1;
        }
        return (packageName == null || packageName.equals("android")) ? 3 : 2;
    }
}
