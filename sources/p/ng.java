package p;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ng {
    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    public ng() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new mg(this);
        } else {
            this.mProvider = new lg(this);
        }
    }

    public kg createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public kg findFocus(int i) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public ng(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.mProvider = accessibilityNodeProvider;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, kg kgVar, String str, Bundle bundle) {
    }
}
