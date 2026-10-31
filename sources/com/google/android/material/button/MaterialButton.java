package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p.b8k1;
import p.blo1;
import p.d4e0;
import p.dgo1;
import p.eg;
import p.f0o1;
import p.ggo1;
import p.hhg1;
import p.iw61;
import p.jx61;
import p.kj5;
import p.o0c;
import p.omz0;
import p.rbh0;
import p.sbh0;
import p.tbh0;
import p.u890;
import p.ubh0;
import p.y1a1;
import p.y4o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class MaterialButton extends kj5 implements Checkable, jx61 {
    public static final int[] U0 = {R.attr.state_checkable};
    public static final int[] V0 = {R.attr.state_checked};
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public final tbh0 e;
    public final LinkedHashSet f;
    public rbh0 g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public Drawable t;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018766), attributeSet, i);
        this.f = new LinkedHashSet();
        this.R0 = false;
        this.S0 = false;
        Context context2 = getContext();
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.u, i, 2132018766, new int[0]);
        this.Q0 = typedArrayS.getDimensionPixelSize(12, 0);
        int i2 = typedArrayS.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.h = o0c.I(i2, mode);
        this.i = dgo1.i(getContext(), typedArrayS, 14);
        this.t = dgo1.l(getContext(), typedArrayS, 10);
        this.T0 = typedArrayS.getInteger(11, 1);
        this.N0 = typedArrayS.getDimensionPixelSize(13, 0);
        tbh0 tbh0Var = new tbh0(this, iw61.b(context2, attributeSet, i, 2132018766).d());
        this.e = tbh0Var;
        tbh0Var.c = typedArrayS.getDimensionPixelOffset(1, 0);
        tbh0Var.d = typedArrayS.getDimensionPixelOffset(2, 0);
        tbh0Var.e = typedArrayS.getDimensionPixelOffset(3, 0);
        tbh0Var.f = typedArrayS.getDimensionPixelOffset(4, 0);
        if (typedArrayS.hasValue(8)) {
            int dimensionPixelSize = typedArrayS.getDimensionPixelSize(8, -1);
            tbh0Var.g = dimensionPixelSize;
            tbh0Var.c(tbh0Var.b.e(dimensionPixelSize));
            tbh0Var.f114p = true;
        }
        tbh0Var.h = typedArrayS.getDimensionPixelSize(20, 0);
        tbh0Var.i = o0c.I(typedArrayS.getInt(7, -1), mode);
        tbh0Var.j = dgo1.i(getContext(), typedArrayS, 6);
        tbh0Var.k = dgo1.i(getContext(), typedArrayS, 19);
        tbh0Var.l = dgo1.i(getContext(), typedArrayS, 16);
        tbh0Var.q = typedArrayS.getBoolean(5, false);
        tbh0Var.s = typedArrayS.getDimensionPixelSize(9, 0);
        WeakHashMap weakHashMap = b8k1.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayS.hasValue(0)) {
            tbh0Var.o = true;
            setSupportBackgroundTintList(tbh0Var.j);
            setSupportBackgroundTintMode(tbh0Var.i);
        } else {
            tbh0Var.e();
        }
        setPaddingRelative(paddingStart + tbh0Var.c, paddingTop + tbh0Var.e, paddingEnd + tbh0Var.d, paddingBottom + tbh0Var.f);
        typedArrayS.recycle();
        setCompoundDrawablePadding(this.Q0);
        d(this.t != null);
    }

    private String getA11yClassName() {
        tbh0 tbh0Var = this.e;
        return ((tbh0Var == null || !tbh0Var.q) ? Button.class : CompoundButton.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public final boolean b() {
        tbh0 tbh0Var = this.e;
        return (tbh0Var == null || tbh0Var.o) ? false : true;
    }

    public final void c() {
        int i = this.T0;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.t, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.t, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.t, null, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.t;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.t = drawableMutate;
            y1a1.U(drawableMutate, this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                y1a1.V(this.t, mode);
            }
            int intrinsicWidth = this.N0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.t.getIntrinsicWidth();
            }
            int intrinsicHeight = this.N0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.t.getIntrinsicHeight();
            }
            Drawable drawable2 = this.t;
            int i = this.O0;
            int i2 = this.P0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.t.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.T0;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.t) || (((i3 == 3 || i3 == 4) && drawable5 != this.t) || ((i3 == 16 || i3 == 32) && drawable4 != this.t))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.t == null || getLayout() == null) {
            return;
        }
        int i3 = this.T0;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.O0 = 0;
                if (i3 == 16) {
                    this.P0 = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.N0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.t.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.Q0) - getPaddingBottom()) / 2;
                if (this.P0 != textHeight) {
                    this.P0 = textHeight;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.P0 = 0;
        if (i3 == 1 || i3 == 3) {
            this.O0 = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.N0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.t.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        WeakHashMap weakHashMap = b8k1.a;
        int paddingEnd = ((((textWidth - getPaddingEnd()) - intrinsicWidth) - this.Q0) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.T0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.O0 != paddingEnd) {
            this.O0 = paddingEnd;
            d(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.e.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.t;
    }

    public int getIconGravity() {
        return this.T0;
    }

    public int getIconPadding() {
        return this.Q0;
    }

    public int getIconSize() {
        return this.N0;
    }

    public ColorStateList getIconTint() {
        return this.i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.h;
    }

    public int getInsetBottom() {
        return this.e.f;
    }

    public int getInsetTop() {
        return this.e.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.e.l;
        }
        return null;
    }

    public iw61 getShapeAppearanceModel() {
        if (b()) {
            return this.e.b;
        }
        eg.m("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.e.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.e.h;
        }
        return 0;
    }

    @Override // p.kj5
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.e.j : super.getSupportBackgroundTintList();
    }

    @Override // p.kj5
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.e.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.R0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            ggo1.N(this, this.e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        tbh0 tbh0Var = this.e;
        if (tbh0Var != null && tbh0Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U0);
        }
        if (this.R0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.kj5, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.R0);
    }

    @Override // p.kj5, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        tbh0 tbh0Var = this.e;
        accessibilityNodeInfo.setCheckable(tbh0Var != null && tbh0Var.q);
        accessibilityNodeInfo.setChecked(this.R0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sbh0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sbh0 sbh0Var = (sbh0) parcelable;
        super.onRestoreInstanceState(sbh0Var.a());
        setChecked(sbh0Var.c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        sbh0 sbh0Var = new sbh0(super.onSaveInstanceState());
        sbh0Var.c = this.R0;
        return sbh0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // p.kj5, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.t != null) {
            if (this.t.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        tbh0 tbh0Var = this.e;
        if (tbh0Var.b(false) != null) {
            tbh0Var.b(false).setTint(i);
        }
    }

    @Override // p.kj5, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        tbh0 tbh0Var = this.e;
        tbh0Var.o = true;
        MaterialButton materialButton = tbh0Var.a;
        materialButton.setSupportBackgroundTintList(tbh0Var.j);
        materialButton.setSupportBackgroundTintMode(tbh0Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.kj5, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? f0o1.j(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.e.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        tbh0 tbh0Var = this.e;
        if (tbh0Var == null || !tbh0Var.q || !isEnabled() || this.R0 == z) {
            return;
        }
        this.R0 = z;
        refreshDrawableState();
        if (this.S0) {
            return;
        }
        this.S0 = true;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ubh0) it.next()).a(this, this.R0);
        }
        this.S0 = false;
    }

    public void setCornerRadius(int i) {
        if (b()) {
            tbh0 tbh0Var = this.e;
            if (tbh0Var.f114p && tbh0Var.g == i) {
                return;
            }
            tbh0Var.g = i;
            tbh0Var.f114p = true;
            tbh0Var.c(tbh0Var.b.e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.e.b(false).l(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.t != drawable) {
            this.t = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? f0o1.j(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            hhg1.n("iconSize cannot be less than 0");
        } else if (this.N0 != i) {
            this.N0 = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(f0o1.i(getContext(), i));
    }

    public void setInsetBottom(int i) {
        tbh0 tbh0Var = this.e;
        tbh0Var.d(tbh0Var.e, i);
    }

    public void setInsetTop(int i) {
        tbh0 tbh0Var = this.e;
        tbh0Var.d(i, tbh0Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(rbh0 rbh0Var) {
        this.g = rbh0Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        d4e0 d4e0Var = this.g;
        if (d4e0Var != null) {
            d4e0Var.m();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            tbh0 tbh0Var = this.e;
            MaterialButton materialButton = tbh0Var.a;
            if (tbh0Var.l != colorStateList) {
                tbh0Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(y4o1.w(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(f0o1.i(getContext(), i));
        }
    }

    @Override // p.jx61
    public void setShapeAppearanceModel(iw61 iw61Var) {
        if (b()) {
            this.e.c(iw61Var);
        } else {
            eg.m("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            tbh0 tbh0Var = this.e;
            tbh0Var.n = z;
            tbh0Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            tbh0 tbh0Var = this.e;
            if (tbh0Var.k != colorStateList) {
                tbh0Var.k = colorStateList;
                tbh0Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(f0o1.i(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            tbh0 tbh0Var = this.e;
            if (tbh0Var.h != i) {
                tbh0Var.h = i;
                tbh0Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p.kj5
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        tbh0 tbh0Var = this.e;
        if (tbh0Var.j != colorStateList) {
            tbh0Var.j = colorStateList;
            if (tbh0Var.b(false) != null) {
                y1a1.U(tbh0Var.b(false), tbh0Var.j);
            }
        }
    }

    @Override // p.kj5
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        tbh0 tbh0Var = this.e;
        if (tbh0Var.i != mode) {
            tbh0Var.i = mode;
            if (tbh0Var.b(false) == null || tbh0Var.i == null) {
                return;
            }
            y1a1.V(tbh0Var.b(false), tbh0Var.i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.R0);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969700);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
