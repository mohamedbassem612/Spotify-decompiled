package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p.b8k1;
import p.d1d1;
import p.e9k;
import p.f0o1;
import p.g60;
import p.gg;
import p.gl61;
import p.jar;
import p.kqi0;
import p.lvc1;
import p.moz0;
import p.msi0;
import p.psi0;
import p.py31;
import p.qpn1;
import p.qti0;
import p.sik1;
import p.svh0;
import p.t3f1;
import p.v1f1;
import p.w1f1;
import p.wh5;
import p.x1f1;
import p.xfz0;
import p.xq81;
import p.y1f1;
import p.y1t0;
import p.ysi0;
import p.z1f1;
import p.zb91;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class Toolbar extends ViewGroup implements psi0 {
    public int N0;
    public int O0;
    public int P0;
    public final int Q0;
    public final int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public py31 W0;
    public int X0;
    public int Y0;
    public final int Z0;
    public ActionMenuView a;
    public CharSequence a1;
    public AppCompatTextView b;
    public CharSequence b1;
    public AppCompatTextView c;
    public ColorStateList c1;
    public AppCompatImageButton d;
    public ColorStateList d1;
    public AppCompatImageView e;
    public boolean e1;
    public final Drawable f;
    public boolean f1;
    public final CharSequence g;
    public final ArrayList g1;
    public AppCompatImageButton h;
    public final ArrayList h1;
    public View i;
    public final int[] i1;
    public final kqi0 j1;
    public ArrayList k1;
    public y1f1 l1;
    public final zb91 m1;
    public t3f1 n1;
    public g60 o1;
    public w1f1 p1;
    public svh0 q1;
    public xq81 r1;
    public boolean s1;
    public Context t;
    public wh5 t1;
    public OnBackInvokedDispatcher u1;
    public boolean v1;
    public final xfz0 w1;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Z0 = 8388627;
        this.g1 = new ArrayList();
        this.h1 = new ArrayList();
        this.i1 = new int[2];
        this.j1 = new kqi0(new v1f1(this, (byte) 1));
        this.k1 = new ArrayList();
        this.m1 = new zb91(this, (byte) 14);
        this.w1 = new xfz0(this, (byte) 25);
        Context context2 = getContext();
        int[] iArr = moz0.y;
        lvc1 lvc1VarE = lvc1.E(context2, attributeSet, iArr, i);
        b8k1.o(this, context, iArr, attributeSet, lvc1VarE.w(), i);
        this.O0 = lvc1VarE.q(28, 0);
        this.P0 = lvc1VarE.q(19, 0);
        this.Z0 = lvc1VarE.o(0, 8388627);
        this.Q0 = lvc1VarE.o(2, 48);
        int iH = lvc1VarE.h(22, 0);
        iH = lvc1VarE.y(27) ? lvc1VarE.h(27, iH) : iH;
        this.V0 = iH;
        this.U0 = iH;
        this.T0 = iH;
        this.S0 = iH;
        int iH2 = lvc1VarE.h(25, -1);
        if (iH2 >= 0) {
            this.S0 = iH2;
        }
        int iH3 = lvc1VarE.h(24, -1);
        if (iH3 >= 0) {
            this.T0 = iH3;
        }
        int iH4 = lvc1VarE.h(26, -1);
        if (iH4 >= 0) {
            this.U0 = iH4;
        }
        int iH5 = lvc1VarE.h(23, -1);
        if (iH5 >= 0) {
            this.V0 = iH5;
        }
        this.R0 = lvc1VarE.i(13, -1);
        int iH6 = lvc1VarE.h(9, Integer.MIN_VALUE);
        int iH7 = lvc1VarE.h(5, Integer.MIN_VALUE);
        int i2 = lvc1VarE.i(7, 0);
        int i3 = lvc1VarE.i(8, 0);
        py31 py31Var = this.W0;
        if (py31Var == null) {
            py31Var = new py31();
            this.W0 = py31Var;
        }
        py31Var.e(i2, i3);
        if (iH6 != Integer.MIN_VALUE || iH7 != Integer.MIN_VALUE) {
            this.W0.g(iH6, iH7);
        }
        this.X0 = lvc1VarE.h(10, Integer.MIN_VALUE);
        this.Y0 = lvc1VarE.h(6, Integer.MIN_VALUE);
        this.f = lvc1VarE.k(4);
        this.g = lvc1VarE.v(3);
        CharSequence charSequenceV = lvc1VarE.v(21);
        if (!TextUtils.isEmpty(charSequenceV)) {
            setTitle(charSequenceV);
        }
        CharSequence charSequenceV2 = lvc1VarE.v(18);
        if (!TextUtils.isEmpty(charSequenceV2)) {
            setSubtitle(charSequenceV2);
        }
        this.t = getContext();
        setPopupTheme(lvc1VarE.q(17, 0));
        Drawable drawableK = lvc1VarE.k(16);
        if (drawableK != null) {
            setNavigationIcon(drawableK);
        }
        CharSequence charSequenceV3 = lvc1VarE.v(15);
        if (!TextUtils.isEmpty(charSequenceV3)) {
            setNavigationContentDescription(charSequenceV3);
        }
        Drawable drawableK2 = lvc1VarE.k(11);
        if (drawableK2 != null) {
            setLogo(drawableK2);
        }
        CharSequence charSequenceV4 = lvc1VarE.v(12);
        if (!TextUtils.isEmpty(charSequenceV4)) {
            setLogoDescription(charSequenceV4);
        }
        if (lvc1VarE.y(29)) {
            setTitleTextColor(lvc1VarE.g(29));
        }
        if (lvc1VarE.y(20)) {
            setSubtitleTextColor(lvc1VarE.g(20));
        }
        if (lvc1VarE.y(14)) {
            getMenuInflater().inflate(lvc1VarE.q(14, 0), getMenu());
        }
        lvc1VarE.I();
    }

    public static x1f1 g(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof x1f1;
        if (z) {
            return new x1f1((x1f1) layoutParams);
        }
        if (z) {
            return new x1f1((x1f1) layoutParams, 0);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new x1f1((ViewGroup.MarginLayoutParams) layoutParams) : new x1f1(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new d1d1(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // p.psi0
    public final void G(qti0 qti0Var) {
        this.j1.a(qti0Var);
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iK = qpn1.k(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                x1f1 layoutParams = childAt.getLayoutParams();
                if (layoutParams.b == 0 && s(childAt)) {
                    int i3 = layoutParams.a;
                    int layoutDirection = getLayoutDirection();
                    int iK2 = qpn1.k(i3, layoutDirection) & 7;
                    if (iK2 != 1 && iK2 != 3 && iK2 != 5) {
                        iK2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (iK2 == iK) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            x1f1 layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && s(childAt2)) {
                int i5 = layoutParams2.a;
                int layoutDirection2 = getLayoutDirection();
                int iK3 = qpn1.k(i5, layoutDirection2) & 7;
                if (iK3 != 1 && iK3 != 3 && iK3 != 5) {
                    iK3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (iK3 == iK) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        x1f1 x1f1VarG;
        x1f1 layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            x1f1VarG = new x1f1();
        } else {
            x1f1VarG = !checkLayoutParams(layoutParams) ? g(layoutParams) : layoutParams;
        }
        x1f1VarG.b = (byte) 1;
        if (!z || this.i == null) {
            addView(view, (ViewGroup.LayoutParams) x1f1VarG);
        } else {
            view.setLayoutParams(x1f1VarG);
            this.h1.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, 2130970488);
            this.h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            ViewGroup.LayoutParams x1f1Var = new x1f1();
            ((x1f1) x1f1Var).a = (this.Q0 & 112) | 8388611;
            ((x1f1) x1f1Var).b = (byte) 2;
            this.h.setLayoutParams(x1f1Var);
            this.h.setOnClickListener(new gl61(this, (byte) 11));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof x1f1);
    }

    public final void d() {
        e();
        if (this.a.o() == null) {
            msi0 menu = this.a.getMenu();
            if (this.p1 == null) {
                this.p1 = new w1f1(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            menu.c(this.p1, this.t);
            u();
        }
    }

    public final void e() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.N0);
            this.a.setOnMenuItemClickListener(this.m1);
            this.a.p(this.q1, new y1t0(this, (byte) 15));
            ViewGroup.LayoutParams x1f1Var = new x1f1();
            ((x1f1) x1f1Var).a = (this.Q0 & 112) | 8388613;
            this.a.setLayoutParams(x1f1Var);
            b(this.a, false);
        }
    }

    public final void f() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), (AttributeSet) null, 2130970488);
            ViewGroup.LayoutParams x1f1Var = new x1f1();
            ((x1f1) x1f1Var).a = (this.Q0 & 112) | 8388611;
            this.d.setLayoutParams(x1f1Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new x1f1();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new x1f1(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        py31 py31Var = this.W0;
        if (py31Var != null) {
            return py31Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.Y0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        py31 py31Var = this.W0;
        if (py31Var != null) {
            return py31Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        py31 py31Var = this.W0;
        if (py31Var != null) {
            return py31Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        py31 py31Var = this.W0;
        if (py31Var != null) {
            return py31Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.X0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        msi0 msi0VarO;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (msi0VarO = actionMenuView.o()) == null || !msi0VarO.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.Y0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.X0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public g60 getOuterActionMenuPresenter() {
        return this.o1;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.t;
    }

    public int getPopupTheme() {
        return this.N0;
    }

    public CharSequence getSubtitle() {
        return this.b1;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.a1;
    }

    public int getTitleMarginBottom() {
        return this.V0;
    }

    public int getTitleMarginEnd() {
        return this.T0;
    }

    public int getTitleMarginStart() {
        return this.S0;
    }

    public int getTitleMarginTop() {
        return this.U0;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public jar getWrapper() {
        t3f1 t3f1Var = this.n1;
        if (t3f1Var != null) {
            return t3f1Var;
        }
        t3f1 t3f1Var2 = new t3f1(this, true);
        this.n1 = t3f1Var2;
        return t3f1Var2;
    }

    public final int h(View view, int i) {
        x1f1 layoutParams = view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.Z0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void k() {
        Iterator it = this.k1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.j1.y(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.k1 = currentMenuItems2;
    }

    @Override // p.psi0
    public final void l(qti0 qti0Var) {
        this.j1.D(qti0Var);
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.h1.contains(view);
    }

    public final boolean n() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.n();
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        x1f1 layoutParams = view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iH = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iH, iMax + measuredWidth, view.getMeasuredHeight() + iH);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.w1);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1 = false;
        }
        if (!this.f1) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        x1f1 layoutParams;
        x1f1 layoutParams2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        ActionMenuView actionMenuView;
        AppCompatImageButton appCompatImageButton;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.i1;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = b8k1.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.d)) {
            AppCompatImageButton appCompatImageButton2 = this.d;
            if (z3) {
                iP = p(appCompatImageButton2, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(appCompatImageButton2, paddingLeft, iMin2, iArr);
            }
            if (s(this.h)) {
                appCompatImageButton = this.h;
                if (z3) {
                    iP = p(appCompatImageButton, iP, iMin2, iArr);
                } else {
                    iO = o(appCompatImageButton, iO, iMin2, iArr);
                }
            }
            if (s(this.a)) {
                actionMenuView = this.a;
                if (z3) {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                } else {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (s(this.i)) {
                view = this.i;
                if (z3) {
                    iMin = p(view, iMin, iMin2, iArr);
                } else {
                    iMax = o(view, iMax, iMin2, iArr);
                }
            }
            if (s(this.e)) {
                appCompatImageView = this.e;
                if (z3) {
                    iMin = p(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = o(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zS = s(this.b);
            zS2 = s(this.c);
            if (zS) {
                x1f1 layoutParams3 = this.b.getLayoutParams();
                measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                x1f1 layoutParams4 = this.c.getLayoutParams();
                measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    appCompatTextView = this.b;
                } else {
                    appCompatTextView = this.c;
                }
                if (zS2) {
                    appCompatTextView2 = this.c;
                } else {
                    appCompatTextView2 = this.b;
                }
                layoutParams = appCompatTextView.getLayoutParams();
                layoutParams2 = appCompatTextView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zS && this.b.getMeasuredWidth() > 0) || (zS2 && this.c.getMeasuredWidth() > 0);
                i6 = this.Z0 & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.U0;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.U0;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i17 = this.V0;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.V0) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.S0;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zS) {
                        x1f1 layoutParams5 = this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.T0;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zS2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                        i13 = iMin - this.T0;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.S0;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zS) {
                        x1f1 layoutParams6 = this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.T0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i30, measuredWidth4, this.c.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.T0;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.g1;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                x1f1 layoutParams7 = view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iO2) {
                if (i25 > iMin) {
                    iO2 = i24 - (i25 - iMin);
                } else {
                    iO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (s(this.h)) {
            appCompatImageButton = this.h;
            if (z3) {
                iP = p(appCompatImageButton, iP, iMin2, iArr);
            } else {
                iO = o(appCompatImageButton, iO, iMin2, iArr);
            }
        }
        if (s(this.a)) {
            actionMenuView = this.a;
            if (z3) {
                iO = o(actionMenuView, iO, iMin2, iArr);
            } else {
                iP = p(actionMenuView, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (s(this.i)) {
            view = this.i;
            if (z3) {
                iMin = p(view, iMin, iMin2, iArr);
            } else {
                iMax = o(view, iMax, iMin2, iArr);
            }
        }
        if (s(this.e)) {
            appCompatImageView = this.e;
            if (z3) {
                iMin = p(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = o(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zS = s(this.b);
        zS2 = s(this.c);
        if (zS) {
            x1f1 layoutParams8 = this.b.getLayoutParams();
            measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            x1f1 layoutParams9 = this.c.getLayoutParams();
            measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                appCompatTextView = this.b;
            } else {
                appCompatTextView = this.c;
            }
            if (zS2) {
                appCompatTextView2 = this.c;
            } else {
                appCompatTextView2 = this.b;
            }
            layoutParams = appCompatTextView.getLayoutParams();
            layoutParams2 = appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.Z0 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.U0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.U0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i17 = this.V0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.V0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.S0;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    x1f1 layoutParams10 = this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.T0;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i13 = iMin - this.T0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.S0;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zS) {
                    x1f1 layoutParams11 = this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.T0;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i35, measuredWidth7, this.c.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.T0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zS) {
                appCompatTextView = this.b;
            } else {
                appCompatTextView = this.c;
            }
            if (zS2) {
                appCompatTextView2 = this.c;
            } else {
                appCompatTextView2 = this.b;
            }
            layoutParams = appCompatTextView.getLayoutParams();
            layoutParams2 = appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.Z0 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.U0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.U0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i17 = this.V0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.V0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.S0;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zS) {
                    x1f1 layoutParams12 = this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.T0;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i214, iMin, this.c.getMeasuredHeight() + i214);
                    i13 = iMin - this.T0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.S0;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zS) {
                    x1f1 layoutParams13 = this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.T0;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i36, measuredWidth10, this.c.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.T0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.g1;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i18 < size) {
            iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            x1f1 layoutParams14 = view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iO2) {
            if (i25 > iMin) {
                iO2 = i24 - (i25 - iMin);
            } else {
                iO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int iMax;
        int iCombineMeasuredStates;
        int i4;
        int iJ;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = sik1.a;
        int i5 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.R0);
            i3 = i(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, j(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.h)) {
            r(this.h, i, 0, i2, this.R0);
            i3 = i(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, j(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, i3);
        int iMax4 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.i1;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.a)) {
            r(this.a, i, iMax3, i2, this.R0);
            i4 = i(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, j(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            i4 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, i4);
        iArr[c] = Math.max(0, currentContentInsetEnd - i4);
        if (s(this.i)) {
            iMax5 += q(this.i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, j(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (s(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, j(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getLayoutParams().b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, j(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i7 = iMax5;
        int i8 = this.U0 + this.V0;
        int i9 = this.S0 + this.T0;
        if (s(this.b)) {
            q(this.b, i, i7 + i9, i2, i8, iArr);
            int i10 = i(this.b) + this.b.getMeasuredWidth();
            iJ = j(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = i10;
        } else {
            iJ = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, i7 + i9, i2, iJ + i8, iArr));
            iJ += j(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (s(this.b) || s(this.c)) {
            iJ += i8;
        }
        int iMax7 = Math.max(iMax, iJ);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i7 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.s1) {
            i5 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i5 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof z1f1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z1f1 z1f1Var = (z1f1) parcelable;
        super.onRestoreInstanceState(z1f1Var.a());
        ActionMenuView actionMenuView = this.a;
        msi0 msi0VarO = actionMenuView != null ? actionMenuView.o() : null;
        int i = z1f1Var.c;
        if (i != 0 && this.p1 != null && msi0VarO != null && (menuItemFindItem = msi0VarO.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (z1f1Var.d) {
            xfz0 xfz0Var = this.w1;
            removeCallbacks(xfz0Var);
            post(xfz0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        py31 py31Var = this.W0;
        if (py31Var == null) {
            py31Var = new py31();
            this.W0 = py31Var;
        }
        py31Var.f(i == 1);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ysi0 ysi0Var;
        z1f1 z1f1Var = new z1f1(super.onSaveInstanceState());
        w1f1 w1f1Var = this.p1;
        if (w1f1Var != null && (ysi0Var = w1f1Var.b) != null) {
            z1f1Var.c = ysi0Var.getItemId();
        }
        z1f1Var.d = n();
        return z1f1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e1 = false;
        }
        if (!this.e1) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.e1 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.e1 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        x1f1 layoutParams = view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iH = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iH, iMax, view.getMeasuredHeight() + iH);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.v1 != z) {
            this.v1 = z;
            u();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.h;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.s1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.Y0) {
            this.Y0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.X0) {
            this.X0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.e;
        if (drawable != null) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(getContext());
                this.e = appCompatImageView;
            }
            if (!m(appCompatImageView)) {
                b(this.e, true);
            }
        } else if (appCompatImageView != null && m(appCompatImageView)) {
            removeView(this.e);
            this.h1.remove(this.e);
        }
        AppCompatImageView appCompatImageView2 = this.e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            e9k.z(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.d)) {
                b(this.d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.d;
            if (appCompatImageButton != null && m(appCompatImageButton)) {
                removeView(this.d);
                this.h1.remove(this.d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(y1f1 y1f1Var) {
        this.l1 = y1f1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            if (i == 0) {
                this.t = getContext();
            } else {
                this.t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.c;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.P0;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.d1;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!m(this.c)) {
                b(this.c, true);
            }
        } else if (appCompatTextView != null && m(appCompatTextView)) {
            removeView(this.c);
            this.h1.remove(this.c);
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.b1 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.d1 = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.b;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.O0;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.c1;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!m(this.b)) {
                b(this.b, true);
            }
        } else if (appCompatTextView != null && m(appCompatTextView)) {
            removeView(this.b);
            this.h1.remove(this.b);
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.a1 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.V0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.T0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.S0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.U0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.c1 = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final boolean t() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.q();
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherE = gg.e(this);
            w1f1 w1f1Var = this.p1;
            boolean z = (w1f1Var == null || w1f1Var.b == null || onBackInvokedDispatcherE == null || !isAttachedToWindow() || !this.v1) ? false : true;
            if (!z || this.u1 != null) {
                if (z || (onBackInvokedDispatcher = this.u1) == null) {
                    return;
                }
                gg.T(onBackInvokedDispatcher, this.t1);
                this.u1 = null;
                return;
            }
            wh5 wh5VarG = this.t1;
            if (wh5VarG == null) {
                wh5VarG = gg.G(new v1f1(this, (byte) 0));
                this.t1 = wh5VarG;
            }
            gg.S(onBackInvokedDispatcherE, wh5VarG);
            this.u1 = onBackInvokedDispatcherE;
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(f0o1.j(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(f0o1.j(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(f0o1.j(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970489);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
