package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jda extends FrameLayout {
    public static final kgh t = new kgh((byte) 2);
    public ida a;
    public hda b;
    public int c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public ColorStateList h;
    public PorterDuff.Mode i;

    public jda(Context context, AttributeSet attributeSet) {
        super(u890.J(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, omz0.J);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = b8k1.a;
            setElevation(dimensionPixelSize);
        }
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(dgo1.i(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(o0c.I(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(t);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(2131166710);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(ago1.s(xfo1.r(this, 2130969040), xfo1.r(this, 2130969024), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.h;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = b8k1.a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fda fdaVar = this.b;
        if (fdaVar != null) {
            fdaVar.a();
        }
        WeakHashMap weakHashMap = b8k1.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        fda fdaVar = this.b;
        if (fdaVar != null) {
            fda fdaVar2 = fdaVar;
            kda kdaVar = fdaVar2.a;
            ua91 ua91VarF = ua91.F();
            eda edaVar = kdaVar.o;
            synchronized (ua91VarF.b) {
                z = true;
                if (!ua91VarF.L(edaVar)) {
                    et91 et91Var = (et91) ua91VarF.e;
                    if (!(et91Var != null && et91Var.a.get() == edaVar)) {
                        z = false;
                    }
                }
            }
            if (z) {
                kda.f19p.post(new s10(fdaVar2, (byte) 15));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        t4d1 t4d1Var = this.a;
        if (t4d1Var != null) {
            kda kdaVar = (kda) t4d1Var.b;
            kdaVar.c.setOnLayoutChangeListener(null);
            kdaVar.e();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.h);
            drawable.setTintMode(this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(hda hdaVar) {
        this.b = hdaVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : t);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(ida idaVar) {
        this.a = idaVar;
    }
}
