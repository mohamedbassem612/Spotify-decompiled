package p;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yh31 extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public bkh1 a;
    public Boolean b;
    public Long c;
    public gv40 d;
    public hx4 e;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f : g;
            bkh1 bkh1Var = this.a;
            if (bkh1Var != null) {
                bkh1Var.setState(iArr);
            }
        } else {
            gv40 gv40Var = new gv40(this, (byte) 28);
            this.d = gv40Var;
            postDelayed(gv40Var, 50L);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(yh31 yh31Var) {
        bkh1 bkh1Var = yh31Var.a;
        if (bkh1Var != null) {
            bkh1Var.setState(g);
        }
        yh31Var.d = null;
    }

    public final void b(r9w0 r9w0Var, boolean z, long j, int i, long j2, float f2, hx4 hx4Var) {
        long j3 = r9w0Var.a;
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            bkh1 bkh1Var = new bkh1(z);
            setBackground(bkh1Var);
            this.a = bkh1Var;
            this.b = Boolean.valueOf(z);
        }
        bkh1 bkh1Var2 = this.a;
        bkh1Var2.getClass();
        this.e = hx4Var;
        e(i, j, f2, j2);
        if (z) {
            bkh1Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            bkh1Var2.setHotspot(bkh1Var2.getBounds().centerX(), bkh1Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        gv40 gv40Var = this.d;
        if (gv40Var != null) {
            removeCallbacks(gv40Var);
            gv40 gv40Var2 = this.d;
            gv40Var2.getClass();
            gv40Var2.run();
        } else {
            bkh1 bkh1Var = this.a;
            if (bkh1Var != null) {
                bkh1Var.setState(g);
            }
        }
        bkh1 bkh1Var2 = this.a;
        if (bkh1Var2 == null) {
            return;
        }
        bkh1Var2.setVisible(false, false);
        unscheduleDrawable(bkh1Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j, float f2, long j2) {
        bkh1 bkh1Var = this.a;
        if (bkh1Var == null) {
            return;
        }
        if (bkh1Var.getRadius() != i) {
            bkh1Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2.0f;
        }
        long jB = u7h.b(j2, f2 > 1.0f ? 1.0f : f2, 0.0f, 0.0f, 0.0f, 14);
        u7h u7hVar = bkh1Var.b;
        if (!(u7hVar == null ? false : z4h1.b(u7hVar.a, jB))) {
            bkh1Var.b = new u7h(jB);
            bkh1Var.setColor(ColorStateList.valueOf(z4p1.G(jB)));
        }
        Rect rect = new Rect(0, 0, jch0.U(Size.f(j)), jch0.U(Size.d(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        bkh1Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        hx4 hx4Var = this.e;
        if (hx4Var != null) {
            hx4Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
