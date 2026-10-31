package p;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class e3n {
    public boolean a(View view) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public boolean d(View view, View view2) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, float f, float f2) {
        return false;
    }

    public void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        l(coordinatorLayout, view, view2, i4);
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public Parcelable p(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void f() {
    }

    public void c(h3n h3nVar) {
    }

    public void e(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void o(View view, Parcelable parcelable) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }
}
