package p;

import android.app.AppOpsManager;
import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wpt {
    public static final Method b;
    public final Context a;

    static {
        Method method;
        try {
            Class cls = Integer.TYPE;
            method = AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class);
        } catch (Exception unused) {
            method = null;
        }
        b = method;
    }

    public wpt(Context context) {
        this.a = context;
    }

    public final Boolean a() {
        Context context = this.a;
        Method method = b;
        if (method == null) {
            return null;
        }
        try {
            return Boolean.valueOf(((Integer) method.invoke((AppOpsManager) context.getSystemService("appops"), 10017, Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() == 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
