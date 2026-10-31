package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bx40 extends ViewGroup implements xly0, jw40, hd {
    public dx40 a;
    public yw40 b;
    public final Rect c;

    public bx40(Context context, int i, f160 f160Var) {
        super(context, null, i);
        this.c = new Rect();
        int iH = d4o1.h(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, aoz0.a, i, 0);
        try {
            float fraction = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
            int integer = typedArrayObtainStyledAttributes.getInteger(4, 3);
            f160 f160Var2 = integer != 1 ? integer != 2 ? f160.IMAGE_AND_COLOR : f160.IMAGE_ONLY : f160.COLOR_ONLY;
            typedArrayObtainStyledAttributes.recycle();
            this.b = new yw40(new wb00(this, (byte) 11), fraction, iH, getResources().getDisplayMetrics().heightPixels);
            g160 g160Var = new g160(context, (f160) cwl1.y(f160Var, f160Var2));
            addView(g160Var.getView(), 0);
            this.a = new dx40(this, g160Var);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static sw9 b() {
        sw9 sw9Var = new sw9((byte) 9, false);
        sw9Var.b = 2130969392;
        sw9Var.c = f160.IMAGE_AND_COLOR;
        return sw9Var;
    }

    public static void c(int i, nx40 nx40Var) {
        if (nx40Var != null) {
            ax40 ax40Var = (ax40) nx40Var.getView().getLayoutParams();
            if (ax40Var != null ? ax40Var.a : false) {
                return;
            }
            View view = nx40Var.getView();
            view.offsetTopAndBottom(i - view.getTop());
        }
    }

    @Override // p.xt41
    public final void a(float f, int i) {
        yw40 yw40Var = this.b;
        int i2 = yw40Var.d + yw40Var.b + i + yw40Var.h;
        bx40 bx40Var = (bx40) yw40Var.g.b;
        c(i2, bx40Var.a.b);
        c(yw40Var.d + i, bx40Var.a.c);
        dx40 dx40Var = this.a;
        dx40.a(f, dx40Var.c);
        dx40.a(f, dx40Var.b);
        cx40 cx40Var = dx40Var.b;
        if (cx40Var instanceof g260) {
            ((g260) cx40Var).a(f);
        }
        g160 g160Var = dx40Var.d;
        fp00 fp00Var = g160Var.d;
        if (fp00Var != null) {
            fp00Var.c = i;
            int iD = fp00Var.d(i);
            ImageView imageView = (ImageView) fp00Var.f;
            imageView.offsetTopAndBottom(iD - imageView.getTop());
            WeakHashMap weakHashMap = b8k1.a;
            imageView.postInvalidateOnAnimation();
            g160Var.e.a(f);
        }
        g160Var.a.c.setAlpha(255);
        g160Var.invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ax40(-1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ax40 ax40Var = new ax40(context, attributeSet);
        ax40Var.b = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aoz0.b);
        try {
            ax40Var.a = typedArrayObtainStyledAttributes.getBoolean(1, true);
            ax40Var.b = typedArrayObtainStyledAttributes.getInt(0, 2);
            return ax40Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p.xly0
    public ImageView getBackgroundImageView() {
        return this.a.d.getBackgroundImageView();
    }

    public cx40 getContentViewBinder() {
        return this.a.b;
    }

    public GlueToolbar getGlueToolbar() {
        return this.a.c;
    }

    @Override // p.jw40
    public int getTotalScrollRange() {
        yw40 yw40Var = this.b;
        return yw40Var.a - ((yw40Var.b + yw40Var.c) + yw40Var.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        Rect rect = this.c;
        this.a.d.getView().layout(rect.left, rect.top, getMeasuredWidth() - (rect.left + rect.right), getMeasuredHeight() - (rect.top + rect.bottom));
        int measuredHeight2 = this.b.d;
        GlueToolbar glueToolbar = this.a.c;
        if (glueToolbar != null) {
            View view = glueToolbar.getView();
            view.layout(0, measuredHeight2, view.getMeasuredWidth(), view.getMeasuredHeight() + measuredHeight2);
            this.b.getClass();
            measuredHeight2 += view.getMeasuredHeight();
        }
        cx40 cx40Var = this.a.b;
        if (cx40Var != null) {
            View view2 = cx40Var.getView();
            int measuredHeight3 = (getMeasuredHeight() - measuredHeight2) - this.b.c;
            int i5 = ((ax40) view2.getLayoutParams()).b;
            if (i5 == 0) {
                measuredHeight = measuredHeight2;
            } else if (i5 == 1) {
                measuredHeight = (measuredHeight3 + measuredHeight2) - view2.getMeasuredHeight();
            } else {
                if (i5 != 2) {
                    hhg1.n(String.format(Locale.getDefault(), "Invalid gravity value: %d", Integer.valueOf(i5)));
                    return;
                }
                measuredHeight = ((measuredHeight3 - view2.getMeasuredHeight()) / 2) + measuredHeight2;
            }
            this.b.h = measuredHeight - measuredHeight2;
            view2.layout(0, measuredHeight, view2.getMeasuredWidth(), view2.getMeasuredHeight() + measuredHeight);
        }
        cx40 cx40Var2 = this.a.b;
        if (cx40Var2 instanceof kw40) {
            ((kw40) cx40Var2).b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        yw40 yw40Var = this.b;
        int iMax = yw40Var.c + yw40Var.d;
        GlueToolbar glueToolbar = this.a.c;
        if (glueToolbar != null) {
            View view = glueToolbar.getView();
            ax40 ax40Var = (ax40) view.getLayoutParams();
            ax40Var.getClass();
            int i4 = ((ViewGroup.MarginLayoutParams) ax40Var).height;
            dm5.m((i4 == -2 || i4 == -1) ? false : true);
            view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ax40Var).height, 1073741824));
            int measuredHeight = view.getMeasuredHeight();
            this.b.getClass();
            iMax += measuredHeight;
            yw40 yw40Var2 = this.b;
            yw40Var2.b = measuredHeight;
            yw40Var = yw40Var2;
        } else {
            yw40Var.b = 0;
        }
        cx40 cx40Var = this.a.b;
        if (cx40Var != null) {
            float f = yw40Var.e;
            int i5 = f != -1.0f ? ((int) (yw40Var.f * f)) - (yw40Var.d + yw40Var.b) : 0;
            View view2 = cx40Var.getView();
            ax40 ax40Var2 = (ax40) view2.getLayoutParams();
            if (ax40Var2 == null || (i3 = ((ViewGroup.MarginLayoutParams) ax40Var2).height) == -1) {
                view2.setMinimumHeight(i5);
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else if (i3 == -2) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ax40Var2).height, 1073741824));
            }
            iMax += Math.max(view2.getMeasuredHeight(), i5);
        }
        Rect rect = this.c;
        this.a.d.getView().measure(View.MeasureSpec.makeMeasureSpec((size - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec((iMax - rect.top) - rect.bottom, 1073741824));
        setMeasuredDimension(size, iMax);
        this.b.a = iMax;
    }

    public void setAccessoryMargin(int i) {
        this.b.c = i;
    }

    @Override // p.xly0
    public void setAvoidCroppingImageWithParallax(boolean z) {
        this.a.d.setAvoidCroppingImageWithParallax(z);
    }

    public void setChildHelper(dx40 dx40Var) {
        this.a = dx40Var;
    }

    public void setColor(int i) {
        this.a.d.setSolidColor(i);
    }

    public void setContentViewBinder(cx40 cx40Var) {
        dx40 dx40Var = this.a;
        dx40Var.getClass();
        ax40 ax40Var = new ax40(-1);
        bx40 bx40Var = dx40Var.a;
        cx40 cx40Var2 = dx40Var.b;
        if (cx40Var2 != null) {
            bx40Var.removeView(cx40Var2.getView());
        }
        dx40Var.b = cx40Var;
        if (cx40Var != null) {
            bx40Var.addView(cx40Var.getView(), 1, ax40Var);
        }
    }

    public void setCoordinatorAccessoryOffset(int i) {
        setAccessoryMargin(i);
    }

    public void setGlueToolbar(GlueToolbar glueToolbar) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130968582});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        dx40 dx40Var = this.a;
        dx40Var.getClass();
        ax40 ax40Var = new ax40(dimensionPixelSize);
        if (glueToolbar != null) {
            ax40Var.c = new hk0(glueToolbar);
        }
        bx40 bx40Var = dx40Var.a;
        GlueToolbar glueToolbar2 = dx40Var.c;
        if (glueToolbar2 != null) {
            bx40Var.removeView(glueToolbar2.getView());
        }
        dx40Var.c = glueToolbar;
        if (glueToolbar != null) {
            bx40Var.addView(glueToolbar.getView(), dx40Var.b != null ? 2 : 1, ax40Var);
        }
    }

    @Override // p.xly0
    public void setHasFixedSize(boolean z) {
        this.a.d.setHasFixedSize(z);
    }

    public void setHeaderInnerState(yw40 yw40Var) {
        this.b = yw40Var;
    }

    @Override // p.jw40
    public View getView() {
        return this;
    }
}
