package p;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import java.lang.reflect.Method;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g580 {
    public final yqg a;
    public final ynb0 b;
    public final kly0 c;
    public final ynb0 d;
    public final j380 e;
    public final laz f;

    public g580(yqg yqgVar, ynb0 ynb0Var, caq caqVar, ynb0 ynb0Var2, j380 j380Var, laz lazVar) {
        this.a = yqgVar;
        this.b = ynb0Var;
        this.c = caqVar;
        this.d = ynb0Var2;
        this.e = j380Var;
        this.f = lazVar;
    }

    public final LinkedHashMap a() {
        SupplicantState m231Var;
        Boolean m231Var2;
        String m231Var3;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) this.c.get();
        yqg yqgVar = this.a;
        gregorianCalendar.setTimeZone(yqgVar.g());
        gregorianCalendar.setTimeInMillis(yqgVar.b());
        xbl xblVar = (xbl) this.d.get();
        ynb0 ynb0Var = xblVar.b;
        DisplayMetrics displayMetrics = (DisplayMetrics) this.b.get();
        try {
            m231Var = ((WifiManager) xblVar.a.get()).getConnectionInfo().getSupplicantState();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        SupplicantState supplicantState = m231Var;
        if (supplicantState == null) {
            supplicantState = SupplicantState.INVALID;
        }
        linkedHashMap.put(kx10.PROPERTY_WI_FI_SUPPLICANT_STATE, supplicantState.toString());
        try {
            Method declaredMethod = Class.forName(ynb0Var.get().getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(ynb0Var.get(), null);
            if (objInvoke == null || (string = objInvoke.toString()) == null) {
                throw new IllegalStateException();
            }
            m231Var2 = Boolean.valueOf(Boolean.parseBoolean(string));
            if (m231Var2 instanceof m231) {
                m231Var2 = null;
            }
            Boolean bool = m231Var2;
            linkedHashMap.put(kx10.PROPERTY_MOBILE_DATA_ENABLED, String.valueOf(bool != null ? bool.booleanValue() : false));
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ynb0Var.get()).getActiveNetworkInfo();
                if (activeNetworkInfo == null || (m231Var3 = activeNetworkInfo.getTypeName()) == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                m231Var3 = new m231(th2);
            }
            String str = m231Var3 instanceof m231 ? null : m231Var3;
            if (str == null) {
                str = "No active network";
            }
            linkedHashMap.put(kx10.PROPERTY_CONNECTIVITY_TYPE, str);
            linkedHashMap.put(kx10.PROPERTY_SCREEN_RESOLUTION, displayMetrics.widthPixels + " x " + displayMetrics.heightPixels);
            linkedHashMap.put(kx10.PROPERTY_TIMEZONE, yqgVar.g().getID());
            linkedHashMap.put(kx10.PROPERTY_LOCAL_TIME, d7r.a(gregorianCalendar));
            return sqg0.O(this.e, linkedHashMap);
        } catch (Throwable th3) {
            m231Var2 = new m231(th3);
        }
    }
}
