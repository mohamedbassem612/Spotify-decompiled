package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p.b8k1;
import p.blo1;
import p.cw50;
import p.d3n;
import p.e3n;
import p.f0o1;
import p.fg;
import p.fl1;
import p.gch0;
import p.ggo1;
import p.h260;
import p.h3n;
import p.hhg1;
import p.hsl1;
import p.je5;
import p.jhc1;
import p.omz0;
import p.ow3;
import p.p6o0;
import p.qq41;
import p.r7k1;
import p.u890;
import p.ui5;
import p.vi5;
import p.wi5;
import p.y1a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AppBarLayout extends LinearLayout implements d3n {
    public boolean N0;
    public boolean O0;
    public int P0;
    public WeakReference Q0;
    public ValueAnimator R0;
    public final ArrayList S0;
    public int[] T0;
    public Drawable U0;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public hsl1 g;
    public ArrayList h;
    public boolean i;
    public boolean t;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018534), attributeSet, i);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.S0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayS = blo1.s(context3, attributeSet, jhc1.d, i, 2132018534, new int[0]);
        try {
            if (typedArrayS.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayS.getResourceId(0, 0)));
            }
            typedArrayS.recycle();
            TypedArray typedArrayS2 = blo1.s(context2, attributeSet, omz0.a, i, 2132018534, new int[0]);
            Drawable drawable = typedArrayS2.getDrawable(0);
            WeakHashMap weakHashMap = b8k1.a;
            setBackground(drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                gch0 gch0Var = new gch0();
                gch0Var.m(ColorStateList.valueOf(colorDrawable.getColor()));
                gch0Var.j(context2);
                setBackground(gch0Var);
            }
            if (typedArrayS2.hasValue(4)) {
                e(typedArrayS2.getBoolean(4, false), false, false);
            }
            if (typedArrayS2.hasValue(3)) {
                jhc1.E(this, typedArrayS2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayS2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayS2.getBoolean(2, false));
                }
                if (typedArrayS2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayS2.getBoolean(1, false));
                }
            }
            this.O0 = typedArrayS2.getBoolean(5, false);
            this.P0 = typedArrayS2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayS2.getDrawable(7));
            typedArrayS2.recycle();
            r7k1.c(this, new fl1(this, (byte) 20));
        } catch (Throwable th) {
            typedArrayS.recycle();
            throw th;
        }
    }

    public static vi5 c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            vi5 vi5Var = new vi5((LinearLayout.LayoutParams) layoutParams);
            vi5Var.a = 1;
            return vi5Var;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            vi5 vi5Var2 = new vi5((ViewGroup.MarginLayoutParams) layoutParams);
            vi5Var2.a = 1;
            return vi5Var2;
        }
        vi5 vi5Var3 = new vi5(layoutParams);
        vi5Var3.a = 1;
        return vi5Var3;
    }

    public final void a(wi5 wi5Var) {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        if (wi5Var == null || arrayList.contains(wi5Var)) {
            return;
        }
        this.h.add(wi5Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vi5 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        vi5 vi5Var = new vi5(context, attributeSet);
        vi5Var.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.b);
        vi5Var.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        vi5Var.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new ow3();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            vi5Var.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return vi5Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof vi5;
    }

    public final void d(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                wi5 wi5Var = (wi5) this.h.get(i2);
                if (wi5Var != null) {
                    wi5Var.a(this, i);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.U0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.U0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.U0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z) {
        if (this.i || this.N0 == z) {
            return false;
        }
        this.N0 = z;
        refreshDrawableState();
        if (this.O0 && (getBackground() instanceof gch0)) {
            gch0 gch0Var = (gch0) getBackground();
            float dimension = getResources().getDimension(2131165632);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.R0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(2131492869));
            this.R0.setInterpolator(je5.a);
            this.R0.addUpdateListener(new ui5(this, gch0Var));
            this.R0.start();
        }
        return true;
    }

    public final boolean g(View view) {
        int i;
        if (this.Q0 == null && (i = this.P0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.P0);
            }
            if (viewFindViewById != null) {
                this.Q0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.Q0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        vi5 vi5Var = new vi5(-1, -2);
        vi5Var.a = 1;
        return vi5Var;
    }

    @Override // p.d3n
    public e3n getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            vi5 vi5Var = (vi5) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = vi5Var.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) vi5Var).topMargin + ((LinearLayout.LayoutParams) vi5Var).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap weakHashMap = b8k1.a;
                    minimumHeight = childAt.getMinimumHeight();
                } else {
                    if ((i3 & 2) != 0) {
                        WeakHashMap weakHashMap2 = b8k1.a;
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0) {
                        WeakHashMap weakHashMap3 = b8k1.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
                iMin = minimumHeight + i4;
                if (childCount == 0) {
                    WeakHashMap weakHashMap4 = b8k1.a;
                    if (childAt.getFitsSystemWindows()) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            vi5 vi5Var = (vi5) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) vi5Var).topMargin + ((LinearLayout.LayoutParams) vi5Var).bottomMargin + childAt.getMeasuredHeight();
            int i3 = vi5Var.a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap weakHashMap = b8k1.a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.P0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = b8k1.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.U0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        hsl1 hsl1Var = this.g;
        if (hsl1Var != null) {
            return hsl1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            vi5 vi5Var = (vi5) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = vi5Var.a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) vi5Var).topMargin + ((LinearLayout.LayoutParams) vi5Var).bottomMargin + minimumHeight;
            if (i2 == 0) {
                WeakHashMap weakHashMap = b8k1.a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap weakHashMap2 = b8k1.a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ggo1.O(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr = this.T0;
        if (iArr == null) {
            iArr = new int[4];
            this.T0 = iArr;
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.t;
        iArr[0] = z ? 2130970303 : -2130970303;
        iArr[1] = (z && this.N0) ? 2130970304 : -2130970304;
        iArr[2] = z ? 2130970300 : -2130970300;
        iArr[3] = (z && this.N0) ? 2130970299 : -2130970299;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.Q0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.Q0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = b8k1.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((vi5) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable = this.U0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.O0) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((vi5) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.t != z2) {
            this.t = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = b8k1.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = u890.o(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ggo1.M(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = b8k1.a;
        e(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.O0 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.P0 = i;
        WeakReference weakReference = this.Q0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.Q0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            hhg1.n("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.U0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.U0 = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.U0.setState(getDrawableState());
                }
                Drawable drawable3 = this.U0;
                WeakHashMap weakHashMap = b8k1.a;
                y1a1.R(drawable3, getLayoutDirection());
                this.U0.setVisible(getVisibility() == 0, false);
                this.U0.setCallback(this);
            }
            if (this.U0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap weakHashMap2 = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(f0o1.j(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        jhc1.E(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.U0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.U0;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends cw50 {
        public int j;
        public int k;
        public ValueAnimator l;
        public f m;
        public WeakReference n;
        public qq41 o;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }

        public static View A(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof p6o0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zG;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((vi5) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = b8k1.a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zG = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zG = false;
                    }
                } else {
                    zG = false;
                }
            } else {
                zG = false;
            }
            if (appBarLayout.O0) {
                zG = appBarLayout.g(A(coordinatorLayout));
            }
            boolean zF = appBarLayout.f(zG);
            if (!z) {
                if (zF) {
                    List listO = coordinatorLayout.b.o(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.d;
                    arrayList.clear();
                    if (listO != null) {
                        arrayList.addAll(listO);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        e3n e3nVar = ((h3n) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (e3nVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) e3nVar).f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = x(coordinatorLayout, appBarLayout2, w() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.O0) {
                appBarLayout2.f(appBarLayout2.g(view));
            }
        }

        @Override // p.e3n
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            if (i4 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                iArr[1] = baseBehavior.x(coordinatorLayout2, appBarLayout2, w() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
            }
            if (i4 == 0) {
                baseBehavior.E(coordinatorLayout2, appBarLayout2);
            }
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                vi5 vi5Var = (vi5) childAt.getLayoutParams();
                if ((vi5Var.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) vi5Var).topMargin;
                    bottom += ((LinearLayout.LayoutParams) vi5Var).bottomMargin;
                }
                int i2 = -iW;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                vi5 vi5Var2 = (vi5) childAt2.getLayoutParams();
                int i3 = vi5Var2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        minimumHeight += appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap = b8k1.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap2 = b8k1.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iW < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) vi5Var2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) vi5Var2).bottomMargin;
                    }
                    if (iW < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    z(coordinatorLayout, appBarLayout, u890.o(i4, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            fg fgVar = fg.k;
            b8k1.l(coordinatorLayout, fgVar.a());
            b8k1.h(coordinatorLayout, 0);
            fg fgVar2 = fg.l;
            b8k1.l(coordinatorLayout, fgVar2.a());
            b8k1.h(coordinatorLayout, 0);
            View viewA = A(coordinatorLayout);
            if (viewA == null || appBarLayout.getTotalScrollRange() == 0 || !(((h3n) viewA.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (w() != (-appBarLayout.getTotalScrollRange()) && viewA.canScrollVertically(1)) {
                b8k1.m(coordinatorLayout, fgVar, null, new c(appBarLayout, false));
            }
            if (w() != 0) {
                if (!viewA.canScrollVertically(-1)) {
                    b8k1.m(coordinatorLayout, fgVar2, null, new c(appBarLayout, true));
                    return;
                }
                int i = -appBarLayout.getDownNestedPreScrollRange();
                if (i != 0) {
                    b8k1.m(coordinatorLayout, fgVar2, null, new b(this, coordinatorLayout, appBarLayout, viewA, i));
                }
            }
        }

        @Override // p.vck1, p.e3n
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            f fVar = this.m;
            if (fVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            z(coordinatorLayout, appBarLayout, i2);
                        } else {
                            y(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            z(coordinatorLayout, appBarLayout, 0);
                        } else {
                            y(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (fVar.c) {
                y(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(fVar.d);
                int i3 = -childAt.getBottom();
                if (this.m.f) {
                    WeakHashMap weakHashMap = b8k1.a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.m.e) + i3;
                }
                y(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f = 0;
            this.m = null;
            v(u890.o(t(), -appBarLayout.getTotalScrollRange(), 0));
            F(coordinatorLayout, appBarLayout, t(), 0, true);
            appBarLayout.d(t());
            E(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // p.e3n
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((h3n) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // p.e3n
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            B(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // p.e3n
        public final void o(View view, Parcelable parcelable) {
            if (parcelable instanceof f) {
                this.m = (f) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // p.e3n
        public final Parcelable p(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iT = t();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iT;
                if (childAt.getTop() + iT <= 0 && bottom >= 0) {
                    f fVar = new f();
                    fVar.c = (-t()) >= appBarLayout.getTotalScrollRange();
                    fVar.d = i;
                    WeakHashMap weakHashMap = b8k1.a;
                    fVar.f = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    fVar.e = bottom / childAt.getHeight();
                    return fVar;
                }
            }
            return absSavedState;
        }

        @Override // p.e3n
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.O0 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // p.e3n
        public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                D(coordinatorLayout, appBarLayout);
                if (appBarLayout.O0) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // p.cw50
        public final int w() {
            return t() + this.j;
        }

        @Override // p.cw50
        public final int x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iW = w();
            int i4 = 0;
            if (i2 == 0 || iW < i2 || iW > i3) {
                this.j = 0;
            } else {
                int iO = u890.o(i, i2, i3);
                if (iW != iO) {
                    if (!appBarLayout.e) {
                        top = iO;
                        break;
                    }
                    int iAbs = Math.abs(iO);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            vi5 vi5Var = (vi5) childAt.getLayoutParams();
                            Interpolator interpolator = vi5Var.c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = vi5Var.a;
                                if ((i6 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) vi5Var).topMargin + ((LinearLayout.LayoutParams) vi5Var).bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        WeakHashMap weakHashMap = b8k1.a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap weakHashMap2 = b8k1.a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iO);
                                    break;
                                }
                            }
                        }
                        top = iO;
                        break;
                    }
                    boolean zV = v(top);
                    int i7 = iW - iO;
                    this.j = iO - top;
                    if (zV) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            vi5 vi5Var2 = (vi5) appBarLayout.getChildAt(i8).getLayoutParams();
                            ow3 ow3Var = vi5Var2.b;
                            if (ow3Var != null && (vi5Var2.a & 1) != 0) {
                                ow3Var.k(appBarLayout, appBarLayout.getChildAt(i8), t());
                            }
                        }
                    }
                    if (!zV && appBarLayout.e) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.d(t());
                    F(coordinatorLayout, appBarLayout, iO, iO < iW ? -1 : 1, false);
                    i4 = i7;
                }
            }
            E(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(w() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iW = w();
            ValueAnimator valueAnimator = this.l;
            if (iW == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(je5.e);
                this.l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iW, i);
            this.l.start();
        }

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        vi5 vi5Var = new vi5(-1, -2);
        vi5Var.a = 1;
        return vi5Var;
    }

    public static class ScrollingViewBehavior extends h260 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.G);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout x(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p.e3n
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // p.e3n
        public final boolean d(View view, View view2) {
            e3n e3nVar = ((h3n) view2.getLayoutParams()).a;
            if (e3nVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e3nVar).j) + this.e) - w(view2);
                WeakHashMap weakHashMap = b8k1.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.O0) {
                return false;
            }
            appBarLayout.f(appBarLayout.g(view));
            return false;
        }

        @Override // p.e3n
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                b8k1.l(coordinatorLayout, fg.k.a());
                b8k1.h(coordinatorLayout, 0);
                b8k1.l(coordinatorLayout, fg.l.a());
                b8k1.h(coordinatorLayout, 0);
            }
        }

        @Override // p.e3n
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutX = x(coordinatorLayout.m(view));
            if (appBarLayoutX != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayoutX.e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968678);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
