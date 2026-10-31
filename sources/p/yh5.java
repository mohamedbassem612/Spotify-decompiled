package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class yh5 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static PackageInfo b(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static ArrayList c(Intent intent, String str, Class cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    public static Object d(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static Serializable e(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }

    public static final void f(ifv0 ifv0Var, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ifv0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void g(ifv0 ifv0Var, wh5 wh5Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (wh5Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ifv0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(wh5Var);
    }

    public static wh5 h(Object obj, yj5 yj5Var) {
        OnBackInvokedCallback wh5Var = new wh5(yj5Var, (byte) 1);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, wh5Var);
        return wh5Var;
    }

    public static void i(Object obj, wh5 wh5Var) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(wh5Var);
    }
}
