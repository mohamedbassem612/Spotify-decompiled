package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p.a9a;
import p.b8k1;
import p.e611;
import p.eg;
import p.g611;
import p.gmz0;
import p.ij01;
import p.kg;
import p.n611;
import p.p0g;
import p.qpj1;
import p.qzd;
import p.rut0;
import p.s611;
import p.vqv0;
import p.w611;
import p.wic0;
import p.x5j1;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class a {
    public int N0;
    public int O0;
    public int P0;
    public int X;
    public boolean Y;
    public int Z;
    public p0g a;
    public RecyclerView b;
    public final qpj1 c;
    public final qpj1 d;
    public wic0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final boolean t;

    public a() {
        rut0 rut0Var = new rut0(this, (byte) 23);
        ij01 ij01Var = new ij01(this, (byte) 2);
        this.c = new qpj1(rut0Var);
        this.d = new qpj1(ij01Var);
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.t = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int J(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int L(View view) {
        return view.getBottom() + ((g611) view.getLayoutParams()).b.bottom;
    }

    public static int M(View view) {
        return view.getLeft() - ((g611) view.getLayoutParams()).b.left;
    }

    public static int N(View view) {
        Rect rect = ((g611) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int P(View view) {
        return view.getRight() + ((g611) view.getLayoutParams()).b.right;
    }

    public static int Q(View view) {
        return view.getTop() - ((g611) view.getLayoutParams()).b.top;
    }

    public static int V(View view) {
        return ((g611) view.getLayoutParams()).a.o();
    }

    public static qzd W(Context context, AttributeSet attributeSet, int i, int i2) {
        qzd qzdVar = new qzd();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gmz0.a, i, i2);
        qzdVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        qzdVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        qzdVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        qzdVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return qzdVar;
    }

    public static boolean a0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void b0(View view, int i, int i2, int i3, int i4) {
        g611 g611Var = (g611) view.getLayoutParams();
        Rect rect = g611Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) g611Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) g611Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) g611Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) g611Var).bottomMargin);
    }

    public static int t(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public int A(s611 s611Var) {
        return 0;
    }

    public final void A0() {
        for (int I = I() - 1; I >= 0; I--) {
            this.a.f(I);
        }
    }

    public int B(s611 s611Var) {
        return 0;
    }

    public final void B0(n611 n611Var) {
        for (int I = I() - 1; I >= 0; I--) {
            if (!RecyclerView.U(H(I)).C()) {
                View viewH = H(I);
                if (H(I) != null) {
                    this.a.f(I);
                }
                n611Var.i(viewH);
            }
        }
    }

    public final void C(n611 n611Var) {
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            w611 w611VarU = RecyclerView.U(viewH);
            if (w611VarU.C()) {
                if (RecyclerView.c2) {
                    w611VarU.toString();
                }
            } else if (!w611VarU.t() || w611VarU.v() || this.b.P0.b) {
                H(I);
                p0g p0gVar = this.a;
                int iD = p0gVar.d(I);
                p0gVar.b.L(iD);
                p0gVar.a.l(iD);
                n611Var.k(viewH);
                this.b.g.A(w611VarU);
            } else {
                if (H(I) != null) {
                    this.a.f(I);
                }
                n611Var.j(w611VarU);
            }
        }
    }

    public final void C0(n611 n611Var) {
        ArrayList arrayList;
        int size = n611Var.a.size();
        int i = size - 1;
        while (true) {
            arrayList = n611Var.a;
            if (i < 0) {
                break;
            }
            View view = ((w611) arrayList.get(i)).a;
            w611 w611VarU = RecyclerView.U(view);
            if (!w611VarU.C()) {
                w611VarU.B(false);
                if (w611VarU.x()) {
                    this.b.removeDetachedView(view, false);
                }
                e611 e611Var = this.b.p1;
                if (e611Var != null) {
                    e611Var.f(w611VarU);
                }
                w611VarU.B(true);
                w611 w611VarU2 = RecyclerView.U(view);
                w611VarU2.N0 = null;
                w611VarU2.O0 = false;
                w611VarU2.t &= -33;
                n611Var.j(w611VarU2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = n611Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public View D(int i) {
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            w611 w611VarU = RecyclerView.U(viewH);
            if (w611VarU != null && w611VarU.o() == i && !w611VarU.C() && (this.b.H1.g || !w611VarU.v())) {
                return viewH;
            }
        }
        return null;
    }

    public final void D0(View view) {
        p0g p0gVar = this.a;
        vqv0 vqv0Var = p0gVar.a;
        byte b = p0gVar.d;
        if (b == 1) {
            eg.m("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            eg.m("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            p0gVar.d = (byte) 1;
            p0gVar.e = view;
            int iR = vqv0Var.r(view);
            if (iR < 0) {
                return;
            }
            if (p0gVar.b.L(iR)) {
                p0gVar.g(view);
            }
            vqv0Var.x(iR);
        } finally {
            p0gVar.d = (byte) 0;
            p0gVar.e = null;
        }
    }

    public g611 E() {
        return new g611(-2, -2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.O0 - getPaddingRight();
        int paddingBottom = this.P0 - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (S() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.O0 - getPaddingRight();
                int paddingBottom2 = this.P0 - getPaddingBottom();
                Rect rect2 = this.b.t;
                RecyclerView.V(rect2, focusedChild);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.x0(i4, i5, null, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.x0(i4, i5, null, false);
            return true;
        }
        return false;
    }

    public g611 F(Context context, AttributeSet attributeSet) {
        return new g611(context, attributeSet);
    }

    public final void F0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public g611 G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g611) {
            return new g611((g611) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g611((ViewGroup.MarginLayoutParams) layoutParams) : new g611(layoutParams);
    }

    public int G0(int i, n611 n611Var, s611 s611Var) {
        return 0;
    }

    public final View H(int i) {
        p0g p0gVar = this.a;
        if (p0gVar != null) {
            return p0gVar.b(i);
        }
        return null;
    }

    public final int I() {
        p0g p0gVar = this.a;
        if (p0gVar != null) {
            return p0gVar.c();
        }
        return 0;
    }

    public int I0(int i, n611 n611Var, s611 s611Var) {
        return 0;
    }

    public final void J0(RecyclerView recyclerView) {
        K0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public int K(n611 n611Var, s611 s611Var) {
        return -1;
    }

    public final void K0(int i, int i2) {
        this.O0 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.Z = mode;
        if (mode == 0 && !RecyclerView.f2) {
            this.O0 = 0;
        }
        this.P0 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.N0 = mode2;
        if (mode2 != 0 || RecyclerView.f2) {
            return;
        }
        this.P0 = 0;
    }

    public void L0(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        this.b.setMeasuredDimension(t(i, paddingRight, U()), t(i2, paddingBottom, T()));
    }

    public final void M0(int i, int i2) {
        int I = I();
        if (I == 0) {
            this.b.u(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < I; i7++) {
            View viewH = H(i7);
            Rect rect = this.b.t;
            RecyclerView.V(rect, viewH);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.t.set(i6, i4, i3, i5);
        L0(this.b.t, i, i2);
    }

    public final void N0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.O0 = 0;
            this.P0 = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.O0 = recyclerView.getWidth();
            this.P0 = recyclerView.getHeight();
        }
        this.Z = 1073741824;
        this.N0 = 1073741824;
    }

    public final int O(View view) {
        Rect rect = ((g611) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    final boolean O0(View view, int i, int i2, g611 g611Var) {
        return (!view.isLayoutRequested() && this.i && a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) g611Var).width) && a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) g611Var).height)) ? false : true;
    }

    public boolean P0() {
        return false;
    }

    public final boolean Q0(View view, int i, int i2, g611 g611Var) {
        return (this.i && a0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) g611Var).width) && a0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) g611Var).height)) ? false : true;
    }

    public final int R() {
        RecyclerView recyclerView = this.b;
        z511 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.e();
        }
        return 0;
    }

    public final int S() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = b8k1.a;
        return recyclerView.getLayoutDirection();
    }

    public final void S0(wic0 wic0Var) {
        wic0 wic0Var2 = this.e;
        if (wic0Var2 != null && wic0Var != wic0Var2 && wic0Var2.g()) {
            this.e.m();
        }
        this.e = wic0Var;
        wic0Var.l(this.b, this);
    }

    public final int T() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = b8k1.a;
        return recyclerView.getMinimumHeight();
    }

    public boolean T0() {
        return false;
    }

    public final int U() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = b8k1.a;
        return recyclerView.getMinimumWidth();
    }

    public int X(n611 n611Var, s611 s611Var) {
        return -1;
    }

    public final void Y(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((g611) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.O0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean Z() {
        return this.h;
    }

    public void c0(View view, int i) {
        g611 g611Var = (g611) view.getLayoutParams();
        Rect rectW = this.b.W(view);
        int i2 = rectW.left + rectW.right + i;
        int i3 = rectW.top + rectW.bottom;
        int iJ = J(q(), this.O0, this.Z, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) g611Var).leftMargin + ((ViewGroup.MarginLayoutParams) g611Var).rightMargin + i2, ((ViewGroup.MarginLayoutParams) g611Var).width);
        int iJ2 = J(r(), this.P0, this.N0, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) g611Var).topMargin + ((ViewGroup.MarginLayoutParams) g611Var).bottomMargin + i3, ((ViewGroup.MarginLayoutParams) g611Var).height);
        if (O0(view, iJ, iJ2, g611Var)) {
            view.measure(iJ, iJ2);
        }
    }

    public void d0(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iC = recyclerView.f.c();
            for (int i2 = 0; i2 < iC; i2++) {
                recyclerView.f.b(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void e0(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iC = recyclerView.f.c();
            for (int i2 = 0; i2 < iC; i2++) {
                recyclerView.f.b(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void g0(RecyclerView recyclerView) {
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = b8k1.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = b8k1.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View i0(View view, int i, n611 n611Var, s611 s611Var) {
        return null;
    }

    public void j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        n611 n611Var = recyclerView.c;
        s611 s611Var = recyclerView.H1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        z511 z511Var = this.b.P0;
        if (z511Var != null) {
            accessibilityEvent.setItemCount(z511Var.e());
        }
    }

    public void k0(n611 n611Var, s611 s611Var, kg kgVar) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            kgVar.a(8192);
            kgVar.t(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            kgVar.a(4096);
            kgVar.t(true);
        }
        kgVar.m(x5j1.h(X(n611Var, s611Var), K(n611Var, s611Var), 0, false));
    }

    public final void l(View view) {
        m(view, -1, false);
    }

    public final void l0(View view, kg kgVar) {
        w611 w611VarU = RecyclerView.U(view);
        if (w611VarU == null || w611VarU.v()) {
            return;
        }
        p0g p0gVar = this.a;
        if (p0gVar.c.contains(w611VarU.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        m0(recyclerView.c, recyclerView.H1, view, kgVar);
    }

    public final void m(View view, int i, boolean z) {
        w611 w611VarU = RecyclerView.U(view);
        if (z || w611VarU.v()) {
            this.b.g.g(w611VarU);
        } else {
            this.b.g.F(w611VarU);
        }
        g611 g611Var = (g611) view.getLayoutParams();
        if (w611VarU.D() || w611VarU.w()) {
            if (w611VarU.w()) {
                w611VarU.N0.n(w611VarU);
            } else {
                w611VarU.t &= -33;
            }
            this.a.a(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            p0g p0gVar = this.a;
            if (parent == recyclerView) {
                int iE = p0gVar.e(view);
                if (i == -1) {
                    i = this.a.c();
                }
                if (iE == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.G());
                }
                if (iE != i) {
                    a aVar = this.b.Q0;
                    View viewH = aVar.H(iE);
                    if (viewH == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iE + aVar.b.toString());
                    }
                    aVar.H(iE);
                    p0g p0gVar2 = aVar.a;
                    int iD = p0gVar2.d(iE);
                    p0gVar2.b.L(iD);
                    p0gVar2.a.l(iD);
                    aVar.o(viewH, i);
                }
            } else {
                vqv0 vqv0Var = p0gVar.a;
                int iP = i < 0 ? vqv0Var.p() : p0gVar.d(i);
                p0gVar.b.H(iP, false);
                vqv0Var.d(view, iP);
                g611Var.c = true;
                wic0 wic0Var = this.e;
                if (wic0Var != null && wic0Var.g()) {
                    this.e.i(view);
                }
            }
        }
        if (g611Var.d) {
            if (RecyclerView.c2) {
                Objects.toString(g611Var.a);
            }
            w611VarU.a.invalidate();
            g611Var.d = false;
        }
    }

    public void n(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.n(str);
        }
    }

    public void n0(RecyclerView recyclerView, int i, int i2) {
    }

    public final void o(View view, int i) {
        g611 g611Var = (g611) view.getLayoutParams();
        w611 w611VarU = RecyclerView.U(view);
        boolean zV = w611VarU.v();
        RecyclerView recyclerView = this.b;
        if (zV) {
            recyclerView.g.g(w611VarU);
        } else {
            recyclerView.g.F(w611VarU);
        }
        this.a.a(view, i, g611Var, w611VarU.v());
    }

    public void o0(RecyclerView recyclerView) {
    }

    public final void p(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public boolean q() {
        return false;
    }

    public void q0(RecyclerView recyclerView, int i, int i2) {
    }

    public boolean r() {
        return false;
    }

    public boolean s(g611 g611Var) {
        return true;
    }

    public void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        r0(i);
    }

    public void t0(n611 n611Var, s611 s611Var) {
        C(n611Var);
        int iR = R();
        for (int i = 0; i < iR; i++) {
            View viewD = n611Var.d(i);
            g611 g611Var = (g611) viewD.getLayoutParams();
            Rect rectW = this.b.W(viewD);
            int i2 = rectW.left + rectW.right;
            int i3 = rectW.top + rectW.bottom;
            int iJ = J(false, this.O0, this.Z, getPaddingRight() + getPaddingLeft() + i2, ((ViewGroup.MarginLayoutParams) g611Var).width);
            int iJ2 = J(false, this.P0, this.N0, getPaddingBottom() + getPaddingTop() + i3, ((ViewGroup.MarginLayoutParams) g611Var).height);
            if (O0(viewD, iJ, iJ2, g611Var)) {
                viewD.measure(iJ, iJ2);
            }
            l(viewD);
            g611 g611Var2 = (g611) viewD.getLayoutParams();
            int i4 = this.P0;
            int i5 = this.O0;
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int iN = (((i4 - paddingTop) - paddingBottom) - N(viewD)) / 2;
            int iO = (((i5 - paddingLeft) - paddingRight) - O(viewD)) / 2;
            int i6 = paddingLeft + iO + ((ViewGroup.MarginLayoutParams) g611Var2).leftMargin;
            int i7 = paddingTop + iN + ((ViewGroup.MarginLayoutParams) g611Var2).topMargin;
            int i8 = ((i5 - paddingRight) - ((ViewGroup.MarginLayoutParams) g611Var2).rightMargin) - iO;
            int i9 = ((i4 - paddingBottom) - ((ViewGroup.MarginLayoutParams) g611Var2).bottomMargin) - iN;
            Rect rect = ((g611) viewD.getLayoutParams()).b;
            viewD.layout(i6 + rect.left, i7 + rect.top, i8 - rect.right, i9 - rect.bottom);
        }
    }

    public void v0(int i, int i2) {
        this.b.u(i, i2);
    }

    public int w(s611 s611Var) {
        return 0;
    }

    public void w0(Parcelable parcelable) {
    }

    public int x(s611 s611Var) {
        return 0;
    }

    public Parcelable x0() {
        return null;
    }

    public int y(s611 s611Var) {
        return 0;
    }

    public void y0(int i) {
    }

    public int z(s611 s611Var) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r3
      0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean z0(n611 n611Var, s611 s611Var, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        if (this.b != null) {
            int iHeight = this.P0;
            int iWidth = this.O0;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.b.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                } else {
                    paddingLeft = 0;
                }
            } else if (i != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.b.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
                } else {
                    paddingLeft = 0;
                }
            }
            if (paddingTop != 0 || paddingLeft != 0) {
                this.b.x0(paddingLeft, paddingTop, null, true);
                return true;
            }
        }
        return false;
    }

    public void H0(int i) {
    }

    public void r0(int i) {
    }

    public void u0(s611 s611Var) {
    }

    public void f0(z511 z511Var, z511 z511Var2) {
    }

    public void h0(RecyclerView recyclerView, n611 n611Var) {
    }

    public void v(int i, a9a a9aVar) {
    }

    public void R0(RecyclerView recyclerView, s611 s611Var, int i) {
    }

    public void p0(RecyclerView recyclerView, int i, int i2) {
    }

    public void m0(n611 n611Var, s611 s611Var, View view, kg kgVar) {
    }

    public void u(int i, int i2, s611 s611Var, a9a a9aVar) {
    }
}
