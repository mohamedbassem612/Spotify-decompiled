package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q3g extends gch0 implements Drawable.Callback, c4e1 {
    public static final int[] f2 = {R.attr.state_enabled};
    public static final ShapeDrawable g2 = new ShapeDrawable(new OvalShape());
    public float A1;
    public float B1;
    public float C1;
    public float D1;
    public final Context E1;
    public final Paint F1;
    public final Paint.FontMetrics G1;
    public final RectF H1;
    public final PointF I1;
    public final Path J1;
    public final d4e1 K1;
    public int L1;
    public int M1;
    public int N1;
    public int O1;
    public int P1;
    public int Q1;
    public boolean R1;
    public int S1;
    public int T1;
    public ColorFilter U1;
    public PorterDuffColorFilter V1;
    public ColorStateList W1;
    public ColorStateList X0;
    public PorterDuff.Mode X1;
    public ColorStateList Y0;
    public int[] Y1;
    public float Z0;
    public ColorStateList Z1;
    public float a1;
    public WeakReference a2;
    public ColorStateList b1;
    public TextUtils.TruncateAt b2;
    public float c1;
    public boolean c2;
    public ColorStateList d1;
    public int d2;
    public CharSequence e1;
    public boolean e2;
    public boolean f1;
    public Drawable g1;
    public ColorStateList h1;
    public float i1;
    public boolean j1;
    public boolean k1;
    public Drawable l1;
    public RippleDrawable m1;
    public ColorStateList n1;
    public float o1;
    public SpannableStringBuilder p1;
    public boolean q1;
    public boolean r1;
    public Drawable s1;
    public ColorStateList t1;
    public lnm0 u1;
    public lnm0 v1;
    public float w1;
    public float x1;
    public float y1;
    public float z1;

    /* JADX WARN: Multi-variable type inference failed */
    public q3g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132018780);
        this.a1 = -1.0f;
        this.F1 = new Paint(1);
        this.G1 = new Paint.FontMetrics();
        this.H1 = new RectF();
        this.I1 = new PointF();
        this.J1 = new Path();
        this.T1 = 255;
        this.X1 = PorterDuff.Mode.SRC_IN;
        this.a2 = new WeakReference(null);
        j(context);
        this.E1 = context;
        d4e1 d4e1Var = new d4e1(this);
        this.K1 = d4e1Var;
        this.e1 = "";
        d4e1Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2;
        setState(iArr);
        if (!Arrays.equals(this.Y1, iArr)) {
            this.Y1 = iArr;
            if (Z()) {
                C(getState(), iArr);
            }
        }
        this.c2 = true;
        g2.setTint(-1);
    }

    public static boolean A(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void a0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean z(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final void B() {
        ?? r1 = (Chip) this.a2.get();
        if (r1 != 0) {
            r1.d(r1.S0);
            r1.requestLayout();
            r1.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.X0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.L1) : 0);
        boolean state = true;
        if (this.L1 != iC) {
            this.L1 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.Y0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.M1) : 0);
        if (this.M1 != iC2) {
            this.M1 = iC2;
            zOnStateChange = true;
        }
        int i = uah.i(iC2, iC);
        if ((this.N1 != i) | (((gch0) this).a.c == null)) {
            this.N1 = i;
            m(ColorStateList.valueOf(i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.b1;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.O1) : 0;
        if (this.O1 != colorForState2) {
            this.O1 = colorForState2;
            zOnStateChange = true;
        }
        if (this.Z1 != null) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z3 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z4 = true;
                }
            }
            if (z3 && z4) {
                colorForState = this.Z1.getColorForState(iArr, this.P1);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.P1 != colorForState) {
            this.P1 = colorForState;
        }
        k0e1 k0e1Var = this.K1.f;
        int colorForState3 = (k0e1Var == null || (colorStateList = k0e1Var.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.Q1);
        if (this.Q1 != colorForState3) {
            this.Q1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                if (state2[i3] == 16842912) {
                    if (this.q1) {
                        z = true;
                        break;
                    }
                } else {
                    i3++;
                }
            }
            z = false;
            break;
        }
        if (this.R1 == z || this.s1 == null) {
            z2 = false;
        } else {
            float fW = w();
            this.R1 = z;
            if (fW != w()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.W1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.S1) : 0;
        if (this.S1 != colorForState4) {
            this.S1 = colorForState4;
            ColorStateList colorStateList6 = this.W1;
            PorterDuff.Mode mode = this.X1;
            this.V1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (A(this.g1)) {
            state |= this.g1.setState(iArr);
        }
        if (A(this.s1)) {
            state |= this.s1.setState(iArr);
        }
        if (A(this.l1)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.l1.setState(iArr3);
        }
        if (A(this.m1)) {
            state |= this.m1.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            B();
        }
        return state;
    }

    public final void D(boolean z) {
        if (this.q1 != z) {
            this.q1 = z;
            float fW = w();
            if (!z && this.R1) {
                this.R1 = false;
            }
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void E(Drawable drawable) {
        if (this.s1 != drawable) {
            float fW = w();
            this.s1 = drawable;
            float fW2 = w();
            a0(this.s1);
            u(this.s1);
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.t1 != colorStateList) {
            this.t1 = colorStateList;
            if (this.r1 && (drawable = this.s1) != null && this.q1) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z) {
        if (this.r1 != z) {
            boolean zX = X();
            this.r1 = z;
            boolean zX2 = X();
            if (zX != zX2) {
                Drawable drawable = this.s1;
                if (zX2) {
                    u(drawable);
                } else {
                    a0(drawable);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void H(float f) {
        if (this.a1 != f) {
            this.a1 = f;
            setShapeAppearanceModel(((gch0) this).a.a.e(f));
        }
    }

    public final void I(Drawable drawable) {
        Drawable drawable2 = this.g1;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fW = w();
            this.g1 = drawable != null ? drawable.mutate() : null;
            float fW2 = w();
            a0(drawable2);
            if (Y()) {
                u(this.g1);
            }
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void J(float f) {
        if (this.i1 != f) {
            float fW = w();
            this.i1 = f;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(ColorStateList colorStateList) {
        this.j1 = true;
        if (this.h1 != colorStateList) {
            this.h1 = colorStateList;
            if (Y()) {
                this.g1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z) {
        if (this.f1 != z) {
            boolean zY = Y();
            this.f1 = z;
            boolean zY2 = Y();
            if (zY != zY2) {
                Drawable drawable = this.g1;
                if (zY2) {
                    u(drawable);
                } else {
                    a0(drawable);
                }
                invalidateSelf();
                B();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(ColorStateList colorStateList) {
        if (this.b1 != colorStateList) {
            this.b1 = colorStateList;
            if (this.e2) {
                fch0 fch0Var = ((gch0) this).a;
                if (fch0Var.d != colorStateList) {
                    fch0Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void N(float f) {
        if (this.c1 != f) {
            this.c1 = f;
            this.F1.setStrokeWidth(f);
            if (this.e2) {
                ((gch0) this).a.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void O(Drawable drawable) {
        Drawable drawable2 = this.l1;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fX = x();
            this.l1 = drawable != null ? drawable.mutate() : null;
            this.m1 = new RippleDrawable(y4o1.w(this.d1), this.l1, g2);
            float fX2 = x();
            a0(drawable2);
            if (Z()) {
                u(this.l1);
            }
            invalidateSelf();
            if (fX != fX2) {
                B();
            }
        }
    }

    public final void P(float f) {
        if (this.C1 != f) {
            this.C1 = f;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void Q(float f) {
        if (this.o1 != f) {
            this.o1 = f;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void R(float f) {
        if (this.B1 != f) {
            this.B1 = f;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(ColorStateList colorStateList) {
        if (this.n1 != colorStateList) {
            this.n1 = colorStateList;
            if (Z()) {
                this.l1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.k1 != z) {
            boolean Z = Z();
            this.k1 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.l1;
                if (Z2) {
                    u(drawable);
                } else {
                    a0(drawable);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void U(float f) {
        if (this.y1 != f) {
            float fW = w();
            this.y1 = f;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void V(float f) {
        if (this.x1 != f) {
            float fW = w();
            this.x1 = f;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(ColorStateList colorStateList) {
        if (this.d1 != colorStateList) {
            this.d1 = colorStateList;
            this.Z1 = null;
            onStateChange(getState());
        }
    }

    public final boolean X() {
        return this.r1 && this.s1 != null && this.R1;
    }

    public final boolean Y() {
        return this.f1 && this.g1 != null;
    }

    public final boolean Z() {
        return this.k1 && this.l1 != null;
    }

    @Override // p.c4e1
    public final void a() {
        B();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.T1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.e2;
        Paint paint = this.F1;
        RectF rectF = this.H1;
        if (!z) {
            paint.setColor(this.L1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, y(), y(), paint);
        }
        if (!this.e2) {
            paint.setColor(this.M1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.U1;
            if (colorFilter == null) {
                colorFilter = this.V1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, y(), y(), paint);
        }
        if (this.e2) {
            super.draw(canvas);
        }
        if (this.c1 > 0.0f && !this.e2) {
            paint.setColor(this.O1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.e2) {
                ColorFilter colorFilter2 = this.U1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.V1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f3 = this.c1 / 2.0f;
            rectF.set(f + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.a1 - (this.c1 / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.P1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.e2) {
            RectF rectF2 = new RectF(bounds);
            fch0 fch0Var = ((gch0) this).a;
            iw61 iw61Var = fch0Var.a;
            float f5 = fch0Var.i;
            yfc0 yfc0Var = ((gch0) this).Q0;
            bz11 bz11Var = ((gch0) this).R0;
            Path path = this.J1;
            bz11Var.c(iw61Var, f5, rectF2, yfc0Var, path);
            e(canvas2, paint, path, ((gch0) this).a.a, g());
        } else {
            canvas2.drawRoundRect(rectF, y(), y(), paint);
        }
        if (Y()) {
            v(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.g1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.g1.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (X()) {
            v(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.s1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.s1.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.c2 && this.e1 != null) {
            PointF pointF = this.I1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.e1;
            d4e1 d4e1Var = this.K1;
            if (charSequence != null) {
                float fW = w() + this.w1 + this.z1;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fW;
                } else {
                    pointF.x = bounds.right - fW;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = d4e1Var.a;
                Paint.FontMetrics fontMetrics = this.G1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.e1 != null) {
                float fW2 = w() + this.w1 + this.z1;
                float fX = x() + this.D1 + this.A1;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fW2;
                    rectF.right = bounds.right - fX;
                } else {
                    rectF.left = i3 + fX;
                    rectF.right = bounds.right - fW2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            k0e1 k0e1Var = d4e1Var.f;
            TextPaint textPaint2 = d4e1Var.a;
            if (k0e1Var != null) {
                textPaint2.drawableState = getState();
                d4e1Var.f.e(this.E1, textPaint2, d4e1Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(d4e1Var.a(this.e1.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.e1;
            if (z2 && this.b2 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.b2);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (Z()) {
            rectF.setEmpty();
            if (Z()) {
                float f10 = this.D1 + this.C1;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.o1;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.o1;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.o1;
                float f14 = fExactCenterY - (f13 / 2.0f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.l1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.m1.setBounds(this.l1.getBounds());
            this.m1.jumpToCurrentState();
            this.m1.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.T1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final int getAlpha() {
        return this.T1;
    }

    public final ColorFilter getColorFilter() {
        return this.U1;
    }

    public final int getIntrinsicHeight() {
        return (int) this.Z0;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(x() + this.K1.a(this.e1.toString()) + w() + this.w1 + this.z1 + this.A1 + this.D1), this.d2);
    }

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.e2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.Z0, this.a1);
        } else {
            outline.setRoundRect(bounds, this.a1);
            outline2 = outline;
        }
        outline2.setAlpha(this.T1 / 255.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (z(this.X0) || z(this.Y0) || z(this.b1)) {
            return true;
        }
        k0e1 k0e1Var = this.K1.f;
        if (k0e1Var == null || (colorStateList = k0e1Var.j) == null || !colorStateList.isStateful()) {
            return (this.r1 && this.s1 != null && this.q1) || A(this.g1) || A(this.s1) || z(this.W1);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super/*android.graphics.drawable.Drawable*/.onLayoutDirectionChanged(i);
        if (Y()) {
            zOnLayoutDirectionChanged |= this.g1.setLayoutDirection(i);
        }
        if (X()) {
            zOnLayoutDirectionChanged |= this.s1.setLayoutDirection(i);
        }
        if (Z()) {
            zOnLayoutDirectionChanged |= this.l1.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super/*android.graphics.drawable.Drawable*/.onLevelChange(i);
        if (Y()) {
            zOnLevelChange |= this.g1.setLevel(i);
        }
        if (X()) {
            zOnLevelChange |= this.s1.setLevel(i);
        }
        if (Z()) {
            zOnLevelChange |= this.l1.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p.c4e1
    public final boolean onStateChange(int[] iArr) {
        if (this.e2) {
            super.onStateChange(iArr);
        }
        return C(iArr, this.Y1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.T1 != i) {
            this.T1 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.U1 != colorFilter) {
            this.U1 = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTintList(ColorStateList colorStateList) {
        if (this.W1 != colorStateList) {
            this.W1 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.X1 != mode) {
            this.X1 = mode;
            ColorStateList colorStateList = this.W1;
            this.V1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super/*android.graphics.drawable.Drawable*/.setVisible(z, z2);
        if (Y()) {
            visible |= this.g1.setVisible(z, z2);
        }
        if (X()) {
            visible |= this.s1.setVisible(z, z2);
        }
        if (Z()) {
            visible |= this.l1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.l1) {
            if (drawable.isStateful()) {
                drawable.setState(this.Y1);
            }
            drawable.setTintList(this.n1);
            return;
        }
        Drawable drawable2 = this.g1;
        if (drawable == drawable2 && this.j1) {
            drawable2.setTintList(this.h1);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y() || X()) {
            float f = this.w1 + this.x1;
            Drawable drawable = this.R1 ? this.s1 : this.g1;
            float intrinsicWidth = this.i1;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + intrinsicWidth;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - intrinsicWidth;
            }
            Drawable drawable2 = this.R1 ? this.s1 : this.g1;
            float fCeil = this.i1;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(o0c.x(this.E1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float w() {
        if (!Y() && !X()) {
            return 0.0f;
        }
        float f = this.x1;
        Drawable drawable = this.R1 ? this.s1 : this.g1;
        float intrinsicWidth = this.i1;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.y1;
    }

    public final float x() {
        if (Z()) {
            return this.B1 + this.o1 + this.C1;
        }
        return 0.0f;
    }

    public final float y() {
        return this.e2 ? h() : this.a1;
    }
}
