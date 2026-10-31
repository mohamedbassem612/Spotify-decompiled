package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import java.util.WeakHashMap;
import p.ach0;
import p.ago1;
import p.b8k1;
import p.blo1;
import p.cch0;
import p.dgo1;
import p.f0o1;
import p.fch0;
import p.gch0;
import p.ggo1;
import p.iw61;
import p.jx61;
import p.omz0;
import p.u890;
import p.y1a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class MaterialCardView extends CardView implements Checkable, jx61 {
    public static final int[] N0 = {R.attr.state_checkable};
    public static final int[] O0 = {R.attr.state_checked};
    public static final int[] P0 = {2130970301};
    public final cch0 g;
    public final boolean h;
    public boolean i;
    public boolean t;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018778), attributeSet, i);
        this.i = false;
        this.t = false;
        this.h = true;
        TypedArray typedArrayS = blo1.s(getContext(), attributeSet, omz0.y, i, 2132018778, new int[0]);
        cch0 cch0Var = new cch0(this, attributeSet, i);
        this.g = cch0Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        gch0 gch0Var = cch0Var.c;
        gch0Var.m(cardBackgroundColor);
        cch0Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cch0Var.h();
        MaterialCardView materialCardView = cch0Var.a;
        ColorStateList colorStateListI = dgo1.i(materialCardView.getContext(), typedArrayS, 10);
        cch0Var.m = colorStateListI;
        if (colorStateListI == null) {
            cch0Var.m = ColorStateList.valueOf(-1);
        }
        cch0Var.g = typedArrayS.getDimensionPixelSize(11, 0);
        boolean z = typedArrayS.getBoolean(0, false);
        cch0Var.r = z;
        materialCardView.setLongClickable(z);
        cch0Var.k = dgo1.i(materialCardView.getContext(), typedArrayS, 5);
        cch0Var.e(dgo1.l(materialCardView.getContext(), typedArrayS, 2));
        cch0Var.f = typedArrayS.getDimensionPixelSize(4, 0);
        cch0Var.e = typedArrayS.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListI2 = dgo1.i(materialCardView.getContext(), typedArrayS, 6);
        cch0Var.j = colorStateListI2;
        if (colorStateListI2 == null) {
            cch0Var.j = ColorStateList.valueOf(ago1.p(materialCardView, 2130969011));
        }
        ColorStateList colorStateListI3 = dgo1.i(materialCardView.getContext(), typedArrayS, 1);
        colorStateListI3 = colorStateListI3 == null ? ColorStateList.valueOf(0) : colorStateListI3;
        gch0 gch0Var2 = cch0Var.d;
        gch0Var2.m(colorStateListI3);
        RippleDrawable rippleDrawable = cch0Var.n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cch0Var.j);
        }
        gch0Var.l(materialCardView.getCardElevation());
        float f = cch0Var.g;
        ColorStateList colorStateList = cch0Var.m;
        gch0Var2.a.j = f;
        gch0Var2.invalidateSelf();
        fch0 fch0Var = gch0Var2.a;
        if (fch0Var.d != colorStateList) {
            fch0Var.d = colorStateList;
            gch0Var2.onStateChange(gch0Var2.getState());
        }
        materialCardView.setBackgroundInternal(cch0Var.d(gch0Var));
        Drawable drawableC = materialCardView.isClickable() ? cch0Var.c() : gch0Var2;
        cch0Var.h = drawableC;
        materialCardView.setForeground(cch0Var.d(drawableC));
        typedArrayS.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.g.c.getBounds());
        return rectF;
    }

    public final void b() {
        cch0 cch0Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cch0Var = this.g).n) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        cch0Var.n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        cch0Var.n.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.g.c.a.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.g.d.a.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.g.i;
    }

    public int getCheckedIconMargin() {
        return this.g.e;
    }

    public int getCheckedIconSize() {
        return this.g.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.g.k;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.g.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.g.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.g.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.g.b.top;
    }

    public float getProgress() {
        return this.g.c.a.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.g.c.h();
    }

    public ColorStateList getRippleColor() {
        return this.g.j;
    }

    public iw61 getShapeAppearanceModel() {
        return this.g.l;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.g.m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.g.m;
    }

    public int getStrokeWidth() {
        return this.g.g;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ggo1.N(this, this.g.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        cch0 cch0Var = this.g;
        if (cch0Var != null && cch0Var.r) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N0);
        }
        if (this.i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O0);
        }
        if (this.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, P0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        cch0 cch0Var = this.g;
        accessibilityNodeInfo.setCheckable(cch0Var != null && cch0Var.r);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        cch0 cch0Var = this.g;
        MaterialCardView materialCardView = cch0Var.a;
        MaterialCardView materialCardView2 = cch0Var.a;
        if (cch0Var.o != null) {
            int i5 = cch0Var.e;
            int i6 = cch0Var.f;
            int iCeil = (measuredWidth - i5) - i6;
            int iCeil2 = (measuredHeight - i5) - i6;
            if (materialCardView.getUseCompatPadding()) {
                iCeil2 -= (int) Math.ceil(((materialCardView2.getMaxCardElevation() * 1.5f) + (cch0Var.g() ? cch0Var.a() : 0.0f)) * 2.0f);
                iCeil -= (int) Math.ceil((materialCardView2.getMaxCardElevation() + (cch0Var.g() ? cch0Var.a() : 0.0f)) * 2.0f);
            }
            int i7 = iCeil2;
            int i8 = cch0Var.e;
            WeakHashMap weakHashMap = b8k1.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = iCeil;
                i3 = i8;
            } else {
                i3 = iCeil;
                i4 = i8;
            }
            cch0Var.o.setLayerInset(2, i3, cch0Var.e, i4, i7);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            cch0 cch0Var = this.g;
            if (!cch0Var.q) {
                cch0Var.q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.g.c.m(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        cch0 cch0Var = this.g;
        cch0Var.c.l(cch0Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        gch0 gch0Var = this.g.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gch0Var.m(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.g.r = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.e(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.g.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.g.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.g.e(f0o1.j(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.g.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.g.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        cch0 cch0Var = this.g;
        cch0Var.k = colorStateList;
        Drawable drawable = cch0Var.i;
        if (drawable != null) {
            y1a1.U(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        cch0 cch0Var = this.g;
        if (cch0Var != null) {
            Drawable drawable = cch0Var.h;
            MaterialCardView materialCardView = cch0Var.a;
            Drawable drawableC = materialCardView.isClickable() ? cch0Var.c() : cch0Var.d;
            cch0Var.h = drawableC;
            if (drawable != drawableC) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
                } else {
                    materialCardView.setForeground(cch0Var.d(drawableC));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.t != z) {
            this.t = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.i();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        cch0 cch0Var = this.g;
        cch0Var.i();
        cch0Var.h();
    }

    public void setProgress(float f) {
        cch0 cch0Var = this.g;
        cch0Var.c.n(f);
        gch0 gch0Var = cch0Var.d;
        if (gch0Var != null) {
            gch0Var.n(f);
        }
        gch0 gch0Var2 = cch0Var.f21p;
        if (gch0Var2 != null) {
            gch0Var2.n(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        cch0 cch0Var = this.g;
        cch0Var.f(cch0Var.l.e(f));
        cch0Var.h.invalidateSelf();
        if (cch0Var.g() || (cch0Var.a.getPreventCornerOverlap() && !cch0Var.c.k())) {
            cch0Var.h();
        }
        if (cch0Var.g()) {
            cch0Var.i();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        cch0 cch0Var = this.g;
        cch0Var.j = colorStateList;
        RippleDrawable rippleDrawable = cch0Var.n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListI = f0o1.i(getContext(), i);
        cch0 cch0Var = this.g;
        cch0Var.j = colorStateListI;
        RippleDrawable rippleDrawable = cch0Var.n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListI);
        }
    }

    @Override // p.jx61
    public void setShapeAppearanceModel(iw61 iw61Var) {
        setClipToOutline(iw61Var.d(getBoundsAsRectF()));
        this.g.f(iw61Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        cch0 cch0Var = this.g;
        if (cch0Var.m != colorStateList) {
            cch0Var.m = colorStateList;
            gch0 gch0Var = cch0Var.d;
            gch0Var.a.j = cch0Var.g;
            gch0Var.invalidateSelf();
            fch0 fch0Var = gch0Var.a;
            if (fch0Var.d != colorStateList) {
                fch0Var.d = colorStateList;
                gch0Var.onStateChange(gch0Var.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        cch0 cch0Var = this.g;
        if (i != cch0Var.g) {
            cch0Var.g = i;
            gch0 gch0Var = cch0Var.d;
            ColorStateList colorStateList = cch0Var.m;
            gch0Var.a.j = i;
            gch0Var.invalidateSelf();
            fch0 fch0Var = gch0Var.a;
            if (fch0Var.d != colorStateList) {
                fch0Var.d = colorStateList;
                gch0Var.onStateChange(gch0Var.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        cch0 cch0Var = this.g;
        cch0Var.i();
        cch0Var.h();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        cch0 cch0Var = this.g;
        if (cch0Var != null && cch0Var.r && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            b();
            boolean z = this.i;
            Drawable drawable = cch0Var.i;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.c.m(colorStateList);
    }

    public void setOnCheckedChangeListener(ach0 ach0Var) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969720);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
