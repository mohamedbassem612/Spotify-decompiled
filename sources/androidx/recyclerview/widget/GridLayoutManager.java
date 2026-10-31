package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import p.a9a;
import p.cg50;
import p.cy30;
import p.dg50;
import p.eg50;
import p.f4i1;
import p.fp00;
import p.g611;
import p.gvg;
import p.hhg1;
import p.jg;
import p.kg;
import p.n611;
import p.s611;
import p.sic0;
import p.tpc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean g1;
    public int h1;
    public int[] i1;
    public View[] j1;
    public final SparseIntArray k1;
    public final SparseIntArray l1;
    public eg50 m1;
    public final Rect n1;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g1 = false;
        this.h1 = -1;
        this.k1 = new SparseIntArray();
        this.l1 = new SparseIntArray();
        this.m1 = new cg50();
        this.n1 = new Rect();
        J1(a.W(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int A(s611 s611Var) {
        return X0(s611Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int B(s611 s611Var) {
        return Y0(s611Var);
    }

    public final void C1(int i) {
        int i2;
        int[] iArr = this.i1;
        int i3 = this.h1;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.i1 = iArr;
    }

    public final void D1() {
        View[] viewArr = this.j1;
        if (viewArr == null || viewArr.length != this.h1) {
            this.j1 = new View[this.h1];
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final g611 E() {
        return this.Q0 == 0 ? new dg50(-2, -1) : new dg50(-1, -2);
    }

    public final int E1(int i, int i2) {
        if (this.Q0 != 1 || !p1()) {
            int[] iArr = this.i1;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.i1;
        int i3 = this.h1;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.a
    public final g611 F(Context context, AttributeSet attributeSet) {
        return new dg50(context, attributeSet);
    }

    public final int F1(int i, n611 n611Var, s611 s611Var) {
        if (!s611Var.g) {
            return this.m1.a(i, this.h1);
        }
        int iB = n611Var.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.m1.a(iB, this.h1);
    }

    @Override // androidx.recyclerview.widget.a
    public final g611 G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new dg50((ViewGroup.MarginLayoutParams) layoutParams) : new dg50(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int G0(int i, n611 n611Var, s611 s611Var) {
        K1();
        D1();
        return super.G0(i, n611Var, s611Var);
    }

    public final int G1(int i, n611 n611Var, s611 s611Var) {
        if (!s611Var.g) {
            return this.m1.b(i, this.h1);
        }
        int i2 = this.l1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = n611Var.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.m1.b(iB, this.h1);
    }

    public final int H1(int i, n611 n611Var, s611 s611Var) {
        if (!s611Var.g) {
            return this.m1.e(i);
        }
        int i2 = this.k1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = n611Var.b(i);
        if (iB == -1) {
            return 1;
        }
        return this.m1.e(iB);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int I0(int i, n611 n611Var, s611 s611Var) {
        K1();
        D1();
        return super.I0(i, n611Var, s611Var);
    }

    public final void I1(View view, int i, boolean z) {
        int iJ;
        int iJ2;
        dg50 layoutParams = view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iE1 = E1(layoutParams.e, layoutParams.f);
        if (this.Q0 == 1) {
            iJ2 = a.J(false, iE1, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iJ = a.J(true, this.S0.n(), this.N0, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int iJ3 = a.J(false, iE1, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            int iJ4 = a.J(true, this.S0.n(), this.Z, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iJ = iJ3;
            iJ2 = iJ4;
        }
        g611 g611Var = (g611) view.getLayoutParams();
        if (z ? Q0(view, iJ2, iJ, g611Var) : O0(view, iJ2, iJ, g611Var)) {
            view.measure(iJ2, iJ);
        }
    }

    public void J1(int i) {
        if (i == this.h1) {
            return;
        }
        this.g1 = true;
        if (i < 1) {
            hhg1.n(f4i1.c(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.h1 = i;
        this.m1.g();
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int K(n611 n611Var, s611 s611Var) {
        if (this.Q0 == 1) {
            return this.h1;
        }
        if (s611Var.b() < 1) {
            return 0;
        }
        return F1(s611Var.b() - 1, n611Var, s611Var) + 1;
    }

    public final void K1() {
        int paddingBottom;
        int paddingTop;
        if (this.Q0 == 1) {
            paddingBottom = this.O0 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.P0 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        C1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.a
    public final void L0(Rect rect, int i, int i2) {
        int iT;
        int iT2;
        if (this.i1 == null) {
            super.L0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.Q0 == 1) {
            iT2 = a.t(i2, rect.height() + paddingBottom, T());
            int[] iArr = this.i1;
            iT = a.t(i, iArr[iArr.length - 1] + paddingRight, U());
        } else {
            iT = a.t(i, rect.width() + paddingRight, U());
            int[] iArr2 = this.i1;
            iT2 = a.t(i2, iArr2[iArr2.length - 1] + paddingBottom, T());
        }
        this.b.setMeasuredDimension(iT, iT2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean T0() {
        return this.b1 == null && !this.g1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(s611 s611Var, sic0 sic0Var, a9a a9aVar) {
        int i;
        int iE = this.h1;
        for (int i2 = 0; i2 < this.h1 && (i = sic0Var.d) >= 0 && i < s611Var.b() && iE > 0; i2++) {
            int i3 = sic0Var.d;
            a9aVar.b(i3, Math.max(0, sic0Var.g));
            iE -= this.m1.e(i3);
            sic0Var.d += sic0Var.e;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int X(n611 n611Var, s611 s611Var) {
        if (this.Q0 == 0) {
            return this.h1;
        }
        if (s611Var.b() < 1) {
            return 0;
        }
        return F1(s611Var.b() - 1, n611Var, s611Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View i0(android.view.View r23, int r24, p.n611 r25, p.s611 r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.i0(android.view.View, int, p.n611, p.s611):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(n611 n611Var, s611 s611Var, kg kgVar) {
        super.k0(n611Var, s611Var, kgVar);
        kgVar.l(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View k1(n611 n611Var, s611 s611Var, boolean z, boolean z2) {
        int i;
        int I;
        int I2 = I();
        int i2 = 1;
        if (z2) {
            I = I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = I2;
            I = 0;
        }
        int iB = s611Var.b();
        a1();
        int iM = this.S0.m();
        int i3 = this.S0.i();
        View view = null;
        View view2 = null;
        while (I != i) {
            View viewH = H(I);
            int iV = a.V(viewH);
            if (iV >= 0 && iV < iB && G1(iV, n611Var, s611Var) == 0) {
                if (((g611) viewH.getLayoutParams()).a.v()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.S0.g(viewH) < i3 && this.S0.d(viewH) >= iM) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            I += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(n611 n611Var, s611 s611Var, View view, kg kgVar) {
        dg50 layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof dg50)) {
            l0(view, kgVar);
            return;
        }
        dg50 dg50Var = layoutParams;
        int iF1 = F1(dg50Var.a.o(), n611Var, s611Var);
        if (this.Q0 == 0) {
            kgVar.n(jg.b(false, dg50Var.a(), dg50Var.b(), iF1, 1));
        } else {
            kgVar.n(jg.b(false, iF1, 1, dg50Var.a(), dg50Var.b()));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public void n0(RecyclerView recyclerView, int i, int i2) {
        this.m1.g();
        this.m1.f();
    }

    @Override // androidx.recyclerview.widget.a
    public void o0(RecyclerView recyclerView) {
        this.m1.g();
        this.m1.f();
    }

    @Override // androidx.recyclerview.widget.a
    public void p0(RecyclerView recyclerView, int i, int i2) {
        this.m1.g();
        this.m1.f();
    }

    @Override // androidx.recyclerview.widget.a
    public void q0(RecyclerView recyclerView, int i, int i2) {
        this.m1.g();
        this.m1.f();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(n611 n611Var, s611 s611Var, sic0 sic0Var, tpc tpcVar) {
        int i;
        int i2;
        int i3;
        int iF;
        int paddingLeft;
        int paddingTop;
        int iJ;
        int iJ2;
        boolean z;
        int i4;
        View viewB;
        int iL = this.S0.l();
        boolean z2 = iL != 1073741824;
        int i5 = I() > 0 ? this.i1[this.h1] : 0;
        if (z2) {
            K1();
        }
        boolean z3 = sic0Var.e == 1;
        int iG1 = this.h1;
        if (!z3) {
            iG1 = G1(sic0Var.d, n611Var, s611Var) + H1(sic0Var.d, n611Var, s611Var);
        }
        int i6 = 0;
        while (i6 < this.h1 && (i4 = sic0Var.d) >= 0 && i4 < s611Var.b() && iG1 > 0) {
            int i7 = sic0Var.d;
            int iH1 = H1(i7, n611Var, s611Var);
            if (iH1 > this.h1) {
                hhg1.n(gvg.j(cy30.q(i7, iH1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.h1, " spans."));
                return;
            }
            iG1 -= iH1;
            if (iG1 < 0 || (viewB = sic0Var.b(n611Var)) == null) {
                break;
            }
            this.j1[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            tpcVar.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.j1[i];
            dg50 layoutParams = view.getLayoutParams();
            int iH2 = H1(a.V(view), n611Var, s611Var);
            layoutParams.f = iH2;
            layoutParams.e = i8;
            i8 += iH2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.j1[i10];
            if (sic0Var.k != null) {
                z = false;
                if (z3) {
                    m(view2, -1, true);
                } else {
                    m(view2, 0, true);
                }
            } else if (z3) {
                l(view2);
                z = false;
            } else {
                z = false;
                m(view2, 0, false);
            }
            p(this.n1, view2);
            I1(view2, iL, z);
            int iE = this.S0.e(view2);
            if (iE > i9) {
                i9 = iE;
            }
            float f2 = (this.S0.f(view2) * 1.0f) / view2.getLayoutParams().f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            C1(Math.max(Math.round(f * this.h1), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.j1[i11];
                I1(view3, 1073741824, true);
                int iE2 = this.S0.e(view3);
                if (iE2 > i9) {
                    i9 = iE2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.j1[i12];
            if (this.S0.e(view4) != i9) {
                dg50 layoutParams2 = view4.getLayoutParams();
                Rect rect = layoutParams2.b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iE1 = E1(layoutParams2.e, layoutParams2.f);
                if (this.Q0 == 1) {
                    iJ2 = a.J(false, iE1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
                    iJ = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iJ = a.J(false, iE1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
                    iJ2 = iMakeMeasureSpec;
                }
                if (Q0(view4, iJ2, iJ, (g611) view4.getLayoutParams())) {
                    view4.measure(iJ2, iJ);
                }
            }
        }
        tpcVar.a = i9;
        int i15 = this.Q0;
        int i16 = sic0Var.f;
        int iF2 = sic0Var.b;
        if (i15 != 1) {
            if (i16 == -1) {
                paddingLeft = iF2 - i9;
                iF = iF2;
            } else {
                iF = iF2 + i9;
                paddingLeft = iF2;
            }
            paddingTop = 0;
            iF2 = 0;
        } else if (i16 == -1) {
            paddingTop = iF2 - i9;
            paddingLeft = 0;
            iF = 0;
        } else {
            paddingTop = iF2;
            iF = 0;
            iF2 += i9;
            paddingLeft = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.j1;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            dg50 layoutParams3 = view5.getLayoutParams();
            if (this.Q0 != 1) {
                paddingTop = getPaddingTop() + this.i1[layoutParams3.e];
                iF2 = this.S0.f(view5) + paddingTop;
            } else if (p1()) {
                int paddingLeft2 = getPaddingLeft() + this.i1[this.h1 - layoutParams3.e];
                iF = paddingLeft2;
                paddingLeft = paddingLeft2 - this.S0.f(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.i1[layoutParams3.e];
                iF = this.S0.f(view5) + paddingLeft;
            }
            a.b0(view5, paddingLeft, paddingTop, iF, iF2);
            if (layoutParams3.a.v() || layoutParams3.a.y()) {
                tpcVar.c = true;
            }
            tpcVar.d = view5.hasFocusable() | tpcVar.d;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r1(n611 n611Var, s611 s611Var, fp00 fp00Var, int i) {
        K1();
        if (s611Var.b() > 0 && !s611Var.g) {
            boolean z = i == 1;
            int iG1 = G1(fp00Var.b, n611Var, s611Var);
            if (z) {
                while (iG1 > 0) {
                    int i2 = fp00Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    fp00Var.b = i3;
                    iG1 = G1(i3, n611Var, s611Var);
                }
            } else {
                int iB = s611Var.b() - 1;
                int i4 = fp00Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iG2 = G1(i5, n611Var, s611Var);
                    if (iG2 <= iG1) {
                        break;
                    }
                    i4 = i5;
                    iG1 = iG2;
                }
                fp00Var.b = i4;
            }
        }
        D1();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean s(g611 g611Var) {
        return g611Var instanceof dg50;
    }

    @Override // androidx.recyclerview.widget.a
    public void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.m1.g();
        this.m1.f();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void t0(n611 n611Var, s611 s611Var) {
        boolean z = s611Var.g;
        SparseIntArray sparseIntArray = this.l1;
        SparseIntArray sparseIntArray2 = this.k1;
        if (z) {
            int I = I();
            for (int i = 0; i < I; i++) {
                dg50 layoutParams = H(i).getLayoutParams();
                int iO = layoutParams.a.o();
                sparseIntArray2.put(iO, layoutParams.b());
                sparseIntArray.put(iO, layoutParams.a());
            }
        }
        super.t0(n611Var, s611Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void u0(s611 s611Var) {
        super.u0(s611Var);
        this.g1 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int x(s611 s611Var) {
        return X0(s611Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int y(s611 s611Var) {
        return Y0(s611Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y1(boolean z) {
        if (z) {
            hhg1.h("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.y1(false);
        }
    }

    public GridLayoutManager(int i, int i2) {
        super(1);
        this.g1 = false;
        this.h1 = -1;
        this.k1 = new SparseIntArray();
        this.l1 = new SparseIntArray();
        this.m1 = new cg50();
        this.n1 = new Rect();
        J1(i);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.g1 = false;
        this.h1 = -1;
        this.k1 = new SparseIntArray();
        this.l1 = new SparseIntArray();
        this.m1 = new cg50();
        this.n1 = new Rect();
        J1(i);
    }
}
