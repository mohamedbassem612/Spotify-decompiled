package p;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v5o0 extends AppBarLayout.ScrollingViewBehavior {
    public final int[] g = new int[2];
    public View h;

    public final boolean j(CoordinatorLayout coordinatorLayout, View view, float f, float f2) {
        e8 e8Var = new e8(f, f2, (byte) 9);
        this.h = view;
        return ((Boolean) e8Var.invoke((w5o0) coordinatorLayout)).booleanValue();
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        k8t k8tVar = new k8t(this, iArr, i, i2);
        this.h = view2;
        k8tVar.invoke((w5o0) coordinatorLayout);
    }

    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        po60 po60Var = new po60(i, (byte) 18);
        this.h = view3;
        return ((Boolean) po60Var.invoke((w5o0) coordinatorLayout)).booleanValue();
    }

    public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        htn0 htn0Var = htn0.R0;
        this.h = view2;
        htn0Var.invoke((w5o0) coordinatorLayout);
    }
}
