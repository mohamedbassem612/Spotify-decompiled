package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.util.WeakHashMap;
import p.b8k1;
import p.bz60;
import p.d20;
import p.e20;
import p.eg;
import p.esl1;
import p.f0o1;
import p.f20;
import p.f3a;
import p.g20;
import p.g60;
import p.h20;
import p.hsl1;
import p.jar;
import p.msi0;
import p.nk80;
import p.nrl1;
import p.os00;
import p.oti0;
import p.prl1;
import p.qrl1;
import p.r6o0;
import p.r7k1;
import p.rrl1;
import p.s6o0;
import p.srl1;
import p.t3f1;
import p.t6o0;
import p.tql1;
import p.trl1;
import p.url1;
import p.vrl1;
import p.w1f1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ActionBarOverlayLayout extends ViewGroup implements t6o0, r6o0, s6o0 {
    public static final int[] i1 = {2130968582, R.attr.windowContentOverlay};
    public static final hsl1 j1;
    public static final Rect k1;
    public int N0;
    public int O0;
    public final Rect P0;
    public final Rect Q0;
    public final Rect R0;
    public final Rect S0;
    public final Rect T0;
    public boolean U0;
    public boolean V0;
    public hsl1 W0;
    public hsl1 X0;
    public hsl1 Y0;
    public hsl1 Z0;
    public int a;
    public f20 a1;
    public int b;
    public OverScroller b1;
    public ContentFrameLayout c;
    public ViewPropertyAnimator c1;
    public ActionBarContainer d;
    public final d20 d1;
    public jar e;
    public final e20 e1;
    public Drawable f;
    public final e20 f1;
    public boolean g;
    public final f3a g1;
    public boolean h;
    public final h20 h1;
    public boolean i;
    public boolean t;

    static {
        vrl1 prl1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            prl1Var = new url1();
        } else if (i >= 35) {
            prl1Var = new trl1();
        } else if (i >= 34) {
            prl1Var = new srl1();
        } else if (i >= 31) {
            prl1Var = new rrl1();
        } else if (i >= 30) {
            prl1Var = new qrl1();
        } else {
            prl1Var = i >= 29 ? new prl1() : new nrl1();
        }
        prl1Var.h(nk80.c(0, 1, 0, 1));
        j1 = prl1Var.b();
        k1 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.P0 = new Rect();
        this.Q0 = new Rect();
        this.R0 = new Rect();
        this.S0 = new Rect();
        this.T0 = new Rect();
        this.U0 = true;
        this.V0 = false;
        hsl1 hsl1Var = hsl1.b;
        this.W0 = hsl1Var;
        this.X0 = hsl1Var;
        this.Y0 = hsl1Var;
        this.Z0 = hsl1Var;
        this.d1 = new d20(this, (byte) 0);
        this.e1 = new e20(this, (byte) 0);
        this.f1 = new e20(this, (byte) 1);
        h(context);
        this.g1 = new f3a();
        h20 h20Var = new h20(context);
        h20Var.setWillNotDraw(true);
        this.h1 = h20Var;
        addView(h20Var);
    }

    public static boolean p(View view, int i, int i2, int i3, int i4) {
        boolean z;
        g20 g20Var = (g20) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) g20Var).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) g20Var).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) g20Var).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) g20Var).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) g20Var).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) g20Var).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) g20Var).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) g20Var).bottomMargin = i4;
        return true;
    }

    public final boolean a() {
        ActionMenuView actionMenuView;
        o();
        Toolbar toolbar = ((t3f1) this.e).a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.V0;
    }

    public final void b() {
        o();
        ActionMenuView actionMenuView = ((t3f1) this.e).a.a;
        if (actionMenuView != null) {
            actionMenuView.j();
        }
    }

    public final void c() {
        removeCallbacks(this.e1);
        removeCallbacks(this.f1);
        ViewPropertyAnimator viewPropertyAnimator = this.c1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g20;
    }

    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean f() {
        g60 g60Var;
        o();
        ActionMenuView actionMenuView = ((t3f1) this.e).a.a;
        return (actionMenuView == null || (g60Var = actionMenuView.W0) == null || !g60Var.j()) ? false : true;
    }

    public final void g(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g20(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g20(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.g1.d();
    }

    public CharSequence getTitle() {
        o();
        return ((t3f1) this.e).a.getTitle();
    }

    public final void h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.b1 = new OverScroller(context);
    }

    public final void i(int i) {
        o();
        if (i == 2) {
            this.e.getClass();
        } else if (i == 5) {
            this.e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        k(view, i, i2, i3, i4, i5);
    }

    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final boolean l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final boolean m() {
        g60 g60Var;
        o();
        ActionMenuView actionMenuView = ((t3f1) this.e).a.a;
        if (actionMenuView == null || (g60Var = actionMenuView.W0) == null) {
            return false;
        }
        return g60Var.S0 != null || g60Var.k();
    }

    public final boolean n() {
        o();
        return ((t3f1) this.e).a.n();
    }

    public final void o() {
        jar wrapper;
        if (this.c == null) {
            this.c = findViewById(2131427446);
            this.d = (ActionBarContainer) findViewById(2131427447);
            Toolbar toolbarFindViewById = findViewById(2131427445);
            if (toolbarFindViewById instanceof jar) {
                wrapper = (jar) toolbarFindViewById;
            } else {
                if (!(toolbarFindViewById instanceof Toolbar)) {
                    eg.m("Can't make a decor toolbar out of ".concat(toolbarFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = toolbarFindViewById.getWrapper();
            }
            this.e = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zP;
        o();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & SemanticState.Hidden) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = b8k1.a;
        h20 h20Var = this.h1;
        hsl1 hsl1Var = j1;
        Rect rect = this.T0;
        r7k1.b(h20Var, hsl1Var, rect);
        boolean zEquals = rect.equals(k1);
        this.U0 = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.V0 = z4;
        f20 f20Var = this.a1;
        if (f20Var != null) {
            ((tql1) f20Var).q = (z2 || z4) ? false : true;
        }
        hsl1 hsl1VarG = hsl1.g(this, windowInsets);
        esl1 esl1Var = hsl1VarG.a;
        nk80 nk80VarN = esl1Var.n();
        int i = nk80VarN.a;
        int i2 = nk80VarN.a;
        int i3 = nk80VarN.b;
        int i4 = nk80VarN.c;
        this.S0.set(i, i3, i4, nk80VarN.d);
        if (this.V0) {
            nk80 nk80VarI = esl1Var.i(2);
            int i5 = nk80VarI.a;
            int i6 = nk80VarI.c;
            this.d.setPadding(i2 - i5, i3, i4 - i6, 0);
            zP = p(this.d, nk80VarI.a, 0, i6, 0);
        } else {
            this.d.setPadding(0, 0, 0, 0);
            zP = p(this.d, i2, i3, i4, 0);
        }
        Rect rect2 = this.P0;
        r7k1.b(this, hsl1VarG, rect2);
        hsl1 hsl1VarR = esl1Var.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.W0 = hsl1VarR;
        if (!this.X0.equals(hsl1VarR)) {
            this.X0 = this.W0;
            zP = true;
        }
        Rect rect3 = this.Q0;
        if (rect3.equals(rect2)) {
            z = zP;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return esl1Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        WeakHashMap weakHashMap = b8k1.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                g20 g20Var = (g20) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) g20Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) g20Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        vrl1 prl1Var;
        o();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        g20 g20Var = (g20) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) g20Var).leftMargin + ((ViewGroup.MarginLayoutParams) g20Var).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) g20Var).topMargin + ((ViewGroup.MarginLayoutParams) g20Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = b8k1.a;
        boolean z = (getWindowSystemUiVisibility() & SemanticState.Hidden) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.V0) {
                measuredHeight += this.S0.top;
            }
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.P0;
        Rect rect2 = this.R0;
        rect2.set(rect);
        hsl1 hsl1Var = this.W0;
        this.Y0 = hsl1Var;
        if (this.g || z || !this.U0) {
            nk80 nk80VarC = this.V0 ? nk80.c(hsl1Var.b(), Math.max(this.Y0.d(), measuredHeight), this.Y0.c(), Math.max(this.Y0.a(), 0)) : nk80.c(hsl1Var.b(), this.Y0.d() + measuredHeight, this.Y0.c(), this.Y0.a());
            hsl1 hsl1Var2 = this.Y0;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                prl1Var = new url1(hsl1Var2);
            } else if (i3 >= 35) {
                prl1Var = new trl1(hsl1Var2);
            } else if (i3 >= 34) {
                prl1Var = new srl1(hsl1Var2);
            } else if (i3 >= 31) {
                prl1Var = new rrl1(hsl1Var2);
            } else if (i3 >= 30) {
                prl1Var = new qrl1(hsl1Var2);
            } else {
                prl1Var = i3 >= 29 ? new prl1(hsl1Var2) : new nrl1(hsl1Var2);
            }
            prl1Var.h(nk80VarC);
            this.Y0 = prl1Var.b();
        } else {
            boolean z2 = this.V0;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.Y0 = this.Y0.a.r(0, measuredHeight, 0, 0);
        }
        p(this.c, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.Z0.equals(this.Y0)) {
            hsl1 hsl1Var3 = this.Y0;
            this.Z0 = hsl1Var3;
            b8k1.d(this.c, hsl1Var3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        g20 g20Var2 = (g20) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) g20Var2).leftMargin + ((ViewGroup.MarginLayoutParams) g20Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) g20Var2).topMargin + ((ViewGroup.MarginLayoutParams) g20Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.b1.fling(0, 0, 0, (int) f2, 0, 0, os00.INVALID_ID, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.b1.getFinalY() > this.d.getHeight()) {
            c();
            this.f1.run();
        } else {
            c();
            this.e1.run();
        }
        this.t = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.N0 + i2;
        this.N0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        tql1 tql1Var;
        bz60 bz60Var;
        this.g1.a = i;
        this.N0 = getActionBarHideOffset();
        c();
        f20 f20Var = this.a1;
        if (f20Var == null || (bz60Var = (tql1Var = (tql1) f20Var).v) == null) {
            return;
        }
        bz60Var.a();
        tql1Var.v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.t) {
            return;
        }
        if (this.N0 <= this.d.getHeight()) {
            c();
            postDelayed(this.e1, 600L);
        } else {
            c();
            postDelayed(this.f1, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        o();
        int i2 = this.O0 ^ i;
        this.O0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & SemanticState.Hidden) != 0;
        f20 f20Var = this.a1;
        if (f20Var != null) {
            tql1 tql1Var = (tql1) f20Var;
            tql1Var.q = (z2 || this.V0) ? false : true;
            if (z || !z2) {
                if (tql1Var.s) {
                    tql1Var.s = false;
                    tql1Var.r0(true);
                }
            } else if (!tql1Var.s) {
                tql1Var.s = true;
                tql1Var.r0(true);
            }
        }
        if ((i2 & SemanticState.Hidden) == 0 || this.a1 == null) {
            return;
        }
        WeakHashMap weakHashMap = b8k1.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        f20 f20Var = this.a1;
        if (f20Var != null) {
            ((tql1) f20Var).f143p = i;
        }
    }

    public final void q(msi0 msi0Var, oti0 oti0Var) {
        o();
        t3f1 t3f1Var = (t3f1) this.e;
        Toolbar toolbar = t3f1Var.a;
        g60 g60Var = t3f1Var.m;
        if (g60Var == null) {
            g60Var = new g60(toolbar.getContext());
            t3f1Var.m = g60Var;
        }
        g60Var.e = oti0Var;
        if (msi0Var == null && toolbar.a == null) {
            return;
        }
        toolbar.e();
        msi0 msi0Var2 = toolbar.a.S0;
        if (msi0Var2 == msi0Var) {
            return;
        }
        if (msi0Var2 != null) {
            msi0Var2.t(toolbar.o1);
            msi0Var2.t(toolbar.p1);
        }
        if (toolbar.p1 == null) {
            toolbar.p1 = new w1f1(toolbar);
        }
        g60Var.O0 = true;
        Context context = toolbar.t;
        if (msi0Var != null) {
            msi0Var.c(g60Var, context);
            msi0Var.c(toolbar.p1, toolbar.t);
        } else {
            g60Var.c(context, null);
            toolbar.p1.c(toolbar.t, null);
            g60Var.e();
            toolbar.p1.e();
        }
        toolbar.a.setPopupTheme(toolbar.N0);
        toolbar.a.setPresenter(g60Var);
        toolbar.o1 = g60Var;
        toolbar.u();
    }

    public final void r() {
        o();
        ((t3f1) this.e).l = true;
    }

    public final boolean s() {
        o();
        return ((t3f1) this.e).a.t();
    }

    public void setActionBarHideOffset(int i) {
        c();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(f20 f20Var) {
        this.a1 = f20Var;
        if (getWindowToken() != null) {
            ((tql1) this.a1).f143p = this.b;
            int i = this.O0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = b8k1.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            c();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        o();
        t3f1 t3f1Var = (t3f1) this.e;
        t3f1Var.d = i != 0 ? f0o1.j(t3f1Var.a.getContext(), i) : null;
        t3f1Var.c();
    }

    public void setLogo(int i) {
        o();
        t3f1 t3f1Var = (t3f1) this.e;
        t3f1Var.e = i != 0 ? f0o1.j(t3f1Var.a.getContext(), i) : null;
        t3f1Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        o();
        ((t3f1) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        o();
        t3f1 t3f1Var = (t3f1) this.e;
        if (t3f1Var.g) {
            return;
        }
        Toolbar toolbar = t3f1Var.a;
        t3f1Var.h = charSequence;
        if ((t3f1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (t3f1Var.g) {
                b8k1.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g20(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        o();
        t3f1 t3f1Var = (t3f1) this.e;
        t3f1Var.d = drawable;
        t3f1Var.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
