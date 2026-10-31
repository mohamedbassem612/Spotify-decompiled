package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r9e implements fog1 {
    public final wb00 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final xqg e;
    public final xqg f;

    public r9e(Context context, xqg xqgVar, xqg xqgVar2) {
        aga0 aga0Var = new aga0();
        e4y.X.b(aga0Var);
        aga0Var.d = true;
        this.a = new wb00(aga0Var, (byte) 23);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(xhc.c);
        this.e = xqgVar2;
        this.f = xqgVar;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(l1d.m("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00cc  */
    public final s09 a(s09 s09Var) {
        int subtype;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        em0 em0VarC = s09Var.c();
        em0VarC.i(Build.VERSION.SDK_INT, "sdk-version");
        em0VarC.j("model", Build.MODEL);
        em0VarC.j("hardware", Build.HARDWARE);
        em0VarC.j("device", Build.DEVICE);
        em0VarC.j("product", Build.PRODUCT);
        em0VarC.j("os-uild", Build.ID);
        em0VarC.j("manufacturer", Build.MANUFACTURER);
        em0VarC.j("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map = (HashMap) em0VarC.g;
        if (map != null) {
            map.put("tz-offset", String.valueOf(offset));
        } else {
            eg.m("Property \"autoMetadata\" has not been set");
        }
        em0VarC.i(activeNetworkInfo == null ? c7o0.b.a() : activeNetworkInfo.getType(), "net-type");
        int i = -1;
        try {
            if (activeNetworkInfo != null) {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    SparseArray sparseArray = b7o0.a;
                    subtype = 100;
                } else if (((b7o0) b7o0.a.get(subtype)) == null) {
                }
                em0VarC.i(subtype, "mobile-subtype");
                em0VarC.j("country", Locale.getDefault().getCountry());
                em0VarC.j("locale", Locale.getDefault().getLanguage());
                Context context = this.c;
                simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (simOperator == null) {
                    simOperator = "";
                }
                em0VarC.j("mcc_mnc", simOperator);
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                em0VarC.j("application_build", Integer.toString(i));
                return em0VarC.t();
            }
            SparseArray sparseArray2 = b7o0.a;
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            pdp1.k("CctTransportBackend");
        }
        subtype = 0;
        em0VarC.i(subtype, "mobile-subtype");
        em0VarC.j("country", Locale.getDefault().getCountry());
        em0VarC.j("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        em0VarC.j("mcc_mnc", simOperator);
        em0VarC.j("application_build", Integer.toString(i));
        return em0VarC.t();
    }
}
