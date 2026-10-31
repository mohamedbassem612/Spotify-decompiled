package p;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t34 implements cg {
    public final AccessibilityManager a;

    public t34(Context context) {
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final long a(long j, boolean z) {
        if (j < 2147483647L) {
            int i = z ? 7 : 3;
            int i2 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.a;
            if (i2 >= 29) {
                int iR = x74.R(accessibilityManager, (int) j, i);
                if (iR == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return iR;
            }
            if (z && accessibilityManager.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j;
    }
}
