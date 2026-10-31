package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import p.a4x;
import p.a8v;
import p.b8k1;
import p.bl5;
import p.f0o1;
import p.fk5;
import p.in3;
import p.j5x;
import p.kfe1;
import p.lvc1;
import p.moz0;
import p.nce;
import p.sik1;
import p.w0h1;
import p.y1a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final nce u1 = new nce((byte) 11);
    public static final int[] v1 = {R.attr.state_checked};
    public int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public CharSequence R0;
    public CharSequence S0;
    public CharSequence T0;
    public CharSequence U0;
    public boolean V0;
    public byte W0;
    public final int X0;
    public float Y0;
    public float Z0;
    public Drawable a;
    public final VelocityTracker a1;
    public ColorStateList b;
    public final int b1;
    public PorterDuff.Mode c;
    public float c1;
    public boolean d;
    public int d1;
    public boolean e;
    public int e1;
    public Drawable f;
    public int f1;
    public ColorStateList g;
    public int g1;
    public PorterDuff.Mode h;
    public int h1;
    public boolean i;
    public int i1;
    public int j1;
    public boolean k1;
    public final TextPaint l1;
    public final ColorStateList m1;
    public StaticLayout n1;
    public StaticLayout o1;
    public final in3 p1;
    public ObjectAnimator q1;
    public fk5 r1;
    public j5x s1;
    public boolean t;
    public final Rect t1;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.t = false;
        this.a1 = VelocityTracker.obtain();
        this.k1 = true;
        this.t1 = new Rect();
        kfe1.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.l1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = moz0.w;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        b8k1.o(this, context, iArr, attributeSet, lvc1VarE.w(), i);
        Drawable drawableK = lvc1VarE.k(2);
        this.a = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(this);
        }
        Drawable drawableK2 = lvc1VarE.k(11);
        this.f = drawableK2;
        if (drawableK2 != null) {
            drawableK2.setCallback(this);
        }
        setTextOnInternal(lvc1VarE.v(0));
        setTextOffInternal(lvc1VarE.v(1));
        this.V0 = lvc1VarE.d(3, true);
        this.N0 = lvc1VarE.i(8, 0);
        this.O0 = lvc1VarE.i(5, 0);
        this.P0 = lvc1VarE.i(6, 0);
        this.Q0 = lvc1VarE.d(4, false);
        ColorStateList colorStateListG = lvc1VarE.g(9);
        if (colorStateListG != null) {
            this.b = colorStateListG;
            this.d = true;
        }
        PorterDuff.Mode modeC = a8v.c(lvc1VarE.n(10, -1), null);
        if (this.c != modeC) {
            this.c = modeC;
            this.e = true;
        }
        if (this.d || this.e) {
            a();
        }
        ColorStateList colorStateListG2 = lvc1VarE.g(12);
        if (colorStateListG2 != null) {
            this.g = colorStateListG2;
            this.i = true;
        }
        PorterDuff.Mode modeC2 = a8v.c(lvc1VarE.n(13, -1), null);
        if (this.h != modeC2) {
            this.h = modeC2;
            this.t = true;
        }
        if (this.i || this.t) {
            b();
        }
        int iQ = lvc1VarE.q(7, 0);
        if (iQ != 0) {
            lvc1 lvc1VarC = lvc1.C(context, iQ, moz0.x);
            ColorStateList colorStateListG3 = lvc1VarC.g(3);
            if (colorStateListG3 != null) {
                this.m1 = colorStateListG3;
            } else {
                this.m1 = getTextColors();
            }
            int i2 = lvc1VarC.i(0, 0);
            if (i2 != 0) {
                float f = i2;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iN = lvc1VarC.n(1, -1);
            int iN2 = lvc1VarC.n(2, -1);
            if (iN == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iN != 2) {
                typeface = iN != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (iN2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(iN2) : Typeface.create(typeface, iN2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & iN2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (lvc1VarC.d(14, false)) {
                this.p1 = new in3(getContext());
            } else {
                this.p1 = null;
            }
            setTextOnInternal(this.R0);
            setTextOffInternal(this.T0);
            lvc1VarC.I();
        }
        new bl5(this).o(attributeSet, i);
        lvc1VarE.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.X0 = viewConfiguration.getScaledTouchSlop();
        this.b1 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private fk5 getEmojiTextViewHelper() {
        fk5 fk5Var = this.r1;
        if (fk5Var != null) {
            return fk5Var;
        }
        fk5 fk5Var2 = new fk5(this);
        this.r1 = fk5Var2;
        return fk5Var2;
    }

    private boolean getTargetCheckedState() {
        return this.c1 > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = sik1.a;
        int layoutDirection = getLayoutDirection();
        float f = this.c1;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.t1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectB = drawable2 != null ? a8v.b(drawable2) : a8v.c;
        return ((((this.d1 - this.f1) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.T0 = charSequence;
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.p1);
        if (transformationMethodF != null) {
            charSequence = transformationMethodF.getTransformation(charSequence, this);
        }
        this.U0 = charSequence;
        this.o1 = null;
        if (this.V0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.R0 = charSequence;
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.p1);
        if (transformationMethodF != null) {
            charSequence = transformationMethodF.getTransformation(charSequence, this);
        }
        this.S0 = charSequence;
        this.n1 = null;
        if (this.V0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    y1a1.U(drawableMutate, this.b);
                }
                if (this.e) {
                    y1a1.V(this.a, this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.t) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    y1a1.U(drawableMutate, this.g);
                }
                if (this.t) {
                    y1a1.V(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.R0);
        setTextOffInternal(this.T0);
        requestLayout();
    }

    public final void d() {
        if (this.s1 == null && this.r1.b() && a4x.d()) {
            a4x a4xVarA = a4x.a();
            int iC = a4xVarA.c();
            if (iC == 3 || iC == 0) {
                j5x j5xVar = new j5x(this);
                this.s1 = j5xVar;
                a4xVarA.i(j5xVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.g1;
        int i4 = this.h1;
        int i5 = this.i1;
        int i6 = this.j1;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect rectB = drawable != null ? a8v.b(drawable) : a8v.c;
        Drawable drawable2 = this.f;
        Rect rect = this.t1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1 + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                y1a1.Q(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.P(drawable, f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            y1a1.P(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = sik1.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.d1;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.P0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = sik1.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.d1;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.P0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w0h1.P(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.V0;
    }

    public boolean getSplitTrack() {
        return this.Q0;
    }

    public int getSwitchMinWidth() {
        return this.O0;
    }

    public int getSwitchPadding() {
        return this.P0;
    }

    public CharSequence getTextOff() {
        return this.T0;
    }

    public CharSequence getTextOn() {
        return this.R0;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.c1;
    }

    public int getThumbTextPadding() {
        return this.N0;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.q1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.q1.end();
        this.q1 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, v1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.t1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.h1;
        int i2 = this.j1;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.Q0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = a8v.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.n1 : this.o1;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.l1;
            ColorStateList colorStateList = this.m1;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.R0 : this.T0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Drawable drawable = this.f;
            Rect rect = this.t1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = a8v.b(this.a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = sik1.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.d1 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.d1) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.e1;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.e1 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.e1;
        }
        this.g1 = paddingLeft;
        this.h1 = paddingTop;
        this.j1 = height;
        this.i1 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.V0) {
            StaticLayout staticLayout = this.n1;
            TextPaint textPaint = this.l1;
            if (staticLayout == null) {
                CharSequence charSequence = this.S0;
                this.n1 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.o1 == null) {
                CharSequence charSequence2 = this.U0;
                this.o1 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.t1;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.V0) {
            iMax = (this.N0 * 2) + Math.max(this.n1.getWidth(), this.o1.getWidth());
        } else {
            iMax = 0;
        }
        this.f1 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectB = a8v.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.k1;
        int iMax4 = this.O0;
        if (z) {
            iMax4 = Math.max(iMax4, (this.f1 * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.d1 = iMax4;
        this.e1 = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.R0 : this.T0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.a1;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.X0;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.W0 == 2) {
                    this.W0 = (byte) 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.b1) {
                            boolean z2 = sik1.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.W0 = (byte) 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                byte b = this.W0;
                if (b == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.Y0) > f3 || Math.abs(y - this.Z0) > f3) {
                        this.W0 = (byte) 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.Y0 = x;
                        this.Z0 = y;
                        return true;
                    }
                } else if (b == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.Y0;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = sik1.a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.c1;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.Y0 = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.W0 == 2) {
                    this.W0 = (byte) 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.b1) {
                            boolean z4 = sik1.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.W0 = (byte) 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.a;
                Rect rect = this.t1;
                drawable.getPadding(rect);
                int i2 = this.h1 - i;
                int i3 = (this.g1 + thumbOffset) - i;
                int i4 = this.f1 + i3 + rect.left + rect.right + i;
                int i5 = this.j1 + i;
                if (x3 > i3 && x3 < i4 && y2 > i2 && y2 < i5) {
                    this.W0 = (byte) 1;
                    this.Y0 = x3;
                    this.Z0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.R0;
                if (string == null) {
                    string = getResources().getString(2131951631);
                }
                b8k1.t(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.T0;
            if (string2 == null) {
                string2 = getResources().getString(2131951630);
            }
            b8k1.t(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.q1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) u1, zIsChecked ? 1.0f : 0.0f);
        this.q1 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.q1.setAutoCancel(true);
        this.q1.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w0h1.Q(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.R0);
        setTextOffInternal(this.T0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.k1 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.Q0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.O0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.P0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.l1;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.T0;
        if (string == null) {
            string = getResources().getString(2131951630);
        }
        b8k1.t(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.R0;
        if (string == null) {
            string = getResources().getString(2131951631);
        }
        b8k1.t(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.c1 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(f0o1.j(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.N0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(f0o1.j(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.t = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970337);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
