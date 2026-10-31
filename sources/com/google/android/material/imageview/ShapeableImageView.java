package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p.bz11;
import p.dgo1;
import p.gch0;
import p.iw61;
import p.jw61;
import p.jx61;
import p.kx61;
import p.omz0;
import p.u890;
import p.x74;
import p.yfc0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements jx61 {
    public gch0 N0;
    public iw61 O0;
    public float P0;
    public final Path Q0;
    public final int R0;
    public final int S0;
    public final int T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public boolean X0;
    public final bz11 d;
    public final RectF e;
    public final RectF f;
    public final Paint g;
    public final Paint h;
    public final Path i;
    public ColorStateList t;

    /* JADX WARN: Multi-variable type inference failed */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018834), attributeSet, i);
        this.d = jw61.a;
        this.i = new Path();
        this.X0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.e = new RectF();
        this.f = new RectF();
        this.Q0 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, omz0.I, i, 2132018834);
        this.t = dgo1.i(context2, typedArrayObtainStyledAttributes, 9);
        this.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.R0 = dimensionPixelSize;
        this.S0 = dimensionPixelSize;
        this.T0 = dimensionPixelSize;
        this.U0 = dimensionPixelSize;
        this.R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.O0 = iw61.b(context2, attributeSet, i, 2132018834).d();
        setOutlineProvider(new kx61(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        iw61 iw61Var = this.O0;
        bz11 bz11Var = this.d;
        Path path = this.i;
        bz11Var.c(iw61Var, 1.0f, rectF, (yfc0) null, path);
        Path path2 = this.Q0;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.U0;
    }

    public final int getContentPaddingEnd() {
        int i = this.W0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.R0 : this.T0;
    }

    public int getContentPaddingLeft() {
        int i = this.W0;
        int i2 = this.V0;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.R0;
    }

    public int getContentPaddingRight() {
        int i = this.W0;
        int i2 = this.V0;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.T0;
    }

    public final int getContentPaddingStart() {
        int i = this.V0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.T0 : this.R0;
    }

    public int getContentPaddingTop() {
        return this.S0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingBottom() {
        return super/*android.view.View*/.getPaddingBottom() - getContentPaddingBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingEnd() {
        return super/*android.view.View*/.getPaddingEnd() - getContentPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingLeft() {
        return super/*android.view.View*/.getPaddingLeft() - getContentPaddingLeft();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingRight() {
        return super/*android.view.View*/.getPaddingRight() - getContentPaddingRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingStart() {
        return super/*android.view.View*/.getPaddingStart() - getContentPaddingStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingTop() {
        return super/*android.view.View*/.getPaddingTop() - getContentPaddingTop();
    }

    public iw61 getShapeAppearanceModel() {
        return this.O0;
    }

    public ColorStateList getStrokeColor() {
        return this.t;
    }

    public float getStrokeWidth() {
        return this.P0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        setLayerType(0, null);
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        canvas.drawPath(this.Q0, this.h);
        if (this.t == null) {
            return;
        }
        float f = this.P0;
        Paint paint = this.g;
        paint.setStrokeWidth(f);
        int colorForState = this.t.getColorForState(getDrawableState(), this.t.getDefaultColor());
        if (this.P0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.i, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        if (!this.X0 && isLayoutDirectionResolved()) {
            this.X0 = true;
            if (!isPaddingRelative() && this.V0 == Integer.MIN_VALUE && this.W0 == Integer.MIN_VALUE) {
                setPadding(super/*android.view.View*/.getPaddingLeft(), super/*android.view.View*/.getPaddingTop(), super/*android.view.View*/.getPaddingRight(), super/*android.view.View*/.getPaddingBottom());
            } else {
                setPaddingRelative(super/*android.view.View*/.getPaddingStart(), super/*android.view.View*/.getPaddingTop(), super/*android.view.View*/.getPaddingEnd(), super/*android.view.View*/.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPadding(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setShapeAppearanceModel(iw61 iw61Var) {
        this.O0 = iw61Var;
        gch0 gch0Var = this.N0;
        if (gch0Var != null) {
            gch0Var.setShapeAppearanceModel(iw61Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColor(ColorStateList colorStateList) {
        this.t = colorStateList;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i) {
        setStrokeColor(x74.E(getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidth(float f) {
        if (this.P0 != f) {
            this.P0 = f;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
