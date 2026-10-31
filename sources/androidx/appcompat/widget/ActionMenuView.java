package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.car.app.model.Alert;
import p.d60;
import p.f60;
import p.g60;
import p.h60;
import p.i60;
import p.iti0;
import p.j60;
import p.kr60;
import p.ksi0;
import p.l9x0;
import p.lsi0;
import p.msi0;
import p.os00;
import p.oti0;
import p.ric0;
import p.sik1;
import p.sti0;
import p.x0d;
import p.ysi0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ActionMenuView extends LinearLayoutCompat implements lsi0, sti0 {
    public msi0 S0;
    public Context T0;
    public int U0;
    public boolean V0;
    public g60 W0;
    public oti0 X0;
    public ksi0 Y0;
    public boolean Z0;
    public int a1;
    public final int b1;
    public final int c1;
    public j60 d1;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.b1 = (int) (56.0f * f);
        this.c1 = (int) (f * 4.0f);
        this.T0 = context;
        this.U0 = 0;
    }

    public static i60 k() {
        i60 i60Var = new i60(-2, -2);
        i60Var.a = false;
        ((LinearLayout.LayoutParams) i60Var).gravity = 16;
        return i60Var;
    }

    public static i60 l(ViewGroup.LayoutParams layoutParams) {
        i60 i60Var;
        if (layoutParams == null) {
            return k();
        }
        if (layoutParams instanceof i60) {
            i60 i60Var2 = (i60) layoutParams;
            i60Var = new i60(i60Var2);
            i60Var.a = i60Var2.a;
        } else {
            i60Var = new i60(layoutParams);
        }
        if (((LinearLayout.LayoutParams) i60Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) i60Var).gravity = 16;
        }
        return i60Var;
    }

    @Override // p.lsi0
    public final boolean a(ysi0 ysi0Var) {
        return this.S0.s(ysi0Var, null, 0);
    }

    @Override // p.sti0
    public final void b(msi0 msi0Var) {
        this.S0 = msi0Var;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i60;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ ric0 generateDefaultLayoutParams() {
        return k();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final ric0 generateLayoutParams(AttributeSet attributeSet) {
        return new i60(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return k();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i60(getContext(), attributeSet);
    }

    public Menu getMenu() {
        msi0 msi0Var = this.S0;
        if (msi0Var != null) {
            return msi0Var;
        }
        Context context = getContext();
        msi0 msi0Var2 = new msi0(context);
        this.S0 = msi0Var2;
        msi0Var2.e = new kr60((Object) this, (byte) 3);
        g60 g60Var = new g60(context);
        this.W0 = g60Var;
        g60Var.t = true;
        g60Var.X = true;
        l9x0 l9x0Var = this.X0;
        if (l9x0Var == null) {
            l9x0Var = new l9x0((byte) 27);
        }
        g60Var.e = l9x0Var;
        this.S0.c(g60Var, this.T0);
        g60 g60Var2 = this.W0;
        g60Var2.f = this;
        msi0 msi0Var3 = g60Var2.c;
        this.S0 = msi0Var3;
        return msi0Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        g60 g60Var = this.W0;
        AppCompatImageView appCompatImageView = g60Var.g;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        if (g60Var.i) {
            return g60Var.h;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.U0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ ric0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final void j() {
        g60 g60Var = this.W0;
        if (g60Var != null) {
            g60Var.j();
            d60 d60Var = g60Var.R0;
            if (d60Var == null || !d60Var.b()) {
                return;
            }
            ((iti0) d60Var.i).dismiss();
        }
    }

    public final boolean m(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof h60)) {
            zA = ((h60) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof h60)) ? zA : ((h60) childAt2).b() | zA;
    }

    public final boolean n() {
        g60 g60Var = this.W0;
        return g60Var != null && g60Var.k();
    }

    public final msi0 o() {
        return this.S0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g60 g60Var = this.W0;
        if (g60Var != null) {
            g60Var.e();
            if (this.W0.k()) {
                this.W0.j();
                this.W0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.Z0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = sik1.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                i60 i60Var = (i60) childAt.getLayoutParams();
                if (i60Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) i60Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) i60Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) i60Var).leftMargin) + ((LinearLayout.LayoutParams) i60Var).rightMargin;
                    m(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                i60 i60Var2 = (i60) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !i60Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) i60Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) i60Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            i60 i60Var3 = (i60) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !i60Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) i60Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = x0d.g(measuredWidth4, ((LinearLayout.LayoutParams) i60Var3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        msi0 msi0Var;
        boolean z = this.Z0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.Z0 = z2;
        if (z != z2) {
            this.a1 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.Z0 && (msi0Var = this.S0) != null && size != this.a1) {
            this.a1 = size;
            msi0Var.q(true);
        }
        int childCount = getChildCount();
        if (!this.Z0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                i60 i60Var = (i60) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) i60Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) i60Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.b1;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.c1;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                i60 i60Var2 = (i60) childAt.getLayoutParams();
                i60Var2.f = false;
                i60Var2.c = 0;
                i60Var2.b = 0;
                i60Var2.d = false;
                ((LinearLayout.LayoutParams) i60Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) i60Var2).rightMargin = 0;
                i60Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = i60Var2.a ? 1 : i10;
                i60 i60Var3 = (i60) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, os00.INVALID_ID), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                i60Var3.d = !i60Var3.a && z6;
                i60Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (i60Var2.d) {
                    i15++;
                }
                if (i60Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Alert.DURATION_SHOW_INDEFINITELY;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                i60 i60Var4 = (i60) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (i60Var4.d) {
                    int i28 = i60Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                i60 i60Var5 = (i60) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && i60Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    i60Var5.b += r11;
                    i60Var5.f = r11;
                    i23--;
                } else if (i60Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((i60) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((i60) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    i60 i60Var6 = (i60) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        i60Var6.c = i32;
                        i60Var6.f = true;
                        if (i33 == 0 && !i60Var6.e) {
                            ((LinearLayout.LayoutParams) i60Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (i60Var6.a) {
                        i60Var6.c = i32;
                        i60Var6.f = true;
                        ((LinearLayout.LayoutParams) i60Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) i60Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) i60Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                i60 i60Var7 = (i60) childAt4.getLayoutParams();
                if (i60Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((i60Var7.b * i22) + i60Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public final void p(oti0 oti0Var, ksi0 ksi0Var) {
        this.X0 = oti0Var;
        this.Y0 = ksi0Var;
    }

    public final boolean q() {
        g60 g60Var = this.W0;
        return g60Var != null && g60Var.l();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.W0.O0 = z;
    }

    public void setOnMenuItemClickListener(j60 j60Var) {
        this.d1 = j60Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        g60 g60Var = this.W0;
        f60 f60Var = g60Var.g;
        if (f60Var != null) {
            f60Var.setImageDrawable(drawable);
        } else {
            g60Var.i = true;
            g60Var.h = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.V0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.U0 != i) {
            this.U0 = i;
            if (i == 0) {
                this.T0 = getContext();
            } else {
                this.T0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(g60 g60Var) {
        this.W0 = g60Var;
        g60Var.f = this;
        this.S0 = g60Var.c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
