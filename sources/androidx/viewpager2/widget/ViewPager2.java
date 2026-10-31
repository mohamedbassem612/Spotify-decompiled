package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a;
import p.ahr0;
import p.b8k1;
import p.c9c;
import p.e611;
import p.eg;
import p.g570;
import p.hhg1;
import p.i0m;
import p.i2k;
import p.imz0;
import p.ir41;
import p.rdk1;
import p.sdk1;
import p.sm90;
import p.tdk1;
import p.udk1;
import p.ukd;
import p.vdk1;
import p.wdk1;
import p.xdk1;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ViewPager2 extends ViewGroup {
    public sm90 N0;
    public ir41 O0;
    public i2k P0;
    public c9c Q0;
    public ahr0 R0;
    public e611 S0;
    public boolean T0;
    public boolean U0;
    public int V0;
    public vdk1 W0;
    public final Rect a;
    public final Rect b;
    public final i2k c;
    public int d;
    public boolean e;
    public final rdk1 f;
    public tdk1 g;
    public int h;
    public Parcelable i;
    public g570 t;

    public ViewPager2(Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new i2k();
        this.e = false;
        this.f = new rdk1(this, (byte) 0);
        this.h = -1;
        this.S0 = null;
        this.T0 = false;
        this.U0 = true;
        this.V0 = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.W0 = new vdk1(this);
        g570 g570Var = new g570(this, context);
        this.t = g570Var;
        g570Var.setId(View.generateViewId());
        this.t.setDescendantFocusability(131072);
        a tdk1Var = new tdk1(this);
        this.g = tdk1Var;
        this.t.setLayoutManager(tdk1Var);
        this.t.setScrollingTouchSlop(1);
        int[] iArr = imz0.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        b8k1.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.t.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.t.k(new i0m((byte) 2));
            ir41 ir41Var = new ir41(this);
            this.O0 = ir41Var;
            this.Q0 = new c9c(ir41Var, (byte) 10);
            sm90 sm90Var = new sm90(this);
            this.N0 = sm90Var;
            sm90Var.b(this.t);
            this.t.m(this.O0);
            i2k i2kVar = new i2k();
            this.P0 = i2kVar;
            this.O0.o(i2kVar);
            sdk1 sdk1Var = new sdk1(this, (byte) 0);
            sdk1 sdk1Var2 = new sdk1(this, (byte) 1);
            this.P0.d(sdk1Var);
            this.P0.d(sdk1Var2);
            this.W0.e(this.t);
            this.P0.d(this.c);
            ahr0 ahr0Var = new ahr0(this.g);
            this.R0 = ahr0Var;
            this.P0.d(ahr0Var);
            g570 g570Var2 = this.t;
            attachViewToParent(g570Var2, 0, g570Var2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(udk1 udk1Var) {
        this.c.d(udk1Var);
    }

    public final void c() {
        z511 adapter;
        if (this.h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.i != null) {
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.h, adapter.e() - 1));
        this.d = iMax;
        this.h = -1;
        this.t.u0(iMax);
        this.W0.h();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.t.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.t.canScrollVertically(i);
    }

    public final void d(int i, boolean z) {
        this.Q0.getClass();
        e(i, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        xdk1 xdk1Var = (Parcelable) sparseArray.get(getId());
        if (xdk1Var instanceof xdk1) {
            int i = xdk1Var.a;
            sparseArray.put(this.t.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e(int i, boolean z) {
        z511 adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.e() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.e() - 1);
        if (iMin == this.d && this.O0.l()) {
            return;
        }
        int i2 = this.d;
        if (iMin == i2 && z) {
            return;
        }
        double dJ = i2;
        this.d = iMin;
        this.W0.j();
        if (!this.O0.l()) {
            dJ = this.O0.j();
        }
        this.O0.m(iMin, z);
        if (!z) {
            this.t.u0(iMin);
            return;
        }
        double d = iMin;
        double dAbs = Math.abs(d - dJ);
        g570 g570Var = this.t;
        if (dAbs <= 3.0d) {
            g570Var.y0(iMin);
            return;
        }
        g570Var.u0(d > dJ ? iMin - 3 : iMin + 3);
        g570 g570Var2 = this.t;
        g570Var2.post(new ukd(iMin, g570Var2));
    }

    public final void f() {
        sm90 sm90Var = this.N0;
        if (sm90Var == null) {
            eg.m("Design assumption violated.");
            return;
        }
        View viewI = sm90Var.i(this.g);
        if (viewI == null) {
            return;
        }
        this.g.getClass();
        int iV = a.V(viewI);
        if (iV != this.d && getScrollState() == 0) {
            this.P0.c(iV);
        }
        this.e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!this.W0.a()) {
            return super.getAccessibilityClassName();
        }
        this.W0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public z511 getAdapter() {
        return this.t.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.t.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.V0;
    }

    public int getOrientation() {
        return this.g.Q0 == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        g570 g570Var = this.t;
        if (getOrientation() == 0) {
            height = g570Var.getWidth() - g570Var.getPaddingLeft();
            paddingBottom = g570Var.getPaddingRight();
        } else {
            height = g570Var.getHeight() - g570Var.getPaddingTop();
            paddingBottom = g570Var.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.O0.k();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.W0.f(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.t.getMeasuredWidth();
        int measuredHeight = this.t.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.t.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            f();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.t, i, i2);
        int measuredWidth = this.t.getMeasuredWidth();
        int measuredHeight = this.t.getMeasuredHeight();
        int measuredState = this.t.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xdk1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xdk1 xdk1Var = (xdk1) parcelable;
        super.onRestoreInstanceState(xdk1Var.getSuperState());
        this.h = xdk1Var.b;
        this.i = xdk1Var.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        xdk1 xdk1Var = new xdk1(super.onSaveInstanceState());
        xdk1Var.a = this.t.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        xdk1Var.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            xdk1Var.c = parcelable;
            return xdk1Var;
        }
        this.t.getAdapter();
        return xdk1Var;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.W0.b(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        this.W0.g(i, bundle);
        return true;
    }

    public void setAdapter(z511 z511Var) {
        z511 adapter = this.t.getAdapter();
        this.W0.d(adapter);
        rdk1 rdk1Var = this.f;
        if (adapter != null) {
            adapter.z(rdk1Var);
        }
        this.t.setAdapter(z511Var);
        this.d = 0;
        c();
        this.W0.c(z511Var);
        if (z511Var != null) {
            z511Var.w(rdk1Var);
        }
    }

    public void setCurrentItem(int i) {
        d(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.W0.i();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            hhg1.n("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.V0 = i;
            this.t.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.g.x1(i);
        this.W0.k();
    }

    public void setPageTransformer(wdk1 wdk1Var) {
        boolean z = this.T0;
        if (wdk1Var != null) {
            if (!z) {
                this.S0 = this.t.getItemAnimator();
                this.T0 = true;
            }
            this.t.setItemAnimator(null);
        } else if (z) {
            this.t.setItemAnimator(this.S0);
            this.S0 = null;
            this.T0 = false;
        }
        this.R0.getClass();
        if (wdk1Var == null) {
            return;
        }
        this.R0.getClass();
        this.R0.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.U0 = z;
        this.W0.l();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new i2k();
        this.e = false;
        this.f = new rdk1(this, (byte) 0);
        this.h = -1;
        this.S0 = null;
        this.T0 = false;
        this.U0 = true;
        this.V0 = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new i2k();
        this.e = false;
        this.f = new rdk1(this, (byte) 0);
        this.h = -1;
        this.S0 = null;
        this.T0 = false;
        this.U0 = true;
        this.V0 = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new i2k();
        this.e = false;
        this.f = new rdk1(this, (byte) 0);
        this.h = -1;
        this.S0 = null;
        this.T0 = false;
        this.U0 = true;
        this.V0 = -1;
        a(context, attributeSet);
    }
}
