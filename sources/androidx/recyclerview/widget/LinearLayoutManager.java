package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import p.a9a;
import p.dyb0;
import p.f4i1;
import p.fp00;
import p.g611;
import p.hhg1;
import p.n611;
import p.prn1;
import p.qzd;
import p.r611;
import p.s611;
import p.sic0;
import p.tic0;
import p.tpc;
import p.w611;
import p.wic0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class LinearLayoutManager extends a implements r611 {
    public int Q0;
    public sic0 R0;
    public dyb0 S0;
    public boolean T0;
    public final boolean U0;
    public boolean V0;
    public boolean W0;
    public final boolean X0;
    public int Y0;
    public int Z0;
    public boolean a1;
    public tic0 b1;
    public final fp00 c1;
    public final tpc d1;
    public byte e1;
    public final int[] f1;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.Q0 = 1;
        this.U0 = false;
        this.V0 = false;
        this.W0 = false;
        this.X0 = true;
        this.Y0 = -1;
        this.Z0 = Integer.MIN_VALUE;
        this.b1 = null;
        this.c1 = new fp00();
        this.d1 = new tpc();
        this.e1 = (byte) 2;
        this.f1 = new int[2];
        qzd qzdVarW = a.W(context, attributeSet, i, i2);
        x1(qzdVarW.a);
        boolean z = qzdVarW.c;
        n(null);
        if (z != this.U0) {
            this.U0 = z;
            F0();
        }
        y1(qzdVarW.d);
    }

    @Override // androidx.recyclerview.widget.a
    public int A(s611 s611Var) {
        return X0(s611Var);
    }

    public final void A1(int i, int i2) {
        this.R0.c = this.S0.i() - i2;
        sic0 sic0Var = this.R0;
        sic0Var.e = this.V0 ? -1 : 1;
        sic0Var.d = i;
        sic0Var.f = 1;
        sic0Var.b = i2;
        sic0Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public int B(s611 s611Var) {
        return Y0(s611Var);
    }

    public final void B1(int i, int i2) {
        this.R0.c = i2 - this.S0.m();
        sic0 sic0Var = this.R0;
        sic0Var.d = i;
        sic0Var.e = this.V0 ? 1 : -1;
        sic0Var.f = -1;
        sic0Var.b = i2;
        sic0Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public final View D(int i) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int iV = i - a.V(H(0));
        if (iV >= 0 && iV < I) {
            View viewH = H(iV);
            if (a.V(viewH) == i) {
                return viewH;
            }
        }
        return super.D(i);
    }

    @Override // androidx.recyclerview.widget.a
    public int G0(int i, n611 n611Var, s611 s611Var) {
        if (this.Q0 == 1) {
            return 0;
        }
        return v1(i, n611Var, s611Var);
    }

    @Override // androidx.recyclerview.widget.a
    public void H0(int i) {
        this.Y0 = i;
        this.Z0 = Integer.MIN_VALUE;
        tic0 tic0Var = this.b1;
        if (tic0Var != null) {
            tic0Var.a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public int I0(int i, n611 n611Var, s611 s611Var) {
        if (this.Q0 == 0) {
            return 0;
        }
        return v1(i, n611Var, s611Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean P0() {
        if (this.N0 != 1073741824 && this.Z != 1073741824) {
            int I = I();
            for (int i = 0; i < I; i++) {
                ViewGroup.LayoutParams layoutParams = H(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        wic0 wic0Var = new wic0(recyclerView.getContext());
        wic0Var.k(i);
        S0(wic0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean T0() {
        return this.b1 == null && this.T0 == this.W0;
    }

    public void U0(s611 s611Var, int[] iArr) {
        int i;
        int iN = s611Var.a != -1 ? this.S0.n() : 0;
        if (this.R0.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void V0(s611 s611Var, sic0 sic0Var, a9a a9aVar) {
        int i = sic0Var.d;
        if (i < 0 || i >= s611Var.b()) {
            return;
        }
        a9aVar.b(i, Math.max(0, sic0Var.g));
    }

    public final int W0(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        a1();
        dyb0 dyb0Var = this.S0;
        boolean z = !this.X0;
        return prn1.g(s611Var, dyb0Var, e1(z), d1(z), this, this.X0);
    }

    public final int X0(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        a1();
        dyb0 dyb0Var = this.S0;
        boolean z = !this.X0;
        return prn1.h(s611Var, dyb0Var, e1(z), d1(z), this, this.X0, this.V0);
    }

    public final int Y0(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        a1();
        dyb0 dyb0Var = this.S0;
        boolean z = !this.X0;
        return prn1.i(s611Var, dyb0Var, e1(z), d1(z), this, this.X0);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Z() {
        return true;
    }

    public final int Z0(int i) {
        if (i == 1) {
            return (this.Q0 != 1 && p1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.Q0 != 1 && p1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.Q0 == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.Q0 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.Q0 == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.Q0 == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // p.r611
    public PointF a(int i) {
        if (I() == 0) {
            return null;
        }
        int i2 = (i < a.V(H(0))) != this.V0 ? -1 : 1;
        return this.Q0 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1() {
        if (this.R0 == null) {
            sic0 sic0Var = new sic0();
            sic0Var.a = true;
            sic0Var.h = 0;
            sic0Var.i = 0;
            sic0Var.k = null;
            this.R0 = sic0Var;
        }
    }

    public final int b1(n611 n611Var, sic0 sic0Var, s611 s611Var, boolean z) {
        int i;
        int i2 = sic0Var.c;
        int i3 = sic0Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                sic0Var.g = i3 + i2;
            }
            s1(n611Var, sic0Var);
        }
        int i4 = sic0Var.c + sic0Var.h;
        while (true) {
            if ((!sic0Var.l && i4 <= 0) || (i = sic0Var.d) < 0 || i >= s611Var.b()) {
                break;
            }
            tpc tpcVar = this.d1;
            tpcVar.a = 0;
            tpcVar.b = false;
            tpcVar.c = false;
            tpcVar.d = false;
            q1(n611Var, s611Var, sic0Var, tpcVar);
            if (!tpcVar.b) {
                int i5 = sic0Var.b;
                int i6 = tpcVar.a;
                sic0Var.b = (sic0Var.f * i6) + i5;
                if (!tpcVar.c || sic0Var.k != null || !s611Var.g) {
                    sic0Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = sic0Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    sic0Var.g = i8;
                    int i9 = sic0Var.c;
                    if (i9 < 0) {
                        sic0Var.g = i8 + i9;
                    }
                    s1(n611Var, sic0Var);
                }
                if (z && tpcVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - sic0Var.c;
    }

    public final int c1() {
        View viewJ1 = j1(0, I(), true, false);
        if (viewJ1 == null) {
            return -1;
        }
        return a.V(viewJ1);
    }

    public final View d1(boolean z) {
        return this.V0 ? j1(0, I(), z, true) : j1(I() - 1, -1, z, true);
    }

    public final View e1(boolean z) {
        return this.V0 ? j1(I() - 1, -1, z, true) : j1(0, I(), z, true);
    }

    public final int f1() {
        View viewJ1 = j1(0, I(), false, true);
        if (viewJ1 == null) {
            return -1;
        }
        return a.V(viewJ1);
    }

    public final int g1() {
        View viewJ1 = j1(I() - 1, -1, true, false);
        if (viewJ1 == null) {
            return -1;
        }
        return a.V(viewJ1);
    }

    @Override // androidx.recyclerview.widget.a
    public void h0(RecyclerView recyclerView, n611 n611Var) {
        if (this.a1) {
            B0(n611Var);
            n611Var.a.clear();
            n611Var.g();
        }
    }

    public final int h1() {
        View viewJ1 = j1(I() - 1, -1, false, true);
        if (viewJ1 == null) {
            return -1;
        }
        return a.V(viewJ1);
    }

    @Override // androidx.recyclerview.widget.a
    public View i0(View view, int i, n611 n611Var, s611 s611Var) {
        int iZ0;
        View viewI1;
        u1();
        if (I() != 0 && (iZ0 = Z0(i)) != Integer.MIN_VALUE) {
            a1();
            z1(iZ0, (int) (this.S0.n() * 0.33333334f), false, s611Var);
            sic0 sic0Var = this.R0;
            sic0Var.g = Integer.MIN_VALUE;
            sic0Var.a = false;
            b1(n611Var, sic0Var, s611Var, true);
            boolean z = this.V0;
            if (iZ0 == -1) {
                viewI1 = z ? i1(I() - 1, -1) : i1(0, I());
            } else {
                viewI1 = z ? i1(0, I()) : i1(I() - 1, -1);
            }
            View viewO1 = iZ0 == -1 ? o1() : n1();
            if (!viewO1.hasFocusable()) {
                return viewI1;
            }
            if (viewI1 != null) {
                return viewO1;
            }
        }
        return null;
    }

    public final View i1(int i, int i2) {
        int i3;
        int i4;
        a1();
        if (i2 <= i && i2 >= i) {
            return H(i);
        }
        if (this.S0.g(H(i)) < this.S0.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.Q0 == 0 ? this.c.o(i, i2, i3, i4) : this.d.o(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(f1());
            accessibilityEvent.setToIndex(h1());
        }
    }

    public final View j1(int i, int i2, boolean z, boolean z2) {
        a1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.Q0 == 0 ? this.c.o(i, i2, i3, i4) : this.d.o(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View k1(n611 n611Var, s611 s611Var, boolean z, boolean z2) {
        int i;
        int I;
        int i2;
        a1();
        int I2 = I();
        if (z2) {
            I = I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = I2;
            I = 0;
            i2 = 1;
        }
        int iB = s611Var.b();
        int iM = this.S0.m();
        int i3 = this.S0.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (I != i) {
            View viewH = H(I);
            int iV = a.V(viewH);
            int iG = this.S0.g(viewH);
            int iD = this.S0.d(viewH);
            if (iV >= 0 && iV < iB) {
                if (!((g611) viewH.getLayoutParams()).a.v()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewH;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewH;
                        } else if (view == null) {
                            view = viewH;
                        }
                    } else if (z3) {
                        view2 = viewH;
                    } else if (view == null) {
                        view = viewH;
                    }
                } else if (view3 == null) {
                    view3 = viewH;
                }
            }
            I += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int l1(int i, n611 n611Var, s611 s611Var, boolean z) {
        int i2;
        int i3 = this.S0.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -v1(-i3, n611Var, s611Var);
        int i5 = i + i4;
        if (!z || (i2 = this.S0.i() - i5) <= 0) {
            return i4;
        }
        this.S0.r(i2);
        return i2 + i4;
    }

    public final int m1(int i, n611 n611Var, s611 s611Var, boolean z) {
        int iM;
        int iM2 = i - this.S0.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -v1(iM2, n611Var, s611Var);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.S0.m()) <= 0) {
            return i2;
        }
        this.S0.r(-iM);
        return i2 - iM;
    }

    @Override // androidx.recyclerview.widget.a
    public final void n(String str) {
        if (this.b1 == null) {
            super.n(str);
        }
    }

    public final View n1() {
        return H(this.V0 ? 0 : I() - 1);
    }

    public final View o1() {
        return H(this.V0 ? I() - 1 : 0);
    }

    public final boolean p1() {
        return S() == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public boolean q() {
        return this.Q0 == 0;
    }

    public void q1(n611 n611Var, s611 s611Var, sic0 sic0Var, tpc tpcVar) {
        int i;
        int iF;
        int i2;
        int iF2;
        View viewB = sic0Var.b(n611Var);
        if (viewB == null) {
            tpcVar.b = true;
            return;
        }
        g611 g611Var = (g611) viewB.getLayoutParams();
        List list = sic0Var.k;
        boolean z = this.V0;
        int i3 = sic0Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                l(viewB);
            } else {
                m(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m(viewB, -1, true);
            } else {
                m(viewB, 0, true);
            }
        }
        c0(viewB, 0);
        tpcVar.a = this.S0.e(viewB);
        if (this.Q0 == 1) {
            if (p1()) {
                iF2 = this.O0 - getPaddingRight();
                iF = iF2 - this.S0.f(viewB);
            } else {
                int paddingLeft = getPaddingLeft();
                iF2 = this.S0.f(viewB) + paddingLeft;
                iF = paddingLeft;
            }
            int i4 = sic0Var.f;
            i2 = sic0Var.b;
            int i5 = tpcVar.a;
            if (i4 == -1) {
                int i6 = i2 - i5;
                i = i2;
                i2 = i6;
            } else {
                i = i5 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF3 = this.S0.f(viewB) + paddingTop;
            int i7 = sic0Var.f;
            int i8 = sic0Var.b;
            int i9 = tpcVar.a;
            if (i7 == -1) {
                int i10 = i8 - i9;
                iF2 = i8;
                i2 = paddingTop;
                i = iF3;
                iF = i10;
            } else {
                int i11 = i8 + i9;
                i = iF3;
                iF = i8;
                i2 = paddingTop;
                iF2 = i11;
            }
        }
        a.b0(viewB, iF, i2, iF2, i);
        if (g611Var.a.v() || g611Var.a.y()) {
            tpcVar.c = true;
        }
        tpcVar.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.a
    public boolean r() {
        return this.Q0 == 1;
    }

    public final void s1(n611 n611Var, sic0 sic0Var) {
        if (!sic0Var.a || sic0Var.l) {
            return;
        }
        int i = sic0Var.g;
        int i2 = sic0Var.i;
        if (sic0Var.f == -1) {
            int I = I();
            if (i < 0) {
                return;
            }
            int iH = (this.S0.h() - i) + i2;
            if (this.V0) {
                for (int i3 = 0; i3 < I; i3++) {
                    View viewH = H(i3);
                    if (this.S0.g(viewH) < iH || this.S0.q(viewH) < iH) {
                        t1(n611Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = I - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewH2 = H(i5);
                if (this.S0.g(viewH2) < iH || this.S0.q(viewH2) < iH) {
                    t1(n611Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int I2 = I();
        if (!this.V0) {
            for (int i7 = 0; i7 < I2; i7++) {
                View viewH3 = H(i7);
                if (this.S0.d(viewH3) > i6 || this.S0.p(viewH3) > i6) {
                    t1(n611Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = I2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewH4 = H(i9);
            if (this.S0.d(viewH4) > i6 || this.S0.p(viewH4) > i6) {
                t1(n611Var, i8, i9);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01af  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x0201  */
    /* JADX WARN: Code duplicated, block: B:130:0x0207  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.a
    public void t0(n611 n611Var, s611 s611Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewK1;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iL1;
        int i7;
        View viewD;
        int iG2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.b1 == null && this.Y0 == -1) && s611Var.b() == 0) {
            B0(n611Var);
            return;
        }
        tic0 tic0Var = this.b1;
        if (tic0Var != null && (i9 = tic0Var.a) >= 0) {
            this.Y0 = i9;
        }
        a1();
        boolean z5 = false;
        this.R0.a = false;
        u1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
            focusedChild = null;
        }
        fp00 fp00Var = this.c1;
        if (!fp00Var.e || this.Y0 != -1 || this.b1 != null) {
            fp00Var.g();
            fp00Var.d = this.V0 ^ this.W0;
            if (s611Var.g || (i2 = this.Y0) == -1) {
                if (I() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 == null && fp00.f(focusedChild2, s611Var)) {
                        fp00Var.c(focusedChild2, a.V(focusedChild2));
                    } else {
                        z = this.T0;
                        z2 = this.W0;
                        if (z == z2 || (viewK1 = k1(n611Var, s611Var, fp00Var.d, z2)) == null) {
                            fp00Var.a();
                            if (this.W0) {
                                iB = s611Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            fp00Var.b = iB;
                        } else {
                            fp00Var.b(viewK1, a.V(viewK1));
                            if (!s611Var.g && T0()) {
                                iG = this.S0.g(viewK1);
                                iD = this.S0.d(viewK1);
                                iM = this.S0.m();
                                i = this.S0.i();
                                if (iD <= iM || iG >= iM) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (iG >= i || iD <= i) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (z3 || z4) {
                                    if (fp00Var.d) {
                                        iM = i;
                                    }
                                    fp00Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    fp00Var.a();
                    if (this.W0) {
                        iB = s611Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    fp00Var.b = iB;
                }
            } else if (i2 < 0 || i2 >= s611Var.b()) {
                this.Y0 = -1;
                this.Z0 = Integer.MIN_VALUE;
                if (I() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 == null) {
                        z = this.T0;
                        z2 = this.W0;
                        if (z == z2) {
                            fp00Var.a();
                            if (this.W0) {
                                iB = s611Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            fp00Var.b = iB;
                        } else {
                            fp00Var.b(viewK1, a.V(viewK1));
                            if (!s611Var.g) {
                                iG = this.S0.g(viewK1);
                                iD = this.S0.d(viewK1);
                                iM = this.S0.m();
                                i = this.S0.i();
                                if (iD <= iM) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iG >= i) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (fp00Var.d) {
                                        iM = i;
                                    }
                                    fp00Var.c = iM;
                                } else {
                                    if (fp00Var.d) {
                                        iM = i;
                                    }
                                    fp00Var.c = iM;
                                }
                            }
                        }
                    } else {
                        z = this.T0;
                        z2 = this.W0;
                        if (z == z2) {
                            fp00Var.a();
                            if (this.W0) {
                                iB = s611Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            fp00Var.b = iB;
                        } else {
                            fp00Var.b(viewK1, a.V(viewK1));
                            if (!s611Var.g) {
                                iG = this.S0.g(viewK1);
                                iD = this.S0.d(viewK1);
                                iM = this.S0.m();
                                i = this.S0.i();
                                if (iD <= iM) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iG >= i) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (fp00Var.d) {
                                        iM = i;
                                    }
                                    fp00Var.c = iM;
                                } else {
                                    if (fp00Var.d) {
                                        iM = i;
                                    }
                                    fp00Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    fp00Var.a();
                    if (this.W0) {
                        iB = s611Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    fp00Var.b = iB;
                }
            } else {
                int i11 = this.Y0;
                fp00Var.b = i11;
                tic0 tic0Var2 = this.b1;
                if (tic0Var2 != null && tic0Var2.a >= 0) {
                    boolean z6 = tic0Var2.c;
                    fp00Var.d = z6;
                    dyb0 dyb0Var = this.S0;
                    if (z6) {
                        fp00Var.c = dyb0Var.i() - this.b1.b;
                    } else {
                        fp00Var.c = dyb0Var.m() + this.b1.b;
                    }
                } else if (this.Z0 == Integer.MIN_VALUE) {
                    View viewD2 = D(i11);
                    if (viewD2 == null) {
                        if (I() > 0) {
                            fp00Var.d = (this.Y0 < a.V(H(0))) == this.V0;
                        }
                        fp00Var.a();
                    } else if (this.S0.e(viewD2) > this.S0.n()) {
                        fp00Var.a();
                    } else {
                        int iG3 = this.S0.g(viewD2) - this.S0.m();
                        dyb0 dyb0Var2 = this.S0;
                        if (iG3 < 0) {
                            fp00Var.c = dyb0Var2.m();
                            fp00Var.d = false;
                        } else if (dyb0Var2.i() - this.S0.d(viewD2) < 0) {
                            fp00Var.c = this.S0.i();
                            fp00Var.d = true;
                        } else {
                            boolean z7 = fp00Var.d;
                            dyb0 dyb0Var3 = this.S0;
                            fp00Var.c = z7 ? this.S0.o() + dyb0Var3.d(viewD2) : dyb0Var3.g(viewD2);
                        }
                    }
                } else {
                    boolean z8 = this.V0;
                    fp00Var.d = z8;
                    dyb0 dyb0Var4 = this.S0;
                    if (z8) {
                        fp00Var.c = dyb0Var4.i() - this.Z0;
                    } else {
                        fp00Var.c = dyb0Var4.m() + this.Z0;
                    }
                }
            }
            fp00Var.e = true;
        } else if (focusedChild != null && (this.S0.g(focusedChild) >= this.S0.i() || this.S0.d(focusedChild) <= this.S0.m())) {
            fp00Var.c(focusedChild, a.V(focusedChild));
        }
        sic0 sic0Var = this.R0;
        sic0Var.f = sic0Var.j >= 0 ? 1 : -1;
        int[] iArr = this.f1;
        iArr[0] = 0;
        iArr[1] = 0;
        U0(s611Var, iArr);
        int iM2 = this.S0.m() + Math.max(0, iArr[0]);
        int iJ = this.S0.j() + Math.max(0, iArr[1]);
        if (s611Var.g && (i7 = this.Y0) != -1 && this.Z0 != Integer.MIN_VALUE && (viewD = D(i7)) != null) {
            boolean z9 = this.V0;
            dyb0 dyb0Var5 = this.S0;
            if (z9) {
                i8 = dyb0Var5.i() - this.S0.d(viewD);
                iG2 = this.Z0;
            } else {
                iG2 = dyb0Var5.g(viewD) - this.S0.m();
                i8 = this.Z0;
            }
            int i12 = i8 - iG2;
            if (i12 > 0) {
                iM2 += i12;
            } else {
                iJ -= i12;
            }
        }
        boolean z10 = fp00Var.d;
        boolean z11 = this.V0;
        if (!z10 ? !z11 : z11) {
            i10 = 1;
        }
        r1(n611Var, s611Var, fp00Var, i10);
        C(n611Var);
        this.R0.l = this.S0.k() == 0 && this.S0.h() == 0;
        this.R0.getClass();
        this.R0.i = 0;
        boolean z12 = fp00Var.d;
        int i13 = fp00Var.b;
        if (z12) {
            B1(i13, fp00Var.c);
            sic0 sic0Var2 = this.R0;
            sic0Var2.h = iM2;
            b1(n611Var, sic0Var2, s611Var, false);
            sic0 sic0Var3 = this.R0;
            i4 = sic0Var3.b;
            int i14 = sic0Var3.d;
            int i15 = sic0Var3.c;
            if (i15 > 0) {
                iJ += i15;
            }
            A1(fp00Var.b, fp00Var.c);
            sic0 sic0Var4 = this.R0;
            sic0Var4.h = iJ;
            sic0Var4.d += sic0Var4.e;
            b1(n611Var, sic0Var4, s611Var, false);
            sic0 sic0Var5 = this.R0;
            i3 = sic0Var5.b;
            int i16 = sic0Var5.c;
            if (i16 > 0) {
                B1(i14, i4);
                sic0 sic0Var6 = this.R0;
                sic0Var6.h = i16;
                b1(n611Var, sic0Var6, s611Var, false);
                i4 = this.R0.b;
            }
        } else {
            A1(i13, fp00Var.c);
            sic0 sic0Var7 = this.R0;
            sic0Var7.h = iJ;
            b1(n611Var, sic0Var7, s611Var, false);
            sic0 sic0Var8 = this.R0;
            i3 = sic0Var8.b;
            int i17 = sic0Var8.d;
            int i18 = sic0Var8.c;
            if (i18 > 0) {
                iM2 += i18;
            }
            B1(fp00Var.b, fp00Var.c);
            sic0 sic0Var9 = this.R0;
            sic0Var9.h = iM2;
            sic0Var9.d += sic0Var9.e;
            b1(n611Var, sic0Var9, s611Var, false);
            sic0 sic0Var10 = this.R0;
            int i19 = sic0Var10.b;
            int i20 = sic0Var10.c;
            if (i20 > 0) {
                A1(i17, i3);
                sic0 sic0Var11 = this.R0;
                sic0Var11.h = i20;
                b1(n611Var, sic0Var11, s611Var, false);
                i3 = this.R0.b;
            }
            i4 = i19;
        }
        if (I() > 0) {
            if (this.V0 ^ this.W0) {
                int iL2 = l1(i3, n611Var, s611Var, true);
                i5 = i4 + iL2;
                i6 = i3 + iL2;
                iL1 = m1(i5, n611Var, s611Var, false);
            } else {
                int iM1 = m1(i4, n611Var, s611Var, true);
                i5 = i4 + iM1;
                i6 = i3 + iM1;
                iL1 = l1(i6, n611Var, s611Var, false);
            }
            i4 = i5 + iL1;
            i3 = i6 + iL1;
        }
        if (s611Var.k && I() != 0 && !s611Var.g && T0()) {
            List list2 = n611Var.d;
            int size = list2.size();
            int iV = a.V(H(0));
            int i21 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i21 < size) {
                w611 w611Var = (w611) list2.get(i21);
                boolean zV = w611Var.v();
                View view = w611Var.a;
                if (!zV) {
                    boolean z13 = w611Var.o() < iV ? true : z5;
                    boolean z14 = this.V0;
                    dyb0 dyb0Var6 = this.S0;
                    if (z13 != z14) {
                        iE += dyb0Var6.e(view);
                    } else {
                        iE2 += dyb0Var6.e(view);
                    }
                }
                i21++;
                z5 = false;
            }
            this.R0.k = list2;
            if (iE > 0) {
                B1(a.V(o1()), i4);
                sic0 sic0Var12 = this.R0;
                sic0Var12.h = iE;
                r4 = 0;
                sic0Var12.c = 0;
                sic0Var12.a(null);
                b1(n611Var, this.R0, s611Var, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                A1(a.V(n1()), i3);
                sic0 sic0Var13 = this.R0;
                sic0Var13.h = iE2;
                sic0Var13.c = r4;
                list = null;
                sic0Var13.a(null);
                b1(n611Var, this.R0, s611Var, r4);
            } else {
                list = null;
            }
            this.R0.k = list;
        }
        if (s611Var.g) {
            fp00Var.g();
        } else {
            this.S0.t();
        }
        this.T0 = this.W0;
    }

    public final void t1(n611 n611Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewH = H(i);
                if (H(i) != null) {
                    this.a.f(i);
                }
                n611Var.i(viewH);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewH2 = H(i3);
            if (H(i3) != null) {
                this.a.f(i3);
            }
            n611Var.i(viewH2);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void u(int i, int i2, s611 s611Var, a9a a9aVar) {
        if (this.Q0 != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        a1();
        z1(i > 0 ? 1 : -1, Math.abs(i), true, s611Var);
        V0(s611Var, this.R0, a9aVar);
    }

    @Override // androidx.recyclerview.widget.a
    public void u0(s611 s611Var) {
        this.b1 = null;
        this.Y0 = -1;
        this.Z0 = Integer.MIN_VALUE;
        this.c1.g();
    }

    public final void u1() {
        if (this.Q0 == 1 || !p1()) {
            this.V0 = this.U0;
        } else {
            this.V0 = !this.U0;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void v(int i, a9a a9aVar) {
        boolean z;
        int i2;
        tic0 tic0Var = this.b1;
        if (tic0Var == null || (i2 = tic0Var.a) < 0) {
            u1();
            z = this.V0;
            i2 = this.Y0;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = tic0Var.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.e1 && i2 >= 0 && i2 < i; i4++) {
            a9aVar.b(i2, 0);
            i2 += i3;
        }
    }

    public final int v1(int i, n611 n611Var, s611 s611Var) {
        if (I() != 0 && i != 0) {
            a1();
            this.R0.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            z1(i2, iAbs, true, s611Var);
            sic0 sic0Var = this.R0;
            int iB1 = b1(n611Var, sic0Var, s611Var, false) + sic0Var.g;
            if (iB1 >= 0) {
                if (iAbs > iB1) {
                    i = i2 * iB1;
                }
                this.S0.r(-i);
                this.R0.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public int w(s611 s611Var) {
        return W0(s611Var);
    }

    @Override // androidx.recyclerview.widget.a
    public void w0(Parcelable parcelable) {
        if (parcelable instanceof tic0) {
            tic0 tic0Var = (tic0) parcelable;
            this.b1 = tic0Var;
            if (this.Y0 != -1) {
                tic0Var.a = -1;
            }
            F0();
        }
    }

    public void w1(int i, int i2) {
        this.Y0 = i;
        this.Z0 = i2;
        tic0 tic0Var = this.b1;
        if (tic0Var != null) {
            tic0Var.a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public int x(s611 s611Var) {
        return X0(s611Var);
    }

    @Override // androidx.recyclerview.widget.a
    public Parcelable x0() {
        tic0 tic0Var = this.b1;
        if (tic0Var != null) {
            tic0 tic0Var2 = new tic0();
            tic0Var2.a = tic0Var.a;
            tic0Var2.b = tic0Var.b;
            tic0Var2.c = tic0Var.c;
            return tic0Var2;
        }
        tic0 tic0Var3 = new tic0();
        if (I() <= 0) {
            tic0Var3.a = -1;
            return tic0Var3;
        }
        a1();
        boolean z = this.T0 ^ this.V0;
        tic0Var3.c = z;
        if (z) {
            View viewN1 = n1();
            tic0Var3.b = this.S0.i() - this.S0.d(viewN1);
            tic0Var3.a = a.V(viewN1);
            return tic0Var3;
        }
        View viewO1 = o1();
        tic0Var3.a = a.V(viewO1);
        tic0Var3.b = this.S0.g(viewO1) - this.S0.m();
        return tic0Var3;
    }

    public final void x1(int i) {
        if (i != 0 && i != 1) {
            hhg1.n(f4i1.c(i, "invalid orientation:"));
            return;
        }
        n(null);
        if (i != this.Q0 || this.S0 == null) {
            dyb0 dyb0VarB = dyb0.b(this, i);
            this.S0 = dyb0VarB;
            this.c1.f = dyb0VarB;
            this.Q0 = i;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int y(s611 s611Var) {
        return Y0(s611Var);
    }

    public void y1(boolean z) {
        n(null);
        if (this.W0 == z) {
            return;
        }
        this.W0 = z;
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public int z(s611 s611Var) {
        return W0(s611Var);
    }

    public final void z1(int i, int i2, boolean z, s611 s611Var) {
        int iM;
        this.R0.l = this.S0.k() == 0 && this.S0.h() == 0;
        this.R0.f = i;
        int[] iArr = this.f1;
        iArr[0] = 0;
        iArr[1] = 0;
        U0(s611Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        sic0 sic0Var = this.R0;
        int i3 = z2 ? iMax2 : iMax;
        sic0Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        sic0Var.i = iMax;
        if (z2) {
            sic0Var.h = this.S0.j() + i3;
            View viewN1 = n1();
            sic0 sic0Var2 = this.R0;
            sic0Var2.e = this.V0 ? -1 : 1;
            int iV = a.V(viewN1);
            sic0 sic0Var3 = this.R0;
            sic0Var2.d = iV + sic0Var3.e;
            sic0Var3.b = this.S0.d(viewN1);
            iM = this.S0.d(viewN1) - this.S0.i();
        } else {
            View viewO1 = o1();
            sic0 sic0Var4 = this.R0;
            sic0Var4.h = this.S0.m() + sic0Var4.h;
            sic0 sic0Var5 = this.R0;
            sic0Var5.e = this.V0 ? 1 : -1;
            int iV2 = a.V(viewO1);
            sic0 sic0Var6 = this.R0;
            sic0Var5.d = iV2 + sic0Var6.e;
            sic0Var6.b = this.S0.g(viewO1);
            iM = (-this.S0.g(viewO1)) + this.S0.m();
        }
        sic0 sic0Var7 = this.R0;
        sic0Var7.c = i2;
        if (z) {
            sic0Var7.c = i2 - iM;
        }
        sic0Var7.g = iM;
    }

    public LinearLayoutManager(int i) {
        this.Q0 = 1;
        this.U0 = false;
        this.V0 = false;
        this.W0 = false;
        this.X0 = true;
        this.Y0 = -1;
        this.Z0 = Integer.MIN_VALUE;
        this.b1 = null;
        this.c1 = new fp00();
        this.d1 = new tpc();
        this.e1 = (byte) 2;
        this.f1 = new int[2];
        x1(i);
        n(null);
        if (this.U0) {
            this.U0 = false;
            F0();
        }
    }

    public void r1(n611 n611Var, s611 s611Var, fp00 fp00Var, int i) {
    }
}
