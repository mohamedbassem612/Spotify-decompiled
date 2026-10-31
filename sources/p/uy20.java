package p;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class uy20 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final n511 a(View view, View view2) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new n511(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ha4) {
            return ((ha4) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i) {
        if (yx20.b(i, 5)) {
            return 33;
        }
        if (yx20.b(i, 6)) {
            return 130;
        }
        if (yx20.b(i, 3)) {
            return 17;
        }
        if (yx20.b(i, 4)) {
            return 66;
        }
        if (yx20.b(i, 1)) {
            return 2;
        }
        return yx20.b(i, 2) ? 1 : null;
    }

    public static final yx20 d(int i) {
        if (i == 1) {
            return yx20.a(2);
        }
        if (i == 2) {
            return yx20.a(1);
        }
        if (i == 17) {
            return yx20.a(3);
        }
        if (i == 33) {
            return yx20.a(5);
        }
        if (i == 66) {
            return yx20.a(4);
        }
        if (i != 130) {
            return null;
        }
        return yx20.a(6);
    }
}
