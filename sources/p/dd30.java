package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dd30 extends LinearLayoutCompat {
    public Drawable S0;
    public final Rect T0;
    public final Rect U0;
    public int V0;
    public final boolean W0;
    public boolean X0;

    public dd30(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T0 = new Rect();
        this.U0 = new Rect();
        this.V0 = 119;
        this.W0 = true;
        this.X0 = false;
        TypedArray typedArrayS = blo1.s(context, attributeSet, omz0.q, i, 0, new int[0]);
        this.V0 = typedArrayS.getInt(1, this.V0);
        Drawable drawable = typedArrayS.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.W0 = typedArrayS.getBoolean(2, true);
        typedArrayS.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.S0;
        if (drawable != null) {
            if (this.X0) {
                this.X0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.W0;
                Rect rect = this.T0;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.V0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.U0;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.S0;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.S0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.S0.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.S0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.V0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.S0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.X0 = z | this.X0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.X0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.S0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.S0);
            }
            this.S0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.V0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.V0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i |= 48;
            }
            this.V0 = i;
            if (i == 119 && this.S0 != null) {
                this.S0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.S0;
    }
}
