package p;

import android.app.ActivityOptions;
import android.app.Notification;
import android.content.Context;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ProfilingManager;
import android.os.flagging.AconfigPackage;
import android.os.flagging.AconfigStorageReadException;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hg {
    public static int a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        accessibilityNodeInfo.setChecked(i);
    }

    public static void c(Context context, ro30 ro30Var) {
        i((ProfilingManager) context.getSystemService(ProfilingManager.class), ro30Var);
    }

    public static boolean d() {
        AconfigPackage aconfigPackage;
        if (Build.VERSION.SDK_INT < 36) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = oo20.a;
        concurrentHashMap.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = oo20.b;
        copyOnWriteArraySet.getClass();
        if (concurrentHashMap.containsKey("com.android.media.flags")) {
            aconfigPackage = (AconfigPackage) concurrentHashMap.get("com.android.media.flags");
        } else if (copyOnWriteArraySet.contains("com.android.media.flags")) {
            aconfigPackage = null;
        } else {
            try {
                AconfigPackage aconfigPackageLoad = AconfigPackage.load("com.android.media.flags");
                concurrentHashMap.put("com.android.media.flags", aconfigPackageLoad);
                aconfigPackage = aconfigPackageLoad;
            } catch (AconfigStorageReadException unused) {
                copyOnWriteArraySet.add("com.android.media.flags");
                aconfigPackage = null;
            }
        }
        if (aconfigPackage != null) {
            return aconfigPackage.getBooleanFlagValue("enable_suggested_device_api", false);
        }
        return false;
    }

    public static int e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static final ColorSpace h(hah hahVar) {
        if (u890.j(hahVar, kah.x)) {
            return ColorSpace.get(ColorSpace.Named.OK_LAB);
        }
        return null;
    }

    public static void i(ProfilingManager profilingManager, ro30 ro30Var) {
        if (profilingManager != null) {
            try {
                profilingManager.removeProfilingTriggersByType(sex0.j);
            } catch (RuntimeException e) {
                ro30Var.t("Failed to remove ANR ProfilingManager trigger due to ".concat(e.getClass().getSimpleName()));
                Logger.e(e, "Failed to remove Android profiling triggers", new Object[0]);
            }
        }
    }

    public static void j(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        accessibilityNodeInfo.setExpandedState(i);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setFieldRequired(z);
    }

    public static void m(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }

    public static void n(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setSupplementalDescription(str);
    }
}
