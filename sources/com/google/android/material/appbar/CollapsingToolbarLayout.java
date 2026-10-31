package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.b8k1;
import p.blo1;
import p.dg8;
import p.dgo1;
import p.ghd;
import p.guw;
import p.hsl1;
import p.je5;
import p.kb5;
import p.odt;
import p.omz0;
import p.pzg;
import p.qzg;
import p.r7k1;
import p.rzg;
import p.u890;
import p.x74;
import p.xck1;
import p.y1a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public final pzg N0;
    public final guw O0;
    public boolean P0;
    public boolean Q0;
    public Drawable R0;
    public Drawable S0;
    public int T0;
    public boolean U0;
    public ValueAnimator V0;
    public long W0;
    public int X0;
    public rzg Y0;
    public int Z0;
    public boolean a;
    public int a1;
    public final int b;
    public hsl1 b1;
    public ViewGroup c;
    public int c1;
    public View d;
    public boolean d1;
    public View e;
    public int e1;
    public int f;
    public boolean f1;
    public int g;
    public int h;
    public int i;
    public final Rect t;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList colorStateListI;
        super(u890.J(context, attributeSet, i, 2132018537), attributeSet, i);
        this.a = true;
        this.t = new Rect();
        this.X0 = -1;
        this.c1 = 0;
        this.e1 = 0;
        Context context2 = getContext();
        pzg pzgVar = new pzg(this);
        this.N0 = pzgVar;
        pzgVar.O = je5.e;
        pzgVar.i(false);
        pzgVar.F = false;
        this.O0 = new guw(context2);
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.l, i, 2132018537, new int[0]);
        int i3 = typedArrayS.getInt(4, 8388691);
        if (pzgVar.k != i3) {
            pzgVar.k = i3;
            pzgVar.i(false);
        }
        pzgVar.l(typedArrayS.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayS.getDimensionPixelSize(5, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayS.hasValue(8)) {
            this.f = typedArrayS.getDimensionPixelSize(8, 0);
        }
        if (typedArrayS.hasValue(7)) {
            this.h = typedArrayS.getDimensionPixelSize(7, 0);
        }
        if (typedArrayS.hasValue(9)) {
            this.g = typedArrayS.getDimensionPixelSize(9, 0);
        }
        if (typedArrayS.hasValue(6)) {
            this.i = typedArrayS.getDimensionPixelSize(6, 0);
        }
        this.P0 = typedArrayS.getBoolean(20, true);
        setTitle(typedArrayS.getText(18));
        pzgVar.m(2132017989);
        pzgVar.j(2132017923);
        if (typedArrayS.hasValue(10)) {
            pzgVar.m(typedArrayS.getResourceId(10, 0));
        }
        if (typedArrayS.hasValue(1)) {
            pzgVar.j(typedArrayS.getResourceId(1, 0));
        }
        if (typedArrayS.hasValue(11) && pzgVar.o != (colorStateListI = dgo1.i(context2, typedArrayS, 11))) {
            pzgVar.o = colorStateListI;
            pzgVar.i(false);
        }
        if (typedArrayS.hasValue(2)) {
            pzgVar.k(dgo1.i(context2, typedArrayS, 2));
        }
        this.X0 = typedArrayS.getDimensionPixelSize(16, -1);
        if (typedArrayS.hasValue(14) && (i2 = typedArrayS.getInt(14, 1)) != pzgVar.f0) {
            pzgVar.f0 = i2;
            Bitmap bitmap = pzgVar.G;
            if (bitmap != null) {
                bitmap.recycle();
                pzgVar.G = null;
            }
            pzgVar.i(false);
        }
        if (typedArrayS.hasValue(21)) {
            pzgVar.N = AnimationUtils.loadInterpolator(context2, typedArrayS.getResourceId(21, 0));
            pzgVar.i(false);
        }
        this.W0 = typedArrayS.getInt(15, 600);
        setContentScrim(typedArrayS.getDrawable(3));
        setStatusBarScrim(typedArrayS.getDrawable(17));
        setTitleCollapseMode(typedArrayS.getInt(19, 0));
        this.b = typedArrayS.getResourceId(22, -1);
        this.d1 = typedArrayS.getBoolean(13, false);
        this.f1 = typedArrayS.getBoolean(12, false);
        typedArrayS.recycle();
        setWillNotDraw(false);
        dg8 dg8Var = new dg8(this, (byte) 23);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(this, dg8Var);
    }

    public static xck1 b(View view) {
        xck1 xck1Var = (xck1) view.getTag(2131431619);
        if (xck1Var != null) {
            return xck1Var;
        }
        xck1 xck1Var2 = new xck1(view);
        view.setTag(2131431619, xck1Var2);
        return xck1Var2;
    }

    public final void a() {
        View view;
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.P0 && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.P0 || this.c == null) {
            return;
        }
        View view2 = this.e;
        if (view2 == null) {
            view2 = new View(getContext());
            this.e = view2;
        }
        if (view2.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qzg;
    }

    public final void d() {
        if (this.R0 == null && this.S0 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.Z0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.R0) != null && this.T0 > 0) {
            drawable.mutate().setAlpha(this.T0);
            this.R0.draw(canvas);
        }
        if (this.P0 && this.Q0) {
            ViewGroup viewGroup = this.c;
            pzg pzgVar = this.N0;
            if (viewGroup == null || this.R0 == null || this.T0 <= 0 || this.a1 != 1 || pzgVar.c >= pzgVar.f) {
                pzgVar.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.R0.getBounds(), Region.Op.DIFFERENCE);
                pzgVar.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.S0 == null || this.T0 <= 0) {
            return;
        }
        hsl1 hsl1Var = this.b1;
        int iD = hsl1Var != null ? hsl1Var.d() : 0;
        if (iD > 0) {
            this.S0.setBounds(0, -this.Z0, getWidth(), iD - this.Z0);
            this.S0.mutate().setAlpha(this.T0);
            this.S0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.R0;
        if (drawable == null || this.T0 <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.a1 == 1 && view != null && this.P0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.R0.mutate().setAlpha(this.T0);
            this.R0.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.S0;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.R0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        pzg pzgVar = this.N0;
        if (pzgVar != null) {
            pzgVar.J = drawableState;
            ColorStateList colorStateList2 = pzgVar.f97p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = pzgVar.o) != null && colorStateList.isStateful())) {
                pzgVar.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.P0 || (view = this.e) == null) {
            return;
        }
        WeakHashMap weakHashMap = b8k1.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.Q0 = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((qzg) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.t;
            odt.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            pzg pzgVar = this.N0;
            Rect rect2 = pzgVar.i;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                pzgVar.K = true;
                pzgVar.h();
            }
            int i10 = z3 ? this.h : this.f;
            int i11 = rect.top + this.g;
            int i12 = (i3 - i) - (z3 ? this.f : this.h);
            int i13 = (i4 - i2) - this.i;
            Rect rect3 = pzgVar.h;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                pzgVar.K = true;
                pzgVar.h();
            }
            pzgVar.i(z);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.c != null && this.P0 && TextUtils.isEmpty(this.N0.C)) {
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        qzg qzgVar = new qzg(-1, -1);
        qzgVar.a = 0;
        qzgVar.b = 0.5f;
        return qzgVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        qzg qzgVar = new qzg(context, attributeSet);
        qzgVar.a = 0;
        qzgVar.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.m);
        qzgVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        qzgVar.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return qzgVar;
    }

    public int getCollapsedTitleGravity() {
        return this.N0.l;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.N0.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.R0;
    }

    public int getExpandedTitleGravity() {
        return this.N0.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.N0.y;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.N0.i0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.N0.Z;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.N0.Z.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.N0.Z.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.N0.f0;
    }

    public int getScrimAlpha() {
        return this.T0;
    }

    public long getScrimAnimationDuration() {
        return this.W0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.X0;
        if (i >= 0) {
            return i + this.c1 + this.e1;
        }
        hsl1 hsl1Var = this.b1;
        int iD = hsl1Var != null ? hsl1Var.d() : 0;
        WeakHashMap weakHashMap = b8k1.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.S0;
    }

    public CharSequence getTitle() {
        if (this.P0) {
            return this.N0.C;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.a1;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.N0.N;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.a1 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = b8k1.a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            rzg rzgVar = this.Y0;
            if (rzgVar == null) {
                rzgVar = new rzg(this, (byte) 0);
                this.Y0 = rzgVar;
            }
            appBarLayout.a(rzgVar);
            requestApplyInsets();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        rzg rzgVar = this.Y0;
        if (rzgVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).h) != null) {
            arrayList.remove(rzgVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hsl1 hsl1Var = this.b1;
        if (hsl1Var != null) {
            int iD = hsl1Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = b8k1.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            xck1 xck1VarB = b(getChildAt(i6));
            View view = xck1VarB.a;
            xck1VarB.b = view.getTop();
            xck1VarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        hsl1 hsl1Var = this.b1;
        int iD = hsl1Var != null ? hsl1Var.d() : 0;
        if ((mode == 0 || this.d1) && iD > 0) {
            this.c1 = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        if (this.f1) {
            pzg pzgVar = this.N0;
            if (pzgVar.f0 > 1) {
                f();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i3 = pzgVar.q;
                if (i3 > 1) {
                    TextPaint textPaint = pzgVar.M;
                    textPaint.setTextSize(pzgVar.m);
                    textPaint.setTypeface(pzgVar.y);
                    textPaint.setLetterSpacing(pzgVar.Y);
                    collapsingToolbarLayout.e1 = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(collapsingToolbarLayout.getMeasuredHeight() + collapsingToolbarLayout.e1, 1073741824));
                }
            } else {
                collapsingToolbarLayout = this;
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.d;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.R0;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.a1 == 1 && viewGroup != null && this.P0) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.N0.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.N0.j(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        pzg pzgVar = this.N0;
        ghd ghdVar = pzgVar.B;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        if (pzgVar.x != typeface) {
            pzgVar.x = typeface;
            pzgVar.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.R0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.R0 = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.a1 == 1 && viewGroup != null && this.P0) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.R0.setCallback(this);
                this.R0.setAlpha(this.T0);
            }
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(x74.G(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        pzg pzgVar = this.N0;
        if (pzgVar.k != i) {
            pzgVar.k = i;
            pzgVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.N0.m(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        pzg pzgVar = this.N0;
        if (pzgVar.o != colorStateList) {
            pzgVar.o = colorStateList;
            pzgVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        pzg pzgVar = this.N0;
        ghd ghdVar = pzgVar.A;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        if (pzgVar.y != typeface) {
            pzgVar.y = typeface;
            pzgVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f1 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.d1 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.N0.i0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.N0.g0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.N0.h0 = f;
    }

    public void setMaxLines(int i) {
        pzg pzgVar = this.N0;
        if (i != pzgVar.f0) {
            pzgVar.f0 = i;
            Bitmap bitmap = pzgVar.G;
            if (bitmap != null) {
                bitmap.recycle();
                pzgVar.G = null;
            }
            pzgVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.N0.F = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.T0) {
            if (this.R0 != null && (viewGroup = this.c) != null) {
                WeakHashMap weakHashMap = b8k1.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.T0 = i;
            WeakHashMap weakHashMap2 = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.W0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.X0 != i) {
            this.X0 = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = b8k1.a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.U0 != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.V0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.V0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.T0 ? je5.c : je5.d);
                    this.V0.addUpdateListener(new kb5(this, (byte) 3));
                } else if (valueAnimator.isRunning()) {
                    this.V0.cancel();
                }
                this.V0.setDuration(this.W0);
                this.V0.setIntValues(this.T0, i);
                this.V0.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.U0 = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.S0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.S0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.S0.setState(getDrawableState());
                }
                Drawable drawable3 = this.S0;
                WeakHashMap weakHashMap = b8k1.a;
                y1a1.R(drawable3, getLayoutDirection());
                this.S0.setVisible(getVisibility() == 0, false);
                this.S0.setCallback(this);
                this.S0.setAlpha(this.T0);
            }
            WeakHashMap weakHashMap2 = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(x74.G(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        pzg pzgVar = this.N0;
        if (charSequence == null || !TextUtils.equals(pzgVar.C, charSequence)) {
            pzgVar.C = charSequence;
            pzgVar.D = null;
            Bitmap bitmap = pzgVar.G;
            if (bitmap != null) {
                bitmap.recycle();
                pzgVar.G = null;
            }
            pzgVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.a1 = i;
        boolean z = i == 1;
        this.N0.d = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.a1 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.R0 == null) {
            float dimension = getResources().getDimension(2131165632);
            guw guwVar = this.O0;
            setContentScrimColor(guwVar.a(dimension, guwVar.d));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.P0) {
            this.P0 = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        pzg pzgVar = this.N0;
        pzgVar.N = timeInterpolator;
        pzgVar.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.S0;
        if (drawable != null && drawable.isVisible() != z) {
            this.S0.setVisible(z, false);
        }
        Drawable drawable2 = this.R0;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.R0.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.R0 || drawable == this.S0;
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.N0.k(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        qzg qzgVar = new qzg(-1, -1);
        qzgVar.a = 0;
        qzgVar.b = 0.5f;
        return qzgVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        qzg qzgVar = new qzg(layoutParams);
        qzgVar.a = 0;
        qzgVar.b = 0.5f;
        return qzgVar;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969004);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
