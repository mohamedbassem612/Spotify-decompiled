package p;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class br91 extends BaseTransientBottomBar.Behavior {
    public boolean i;

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zG = super.g(coordinatorLayout, view, motionEvent);
        this.i = zG;
        return zG;
    }

    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.i && super/*com.google.android.material.behavior.SwipeDismissBehavior*/.s(coordinatorLayout, view, motionEvent);
    }
}
