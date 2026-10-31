package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b9d0 implements AccessibilityManager.AccessibilityStateChangeListener, tob1 {
    public final boolean a;
    public final boolean b;
    public final hrr0 c = v8r.q(Boolean.FALSE);
    public final zg d;
    public final a9d0 e;

    public b9d0(boolean z, boolean z2, boolean z3) {
        this.a = z2;
        this.b = z3;
        a9d0 a9d0Var = null;
        this.d = z ? new zg() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            a9d0Var = new a9d0(this);
        }
        this.e = a9d0Var;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && ihc1.h0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && ihc1.h0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void e(AccessibilityManager accessibilityManager) {
        a9d0 a9d0Var;
        this.c.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
        accessibilityManager.addAccessibilityStateChangeListener(this);
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.d;
        if (touchExplorationStateChangeListener != null) {
            ((hrr0) ((zg) touchExplorationStateChangeListener).b).setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        if (Build.VERSION.SDK_INT < 33 || (a9d0Var = this.e) == null) {
            return;
        }
        a9d0Var.a.setValue(Boolean.valueOf(c(accessibilityManager)));
        a9d0Var.b.setValue(Boolean.valueOf(d(accessibilityManager)));
        accessibilityManager.addAccessibilityServicesStateChangeListener(a9d0Var);
    }

    public final void f(AccessibilityManager accessibilityManager) {
        a9d0 a9d0Var;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        zg zgVar = this.d;
        if (zgVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(zgVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (a9d0Var = this.e) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityServicesStateChangeListener(a9d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    public final Object getValue() {
        boolean z;
        if (((Boolean) this.c.getValue()).booleanValue()) {
            z = true;
            zg zgVar = this.d;
            if (zgVar == null || !((Boolean) ((hrr0) zgVar.b).getValue()).booleanValue()) {
                boolean z2 = this.a;
                a9d0 a9d0Var = this.e;
                if ((!z2 || a9d0Var == null || !((Boolean) a9d0Var.a.getValue()).booleanValue()) && (!this.b || a9d0Var == null || !((Boolean) a9d0Var.b.getValue()).booleanValue())) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }
}
