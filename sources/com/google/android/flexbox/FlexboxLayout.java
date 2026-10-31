package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p.b8k1;
import p.bhn0;
import p.eg;
import p.f4i1;
import p.hhg1;
import p.lmz0;
import p.os00;
import p.rp20;
import p.sp20;
import p.tp20;
import p.up20;
import p.vp20;
import p.wp20;
import p.xp20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class FlexboxLayout extends ViewGroup implements rp20 {
    public int N0;
    public int O0;
    public int[] P0;
    public SparseIntArray Q0;
    public final wp20 R0;
    public List S0;
    public final up20 T0;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;
    public Drawable h;
    public int i;
    public int t;

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.R0 = new wp20(this);
        this.S0 = new ArrayList();
        this.T0 = new up20();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lmz0.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.t = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.t = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.S0.size();
        for (int i = 0; i < size; i++) {
            tp20 tp20Var = (tp20) this.S0.get(i);
            for (int i2 = 0; i2 < tp20Var.h; i2++) {
                int i3 = tp20Var.o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    xp20 xp20Var = (xp20) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        n(canvas, z ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) xp20Var).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) xp20Var).leftMargin) - this.O0, tp20Var.b, tp20Var.g);
                    }
                    if (i2 == tp20Var.h - 1 && (this.t & 4) > 0) {
                        n(canvas, z ? (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) xp20Var).leftMargin) - this.O0 : viewO.getRight() + ((ViewGroup.MarginLayoutParams) xp20Var).rightMargin, tp20Var.b, tp20Var.g);
                    }
                }
            }
            if (q(i)) {
                m(canvas, paddingLeft, z2 ? tp20Var.d : tp20Var.b - this.N0, iMax);
            }
            if (r(i) && (this.i & 4) > 0) {
                m(canvas, paddingLeft, z2 ? tp20Var.b - this.N0 : tp20Var.d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.Q0;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.Q0 = sparseIntArray;
        }
        wp20 wp20Var = this.R0;
        rp20 rp20Var = (rp20) wp20Var.a;
        int flexItemCount = rp20Var.getFlexItemCount();
        ArrayList arrayListP = wp20Var.p(flexItemCount);
        vp20 vp20Var = new vp20();
        if (view == null || !(layoutParams instanceof sp20)) {
            vp20Var.b = 1;
        } else {
            vp20Var.b = ((sp20) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= rp20Var.getFlexItemCount()) {
            vp20Var.a = flexItemCount;
        } else {
            vp20Var.a = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((vp20) arrayListP.get(i2)).a++;
            }
        }
        arrayListP.add(vp20Var);
        this.P0 = wp20.S(flexItemCount + 1, arrayListP, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // p.rp20
    public final int b(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // p.rp20
    public final View c(int i) {
        return getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xp20;
    }

    @Override // p.rp20
    public final int d(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // p.rp20
    public final int f(View view) {
        return 0;
    }

    @Override // p.rp20
    public final View g(int i) {
        return o(i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof xp20) {
            xp20 xp20Var = (xp20) layoutParams;
            xp20 xp20Var2 = new xp20(xp20Var);
            xp20Var2.a = 1;
            xp20Var2.b = 0.0f;
            xp20Var2.c = 1.0f;
            xp20Var2.d = -1;
            xp20Var2.e = -1.0f;
            xp20Var2.f = -1;
            xp20Var2.g = -1;
            xp20Var2.h = 16777215;
            xp20Var2.i = 16777215;
            xp20Var2.a = xp20Var.a;
            xp20Var2.b = xp20Var.b;
            xp20Var2.c = xp20Var.c;
            xp20Var2.d = xp20Var.d;
            xp20Var2.e = xp20Var.e;
            xp20Var2.f = xp20Var.f;
            xp20Var2.g = xp20Var.g;
            xp20Var2.h = xp20Var.h;
            xp20Var2.i = xp20Var.i;
            xp20Var2.t = xp20Var.t;
            return xp20Var2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            xp20 xp20Var3 = new xp20((ViewGroup.MarginLayoutParams) layoutParams);
            xp20Var3.a = 1;
            xp20Var3.b = 0.0f;
            xp20Var3.c = 1.0f;
            xp20Var3.d = -1;
            xp20Var3.e = -1.0f;
            xp20Var3.f = -1;
            xp20Var3.g = -1;
            xp20Var3.h = 16777215;
            xp20Var3.i = 16777215;
            return xp20Var3;
        }
        xp20 xp20Var4 = new xp20(layoutParams);
        xp20Var4.a = 1;
        xp20Var4.b = 0.0f;
        xp20Var4.c = 1.0f;
        xp20Var4.d = -1;
        xp20Var4.e = -1.0f;
        xp20Var4.f = -1;
        xp20Var4.g = -1;
        xp20Var4.h = 16777215;
        xp20Var4.i = 16777215;
        return xp20Var4;
    }

    @Override // p.rp20
    public int getAlignContent() {
        return this.e;
    }

    @Override // p.rp20
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // p.rp20
    public int getFlexDirection() {
        return this.a;
    }

    @Override // p.rp20
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<tp20> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.S0.size());
        for (tp20 tp20Var : this.S0) {
            if (tp20Var.a() != 0) {
                arrayList.add(tp20Var);
            }
        }
        return arrayList;
    }

    @Override // p.rp20
    public List<tp20> getFlexLinesInternal() {
        return this.S0;
    }

    @Override // p.rp20
    public int getFlexWrap() {
        return this.b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // p.rp20
    public int getLargestMainSize() {
        Iterator it = this.S0.iterator();
        int iMax = os00.INVALID_ID;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((tp20) it.next()).e);
        }
        return iMax;
    }

    @Override // p.rp20
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.t;
    }

    @Override // p.rp20
    public int getSumOfCrossSize() {
        int size = this.S0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tp20 tp20Var = (tp20) this.S0.get(i2);
            if (q(i2)) {
                i += k() ? this.N0 : this.O0;
            }
            if (r(i2)) {
                i += k() ? this.N0 : this.O0;
            }
            i += tp20Var.g;
        }
        return i;
    }

    @Override // p.rp20
    public final void h(View view, int i, int i2, tp20 tp20Var) {
        if (p(i, i2)) {
            boolean zK = k();
            int i3 = tp20Var.e;
            if (zK) {
                int i4 = this.O0;
                tp20Var.e = i3 + i4;
                tp20Var.f += i4;
            } else {
                int i5 = this.N0;
                tp20Var.e = i3 + i5;
                tp20Var.f += i5;
            }
        }
    }

    @Override // p.rp20
    public final int i(View view, int i, int i2) {
        int i3;
        int i4;
        if (k()) {
            i3 = p(i, i2) ? this.O0 : 0;
            if ((this.t & 4) <= 0) {
                return i3;
            }
            i4 = this.O0;
        } else {
            i3 = p(i, i2) ? this.N0 : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.N0;
        }
        return i3 + i4;
    }

    @Override // p.rp20
    public final void j(tp20 tp20Var) {
        if (k()) {
            if ((this.t & 4) > 0) {
                int i = tp20Var.e;
                int i2 = this.O0;
                tp20Var.e = i + i2;
                tp20Var.f += i2;
                return;
            }
            return;
        }
        if ((this.i & 4) > 0) {
            int i3 = tp20Var.e;
            int i4 = this.N0;
            tp20Var.e = i3 + i4;
            tp20Var.f += i4;
        }
    }

    @Override // p.rp20
    public final boolean k() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final void l(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.S0.size();
        for (int i = 0; i < size; i++) {
            tp20 tp20Var = (tp20) this.S0.get(i);
            for (int i2 = 0; i2 < tp20Var.h; i2++) {
                int i3 = tp20Var.o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    xp20 xp20Var = (xp20) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        m(canvas, tp20Var.a, z2 ? viewO.getBottom() + ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin : (viewO.getTop() - ((ViewGroup.MarginLayoutParams) xp20Var).topMargin) - this.N0, tp20Var.g);
                    }
                    if (i2 == tp20Var.h - 1 && (this.i & 4) > 0) {
                        m(canvas, tp20Var.a, z2 ? (viewO.getTop() - ((ViewGroup.MarginLayoutParams) xp20Var).topMargin) - this.N0 : viewO.getBottom() + ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin, tp20Var.g);
                    }
                }
            }
            if (q(i)) {
                n(canvas, z ? tp20Var.c : tp20Var.a - this.O0, paddingTop, iMax);
            }
            if (r(i) && (this.t & 4) > 0) {
                n(canvas, z ? tp20Var.a - this.O0 : tp20Var.c, paddingTop, iMax);
            }
        }
    }

    public final void m(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.N0 + i2);
        this.g.draw(canvas);
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.O0 + i, i3 + i2);
        this.h.draw(canvas);
    }

    public final View o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.P0;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.t == 0) {
            return;
        }
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (i == 0) {
            a(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            a(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.b == 2) {
                z = !z;
            }
            l(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        l(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.a;
        if (i5 == 0) {
            s(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            s(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            if (this.b == 2) {
                z2 = !z2;
            }
            t(i, i2, i3, i4, z2, false);
            return;
        }
        if (i5 != 3) {
            bhn0.r(this.a, "Invalid flex direction is set: ");
            return;
        }
        z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        t(i, i2, i3, i4, z2, true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.Q0;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.Q0 = sparseIntArray;
        }
        wp20 wp20Var = this.R0;
        rp20 rp20Var = (rp20) wp20Var.a;
        int flexItemCount = rp20Var.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.Q0;
            int flexItemCount2 = ((rp20) wp20Var.a).getFlexItemCount();
            this.P0 = wp20.S(flexItemCount2, wp20Var.p(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewC = rp20Var.c(i3);
            if (viewC != null && ((sp20) viewC.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.Q0;
                int flexItemCount3 = ((rp20) wp20Var.a).getFlexItemCount();
                this.P0 = wp20.S(flexItemCount3, wp20Var.p(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.a;
        up20 up20Var = this.T0;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                bhn0.r(this.a, "Invalid value for the flex direction is set: ");
                return;
            }
            this.S0.clear();
            up20Var.b = null;
            up20Var.a = 0;
            this.R0.k(this.T0, i2, i, Alert.DURATION_SHOW_INDEFINITELY, 0, -1, null);
            this.S0 = (List) up20Var.b;
            wp20Var.r(i, i2, 0);
            wp20Var.q(i, i2, getPaddingRight() + getPaddingLeft());
            wp20Var.V(0);
            u(this.a, i, i2, up20Var.a);
            return;
        }
        this.S0.clear();
        up20Var.b = null;
        up20Var.a = 0;
        this.R0.k(this.T0, i, i2, Alert.DURATION_SHOW_INDEFINITELY, 0, -1, null);
        this.S0 = (List) up20Var.b;
        wp20Var.r(i, i2, 0);
        if (this.d == 3) {
            for (tp20 tp20Var : this.S0) {
                int iMax = os00.INVALID_ID;
                for (int i5 = 0; i5 < tp20Var.h; i5++) {
                    View viewO = o(tp20Var.o + i5);
                    if (viewO != null && viewO.getVisibility() != 8) {
                        xp20 xp20Var = (xp20) viewO.getLayoutParams();
                        int i6 = this.b;
                        int i7 = tp20Var.l;
                        iMax = i6 != 2 ? Math.max(iMax, viewO.getMeasuredHeight() + Math.max(i7 - viewO.getBaseline(), ((ViewGroup.MarginLayoutParams) xp20Var).topMargin) + ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin) : Math.max(iMax, viewO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) xp20Var).topMargin + Math.max(viewO.getBaseline() + (i7 - viewO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin));
                    }
                }
                tp20Var.g = iMax;
            }
        }
        wp20Var.q(i, i2, getPaddingBottom() + getPaddingTop());
        wp20Var.V(0);
        u(this.a, i, i2, up20Var.a);
    }

    public final boolean p(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewO = o(i - i3);
            if (viewO != null && viewO.getVisibility() != 8) {
                if (k()) {
                    return (this.t & 2) != 0;
                }
                return (this.i & 2) != 0;
            }
        }
        if (k()) {
            return (this.t & 1) != 0;
        }
        return (this.i & 1) != 0;
    }

    public final boolean q(int i) {
        if (i >= 0 && i < this.S0.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((tp20) this.S0.get(i2)).a() > 0) {
                    if (k()) {
                        return (this.i & 2) != 0;
                    }
                    return (this.t & 2) != 0;
                }
            }
            if (k()) {
                return (this.i & 1) != 0;
            }
            if ((this.t & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.S0.size()) {
            for (int i2 = i + 1; i2 < this.S0.size(); i2++) {
                if (((tp20) this.S0.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (k()) {
                return (this.i & 4) != 0;
            }
            if ((this.t & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewO;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        wp20 wp20Var;
        tp20 tp20Var;
        wp20 wp20Var2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.S0.size();
        for (int i12 = 0; i12 < size; i12++) {
            tp20 tp20Var2 = (tp20) this.S0.get(i12);
            if (q(i12)) {
                int i13 = this.N0;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.c;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = tp20Var2.e;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = tp20Var2.a();
                    f2 = (i11 - tp20Var2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iA2 = tp20Var2.a();
                    float f6 = iA2 != 0 ? (i11 - tp20Var2.e) / iA2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        bhn0.r(this.c, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = tp20Var2.a();
                    f2 = iA3 != 0 ? (i11 - tp20Var2.e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < tp20Var2.h) {
                    i6 = tp20Var2.o + i5;
                    viewO = o(i6);
                    char c2 = c;
                    if (viewO != null) {
                        z2 = z3;
                        if (viewO.getVisibility() == 8) {
                            z2 = z2;
                        } else {
                            xp20 xp20Var = (xp20) viewO.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) xp20Var).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) xp20Var).rightMargin;
                            if (p(i6, i5)) {
                                int i18 = this.O0;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == tp20Var2.h - 1 || (this.t & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.O0;
                            }
                            if (this.b == i16) {
                                i8 = i16;
                                wp20Var2 = this.R0;
                                if (z) {
                                    view = viewO;
                                    wp20Var2.H(view, tp20Var2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewO;
                                    wp20Var2.H(view, tp20Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i7 = i14;
                            } else {
                                i5 = i5;
                                view = viewO;
                                z2 = z2;
                                i8 = i16;
                                i7 = i14;
                                wp20Var = this.R0;
                                if (z) {
                                    wp20Var.H(view, tp20Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    wp20Var.H(view, tp20Var2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) xp20Var).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) xp20Var).leftMargin);
                            if (z) {
                                tp20Var = tp20Var2;
                                tp20Var.b(view, i10, 0, i9, 0);
                            } else {
                                tp20Var = tp20Var2;
                                tp20Var.b(view, i9, 0, i10, 0);
                            }
                            tp20Var2 = tp20Var;
                            f = measuredWidth2;
                        }
                        i5++;
                        c = c2;
                        i16 = i8;
                        z3 = z2;
                        i14 = i7;
                    } else {
                        z2 = z3;
                    }
                    i8 = i16;
                    i5 = i5;
                    i7 = i14;
                    i5++;
                    c = c2;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                }
                int i20 = tp20Var2.g;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = tp20Var2.e;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < tp20Var2.h) {
                i6 = tp20Var2.o + i5;
                viewO = o(i6);
                char c3 = c;
                if (viewO != null) {
                    z2 = z3;
                    if (viewO.getVisibility() == 8) {
                        z2 = z2;
                    } else {
                        xp20 xp20Var2 = (xp20) viewO.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) xp20Var2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) xp20Var2).rightMargin;
                        if (p(i6, i5)) {
                            int i110 = this.O0;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == tp20Var2.h - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.b == i16) {
                            i8 = i16;
                            wp20Var2 = this.R0;
                            if (z) {
                                view = viewO;
                                wp20Var2.H(view, tp20Var2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewO;
                                wp20Var2.H(view, tp20Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i7 = i14;
                        } else {
                            i5 = i5;
                            view = viewO;
                            z2 = z2;
                            i8 = i16;
                            i7 = i14;
                            wp20Var = this.R0;
                            if (z) {
                                wp20Var.H(view, tp20Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                wp20Var.H(view, tp20Var2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) xp20Var2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) xp20Var2).leftMargin);
                        if (z) {
                            tp20Var = tp20Var2;
                            tp20Var.b(view, i10, 0, i9, 0);
                        } else {
                            tp20Var = tp20Var2;
                            tp20Var.b(view, i9, 0, i10, 0);
                        }
                        tp20Var2 = tp20Var;
                        f = measuredWidth3;
                    }
                    i5++;
                    c = c3;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                } else {
                    z2 = z3;
                }
                i8 = i16;
                i5 = i5;
                i7 = i14;
                i5++;
                c = c3;
                i16 = i8;
                z3 = z2;
                i14 = i7;
            }
            int i22 = tp20Var2.g;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        if (drawable != null) {
            this.N0 = drawable.getIntrinsicHeight();
        } else {
            this.N0 = 0;
        }
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.O0 = drawable.getIntrinsicWidth();
        } else {
            this.O0 = 0;
        }
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // p.rp20
    public void setFlexLines(List<tp20> list) {
        this.S0 = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.t) {
            this.t = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    public final void t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewO;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        wp20 wp20Var;
        tp20 tp20Var;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.S0.size();
        for (int i14 = 0; i14 < size; i14++) {
            tp20 tp20Var2 = (tp20) this.S0.get(i14);
            if (q(i14)) {
                int i15 = this.O0;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.c;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 != 1) {
                if (i17 == 2) {
                    float f6 = (i12 - tp20Var2.e) / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iA = tp20Var2.a();
                    f2 = (i12 - tp20Var2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iA2 = tp20Var2.a();
                    f2 = iA2 != 0 ? (i12 - tp20Var2.e) / iA2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredHeight = paddingTop + f7;
                    f = (i12 - paddingBottom) - f7;
                } else {
                    if (i17 != 5) {
                        bhn0.r(this.c, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = tp20Var2.a();
                    f2 = iA3 != 0 ? (i12 - tp20Var2.e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < tp20Var2.h) {
                    i6 = tp20Var2.o + i5;
                    i7 = i18;
                    viewO = o(i6);
                    if (viewO != null) {
                        c = c2;
                        if (viewO.getVisibility() == 8) {
                            xp20 xp20Var = (xp20) viewO.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) xp20Var).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin;
                            if (p(i6, i5)) {
                                i10 = this.N0;
                                float f8 = i10;
                                f3 += f8;
                                f4 -= f8;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == tp20Var2.h - i7 || (this.i & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.N0;
                            }
                            i9 = i5;
                            wp20Var = this.R0;
                            if (z) {
                                if (z2) {
                                    wp20Var.I(viewO, tp20Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    wp20Var.I(viewO, tp20Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                                }
                                i8 = i16;
                            } else {
                                i9 = i9;
                                i7 = i7;
                                i8 = i16;
                                if (z2) {
                                    wp20Var.I(viewO, tp20Var2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i19 = paddingLeft;
                                    wp20Var.I(viewO, tp20Var2, false, i19, Math.round(f3), viewO.getMeasuredWidth() + i19, viewO.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i19;
                                }
                            }
                            measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin;
                            float measuredHeight2 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) xp20Var).topMargin);
                            if (z2) {
                                tp20Var = tp20Var2;
                                tp20Var.b(viewO, 0, i11, 0, i10);
                            } else {
                                tp20Var = tp20Var2;
                                tp20Var.b(viewO, 0, i10, 0, i11);
                            }
                            tp20Var2 = tp20Var;
                            f = measuredHeight2;
                        }
                        i5 = i9 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i8;
                    } else {
                        c = c2;
                    }
                    i9 = i5;
                    i7 = i7;
                    i8 = i16;
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                }
                int i20 = tp20Var2.g;
                paddingLeft += i20;
                i13 = i16 - i20;
            } else {
                int i21 = tp20Var2.e;
                f = i21 - paddingTop;
                measuredHeight = (i12 - i21) + paddingBottom;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < tp20Var2.h) {
                i6 = tp20Var2.o + i5;
                i7 = i18;
                viewO = o(i6);
                if (viewO != null) {
                    c = c2;
                    if (viewO.getVisibility() == 8) {
                        xp20 xp20Var2 = (xp20) viewO.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) xp20Var2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) xp20Var2).bottomMargin;
                        if (p(i6, i5)) {
                            i10 = this.N0;
                            float f9 = i10;
                            f3 += f9;
                            f4 -= f9;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == tp20Var2.h - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        i9 = i5;
                        wp20Var = this.R0;
                        if (z) {
                            if (z2) {
                                wp20Var.I(viewO, tp20Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                wp20Var.I(viewO, tp20Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                            }
                            i8 = i16;
                        } else {
                            i9 = i9;
                            i7 = i7;
                            i8 = i16;
                            if (z2) {
                                wp20Var.I(viewO, tp20Var2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i110 = paddingLeft;
                                wp20Var.I(viewO, tp20Var2, false, i110, Math.round(f3), viewO.getMeasuredWidth() + i110, viewO.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i110;
                            }
                        }
                        measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) xp20Var2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) xp20Var2).topMargin);
                        if (z2) {
                            tp20Var = tp20Var2;
                            tp20Var.b(viewO, 0, i11, 0, i10);
                        } else {
                            tp20Var = tp20Var2;
                            tp20Var.b(viewO, 0, i10, 0, i11);
                        }
                        tp20Var2 = tp20Var;
                        f = measuredHeight3;
                    }
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                } else {
                    c = c2;
                }
                i9 = i5;
                i7 = i7;
                i8 = i16;
                i5 = i9 + 1;
                c2 = c;
                i18 = i7;
                i16 = i8;
            }
            int i22 = tp20Var2.g;
            paddingLeft += i22;
            i13 = i16 - i22;
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                hhg1.n(f4i1.c(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            eg.m(f4i1.c(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, SemanticState.Hidden);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            eg.m(f4i1.c(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, SemanticState.Hidden);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // p.rp20
    public final void e(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        xp20 xp20Var = new xp20(context, attributeSet);
        xp20Var.a = 1;
        xp20Var.b = 0.0f;
        xp20Var.c = 1.0f;
        xp20Var.d = -1;
        xp20Var.e = -1.0f;
        xp20Var.f = -1;
        xp20Var.g = -1;
        xp20Var.h = 16777215;
        xp20Var.i = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lmz0.b);
        xp20Var.a = typedArrayObtainStyledAttributes.getInt(8, 1);
        xp20Var.b = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        xp20Var.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        xp20Var.d = typedArrayObtainStyledAttributes.getInt(0, -1);
        xp20Var.e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        xp20Var.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        xp20Var.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        xp20Var.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        xp20Var.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        xp20Var.t = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return xp20Var;
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
