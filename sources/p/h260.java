package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class h260 extends vck1 {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public h260() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // p.e3n
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutX;
        hsl1 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutX = AppBarLayout.ScrollingViewBehavior.x(coordinatorLayout.m(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = b8k1.a;
            if (appBarLayoutX.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec((appBarLayoutX.getTotalScrollRange() + size) - appBarLayoutX.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    @Override // p.vck1
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutX = AppBarLayout.ScrollingViewBehavior.x(coordinatorLayout.m(view));
        if (appBarLayoutX == null) {
            coordinatorLayout.r(view, i);
            this.e = 0;
            return;
        }
        h3n h3nVar = (h3n) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin;
        int bottom = appBarLayoutX.getBottom() + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin;
        int bottom2 = ((appBarLayoutX.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        hsl1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = b8k1.a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i2 = h3nVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        qpn1.g(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iW = w(appBarLayoutX);
        view.layout(rect2.left, rect2.top - iW, rect2.right, rect2.bottom - iW);
        this.e = rect2.top - appBarLayoutX.getBottom();
    }

    public final int w(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            e3n e3nVar = ((h3n) appBarLayout.getLayoutParams()).a;
            int iW = e3nVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) e3nVar).w() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iW > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iW / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return u890.o((int) (f * i2), 0, i2);
    }

    public h260(int i) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
