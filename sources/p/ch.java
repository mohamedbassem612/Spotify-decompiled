package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ch {
    public static final Uri c = Settings.Global.getUriFor("animator_duration_scale");
    public static final Uri d = Settings.Secure.getUriFor("enabled_accessibility_services");
    public final Context a;
    public final AccessibilityManager b;

    public ch(Context context) {
        this.a = context;
        Object systemService = context.getSystemService("accessibility");
        this.b = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
    }

    public final boolean a() {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        enabledAccessibilityServiceList.getClass();
        List<AccessibilityServiceInfo> list = enabledAccessibilityServiceList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (ihc1.h0(((AccessibilityServiceInfo) it.next()).getId(), "SwitchAccessService", true)) {
                return true;
            }
        }
        return false;
    }
}
