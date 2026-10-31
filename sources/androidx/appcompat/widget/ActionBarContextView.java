package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p.b8k1;
import p.c20;
import p.d1s;
import p.d60;
import p.eg;
import p.f0o1;
import p.g60;
import p.iti0;
import p.l1d;
import p.moz0;
import p.msi0;
import p.o60;
import p.oek1;
import p.os00;
import p.sik1;
import p.sti0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ActionBarContextView extends ViewGroup {
    public View N0;
    public View O0;
    public View P0;
    public LinearLayout Q0;
    public TextView R0;
    public TextView S0;
    public final int T0;
    public final int U0;
    public boolean V0;
    public final int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public final d1s a;
    public int a1;
    public final Context b;
    public int b1;
    public ActionMenuView c;
    public int c1;
    public g60 d;
    public int d1;
    public int e;
    public oek1 f;
    public boolean g;
    public boolean h;
    public CharSequence i;
    public CharSequence t;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        d1s d1sVar = new d1s();
        d1sVar.c = this;
        d1sVar.a = false;
        this.a = d1sVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968581, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, moz0.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : f0o1.j(context, resourceId));
        this.T0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.U0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.W0 = typedArrayObtainStyledAttributes.getResourceId(2, 2131623941);
        typedArrayObtainStyledAttributes.recycle();
        this.a1 = getPaddingLeft();
        this.b1 = getPaddingTop();
        this.c1 = getPaddingRight();
        this.d1 = getPaddingBottom();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, os00.INVALID_ID), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int h(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iF = l1d.f(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iF, i, measuredHeight + iF);
        } else {
            view.layout(i, iF, i + measuredWidth, measuredHeight + iF);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(o60 o60Var) {
        View view = this.N0;
        byte b = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.W0, (ViewGroup) this, false);
            this.N0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.N0);
        }
        View viewFindViewById = this.N0.findViewById(2131427472);
        this.O0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new c20(o60Var, b));
        msi0 msi0VarF = o60Var.f();
        g60 g60Var = this.d;
        if (g60Var != null) {
            g60Var.j();
            d60 d60Var = g60Var.R0;
            if (d60Var != null && d60Var.b()) {
                ((iti0) d60Var.i).dismiss();
            }
        }
        g60 g60Var2 = new g60(getContext());
        this.d = g60Var2;
        g60Var2.t = true;
        g60Var2.X = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        msi0VarF.c(this.d, this.b);
        g60 g60Var3 = this.d;
        sti0 sti0Var = g60Var3.f;
        if (sti0Var == null) {
            sti0 sti0Var2 = (sti0) g60Var3.d.inflate(2131623939, (ViewGroup) this, false);
            g60Var3.f = sti0Var2;
            sti0Var2.b(g60Var3.c);
            g60Var3.e();
        }
        sti0 sti0Var3 = g60Var3.f;
        if (sti0Var != sti0Var3) {
            ((ActionMenuView) sti0Var3).setPresenter(g60Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) sti0Var3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.Q0 == null) {
            LayoutInflater.from(getContext()).inflate(2131623936, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.Q0 = linearLayout;
            this.R0 = (TextView) linearLayout.findViewById(2131427452);
            this.S0 = (TextView) this.Q0.findViewById(2131427451);
            int i = this.T0;
            if (i != 0) {
                this.R0.setTextAppearance(getContext(), i);
            }
            int i2 = this.U0;
            if (i2 != 0) {
                this.S0.setTextAppearance(getContext(), i2);
            }
        }
        this.R0.setText(this.i);
        this.S0.setText(this.t);
        boolean zIsEmpty = TextUtils.isEmpty(this.i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.t);
        this.S0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.Q0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.Q0.getParent() == null) {
            addView(this.Q0);
        }
    }

    public final void e() {
        removeAllViews();
        this.P0 = null;
        this.c = null;
        this.d = null;
        View view = this.O0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, moz0.a, 2130968584, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        g60 g60Var = this.d;
        if (g60Var != null) {
            Configuration configuration2 = g60Var.b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            g60Var.N0 = i;
            msi0 msi0Var = g60Var.c;
            if (msi0Var != null) {
                msi0Var.q(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.t;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public final void i(int i, int i2, int i3) {
        this.X0 = i;
        this.Y0 = i2;
        this.Z0 = i3;
        l();
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            oek1 oek1Var = this.f;
            if (oek1Var != null) {
                oek1Var.c();
            }
            super.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final oek1 k(int i, long j) {
        oek1 oek1Var = this.f;
        if (oek1Var != null) {
            oek1Var.c();
        }
        d1s d1sVar = this.a;
        if (i != 0) {
            oek1 oek1VarC = b8k1.c(this);
            oek1VarC.a(0.0f);
            oek1VarC.d(j);
            ((ActionBarContextView) d1sVar.c).f = oek1VarC;
            d1sVar.b = i;
            oek1VarC.f(d1sVar);
            return oek1VarC;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        oek1 oek1VarC2 = b8k1.c(this);
        oek1VarC2.a(1.0f);
        oek1VarC2.d(j);
        ((ActionBarContextView) d1sVar.c).f = oek1VarC2;
        d1sVar.b = i;
        oek1VarC2.f(d1sVar);
        return oek1VarC2;
    }

    public final void l() {
        super.setPadding(this.X0 + this.a1, this.Y0 + this.b1, this.Z0 + this.c1, this.d1);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, moz0.d, 2130968608, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g60 g60Var = this.d;
        if (g60Var != null) {
            g60Var.j();
            d60 d60Var = this.d.R0;
            if (d60Var == null || !d60Var.b()) {
                return;
            }
            ((iti0) d60Var.i).dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = sik1.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.N0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.N0.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iH = h(i7, paddingTop, paddingTop2, this.N0, z3) + i7;
            paddingRight = z3 ? iH - i6 : iH + i6;
        }
        LinearLayout linearLayout = this.Q0;
        if (linearLayout != null && this.P0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(paddingRight, paddingTop, paddingTop2, this.Q0, z3);
        }
        View view2 = this.P0;
        if (view2 != null) {
            h(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            h(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            eg.m(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            eg.m(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.e;
        int size2 = i3 > 0 ? i3 + this.Y0 : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, os00.INVALID_ID);
        View view = this.N0;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.N0.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.Q0;
        if (linearLayout != null && this.P0 == null) {
            if (this.V0) {
                this.Q0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.Q0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.Q0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.P0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.P0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.P0;
        if (view2 != null) {
            removeView(view2);
        }
        this.P0 = view;
        if (view != null && (linearLayout = this.Q0) != null) {
            removeView(linearLayout);
            this.Q0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.a1 = i;
        this.b1 = i2;
        this.c1 = i3;
        this.d1 = i4;
        l();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.a1 = i;
            this.c1 = i3;
        } else {
            this.a1 = i3;
            this.c1 = i;
        }
        this.b1 = i2;
        this.d1 = i4;
        l();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.t = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        b8k1.r(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.V0) {
            requestLayout();
        }
        this.V0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968608);
    }
}
