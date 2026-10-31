package p;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.spotify.base.java.logging.Logger;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimelineResponse;
import io.reactivex.rxjava3.functions.Function;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tqt implements Function {
    public final /* synthetic */ byte a;
    public int b;
    public String c;

    public tqt() {
        this.a = (byte) 0;
        this.c = null;
        this.b = 0;
    }

    public static boolean A() {
        return Build.MANUFACTURER.equalsIgnoreCase("amazon");
    }

    public static boolean B(Context context) {
        if (!Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
            return false;
        }
        try {
            Object obj = lz40.d;
            Object objInvoke = lz40.class.getDeclaredMethod("isGooglePlayServicesAvailable", Context.class).invoke(lz40.class.getDeclaredMethod("getInstance", null).invoke(null, null), context);
            return ((objInvoke instanceof Integer) && ((Integer) objInvoke).intValue() == 0) ? false : true;
        } catch (Exception e) {
            i1k0.n("Caught Exception isGooglePlayServicesAvailable: " + e.getMessage());
            return true;
        }
    }

    public static boolean C(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    return !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty();
                }
            } catch (Exception e) {
                i1k0.n("Caught Exception, error obtaining PackageInfo " + e.getMessage());
            }
        }
        return false;
    }

    public static void b(Context context, ic9 ic9Var) {
        i1k0.B("Begin fetchInstallReferrer");
        try {
            hw20 hw20Var = new hw20(context, ic9Var, (byte) 1);
            int i = ((SharedPreferences) ne.z(context).a).getInt("bnc_install_referrer_timeout", 0);
            i1k0.B("InstallReferrer fetch timeout in milliseconds: " + i);
            if (i > 0) {
                rc2.O(i, new sn80(context, null, (byte) 0), hw20Var);
            } else {
                guo1.H(new tn80(context, null), hw20Var);
            }
        } catch (Exception e) {
            i1k0.n("Caught Exception SystemObserver fetchInstallReferrer " + e.getMessage());
            ((u861) ic9Var.b).g.remove(t861.d);
            i1k0.B("INSTALL_REFERRER_FETCH_WAIT_LOCK removed");
            ((n3c) ic9Var.c).f.p("onInstallReferrersFinished");
        }
    }

    public static int d() {
        return Build.VERSION.SDK_INT;
    }

    public static String e(Context context) {
        String strF = ne.z(context).F("bnc_anon_id");
        if (!TextUtils.isEmpty(strF) && !strF.equals("bnc_no_value")) {
            return strF;
        }
        String string = UUID.randomUUID().toString();
        ne.z(context).Z("bnc_anon_id", string);
        return string;
    }

    public static String f(Context context) {
        String str;
        if (context != null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e) {
                i1k0.n("Caught Exception, error obtaining AppVersion " + e.getMessage());
                str = "";
            }
        } else {
            str = "";
        }
        return TextUtils.isEmpty(str) ? "bnc_no_value" : str;
    }

    public static String g() {
        return System.getProperty("os.arch");
    }

    public static String h(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            return null;
        }
        return networkOperatorName;
    }

    public static String i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        return activeNetworkInfo.getType() == 1 ? "wifi" : "mobile";
    }

    public static void j() {
        String str = Build.DISPLAY;
    }

    public static long k(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            } catch (Exception e) {
                i1k0.n("Caught Exception, error obtaining FirstInstallTime " + e.getMessage());
            }
        }
        return 0L;
    }

    public static String l() {
        return Locale.getDefault().getCountry();
    }

    public static String m() {
        return Locale.getDefault().getLanguage();
    }

    public static long o(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            } catch (Exception e) {
                i1k0.n("Caught Exception, error obtaining LastUpdateTime " + e.getMessage());
            }
        }
        return 0L;
    }

    public static String p() {
        String str = "";
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            str = hostAddress;
                            break;
                        }
                    }
                }
            }
            return str;
        } catch (Exception e) {
            i1k0.n("Caught Exception SystemObserver getLocalIPAddress: " + e.getMessage());
            return str;
        }
    }

    public static String q() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    public static String r(Context context) {
        if (!A()) {
            return "Android";
        }
        if (context == null) {
            return Build.MODEL.contains("AFT") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE";
        }
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE";
    }

    public static void s() {
        String str = Build.VERSION.RELEASE;
    }

    public static String t(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            i1k0.n("Caught Exception, error obtaining PackageName " + e.getMessage());
            return "";
        }
    }

    public static void u() {
        String str = Build.MANUFACTURER;
    }

    public static void v() {
        String str = Build.MODEL;
    }

    public static DisplayMetrics w(Context context) {
        DisplayManager displayManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = null;
        if (context != null && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display != null) {
            display.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static String x(Context context) {
        UiModeManager uiModeManager;
        if (context != null) {
            try {
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
            } catch (Exception e) {
                i1k0.n("Caught Exception SystemObserver getUIMode" + e.getMessage());
            }
        } else {
            uiModeManager = null;
        }
        if (uiModeManager != null) {
            switch (uiModeManager.getCurrentModeType()) {
                case 1:
                    return "UI_MODE_TYPE_NORMAL";
                case 2:
                    return "UI_MODE_TYPE_DESK";
                case 3:
                    return "UI_MODE_TYPE_CAR";
                case 4:
                    return "UI_MODE_TYPE_TELEVISION";
                case 5:
                    return "UI_MODE_TYPE_APPLIANCE";
                case 6:
                    return "UI_MODE_TYPE_WATCH";
                default:
                    break;
            }
        }
        return "UI_MODE_TYPE_UNDEFINED";
    }

    public static med1 y(Context context) {
        med1 med1Var = new med1();
        med1Var.b = true;
        med1Var.a = "bnc_no_value";
        String string = (context == null || !TextUtils.isEmpty(((tqt) rm5.t().a).c)) ? null : Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            string = ne.z(context).F("bnc_randomly_generated_uuid");
            if (TextUtils.isEmpty(string) || string.equals("bnc_no_value")) {
                String string2 = UUID.randomUUID().toString();
                ne.z(context).Z("bnc_randomly_generated_uuid", string2);
                string = string2;
            }
            med1Var.b = false;
        }
        med1Var.a = string;
        return med1Var;
    }

    public static boolean z(Context context) {
        return "wifi".equalsIgnoreCase(i(context));
    }

    public void D(Throwable th) {
        String str = this.c;
        int i = this.b + 1;
        this.b = i;
        boolean z = i % 30 == 0;
        if (z && th != null) {
            Logger.e(th, "%s failed %d times in a row, its levels read as not collected", new Object[]{str, Integer.valueOf(i)});
            return;
        }
        if (z) {
            Logger.d("%s failed %d times in a row, its levels read as not collected", new Object[]{str, Integer.valueOf(i)});
        } else if (th != null) {
            Logger.l(th, "%s failed", new Object[]{str});
        } else {
            Logger.k("%s failed", new Object[]{str});
        }
    }

    public void E(String str) {
        this.c = str;
    }

    public void F(int i) {
        this.b = i;
    }

    public void a(Context context, ifl1 ifl1Var) {
        if (A()) {
            i1k0.B("Begin setFireAdId");
            fn31.Y(igu.a, new p82(context, null, (byte) 0), new led1(this, ifl1Var));
            return;
        }
        if (B(context)) {
            i1k0.B("Begin fetchHuaweiAdId");
            if (zod.x("com.huawei.hms.ads.identifier.AdvertisingIdClient")) {
                fn31.Y(igu.a, new r82(context, null), new jed1(this, ifl1Var));
                return;
            } else {
                ifl1Var.m();
                i1k0.B("Huawei advertising service not found. If not expected, import com.huawei.hms.ads.identifier.AdvertisingIdClient into your gradle dependencies");
                return;
            }
        }
        i1k0.B("Begin fetchGoogleAdId");
        if (zod.x("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            fn31.Y(igu.a, new q82(context, (lnm) null, (byte) 0), new ked1(this, ifl1Var));
        } else {
            ifl1Var.m();
            i1k0.B("Play Store advertising service not found. If not expected, import com.google.android.gms.ads.identifier.AdvertisingIdClient into your gradle dependencies");
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                UserTimelineResponse userTimelineResponse = (UserTimelineResponse) obj;
                int i = this.b;
                int iN = userTimelineResponse.n();
                int i2 = iN == 0 ? -1 : tr50.a[l1d.C(iN)];
                if (i2 != 1) {
                    return i2 != 2 ? new yre1(i, new IllegalArgumentException("Invalid timeline status")) : new wre1(userTimelineResponse.p(), i, this.c);
                }
                return new dse1(userTimelineResponse.o());
            default:
                nq6 nq6Var = (nq6) obj;
                return (nq6Var.c > 0 || nq6Var.b > 0) ? Collections.singletonList(new xer0(this.c, new tfr0(Integer.valueOf(this.b), (y6h1) null, 2))) : z6x.a;
        }
    }

    public String c() {
        return this.c;
    }

    public int n() {
        return this.b;
    }

    public tqt(String str, int i) {
        this.a = (byte) 3;
        this.c = str;
        this.b = i;
    }

    public /* synthetic */ tqt(int i, String str, byte b) {
        this.a = b;
        this.b = i;
        this.c = str;
    }

    public tqt(String str) {
        this.a = (byte) 4;
        this.c = str;
    }
}
