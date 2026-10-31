package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p.ahd1;
import p.b8k1;
import p.bhd1;
import p.blo1;
import p.chd1;
import p.dgo1;
import p.dhd1;
import p.ehd1;
import p.f0o1;
import p.fjr0;
import p.gch0;
import p.ggo1;
import p.ghd1;
import p.hhg1;
import p.je5;
import p.kb5;
import p.mdk1;
import p.moz0;
import p.ndv0;
import p.o0c;
import p.omz0;
import p.pwd;
import p.sua;
import p.tpw;
import p.u890;
import p.up20;
import p.x5j1;
import p.x74;
import p.zgd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@mdk1
public class TabLayout extends HorizontalScrollView {
    public static final ndv0 r1 = new ndv0(16);
    public ColorStateList N0;
    public Drawable O0;
    public int P0;
    public final float Q0;
    public final float R0;
    public final int S0;
    public int T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public final int X0;
    public int Y0;
    public final int Z0;
    public final ArrayList a;
    public int a1;
    public dhd1 b;
    public int b1;
    public final chd1 c;
    public boolean c1;
    public final int d;
    public boolean d1;
    public final int e;
    public int e1;
    public final int f;
    public int f1;
    public final int g;
    public boolean g1;
    public final int h;
    public sua h1;
    public ColorStateList i;
    public ahd1 i1;
    public final ArrayList j1;
    public pwd k1;
    public ValueAnimator l1;
    public ViewPager m1;
    public ehd1 n1;
    public zgd1 o1;
    public boolean p1;
    public final up20 q1;
    public ColorStateList t;

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018542), attributeSet, i);
        this.a = new ArrayList();
        this.O0 = new GradientDrawable();
        this.P0 = 0;
        this.T0 = Integer.MAX_VALUE;
        this.e1 = -1;
        this.j1 = new ArrayList();
        this.q1 = new up20(12, (byte) 3);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        chd1 chd1Var = new chd1(this, context2);
        this.c = chd1Var;
        super.addView(chd1Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.K, i, 2132018542, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            Drawable gch0Var = new gch0();
            gch0Var.m(ColorStateList.valueOf(colorDrawable.getColor()));
            gch0Var.j(context2);
            WeakHashMap weakHashMap = b8k1.a;
            gch0Var.l(getElevation());
            setBackground(gch0Var);
        }
        setSelectedTabIndicator(dgo1.l(context2, typedArrayS, 5));
        setSelectedTabIndicatorColor(typedArrayS.getColor(8, 0));
        chd1Var.b(typedArrayS.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayS.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayS.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayS.getBoolean(9, true));
        int dimensionPixelSize = typedArrayS.getDimensionPixelSize(16, 0);
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.d = typedArrayS.getDimensionPixelSize(19, dimensionPixelSize);
        this.e = typedArrayS.getDimensionPixelSize(20, dimensionPixelSize);
        this.f = typedArrayS.getDimensionPixelSize(18, dimensionPixelSize);
        this.g = typedArrayS.getDimensionPixelSize(17, dimensionPixelSize);
        int resourceId = typedArrayS.getResourceId(23, 2132017999);
        this.h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, moz0.x);
        try {
            this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.i = dgo1.i(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayS.hasValue(24)) {
                this.i = dgo1.i(context2, typedArrayS, 24);
            }
            if (typedArrayS.hasValue(22)) {
                this.i = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayS.getColor(22, 0), this.i.getDefaultColor()});
            }
            this.t = dgo1.i(context2, typedArrayS, 3);
            o0c.I(typedArrayS.getInt(4, -1), (PorterDuff.Mode) null);
            this.N0 = dgo1.i(context2, typedArrayS, 21);
            this.Z0 = typedArrayS.getInt(6, CtaType.CTA_WAITLISTED_FIELD_NUMBER);
            this.U0 = typedArrayS.getDimensionPixelSize(14, -1);
            this.V0 = typedArrayS.getDimensionPixelSize(13, -1);
            this.S0 = typedArrayS.getResourceId(0, 0);
            this.X0 = typedArrayS.getDimensionPixelSize(1, 0);
            this.b1 = typedArrayS.getInt(15, 1);
            this.Y0 = typedArrayS.getInt(2, 0);
            this.c1 = typedArrayS.getBoolean(12, false);
            this.g1 = typedArrayS.getBoolean(25, false);
            typedArrayS.recycle();
            Resources resources = getResources();
            this.R0 = resources.getDimensionPixelSize(2131165678);
            this.W0 = resources.getDimensionPixelSize(2131165676);
            d();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.U0;
        if (i != -1) {
            return i;
        }
        int i2 = this.b1;
        if (i2 == 0 || i2 == 2) {
            return this.W0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        chd1 chd1Var = this.c;
        int childCount = chd1Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = chd1Var.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void a(ahd1 ahd1Var) {
        ArrayList arrayList = this.j1;
        if (arrayList.contains(ahd1Var)) {
            return;
        }
        arrayList.add(ahd1Var);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(dhd1 dhd1Var, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (dhd1Var.d != this) {
            hhg1.n("Tab belongs to a different TabLayout.");
            return;
        }
        dhd1Var.b = size;
        arrayList.add(size, dhd1Var);
        int size2 = arrayList.size();
        for (int i = size + 1; i < size2; i++) {
            ((dhd1) arrayList.get(i)).b = i;
        }
        ghd1 ghd1Var = dhd1Var.e;
        ghd1Var.setSelected(false);
        ghd1Var.setActivated(false);
        int i2 = dhd1Var.b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.b1 == 1 && this.Y0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.c.addView(ghd1Var, i2, layoutParams);
        if (z) {
            TabLayout tabLayout = dhd1Var.d;
            if (tabLayout != null) {
                tabLayout.j(dhd1Var, true);
            } else {
                hhg1.n("Tab not attached to a TabLayout");
            }
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = b8k1.a;
            if (isLaidOut()) {
                chd1 chd1Var = this.c;
                int childCount = chd1Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (chd1Var.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iE = e(0.0f, i);
                if (scrollX != iE) {
                    f();
                    this.l1.setIntValues(scrollX, iE);
                    this.l1.start();
                }
                ValueAnimator valueAnimator = chd1Var.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    chd1Var.a.cancel();
                }
                chd1Var.d(i, this.Z0, true);
                return;
            }
        }
        k(0.0f, i, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public final void d() {
        int i = this.b1;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.X0 - this.d) : 0;
        WeakHashMap weakHashMap = b8k1.a;
        chd1 chd1Var = this.c;
        chd1Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.b1;
        if (i2 == 0) {
            int i3 = this.Y0;
            if (i3 == 0) {
                chd1Var.setGravity(8388611);
            } else if (i3 == 1) {
                chd1Var.setGravity(1);
            } else if (i3 == 2) {
                chd1Var.setGravity(8388611);
            }
        } else if (i2 == 1 || i2 == 2) {
            chd1Var.setGravity(1);
        }
        m(true);
    }

    public final int e(float f, int i) {
        chd1 chd1Var;
        View childAt;
        int i2 = this.b1;
        if ((i2 != 0 && i2 != 2) || (childAt = (chd1Var = this.c).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < chd1Var.getChildCount() ? chd1Var.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = b8k1.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void f() {
        if (this.l1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.l1 = valueAnimator;
            valueAnimator.setInterpolator(je5.b);
            this.l1.setDuration(this.Z0);
            this.l1.addUpdateListener(new kb5(this, (byte) 19));
        }
    }

    public final dhd1 g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (dhd1) this.a.get(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        dhd1 dhd1Var = this.b;
        if (dhd1Var != null) {
            return dhd1Var.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.a.size();
    }

    public int getTabGravity() {
        return this.Y0;
    }

    public ColorStateList getTabIconTint() {
        return this.t;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f1;
    }

    public int getTabIndicatorGravity() {
        return this.a1;
    }

    public int getTabMaxWidth() {
        return this.T0;
    }

    public int getTabMode() {
        return this.b1;
    }

    public ColorStateList getTabRippleColor() {
        return this.N0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.O0;
    }

    public ColorStateList getTabTextColors() {
        return this.i;
    }

    public final dhd1 h() {
        dhd1 dhd1Var = (dhd1) r1.a();
        if (dhd1Var == null) {
            dhd1Var = new dhd1();
            dhd1Var.b = -1;
        }
        dhd1Var.d = this;
        up20 up20Var = this.q1;
        ghd1 ghd1Var = up20Var != null ? (ghd1) up20Var.a() : null;
        if (ghd1Var == null) {
            ghd1Var = new ghd1(this, getContext());
        }
        ghd1Var.setTab(dhd1Var);
        ghd1Var.setFocusable(true);
        ghd1Var.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            ghd1Var.setContentDescription(dhd1Var.a);
        } else {
            ghd1Var.setContentDescription(null);
        }
        dhd1Var.e = ghd1Var;
        return dhd1Var;
    }

    public final void i() {
        chd1 chd1Var = this.c;
        int childCount = chd1Var.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            ghd1 ghd1Var = (ghd1) chd1Var.getChildAt(childCount);
            chd1Var.removeViewAt(childCount);
            if (ghd1Var != null) {
                ghd1Var.setTab(null);
                ghd1Var.setSelected(false);
                this.q1.i(ghd1Var);
            }
            requestLayout();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            dhd1 dhd1Var = (dhd1) it.next();
            it.remove();
            dhd1Var.d = null;
            dhd1Var.e = null;
            dhd1Var.a = null;
            dhd1Var.b = -1;
            dhd1Var.c = null;
            r1.i(dhd1Var);
        }
        this.b = null;
    }

    public final void j(dhd1 dhd1Var, boolean z) {
        dhd1 dhd1Var2 = this.b;
        ArrayList arrayList = this.j1;
        if (dhd1Var2 == dhd1Var) {
            if (dhd1Var2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((ahd1) arrayList.get(size)).c(dhd1Var);
                }
                c(dhd1Var.b);
                return;
            }
            return;
        }
        int i = dhd1Var != null ? dhd1Var.b : -1;
        if (z) {
            if ((dhd1Var2 == null || dhd1Var2.b == -1) && i != -1) {
                k(0.0f, i, true, true);
            } else {
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.b = dhd1Var;
        if (dhd1Var2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((ahd1) arrayList.get(size2)).b(dhd1Var2);
            }
        }
        if (dhd1Var != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((ahd1) arrayList.get(size3)).a(dhd1Var);
            }
        }
    }

    public final void k(float f, int i, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0) {
            chd1 chd1Var = this.c;
            if (iRound >= chd1Var.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = chd1Var.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    chd1Var.a.cancel();
                }
                chd1Var.b = i;
                chd1Var.c = f;
                chd1Var.c(chd1Var.getChildAt(i), chd1Var.getChildAt(chd1Var.b + 1), chd1Var.c);
            }
            ValueAnimator valueAnimator2 = this.l1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.l1.cancel();
            }
            scrollTo(i < 0 ? 0 : e(f, i), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void l(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.m1;
        if (viewPager2 != null) {
            ehd1 ehd1Var = this.n1;
            if (ehd1Var != null && (arrayList2 = viewPager2.g1) != null) {
                arrayList2.remove(ehd1Var);
            }
            zgd1 zgd1Var = this.o1;
            if (zgd1Var != null && (arrayList = this.m1.i1) != null) {
                arrayList.remove(zgd1Var);
            }
        }
        pwd pwdVar = this.k1;
        if (pwdVar != null) {
            this.j1.remove(pwdVar);
            this.k1 = null;
        }
        if (viewPager != null) {
            this.m1 = viewPager;
            ehd1 ehd1Var2 = this.n1;
            if (ehd1Var2 == null) {
                ehd1Var2 = new ehd1(this);
                this.n1 = ehd1Var2;
            }
            ehd1Var2.c = 0;
            ehd1Var2.b = 0;
            ArrayList arrayList3 = viewPager.g1;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                viewPager.g1 = arrayList3;
            }
            arrayList3.add(ehd1Var2);
            pwd pwdVar2 = new pwd(viewPager, (byte) 2);
            this.k1 = pwdVar2;
            a(pwdVar2);
            viewPager.getAdapter();
            zgd1 zgd1Var2 = this.o1;
            if (zgd1Var2 == null) {
                zgd1Var2 = new zgd1(this);
                this.o1 = zgd1Var2;
            }
            ArrayList arrayList4 = viewPager.i1;
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                viewPager.i1 = arrayList4;
            }
            arrayList4.add(zgd1Var2);
            k(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            this.m1 = null;
            i();
        }
        this.p1 = z;
    }

    public final void m(boolean z) {
        int i = 0;
        while (true) {
            chd1 chd1Var = this.c;
            if (i >= chd1Var.getChildCount()) {
                return;
            }
            View childAt = chd1Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.b1 == 1 && this.Y0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ggo1.O(this);
        if (this.m1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                l((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.p1) {
            setupWithViewPager(null);
            this.p1 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = 0;
        while (true) {
            chd1 chd1Var = this.c;
            if (i >= chd1Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = chd1Var.getChildAt(i);
            if (childAt instanceof ghd1) {
                ghd1 ghd1Var = (ghd1) childAt;
                int i2 = ghd1.O0;
                Drawable drawable = ghd1Var.i;
                if (drawable != null) {
                    drawable.setBounds(ghd1Var.getLeft(), ghd1Var.getTop(), ghd1Var.getRight(), ghd1Var.getBottom());
                    ghd1Var.i.draw(canvas);
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x5j1.h(1, getTabCount(), 1, false).b);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(o0c.x(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iX = this.V0;
            if (iX <= 0) {
                iX = (int) (size - o0c.x(getContext(), 56));
            }
            this.T0 = iX;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.b1;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ggo1.M(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.c1 == z) {
            return;
        }
        this.c1 = z;
        int i = 0;
        while (true) {
            chd1 chd1Var = this.c;
            if (i >= chd1Var.getChildCount()) {
                d();
                return;
            }
            View childAt = chd1Var.getChildAt(i);
            if (childAt instanceof ghd1) {
                ghd1 ghd1Var = (ghd1) childAt;
                ghd1Var.setOrientation(!ghd1Var.N0.c1 ? 1 : 0);
                TextView textView = ghd1Var.g;
                if (textView == null && ghd1Var.h == null) {
                    ghd1Var.g(ghd1Var.b, ghd1Var.c);
                } else {
                    ghd1Var.g(textView, ghd1Var.h);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(ahd1 ahd1Var) {
        ahd1 ahd1Var2 = this.i1;
        if (ahd1Var2 != null) {
            this.j1.remove(ahd1Var2);
        }
        this.i1 = ahd1Var;
        if (ahd1Var != null) {
            a(ahd1Var);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.l1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.O0 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.O0 = drawable;
            int intrinsicHeight = this.e1;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.c.b(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.P0 = i;
        m(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.a1 != i) {
            this.a1 = i;
            WeakHashMap weakHashMap = b8k1.a;
            this.c.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.e1 = i;
        this.c.b(i);
    }

    public void setTabGravity(int i) {
        if (this.Y0 != i) {
            this.Y0 = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ghd1 ghd1Var = ((dhd1) arrayList.get(i)).e;
                if (ghd1Var != null) {
                    ghd1Var.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(x74.E(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f1 = i;
        if (i == 0) {
            this.h1 = new sua((byte) 27);
        } else {
            if (i == 1) {
                this.h1 = new tpw((byte) 27);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.d1 = z;
        int i = chd1.e;
        chd1 chd1Var = this.c;
        chd1Var.a();
        WeakHashMap weakHashMap = b8k1.a;
        chd1Var.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.b1) {
            this.b1 = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.N0 == colorStateList) {
            return;
        }
        this.N0 = colorStateList;
        int i = 0;
        while (true) {
            chd1 chd1Var = this.c;
            if (i >= chd1Var.getChildCount()) {
                return;
            }
            View childAt = chd1Var.getChildAt(i);
            if (childAt instanceof ghd1) {
                Context context = getContext();
                int i2 = ghd1.O0;
                ((ghd1) childAt).f(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(x74.E(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ghd1 ghd1Var = ((dhd1) arrayList.get(i)).e;
                if (ghd1Var != null) {
                    ghd1Var.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(fjr0 fjr0Var) {
        i();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.g1 == z) {
            return;
        }
        this.g1 = z;
        int i = 0;
        while (true) {
            chd1 chd1Var = this.c;
            if (i >= chd1Var.getChildCount()) {
                return;
            }
            View childAt = chd1Var.getChildAt(i);
            if (childAt instanceof ghd1) {
                Context context = getContext();
                int i2 = ghd1.O0;
                ((ghd1) childAt).f(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        l(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(bhd1 bhd1Var) {
        setOnTabSelectedListener((ahd1) bhd1Var);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(f0o1.j(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970363);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
