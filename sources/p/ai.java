package p;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ai implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ai(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                Rect rect = new Rect();
                view.getHitRect(rect);
                int iY = a8o.y(48.0f, view.getResources());
                int i = rect.bottom;
                int i2 = rect.top;
                int i3 = i - i2;
                if (iY > i3) {
                    int iF = l1d.f(iY, i3, 2, 1);
                    rect.top = i2 - iF;
                    rect.bottom = i + iF;
                }
                int i4 = rect.right;
                int i5 = rect.left;
                int i6 = i4 - i5;
                if (iY > i6) {
                    int iF2 = l1d.f(iY, i6, 2, 1);
                    rect.left = i5 - iF2;
                    rect.right = i4 + iF2;
                }
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
                break;
            case 1:
                view.requestLayout();
                break;
            case 2:
                view.setVisibility(8);
                view.setAlpha(1.0f);
                break;
            case 3:
                view.setNestedScrollingEnabled(true);
                break;
            case 4:
                view.setVisibility(8);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                break;
        }
    }
}
