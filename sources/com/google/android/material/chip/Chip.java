package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import p.a4e1;
import p.b8k1;
import p.blo1;
import p.d4e1;
import p.dgo1;
import p.f0o1;
import p.gch0;
import p.ggo1;
import p.hhg1;
import p.ira;
import p.iw61;
import p.jg;
import p.jx61;
import p.k0e1;
import p.k2g;
import p.l2g;
import p.lnm0;
import p.n2g;
import p.o0c;
import p.omz0;
import p.q3g;
import p.rf;
import p.svh0;
import p.u890;
import p.x74;
import p.y4o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class Chip extends AppCompatCheckBox implements jx61 {
    public static final Rect Y0 = new Rect();
    public static final int[] Z0 = {R.attr.state_selected};
    public static final int[] a1 = {R.attr.state_checkable};
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public final n2g T0;
    public boolean U0;
    public final Rect V0;
    public final RectF W0;
    public final k2g X0;
    public q3g e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.graphics.drawable.Drawable, p.gch0, p.q3g] */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(u890.J(context, attributeSet, i, 2132018780), attributeSet, i);
        this.V0 = new Rect();
        this.W0 = new RectF();
        this.X0 = new k2g(this, (byte) 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                hhg1.h("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                hhg1.h("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                hhg1.h("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                hhg1.h("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                hhg1.h("Chip does not support multi-line text");
                throw null;
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        ?? q3gVar = new q3g(context2, attributeSet, i);
        Context context3 = q3gVar.E1;
        int[] iArr = omz0.g;
        TypedArray typedArrayS = blo1.s(context3, attributeSet, iArr, i, 2132018780, new int[0]);
        q3gVar.e2 = typedArrayS.hasValue(37);
        Context context4 = q3gVar.E1;
        ColorStateList colorStateListI = dgo1.i(context4, typedArrayS, 24);
        if (q3gVar.X0 != colorStateListI) {
            q3gVar.X0 = colorStateListI;
            q3gVar.onStateChange(q3gVar.getState());
        }
        ColorStateList colorStateListI2 = dgo1.i(context4, typedArrayS, 11);
        if (q3gVar.Y0 != colorStateListI2) {
            q3gVar.Y0 = colorStateListI2;
            q3gVar.onStateChange(q3gVar.getState());
        }
        float dimension = typedArrayS.getDimension(19, 0.0f);
        if (q3gVar.Z0 != dimension) {
            q3gVar.Z0 = dimension;
            q3gVar.invalidateSelf();
            q3gVar.B();
        }
        if (typedArrayS.hasValue(12)) {
            q3gVar.H(typedArrayS.getDimension(12, 0.0f));
        }
        q3gVar.M(dgo1.i(context4, typedArrayS, 22));
        q3gVar.N(typedArrayS.getDimension(23, 0.0f));
        q3gVar.W(dgo1.i(context4, typedArrayS, 36));
        String text = typedArrayS.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(q3gVar.e1, text);
        d4e1 d4e1Var = q3gVar.K1;
        if (!zEquals) {
            q3gVar.e1 = text;
            d4e1Var.d = true;
            q3gVar.invalidateSelf();
            q3gVar.B();
        }
        k0e1 k0e1Var = (!typedArrayS.hasValue(0) || (resourceId3 = typedArrayS.getResourceId(0, 0)) == 0) ? null : new k0e1(context4, resourceId3);
        k0e1Var.k = typedArrayS.getDimension(1, k0e1Var.k);
        d4e1Var.b(k0e1Var, context4);
        int i2 = typedArrayS.getInt(3, 0);
        if (i2 == 1) {
            q3gVar.b2 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            q3gVar.b2 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            q3gVar.b2 = TextUtils.TruncateAt.END;
        }
        q3gVar.L(typedArrayS.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            q3gVar.L(typedArrayS.getBoolean(15, false));
        }
        q3gVar.I(dgo1.l(context4, typedArrayS, 14));
        if (typedArrayS.hasValue(17)) {
            q3gVar.K(dgo1.i(context4, typedArrayS, 17));
        }
        q3gVar.J(typedArrayS.getDimension(16, -1.0f));
        q3gVar.T(typedArrayS.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            q3gVar.T(typedArrayS.getBoolean(26, false));
        }
        q3gVar.O(dgo1.l(context4, typedArrayS, 25));
        q3gVar.S(dgo1.i(context4, typedArrayS, 30));
        q3gVar.Q(typedArrayS.getDimension(28, 0.0f));
        q3gVar.D(typedArrayS.getBoolean(6, false));
        q3gVar.G(typedArrayS.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            q3gVar.G(typedArrayS.getBoolean(8, false));
        }
        q3gVar.E(dgo1.l(context4, typedArrayS, 7));
        if (typedArrayS.hasValue(9)) {
            q3gVar.F(dgo1.i(context4, typedArrayS, 9));
        }
        q3gVar.u1 = (!typedArrayS.hasValue(39) || (resourceId2 = typedArrayS.getResourceId(39, 0)) == 0) ? null : lnm0.a(context4, resourceId2);
        q3gVar.v1 = (!typedArrayS.hasValue(33) || (resourceId = typedArrayS.getResourceId(33, 0)) == 0) ? null : lnm0.a(context4, resourceId);
        float dimension2 = typedArrayS.getDimension(21, 0.0f);
        if (q3gVar.w1 != dimension2) {
            q3gVar.w1 = dimension2;
            q3gVar.invalidateSelf();
            q3gVar.B();
        }
        q3gVar.V(typedArrayS.getDimension(35, 0.0f));
        q3gVar.U(typedArrayS.getDimension(34, 0.0f));
        float dimension3 = typedArrayS.getDimension(41, 0.0f);
        if (q3gVar.z1 != dimension3) {
            q3gVar.z1 = dimension3;
            q3gVar.invalidateSelf();
            q3gVar.B();
        }
        float dimension4 = typedArrayS.getDimension(40, 0.0f);
        if (q3gVar.A1 != dimension4) {
            q3gVar.A1 = dimension4;
            q3gVar.invalidateSelf();
            q3gVar.B();
        }
        q3gVar.R(typedArrayS.getDimension(29, 0.0f));
        q3gVar.P(typedArrayS.getDimension(27, 0.0f));
        float dimension5 = typedArrayS.getDimension(13, 0.0f);
        if (q3gVar.D1 != dimension5) {
            q3gVar.D1 = dimension5;
            q3gVar.invalidateSelf();
            q3gVar.B();
        }
        q3gVar.d2 = typedArrayS.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayS.recycle();
        blo1.m(context2, attributeSet, i, 2132018780);
        blo1.n(context2, attributeSet, iArr, i, 2132018780, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132018780);
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.S0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(o0c.x(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(q3gVar);
        WeakHashMap weakHashMap = b8k1.a;
        q3gVar.l(getElevation());
        blo1.m(context2, attributeSet, i, 2132018780);
        blo1.n(context2, attributeSet, iArr, i, 2132018780, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132018780);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.T0 = new n2g(this, this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new l2g(this));
        }
        setChecked(this.t);
        setText(q3gVar.e1);
        setEllipsize(q3gVar.b2);
        i();
        if (!this.e.c2) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.Q0) {
            setMinHeight(this.S0);
        }
        this.R0 = getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.graphics.drawable.Drawable, p.q3g] */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.W0;
        rectF.setEmpty();
        if (e() && this.h != null) {
            ?? r4 = this.e;
            Rect bounds = r4.getBounds();
            rectF.setEmpty();
            if (r4.Z()) {
                float f = r4.D1 + r4.C1 + r4.o1 + r4.B1 + r4.A1;
                if (r4.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.V0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private k0e1 getTextAppearance() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.K1.f;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCloseIconHovered(boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCloseIconPressed(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i) {
        this.S0 = i;
        if (!this.Q0) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.Z0));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.U0) {
            return this.T0.dispatchHoverEvent(motionEvent) || super/*android.view.View*/.dispatchHoverEvent(motionEvent);
        }
        return super/*android.view.View*/.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.U0) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        n2g n2gVar = this.T0;
        if (!n2gVar.dispatchKeyEvent(keyEvent) || n2gVar.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable, p.q3g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
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
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        q3g q3gVar = this.e;
        boolean zC = false;
        if (q3gVar != null && q3g.A(q3gVar.l1)) {
            ?? r0 = this.e;
            ?? IsEnabled = isEnabled();
            if (this.P0) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.O0) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.N0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.P0) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.O0) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.N0) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(r0.Y1, iArr)) {
                r0.Y1 = iArr;
                if (r0.Z()) {
                    zC = r0.C(r0.getState(), iArr);
                }
            }
        }
        if (zC) {
            invalidate();
        }
    }

    public final boolean e() {
        q3g q3gVar = this.e;
        if (q3gVar == null) {
            return false;
        }
        Drawable drawable = q3gVar.l1;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        q3g q3gVar;
        if (!e() || (q3gVar = this.e) == null || !q3gVar.k1 || this.h == null) {
            b8k1.p(this, (rf) null);
            this.U0 = false;
        } else {
            b8k1.p(this, this.T0);
            this.U0 = true;
        }
    }

    public final void g() {
        this.g = new RippleDrawable(y4o1.w(this.e.d1), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable rippleDrawable = this.g;
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(rippleDrawable);
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharSequence getAccessibilityClassName() {
        q3g q3gVar = this.e;
        if (q3gVar == null || !q3gVar.q1) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).g) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.s1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.t1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.Y0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return Math.max(0.0f, q3gVar.y());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.D1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        q3g q3gVar = this.e;
        if (q3gVar == null || (drawable = q3gVar.g1) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.i1;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.h1;
        }
        return null;
    }

    public float getChipMinHeight() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.Z0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.w1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.b1;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.c1;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        q3g q3gVar = this.e;
        if (q3gVar == null || (drawable = q3gVar.l1) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.p1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.C1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.o1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.B1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.n1;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.b2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getFocusedRect(Rect rect) {
        if (this.U0) {
            n2g n2gVar = this.T0;
            if (n2gVar.getKeyboardFocusedVirtualViewId() == 1 || n2gVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super/*android.view.View*/.getFocusedRect(rect);
    }

    public lnm0 getHideMotionSpec() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.v1;
        }
        return null;
    }

    public float getIconEndPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.y1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.x1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.d1;
        }
        return null;
    }

    public iw61 getShapeAppearanceModel() {
        return ((gch0) this.e).a.a;
    }

    public lnm0 getShowMotionSpec() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.u1;
        }
        return null;
    }

    public float getTextEndPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.A1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            return q3gVar.z1;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        q3g q3gVar;
        if (TextUtils.isEmpty(getText()) || (q3gVar = this.e) == null) {
            return;
        }
        int iX = (int) (q3gVar.x() + q3gVar.D1 + q3gVar.A1);
        q3g q3gVar2 = this.e;
        int iW = (int) (q3gVar2.w() + q3gVar2.w1 + q3gVar2.z1);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iW += rect.left;
            iX += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = b8k1.a;
        setPaddingRelative(iW, paddingTop, iX, paddingBottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        TextPaint paint = getPaint();
        gch0 gch0Var = this.e;
        if (gch0Var != null) {
            paint.drawableState = gch0Var.getState();
        }
        k0e1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.X0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        ggo1.N(this, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Z0);
        }
        q3g q3gVar = this.e;
        if (q3gVar != null && q3gVar.q1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, a1);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super/*android.view.View*/.onFocusChanged(z, i, rect);
        if (this.U0) {
            this.T0.onFocusChanged(z, i, rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super/*android.view.View*/.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        q3g q3gVar = this.e;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(q3gVar != null && q3gVar.q1);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.c) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                if (chipGroup.getChildAt(i2) instanceof Chip) {
                    if (((Chip) chipGroup.getChildAt(i2)) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(2131430714);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) jg.b(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRtlPropertiesChanged(int i) {
        super/*android.view.View*/.onRtlPropertiesChanged(i);
        if (this.R0 != i) {
            this.R0 = i;
            h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.N0) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.N0) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.U0) {
                        this.T0.sendEventForVirtualView(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super/*android.view.View*/.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.D(z);
        }
    }

    public void setCheckableResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.D(q3gVar.E1.getResources().getBoolean(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        q3g q3gVar = this.e;
        if (q3gVar == null) {
            this.t = z;
            return;
        }
        if (q3gVar.q1) {
            boolean zIsChecked = isChecked();
            super/*android.widget.CompoundButton*/.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.E(f0o1.j(q3gVar.E1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.F(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.F(x74.E(q3gVar.E1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.G(q3gVar.E1.getResources().getBoolean(i));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable, p.q3g] */
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
    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ?? r1 = this.e;
        if (r1 == 0 || r1.Y0 == colorStateList) {
            return;
        }
        r1.Y0 = colorStateList;
        r1.onStateChange(r1.getState());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable, p.q3g] */
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
    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListE;
        ?? r1 = this.e;
        if (r1 == 0 || r1.Y0 == (colorStateListE = x74.E(r1.E1, i))) {
            return;
        }
        r1.Y0 = colorStateListE;
        r1.onStateChange(r1.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.H(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.H(q3gVar.E1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(q3g q3gVar) {
        q3g q3gVar2 = this.e;
        if (q3gVar2 != q3gVar) {
            if (q3gVar2 != null) {
                q3gVar2.a2 = new WeakReference(null);
            }
            this.e = q3gVar;
            q3gVar.c2 = false;
            q3gVar.a2 = new WeakReference(this);
            d(this.S0);
        }
    }

    public void setChipEndPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar == null || q3gVar.D1 == f) {
            return;
        }
        q3gVar.D1 = f;
        q3gVar.invalidateSelf();
        q3gVar.B();
    }

    public void setChipEndPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            float dimension = q3gVar.E1.getResources().getDimension(i);
            if (q3gVar.D1 != dimension) {
                q3gVar.D1 = dimension;
                q3gVar.invalidateSelf();
                q3gVar.B();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.I(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.I(f0o1.j(q3gVar.E1, i));
        }
    }

    public void setChipIconSize(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.J(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.J(q3gVar.E1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.K(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.K(x74.E(q3gVar.E1, i));
        }
    }

    public void setChipIconVisible(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.L(q3gVar.E1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        q3g q3gVar = this.e;
        if (q3gVar == null || q3gVar.Z0 == f) {
            return;
        }
        q3gVar.Z0 = f;
        q3gVar.invalidateSelf();
        q3gVar.B();
    }

    public void setChipMinHeightResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            float dimension = q3gVar.E1.getResources().getDimension(i);
            if (q3gVar.Z0 != dimension) {
                q3gVar.Z0 = dimension;
                q3gVar.invalidateSelf();
                q3gVar.B();
            }
        }
    }

    public void setChipStartPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar == null || q3gVar.w1 == f) {
            return;
        }
        q3gVar.w1 = f;
        q3gVar.invalidateSelf();
        q3gVar.B();
    }

    public void setChipStartPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            float dimension = q3gVar.E1.getResources().getDimension(i);
            if (q3gVar.w1 != dimension) {
                q3gVar.w1 = dimension;
                q3gVar.invalidateSelf();
                q3gVar.B();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.M(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.M(x74.E(q3gVar.E1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.N(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.N(q3gVar.E1.getResources().getDimension(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.O(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        q3g q3gVar = this.e;
        if (q3gVar == null || q3gVar.p1 == charSequence) {
            return;
        }
        ira iraVarC = ira.c();
        iraVarC.getClass();
        svh0 svh0Var = a4e1.a;
        q3gVar.p1 = iraVarC.d(charSequence);
        q3gVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.P(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.P(q3gVar.E1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.O(f0o1.j(q3gVar.E1, i));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.Q(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.Q(q3gVar.E1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.R(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.R(q3gVar.E1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.S(x74.E(q3gVar.E1, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            hhg1.h("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            hhg1.h("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            hhg1.h("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            hhg1.h("Please set end drawable using R.attr#closeIcon.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            hhg1.h("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super/*android.widget.TextView*/.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            hhg1.h("Please set end drawable using R.attr#closeIcon.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            hhg1.h("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super/*android.widget.TextView*/.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            hhg1.h("Please set end drawable using R.attr#closeIcon.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.l(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            hhg1.h("Text within a chip are not allowed to scroll.");
            return;
        }
        super/*android.widget.TextView*/.setEllipsize(truncateAt);
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.b2 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.Q0 = z;
        d(this.S0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super/*android.widget.TextView*/.setGravity(i);
    }

    public void setHideMotionSpec(lnm0 lnm0Var) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.v1 = lnm0Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.v1 = lnm0.a(q3gVar.E1, i);
        }
    }

    public void setIconEndPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.U(q3gVar.E1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.V(q3gVar.E1.getResources().getDimension(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super/*android.view.View*/.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLines(int i) {
        if (i <= 1) {
            super/*android.widget.TextView*/.setLines(i);
        } else {
            hhg1.h("Chip does not support multi-line text");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int i) {
        if (i <= 1) {
            super/*android.widget.TextView*/.setMaxLines(i);
        } else {
            hhg1.h("Chip does not support multi-line text");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxWidth(int i) {
        super/*android.widget.TextView*/.setMaxWidth(i);
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.d2 = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMinLines(int i) {
        if (i <= 1) {
            super/*android.widget.TextView*/.setMinLines(i);
        } else {
            hhg1.h("Chip does not support multi-line text");
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.W(colorStateList);
        }
        this.e.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.W(x74.E(q3gVar.E1, i));
            this.e.getClass();
            g();
        }
    }

    public void setShapeAppearanceModel(iw61 iw61Var) {
        this.e.setShapeAppearanceModel(iw61Var);
    }

    public void setShowMotionSpec(lnm0 lnm0Var) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.u1 = lnm0Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.u1 = lnm0.a(q3gVar.E1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSingleLine(boolean z) {
        if (z) {
            super/*android.widget.TextView*/.setSingleLine(z);
        } else {
            hhg1.h("Chip does not support multi-line text");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        q3g q3gVar = this.e;
        if (q3gVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super/*android.widget.TextView*/.setText(q3gVar.c2 ? null : charSequence, bufferType);
        q3g q3gVar2 = this.e;
        if (q3gVar2 == null || TextUtils.equals(q3gVar2.e1, charSequence)) {
            return;
        }
        q3gVar2.e1 = charSequence;
        q3gVar2.K1.d = true;
        q3gVar2.invalidateSelf();
        q3gVar2.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextAppearance(Context context, int i) {
        super/*android.widget.TextView*/.setTextAppearance(context, i);
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            Context context2 = q3gVar.E1;
            q3gVar.K1.b(new k0e1(context2, i), context2);
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar == null || q3gVar.A1 == f) {
            return;
        }
        q3gVar.A1 = f;
        q3gVar.invalidateSelf();
        q3gVar.B();
    }

    public void setTextEndPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            float dimension = q3gVar.E1.getResources().getDimension(i);
            if (q3gVar.A1 != dimension) {
                q3gVar.A1 = dimension;
                q3gVar.invalidateSelf();
                q3gVar.B();
            }
        }
    }

    public void setTextStartPadding(float f) {
        q3g q3gVar = this.e;
        if (q3gVar == null || q3gVar.z1 == f) {
            return;
        }
        q3gVar.z1 = f;
        q3gVar.invalidateSelf();
        q3gVar.B();
    }

    public void setTextStartPaddingResource(int i) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            float dimension = q3gVar.E1.getResources().getDimension(i);
            if (q3gVar.z1 != dimension) {
                q3gVar.z1 = dimension;
                q3gVar.invalidateSelf();
                q3gVar.B();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.T(z);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.G(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.L(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            hhg1.h("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super/*android.widget.TextView*/.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            hhg1.h("Please set end drawable using R.attr#closeIcon.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            hhg1.h("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super/*android.widget.TextView*/.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            hhg1.h("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(k0e1 k0e1Var) {
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            q3gVar.K1.b(k0e1Var, q3gVar.E1);
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(int i) {
        super/*android.widget.TextView*/.setTextAppearance(i);
        q3g q3gVar = this.e;
        if (q3gVar != null) {
            Context context = q3gVar.E1;
            q3gVar.K1.b(new k0e1(context, i), context);
        }
        i();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968969);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
