package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q75 extends ViewGroup {
    public final HashMap a;
    public final HashMap b;

    public q75(Context context) {
        super(context);
        setClipChildren(false);
        this.a = new HashMap();
        this.b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<k75, hmb0> getHolderToLayoutNode() {
        return this.a;
    }

    public final HashMap<hmb0, k75> getLayoutNodeToHolder() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (k75 k75Var : this.a.keySet()) {
            k75Var.layout(k75Var.getLeft(), k75Var.getTop(), k75Var.getRight(), k75Var.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            qf80.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            qf80.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (k75 k75Var : this.a.keySet()) {
            int i4 = k75Var.Y0;
            if (i4 != Integer.MIN_VALUE && (i3 = k75Var.Z0) != Integer.MIN_VALUE) {
                k75Var.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            hmb0 hmb0Var = (hmb0) this.a.get(childAt);
            if (childAt.isLayoutRequested() && hmb0Var != null) {
                hmb0.W(hmb0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
