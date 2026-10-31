package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b2p0 {
    public final MotionLayout a;
    public final View b;
    public final Context c;
    public final View d;
    public final g2p0 e;
    public ValueAnimator f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;

    public b2p0(MotionLayout motionLayout, FrameLayout frameLayout, Context context, gh4 gh4Var, View view, g2p0 g2p0Var) {
        this.a = motionLayout;
        this.b = frameLayout;
        this.c = context;
        this.d = view;
        this.e = g2p0Var;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165905);
        this.g = gh4Var.b() ? 0 : dimensionPixelSize;
        this.h = gh4Var.e() ? 0 : dimensionPixelSize;
        this.i = context.getResources().getDimension(2131165796);
        this.j = context.getResources().getDimension(2131165797);
        this.k = context.getResources().getDimension(2131165794);
        this.l = context.getResources().getDimension(2131165796);
        this.m = context.getResources().getDimension(2131165737);
        c(0.0f);
    }

    public final void a(float f) {
        MotionLayout motionLayout = this.a;
        motionLayout.setProgress(f);
        int iB = b();
        int dimensionPixelSize = (int) (((this.c.getResources().getDimensionPixelSize(2131166766) - iB) * f) + iB);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams.height != dimensionPixelSize) {
            layoutParams.height = dimensionPixelSize;
            motionLayout.setLayoutParams(layoutParams);
            this.e.invoke(Integer.valueOf(dimensionPixelSize));
        }
        c(f);
        float f2 = this.i;
        float fE = l1d.e(this.j, f2, f, f2);
        Drawable background = motionLayout.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(fE);
        }
        View view = this.b;
        Drawable background2 = view != null ? view.getBackground() : null;
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadius((this.m / 2.0f) + fE);
        }
        float f3 = this.k;
        float fE2 = l1d.e(this.l, f3, f, f3);
        Drawable background3 = this.d.getBackground();
        GradientDrawable gradientDrawable3 = background3 instanceof GradientDrawable ? (GradientDrawable) background3 : null;
        if (gradientDrawable3 != null) {
            gradientDrawable3.setCornerRadius(fE2);
        }
    }

    public final int b() {
        Context context = this.c;
        return context.getResources().getDimensionPixelSize(context.getResources().getConfiguration().fontScale >= 1.5f ? 2131166048 : 2131166041);
    }

    public final void c(float f) {
        int i = this.g;
        int i2 = (int) (((this.h - i) * f) + i);
        View view = this.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin == i2 && marginLayoutParams.bottomMargin == i2 && marginLayoutParams.getMarginStart() == i2) {
            return;
        }
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i2;
        marginLayoutParams.setMarginStart(i2);
        view.setLayoutParams(marginLayoutParams);
    }
}
