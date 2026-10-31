package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dth {
    public static final xot a = new xot("CommonUtils", "");

    public static String a(Context context) {
        String str;
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            xot xotVar = a;
            if (!Log.isLoggable(xotVar.b, 6) || (str = xotVar.c) == null) {
                return "";
            }
            str.concat(strConcat);
            return "";
        }
    }
}
