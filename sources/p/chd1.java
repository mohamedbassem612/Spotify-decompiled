package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class chd1 extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public ValueAnimator a;
    public int b;
    public float c;
    public final /* synthetic */ TabLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chd1(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.b = -1;
        setWillNotDraw(false);
    }

    public final void a() {
        View childAt = getChildAt(this.b);
        TabLayout tabLayout = this.d;
        sua suaVar = tabLayout.h1;
        Drawable drawable = tabLayout.O0;
        suaVar.getClass();
        RectF rectFJ = sua.j(tabLayout, childAt);
        drawable.setBounds((int) rectFJ.left, drawable.getBounds().top, (int) rectFJ.right, drawable.getBounds().bottom);
    }

    public final void b(int i) {
        TabLayout tabLayout = this.d;
        Rect bounds = tabLayout.O0.getBounds();
        tabLayout.O0.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.d;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.O0;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.O0.getBounds().bottom);
        } else {
            tabLayout.h1.y(tabLayout, view, view2, f, tabLayout.O0);
        }
        WeakHashMap weakHashMap = b8k1.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        View childAt = getChildAt(this.b);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        xy9 xy9Var = new xy9(this, childAt, childAt2);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(xy9Var);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(je5.b);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(xy9Var);
        valueAnimator.addListener(new ada(this, i, (byte) 2));
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.d;
        int iHeight = tabLayout.O0.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.O0.getIntrinsicHeight();
        }
        int i = tabLayout.a1;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.O0.getBounds().width() > 0) {
            Rect bounds = tabLayout.O0.getBounds();
            tabLayout.O0.setBounds(bounds.left, height, bounds.right, iHeight);
            Drawable drawable = tabLayout.O0;
            int i2 = tabLayout.P0;
            if (i2 != 0) {
                drawable.setTint(i2);
            } else {
                drawable.setTintList(null);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
        } else {
            d(this.b, -1, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.d;
        boolean z = true;
        if (tabLayout.Y0 == 1 || tabLayout.b1 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) o0c.x(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.Y0 = 0;
                tabLayout.m(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
