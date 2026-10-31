package p;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ns00 extends ng {
    public final /* synthetic */ os00 a;

    public ns00(os00 os00Var) {
        this.a = os00Var;
    }

    public final kg createAccessibilityNodeInfo(int i) {
        return new kg(AccessibilityNodeInfo.obtain(this.a.obtainAccessibilityNodeInfo(i).a));
    }

    public final kg findFocus(int i) {
        os00 os00Var = this.a;
        int i2 = i == 2 ? os00Var.mAccessibilityFocusedVirtualViewId : os00Var.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.performAction(i, i2, bundle);
    }
}
