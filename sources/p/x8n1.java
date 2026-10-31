package p;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class x8n1 {
    public static final jv81 a = new jv81(0);
    public static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(2131954149);
            case 2:
                return resources.getString(2131954156);
            case 3:
                return resources.getString(2131954146);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                return h(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                new StringBuilder(String.valueOf(i).length() + 22);
                return null;
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i) {
        String strH = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : a(context, i);
        return strH == null ? context.getResources().getString(2131954151) : strH;
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String strF = f(context);
        if (i == 1) {
            return resources.getString(2131954148, strF);
        }
        if (i == 2) {
            return e9k.w(context) ? resources.getString(2131954158) : resources.getString(2131954155, strF);
        }
        if (i == 3) {
            return resources.getString(2131954145, strF);
        }
        if (i == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strF);
        }
        if (i == 7) {
            return g(context, "common_google_play_services_network_error_text", strF);
        }
        if (i == 9) {
            return resources.getString(2131954153, strF);
        }
        if (i == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strF);
        }
        switch (i) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strF);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strF);
            case 18:
                return resources.getString(2131954157, strF);
            default:
                return resources.getString(2131954152, strF);
        }
    }

    public static String d(Context context, int i) {
        return (i == 6 || i == 19) ? g(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i);
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(2131954147);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(R.string.ok) : resources.getString(2131954144);
        }
        return resources.getString(2131954154);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = mjm1.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(2131954152);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        Resources resourcesForApplication;
        jv81 jv81Var = a;
        synchronized (jv81Var) {
            try {
                Locale localeB = yoi1.A(context.getResources().getConfiguration()).b(0);
                if (!localeB.equals(b)) {
                    jv81Var.clear();
                    b = localeB;
                }
                String str2 = (String) jv81Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = h450.a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        new StringBuilder(str.length() + 18);
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            jv81Var.put(str, string);
                            return string;
                        }
                        new StringBuilder(str.length() + 20);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
