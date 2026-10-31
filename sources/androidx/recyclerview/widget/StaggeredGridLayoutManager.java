package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p.a9a;
import p.dyb0;
import p.g611;
import p.hhg1;
import p.hp91;
import p.iab1;
import p.jab1;
import p.kab1;
import p.l1d;
import p.lab1;
import p.n611;
import p.os00;
import p.prn1;
import p.qzd;
import p.r611;
import p.rnb0;
import p.s611;
import p.vb91;
import p.wic0;
import p.xfz0;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class StaggeredGridLayoutManager extends a implements r611 {
    public int Q0;
    public vb91[] R0;
    public final dyb0 S0;
    public final dyb0 T0;
    public final int U0;
    public int V0;
    public final rnb0 W0;
    public boolean X0;
    public boolean Y0;
    public BitSet Z0;
    public int a1;
    public int b1;
    public final hp91 c1;
    public final byte d1;
    public boolean e1;
    public boolean f1;
    public lab1 g1;
    public final Rect h1;
    public final iab1 i1;
    public final boolean j1;
    public int[] k1;
    public final xfz0 l1;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.Q0 = -1;
        this.X0 = false;
        this.Y0 = false;
        this.a1 = -1;
        this.b1 = os00.INVALID_ID;
        this.c1 = new hp91();
        this.d1 = (byte) 2;
        this.h1 = new Rect();
        this.i1 = new iab1(this);
        this.j1 = true;
        this.l1 = new xfz0(this, (byte) 20);
        qzd qzdVarW = a.W(context, attributeSet, i, i2);
        int i3 = qzdVarW.a;
        if (i3 != 0 && i3 != 1) {
            hhg1.n("invalid orientation.");
            throw null;
        }
        n(null);
        if (i3 != this.U0) {
            this.U0 = i3;
            dyb0 dyb0Var = this.S0;
            this.S0 = this.T0;
            this.T0 = dyb0Var;
            F0();
        }
        u1(qzdVarW.b);
        boolean z = qzdVarW.c;
        n(null);
        lab1 lab1Var = this.g1;
        if (lab1Var != null && lab1Var.h != z) {
            lab1Var.h = z;
        }
        this.X0 = z;
        F0();
        this.W0 = new rnb0();
        this.S0 = dyb0.b(this, this.U0);
        this.T0 = dyb0.b(this, 1 - this.U0);
    }

    public static int x1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int A(s611 s611Var) {
        return V0(s611Var);
    }

    public final int B(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return prn1.i(s611Var, this.S0, Y0(z), X0(z), this, this.j1);
    }

    public final g611 E() {
        return this.U0 == 0 ? new jab1(-2, -1) : new jab1(-1, -2);
    }

    public final g611 F(Context context, AttributeSet attributeSet) {
        return new jab1(context, attributeSet);
    }

    public final g611 G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new jab1((ViewGroup.MarginLayoutParams) layoutParams) : new jab1(layoutParams);
    }

    public final int G0(int i, n611 n611Var, s611 s611Var) {
        return s1(i, n611Var, s611Var);
    }

    public final void H0(int i) {
        lab1 lab1Var = this.g1;
        if (lab1Var != null && lab1Var.a != i) {
            lab1Var.d = null;
            lab1Var.c = 0;
            lab1Var.a = -1;
            lab1Var.b = -1;
        }
        this.a1 = i;
        this.b1 = os00.INVALID_ID;
        F0();
    }

    public final int I0(int i, n611 n611Var, s611 s611Var) {
        return s1(i, n611Var, s611Var);
    }

    public final void L0(Rect rect, int i, int i2) {
        int iT;
        int iT2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.U0 == 1) {
            iT2 = a.t(i2, rect.height() + paddingBottom, T());
            iT = a.t(i, (this.V0 * this.Q0) + paddingRight, U());
        } else {
            iT = a.t(i, rect.width() + paddingRight, U());
            iT2 = a.t(i2, (this.V0 * this.Q0) + paddingBottom, T());
        }
        RecyclerView.h(((a) this).b, iT, iT2);
    }

    public final void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        wic0 wic0Var = new wic0(recyclerView.getContext());
        wic0Var.a = i;
        S0(wic0Var);
    }

    public final boolean T0() {
        return this.g1 == null;
    }

    public final boolean U0() {
        int iC1;
        if (I() != 0 && this.d1 != 0 && ((a) this).g) {
            if (this.Y0) {
                iC1 = d1();
                c1();
            } else {
                iC1 = c1();
                d1();
            }
            if (iC1 == 0 && i1() != null) {
                this.c1.d();
                ((a) this).f = true;
                F0();
                return true;
            }
        }
        return false;
    }

    public final int V0(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return prn1.h(s611Var, this.S0, Y0(z), X0(z), this, this.j1, this.Y0);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.ViewGroup$MarginLayoutParams, p.g611, p.jab1] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int W0(n611 n611Var, rnb0 rnb0Var, s611 s611Var) {
        int i;
        int i2;
        vb91 vb91Var;
        ?? r6;
        int iJ;
        int iE;
        int iE2;
        int i3;
        int i4;
        int i5;
        n611 n611Var2 = n611Var;
        int i6 = 0;
        int i7 = 1;
        this.Z0.set(0, this.Q0, true);
        rnb0 rnb0Var2 = this.W0;
        if (rnb0Var2.i) {
            i = rnb0Var.e;
            i2 = i == 1 ? Alert.DURATION_SHOW_INDEFINITELY : os00.INVALID_ID;
        } else {
            i = rnb0Var.e;
            i2 = i == 1 ? rnb0Var.g + rnb0Var.b : rnb0Var.f - rnb0Var.b;
        }
        for (int i8 = 0; i8 < this.Q0; i8++) {
            if (!this.R0[i8].a.isEmpty()) {
                w1(this.R0[i8], i, i2);
            }
        }
        boolean z = this.Y0;
        dyb0 dyb0Var = this.S0;
        int i9 = z ? dyb0Var.i() : dyb0Var.m();
        boolean z2 = false;
        while (true) {
            int i10 = rnb0Var.c;
            int i11 = -1;
            if (i10 < 0 || i10 >= s611Var.b() || (!rnb0Var2.i && this.Z0.isEmpty())) {
                break;
            }
            View viewD = n611Var2.d(rnb0Var.c);
            rnb0Var.c += rnb0Var.d;
            ?? r12 = (jab1) viewD.getLayoutParams();
            int iO = ((g611) r12).a.o();
            hp91 hp91Var = this.c1;
            int[] iArr = (int[]) hp91Var.b;
            int i12 = (iArr == null || iO >= iArr.length) ? -1 : iArr[iO];
            if (i12 == -1) {
                boolean zM1 = m1(rnb0Var.e);
                int i13 = this.Q0;
                if (zM1) {
                    i5 = i13 - 1;
                    i4 = -1;
                } else {
                    i4 = i7;
                    i11 = i13;
                    i5 = i6;
                }
                vb91 vb91Var2 = null;
                if (rnb0Var.e == i7) {
                    int iM = dyb0Var.m();
                    int i14 = Alert.DURATION_SHOW_INDEFINITELY;
                    while (i5 != i11) {
                        int i15 = i4;
                        vb91 vb91Var3 = this.R0[i5];
                        int i16 = i5;
                        int iG = vb91Var3.g(iM);
                        if (iG < i14) {
                            vb91Var2 = vb91Var3;
                            i14 = iG;
                        }
                        i5 = i16 + i15;
                        i4 = i15;
                    }
                } else {
                    int i17 = i4;
                    int i18 = dyb0Var.i();
                    int i19 = os00.INVALID_ID;
                    while (i5 != i11) {
                        vb91 vb91Var4 = this.R0[i5];
                        int i20 = i5;
                        int iJ2 = vb91Var4.j(i18);
                        if (iJ2 > i19) {
                            vb91Var2 = vb91Var4;
                            i19 = iJ2;
                        }
                        i5 = i20 + i17;
                    }
                }
                vb91Var = vb91Var2;
                hp91Var.g(iO);
                ((int[]) hp91Var.b)[iO] = vb91Var.e;
            } else {
                vb91Var = this.R0[i12];
            }
            r12.e = vb91Var;
            if (rnb0Var.e == 1) {
                l(viewD);
                r6 = 0;
            } else {
                r6 = 0;
                m(viewD, 0, false);
            }
            int i21 = this.U0;
            if (i21 == 1) {
                k1(viewD, a.J((boolean) r6, this.V0, ((a) this).Z, (int) r6, ((ViewGroup.MarginLayoutParams) r12).width), a.J(true, ((a) this).P0, ((a) this).N0, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) r12).height));
            } else {
                k1(viewD, a.J(true, ((a) this).O0, ((a) this).Z, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) r12).width), a.J(false, this.V0, ((a) this).N0, 0, ((ViewGroup.MarginLayoutParams) r12).height));
            }
            if (rnb0Var.e == 1) {
                iE = vb91Var.g(i9);
                iJ = dyb0Var.e(viewD) + iE;
            } else {
                iJ = vb91Var.j(i9);
                iE = iJ - dyb0Var.e(viewD);
            }
            int i22 = rnb0Var.e;
            vb91 vb91Var5 = r12.e;
            if (i22 == 1) {
                vb91Var5.getClass();
                jab1 jab1Var = (jab1) viewD.getLayoutParams();
                jab1Var.e = vb91Var5;
                ArrayList arrayList = vb91Var5.a;
                arrayList.add(viewD);
                vb91Var5.c = os00.INVALID_ID;
                if (arrayList.size() == 1) {
                    vb91Var5.b = os00.INVALID_ID;
                }
                if (((g611) jab1Var).a.v() || ((g611) jab1Var).a.y()) {
                    vb91Var5.d = ((StaggeredGridLayoutManager) vb91Var5.f).S0.e(viewD) + vb91Var5.d;
                }
            } else {
                vb91Var5.getClass();
                jab1 jab1Var2 = (jab1) viewD.getLayoutParams();
                jab1Var2.e = vb91Var5;
                ArrayList arrayList2 = vb91Var5.a;
                arrayList2.add(0, viewD);
                vb91Var5.b = os00.INVALID_ID;
                if (arrayList2.size() == 1) {
                    vb91Var5.c = os00.INVALID_ID;
                }
                if (((g611) jab1Var2).a.v() || ((g611) jab1Var2).a.y()) {
                    vb91Var5.d = ((StaggeredGridLayoutManager) vb91Var5.f).S0.e(viewD) + vb91Var5.d;
                }
            }
            boolean zJ1 = j1();
            dyb0 dyb0Var2 = this.T0;
            if (zJ1 && i21 == 1) {
                i3 = dyb0Var2.i() - (((this.Q0 - 1) - vb91Var.e) * this.V0);
                iE2 = i3 - dyb0Var2.e(viewD);
            } else {
                int iM2 = (vb91Var.e * this.V0) + dyb0Var2.m();
                int iE3 = dyb0Var2.e(viewD) + iM2;
                iE2 = iM2;
                i3 = iE3;
            }
            if (i21 == 1) {
                a.b0(viewD, iE2, iE, i3, iJ);
            } else {
                a.b0(viewD, iE, iE2, iJ, i3);
            }
            w1(vb91Var, rnb0Var2.e, i2);
            n611Var2 = n611Var;
            o1(n611Var2, rnb0Var2);
            if (rnb0Var2.h && viewD.hasFocusable()) {
                this.Z0.set(vb91Var.e, false);
            }
            i7 = 1;
            z2 = true;
            i6 = 0;
        }
        if (!z2) {
            o1(n611Var2, rnb0Var2);
        }
        int iM3 = rnb0Var2.e == -1 ? dyb0Var.m() - f1(dyb0Var.m()) : e1(dyb0Var.i()) - dyb0Var.i();
        if (iM3 > 0) {
            return Math.min(rnb0Var.b, iM3);
        }
        return 0;
    }

    public final View X0(boolean z) {
        dyb0 dyb0Var = this.S0;
        int iM = dyb0Var.m();
        int i = dyb0Var.i();
        View view = null;
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            int iG = dyb0Var.g(viewH);
            int iD = dyb0Var.d(viewH);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    public final View Y0(boolean z) {
        dyb0 dyb0Var = this.S0;
        int iM = dyb0Var.m();
        int i = dyb0Var.i();
        int I = I();
        View view = null;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            int iG = dyb0Var.g(viewH);
            if (dyb0Var.d(viewH) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    public final boolean Z() {
        return this.d1 != 0;
    }

    public final void Z0(int[] iArr) {
        if (iArr.length < this.Q0) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.Q0 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.Q0; i++) {
            vb91 vb91Var = this.R0[i];
            boolean z = ((StaggeredGridLayoutManager) vb91Var.f).X0;
            ArrayList arrayList = vb91Var.a;
            iArr[i] = z ? vb91Var.f(arrayList.size() - 1, -1, true, false) : vb91Var.f(0, arrayList.size(), true, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final PointF a(int i) {
        int i2 = -1;
        if (I() != 0) {
            if ((i < c1()) == this.Y0) {
                i2 = 1;
            }
        } else if (this.Y0) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.U0 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    public final void a1(n611 n611Var, s611 s611Var, boolean z) {
        int i;
        int iE1 = e1(os00.INVALID_ID);
        if (iE1 != Integer.MIN_VALUE && (i = this.S0.i() - iE1) > 0) {
            int i2 = i - (-s1(-i, n611Var, s611Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.S0.r(i2);
        }
    }

    public final void b1(n611 n611Var, s611 s611Var, boolean z) {
        int iM;
        int iF1 = f1(Alert.DURATION_SHOW_INDEFINITELY);
        if (iF1 != Integer.MAX_VALUE && (iM = iF1 - this.S0.m()) > 0) {
            int iS1 = iM - s1(iM, n611Var, s611Var);
            if (!z || iS1 <= 0) {
                return;
            }
            this.S0.r(-iS1);
        }
    }

    public final int c1() {
        if (I() == 0) {
            return 0;
        }
        return a.V(H(0));
    }

    public final void d0(int i) {
        super.d0(i);
        for (int i2 = 0; i2 < this.Q0; i2++) {
            vb91 vb91Var = this.R0[i2];
            int i3 = vb91Var.b;
            if (i3 != Integer.MIN_VALUE) {
                vb91Var.b = i3 + i;
            }
            int i4 = vb91Var.c;
            if (i4 != Integer.MIN_VALUE) {
                vb91Var.c = i4 + i;
            }
        }
    }

    public final int d1() {
        int I = I();
        if (I == 0) {
            return 0;
        }
        return a.V(H(I - 1));
    }

    public final void e0(int i) {
        super.e0(i);
        for (int i2 = 0; i2 < this.Q0; i2++) {
            vb91 vb91Var = this.R0[i2];
            int i3 = vb91Var.b;
            if (i3 != Integer.MIN_VALUE) {
                vb91Var.b = i3 + i;
            }
            int i4 = vb91Var.c;
            if (i4 != Integer.MIN_VALUE) {
                vb91Var.c = i4 + i;
            }
        }
    }

    public final int e1(int i) {
        int iG = this.R0[0].g(i);
        for (int i2 = 1; i2 < this.Q0; i2++) {
            int iG2 = this.R0[i2].g(i);
            if (iG2 > iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    public void f0(z511 z511Var, z511 z511Var2) {
        this.c1.d();
        for (int i = 0; i < this.Q0; i++) {
            this.R0[i].c();
        }
    }

    public final int f1(int i) {
        int iJ = this.R0[0].j(i);
        for (int i2 = 1; i2 < this.Q0; i2++) {
            int iJ2 = this.R0[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    public final int g1() {
        return this.Q0;
    }

    public void h0(RecyclerView recyclerView, n611 n611Var) {
        RecyclerView recyclerView2 = ((a) this).b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.l1);
        }
        for (int i = 0; i < this.Q0; i++) {
            this.R0[i].c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void h1(int i, int i2, int i3) {
        int i4;
        int i5;
        hp91 hp91Var;
        int[] iArr;
        int iD1;
        ArrayList arrayList;
        kab1 kab1Var;
        int size;
        int i6;
        int i7;
        int size2;
        int[] iArr2;
        int iD2 = this.Y0 ? d1() : c1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            hp91Var = this.c1;
            iArr = (int[]) hp91Var.b;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) hp91Var.c;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                kab1Var = null;
                                break;
                            }
                            kab1Var = (kab1) ((ArrayList) hp91Var.c).get(size2);
                            if (kab1Var.a == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        kab1Var = null;
                        break;
                    }
                    if (kab1Var != null) {
                        ((ArrayList) hp91Var.c).remove(kab1Var);
                    }
                    size = ((ArrayList) hp91Var.c).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            i6 = -1;
                            break;
                        } else if (((kab1) ((ArrayList) hp91Var.c).get(i6)).a >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        kab1 kab1Var2 = (kab1) ((ArrayList) hp91Var.c).get(i6);
                        ((ArrayList) hp91Var.c).remove(i6);
                        i7 = kab1Var2.a;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                iArr2 = (int[]) hp91Var.b;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) hp91Var.b).length;
                } else {
                    Arrays.fill((int[]) hp91Var.b, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                hp91Var.l(i, i2);
            } else if (i3 != 2) {
                hp91Var.m(i, i2);
            } else if (i3 == 8) {
                hp91Var.m(i, 1);
                hp91Var.l(i2, 1);
            }
            if (i4 <= iD2) {
                return;
            }
            if (this.Y0) {
                iD1 = c1();
            } else {
                iD1 = d1();
            }
            if (i5 <= iD1) {
                F0();
            }
        }
        i4 = i + i2;
        i5 = i;
        hp91Var = this.c1;
        iArr = (int[]) hp91Var.b;
        if (iArr != null) {
            arrayList = (ArrayList) hp91Var.c;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            kab1Var = null;
                            break;
                        }
                        kab1Var = (kab1) ((ArrayList) hp91Var.c).get(size2);
                        if (kab1Var.a == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    kab1Var = null;
                    break;
                }
                if (kab1Var != null) {
                    ((ArrayList) hp91Var.c).remove(kab1Var);
                }
                size = ((ArrayList) hp91Var.c).size();
                i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6 = -1;
                        break;
                    } else {
                        if (((kab1) ((ArrayList) hp91Var.c).get(i6)).a >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    kab1 kab1Var3 = (kab1) ((ArrayList) hp91Var.c).get(i6);
                    ((ArrayList) hp91Var.c).remove(i6);
                    i7 = kab1Var3.a;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            iArr2 = (int[]) hp91Var.b;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) hp91Var.b).length;
            } else {
                Arrays.fill((int[]) hp91Var.b, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            hp91Var.l(i, i2);
        } else if (i3 != 2) {
            hp91Var.m(i, i2);
        } else if (i3 == 8) {
            hp91Var.m(i, 1);
            hp91Var.l(i2, 1);
        }
        if (i4 <= iD2) {
            return;
        }
        if (this.Y0) {
            iD1 = c1();
        } else {
            iD1 = d1();
        }
        if (i5 <= iD1) {
            F0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    public final View i0(View view, int i, n611 n611Var, s611 s611Var) {
        View viewI;
        int i2;
        if (I() != 0) {
            RecyclerView recyclerView = ((a) this).b;
            if (recyclerView == null || (viewI = recyclerView.I(view)) == null || ((a) this).a.c.contains(viewI)) {
                viewI = null;
            }
            if (viewI != null) {
                r1();
                int i3 = this.U0;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && j1()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && j1()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    jab1 jab1Var = (jab1) viewI.getLayoutParams();
                    jab1Var.getClass();
                    vb91 vb91Var = jab1Var.e;
                    int iD1 = i2 == 1 ? d1() : c1();
                    v1(iD1, s611Var);
                    t1(i2);
                    rnb0 rnb0Var = this.W0;
                    rnb0Var.c = rnb0Var.d + iD1;
                    rnb0Var.b = (int) (this.S0.n() * 0.33333334f);
                    rnb0Var.h = true;
                    rnb0Var.a = false;
                    W0(n611Var, rnb0Var, s611Var);
                    this.e1 = this.Y0;
                    View viewH = vb91Var.h(iD1, i2);
                    if (viewH != null && viewH != viewI) {
                        return viewH;
                    }
                    if (m1(i2)) {
                        for (int i4 = this.Q0 - 1; i4 >= 0; i4--) {
                            View viewH2 = this.R0[i4].h(iD1, i2);
                            if (viewH2 != null && viewH2 != viewI) {
                                return viewH2;
                            }
                        }
                    } else {
                        for (int i5 = 0; i5 < this.Q0; i5++) {
                            View viewH3 = this.R0[i5].h(iD1, i2);
                            if (viewH3 != null && viewH3 != viewI) {
                                return viewH3;
                            }
                        }
                    }
                    boolean z = (this.X0 ^ true) == (i2 == -1);
                    View viewD = D(z ? vb91Var.d() : vb91Var.e());
                    if (viewD != null && viewD != viewI) {
                        return viewD;
                    }
                    if (m1(i2)) {
                        for (int i6 = this.Q0 - 1; i6 >= 0; i6--) {
                            if (i6 != vb91Var.e) {
                                vb91[] vb91VarArr = this.R0;
                                View viewD2 = D(z ? vb91VarArr[i6].d() : vb91VarArr[i6].e());
                                if (viewD2 != null && viewD2 != viewI) {
                                    return viewD2;
                                }
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.Q0; i7++) {
                            vb91[] vb91VarArr2 = this.R0;
                            View viewD3 = D(z ? vb91VarArr2[i7].d() : vb91VarArr2[i7].e());
                            if (viewD3 != null && viewD3 != viewI) {
                                return viewD3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View i1() {
        boolean z;
        boolean z2;
        int I = I();
        int i = I - 1;
        BitSet bitSet = new BitSet(this.Q0);
        bitSet.set(0, this.Q0, true);
        byte b = (this.U0 == 1 && j1()) ? (byte) 1 : (byte) -1;
        if (this.Y0) {
            I = -1;
        } else {
            i = 0;
        }
        int i2 = i < I ? 1 : -1;
        while (i != I) {
            View viewH = H(i);
            jab1 jab1Var = (jab1) viewH.getLayoutParams();
            boolean z3 = bitSet.get(jab1Var.e.e);
            dyb0 dyb0Var = this.S0;
            if (z3) {
                vb91 vb91Var = jab1Var.e;
                if (this.Y0) {
                    int i3 = vb91Var.c;
                    if (i3 == Integer.MIN_VALUE) {
                        vb91Var.b();
                        i3 = vb91Var.c;
                    }
                    if (i3 < dyb0Var.i()) {
                        ((jab1) ((View) l1d.i(1, vb91Var.a)).getLayoutParams()).getClass();
                        return viewH;
                    }
                } else {
                    int i4 = vb91Var.b;
                    ArrayList arrayList = vb91Var.a;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        jab1 jab1Var2 = (jab1) view.getLayoutParams();
                        vb91Var.b = ((StaggeredGridLayoutManager) vb91Var.f).S0.g(view);
                        jab1Var2.getClass();
                        i4 = vb91Var.b;
                    }
                    if (i4 > dyb0Var.m()) {
                        ((jab1) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewH;
                    }
                }
                bitSet.clear(jab1Var.e.e);
            }
            i += i2;
            if (i != I) {
                View viewH2 = H(i);
                if (this.Y0) {
                    int iD = dyb0Var.d(viewH);
                    int iD2 = dyb0Var.d(viewH2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (jab1Var.e.e - ((jab1) viewH2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewH;
                }
                int iG = dyb0Var.g(viewH);
                int iG2 = dyb0Var.g(viewH2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (jab1Var.e.e - ((jab1) viewH2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewH;
            }
        }
        return null;
    }

    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (I() > 0) {
            View viewY0 = Y0(false);
            View viewX0 = X0(false);
            if (viewY0 == null || viewX0 == null) {
                return;
            }
            int iV = a.V(viewY0);
            int iV2 = a.V(viewX0);
            if (iV < iV2) {
                accessibilityEvent.setFromIndex(iV);
                accessibilityEvent.setToIndex(iV2);
            } else {
                accessibilityEvent.setFromIndex(iV2);
                accessibilityEvent.setToIndex(iV);
            }
        }
    }

    public final boolean j1() {
        return S() == 1;
    }

    public final void k1(View view, int i, int i2) {
        Rect rect = this.h1;
        p(rect, view);
        g611 g611Var = (jab1) view.getLayoutParams();
        int iX1 = x1(i, ((ViewGroup.MarginLayoutParams) g611Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) g611Var).rightMargin + rect.right);
        int iX2 = x1(i2, ((ViewGroup.MarginLayoutParams) g611Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) g611Var).bottomMargin + rect.bottom);
        if (O0(view, iX1, iX2, g611Var)) {
            view.measure(iX1, iX2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0190  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:253:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:264:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x01de A[SYNTHETIC] */
    public final void l1(n611 n611Var, s611 s611Var, boolean z) {
        boolean z2;
        lab1 lab1Var;
        vb91[] vb91VarArr;
        int I;
        int i;
        int iV;
        int iV2;
        int I2;
        int i2;
        boolean z3;
        lab1 lab1Var2 = this.g1;
        iab1 iab1Var = this.i1;
        if (!(lab1Var2 == null && this.a1 == -1) && s611Var.b() == 0) {
            B0(n611Var);
            iab1Var.a();
            return;
        }
        boolean z4 = iab1Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = iab1Var.g;
        boolean z5 = (z4 && this.a1 == -1 && this.g1 == null) ? false : true;
        hp91 hp91Var = this.c1;
        if (z5) {
            iab1Var.a();
            lab1 lab1Var3 = this.g1;
            dyb0 dyb0Var = this.S0;
            if (lab1Var3 != null) {
                int i3 = lab1Var3.c;
                if (i3 > 0) {
                    if (i3 == this.Q0) {
                        for (int i4 = 0; i4 < this.Q0; i4++) {
                            this.R0[i4].c();
                            lab1 lab1Var4 = this.g1;
                            int i5 = lab1Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += lab1Var4.i ? dyb0Var.i() : dyb0Var.m();
                            }
                            vb91 vb91Var = this.R0[i4];
                            vb91Var.b = i5;
                            vb91Var.c = i5;
                        }
                    } else {
                        lab1Var3.d = null;
                        lab1Var3.c = 0;
                        lab1Var3.e = 0;
                        lab1Var3.f = null;
                        lab1Var3.g = null;
                        lab1Var3.a = lab1Var3.b;
                    }
                }
                lab1 lab1Var5 = this.g1;
                this.f1 = lab1Var5.t;
                boolean z6 = lab1Var5.h;
                n(null);
                lab1 lab1Var6 = this.g1;
                if (lab1Var6 != null && lab1Var6.h != z6) {
                    lab1Var6.h = z6;
                }
                this.X0 = z6;
                F0();
                r1();
                lab1 lab1Var7 = this.g1;
                int i6 = lab1Var7.a;
                if (i6 != -1) {
                    this.a1 = i6;
                    iab1Var.c = lab1Var7.i;
                } else {
                    iab1Var.c = this.Y0;
                }
                if (lab1Var7.e > 1) {
                    hp91Var.b = lab1Var7.f;
                    hp91Var.c = lab1Var7.g;
                }
            } else {
                r1();
                iab1Var.c = this.Y0;
            }
            if (s611Var.g || (i2 = this.a1) == -1) {
                if (this.e1) {
                    int iB = s611Var.b();
                    I2 = I() - 1;
                    while (true) {
                        if (I2 < 0) {
                            iV2 = 0;
                            break;
                        }
                        iV2 = a.V(H(I2));
                        if (iV2 < 0 && iV2 < iB) {
                            break;
                        } else {
                            I2--;
                        }
                    }
                } else {
                    int iB2 = s611Var.b();
                    I = I();
                    i = 0;
                    while (true) {
                        if (i >= I) {
                            iV2 = 0;
                            break;
                        }
                        iV = a.V(H(i));
                        if (iV < 0 && iV < iB2) {
                            iV2 = iV;
                            break;
                        }
                        i++;
                    }
                }
                iab1Var.a = iV2;
                iab1Var.b = os00.INVALID_ID;
            } else if (i2 < 0 || i2 >= s611Var.b()) {
                this.a1 = -1;
                this.b1 = os00.INVALID_ID;
                if (this.e1) {
                    int iB3 = s611Var.b();
                    I2 = I() - 1;
                    while (true) {
                        if (I2 < 0) {
                            iV2 = 0;
                            break;
                        } else {
                            iV2 = a.V(H(I2));
                            if (iV2 < 0) {
                            }
                            I2--;
                        }
                    }
                } else {
                    int iB4 = s611Var.b();
                    I = I();
                    i = 0;
                    while (true) {
                        if (i >= I) {
                            iV2 = 0;
                            break;
                        } else {
                            iV = a.V(H(i));
                            if (iV < 0) {
                            }
                            i++;
                        }
                    }
                }
                iab1Var.a = iV2;
                iab1Var.b = os00.INVALID_ID;
            } else {
                lab1 lab1Var8 = this.g1;
                if (lab1Var8 == null || lab1Var8.a == -1 || lab1Var8.c < 1) {
                    View viewD = D(this.a1);
                    if (viewD != null) {
                        iab1Var.a = this.Y0 ? d1() : c1();
                        if (this.b1 != Integer.MIN_VALUE) {
                            if (iab1Var.c) {
                                iab1Var.b = (dyb0Var.i() - this.b1) - dyb0Var.d(viewD);
                            } else {
                                iab1Var.b = (dyb0Var.m() + this.b1) - dyb0Var.g(viewD);
                            }
                        } else if (dyb0Var.e(viewD) > dyb0Var.n()) {
                            iab1Var.b = iab1Var.c ? dyb0Var.i() : dyb0Var.m();
                        } else {
                            int iG = dyb0Var.g(viewD) - dyb0Var.m();
                            if (iG < 0) {
                                iab1Var.b = -iG;
                            } else {
                                int i7 = dyb0Var.i() - dyb0Var.d(viewD);
                                if (i7 < 0) {
                                    iab1Var.b = i7;
                                } else {
                                    iab1Var.b = os00.INVALID_ID;
                                }
                            }
                        }
                    } else {
                        int i8 = this.a1;
                        iab1Var.a = i8;
                        int i9 = this.b1;
                        if (i9 == Integer.MIN_VALUE) {
                            if (I() != 0) {
                                if ((i8 < c1()) != this.Y0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.Y0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iab1Var.c = z3;
                            dyb0 dyb0Var2 = staggeredGridLayoutManager.S0;
                            iab1Var.b = z3 ? dyb0Var2.i() : dyb0Var2.m();
                        } else {
                            boolean z7 = iab1Var.c;
                            dyb0 dyb0Var3 = staggeredGridLayoutManager.S0;
                            if (z7) {
                                iab1Var.b = dyb0Var3.i() - i9;
                            } else {
                                iab1Var.b = dyb0Var3.m() + i9;
                            }
                        }
                        iab1Var.d = true;
                    }
                } else {
                    iab1Var.b = os00.INVALID_ID;
                    iab1Var.a = this.a1;
                }
            }
            iab1Var.e = true;
        }
        if (this.g1 == null && this.a1 == -1 && (iab1Var.c != this.e1 || j1() != this.f1)) {
            hp91Var.d();
            iab1Var.d = true;
        }
        if (I() > 0 && ((lab1Var = this.g1) == null || lab1Var.c < 1)) {
            if (iab1Var.d) {
                for (int i10 = 0; i10 < this.Q0; i10++) {
                    this.R0[i10].c();
                    int i11 = iab1Var.b;
                    if (i11 != Integer.MIN_VALUE) {
                        vb91 vb91Var2 = this.R0[i10];
                        vb91Var2.b = i11;
                        vb91Var2.c = i11;
                    }
                }
            } else if (z5 || iab1Var.f == null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.Q0;
                    vb91VarArr = this.R0;
                    if (i12 >= i13) {
                        break;
                    }
                    vb91 vb91Var3 = vb91VarArr[i12];
                    boolean z8 = this.Y0;
                    int i14 = iab1Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) vb91Var3.f;
                    int iG2 = z8 ? vb91Var3.g(os00.INVALID_ID) : vb91Var3.j(os00.INVALID_ID);
                    vb91Var3.c();
                    if (iG2 != Integer.MIN_VALUE && ((!z8 || iG2 >= staggeredGridLayoutManager2.S0.i()) && (z8 || iG2 <= staggeredGridLayoutManager2.S0.m()))) {
                        if (i14 != Integer.MIN_VALUE) {
                            iG2 += i14;
                        }
                        vb91Var3.c = iG2;
                        vb91Var3.b = iG2;
                    }
                    i12++;
                }
                int length = vb91VarArr.length;
                int[] iArr = iab1Var.f;
                if (iArr == null || iArr.length < length) {
                    iab1Var.f = new int[staggeredGridLayoutManager.R0.length];
                }
                for (int i15 = 0; i15 < length; i15++) {
                    iab1Var.f[i15] = vb91VarArr[i15].j(os00.INVALID_ID);
                }
            } else {
                for (int i16 = 0; i16 < this.Q0; i16++) {
                    vb91 vb91Var4 = this.R0[i16];
                    vb91Var4.c();
                    int i17 = iab1Var.f[i16];
                    vb91Var4.b = i17;
                    vb91Var4.c = i17;
                }
            }
        }
        C(n611Var);
        rnb0 rnb0Var = this.W0;
        rnb0Var.a = false;
        dyb0 dyb0Var4 = this.T0;
        int iN = dyb0Var4.n();
        this.V0 = iN / this.Q0;
        View.MeasureSpec.makeMeasureSpec(iN, dyb0Var4.k());
        v1(iab1Var.a, s611Var);
        if (iab1Var.c) {
            t1(-1);
            W0(n611Var, rnb0Var, s611Var);
            t1(1);
            rnb0Var.c = iab1Var.a + rnb0Var.d;
            W0(n611Var, rnb0Var, s611Var);
        } else {
            t1(1);
            W0(n611Var, rnb0Var, s611Var);
            t1(-1);
            rnb0Var.c = iab1Var.a + rnb0Var.d;
            W0(n611Var, rnb0Var, s611Var);
        }
        if (dyb0Var4.k() != 1073741824) {
            int I3 = I();
            float fMax = 0.0f;
            for (int i18 = 0; i18 < I3; i18++) {
                View viewH = H(i18);
                float fE = dyb0Var4.e(viewH);
                if (fE >= fMax) {
                    ((jab1) viewH.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i19 = this.V0;
            int iRound = Math.round(fMax * this.Q0);
            if (dyb0Var4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, dyb0Var4.n());
            }
            this.V0 = iRound / this.Q0;
            View.MeasureSpec.makeMeasureSpec(iRound, dyb0Var4.k());
            if (this.V0 != i19) {
                for (int i20 = 0; i20 < I3; i20++) {
                    View viewH2 = H(i20);
                    jab1 jab1Var = (jab1) viewH2.getLayoutParams();
                    jab1Var.getClass();
                    boolean zJ1 = j1();
                    int i21 = this.U0;
                    if (zJ1 && i21 == 1) {
                        int i22 = -((this.Q0 - 1) - jab1Var.e.e);
                        viewH2.offsetLeftAndRight((this.V0 * i22) - (i22 * i19));
                    } else {
                        int i23 = jab1Var.e.e;
                        int i24 = this.V0 * i23;
                        int i25 = i23 * i19;
                        if (i21 == 1) {
                            viewH2.offsetLeftAndRight(i24 - i25);
                        } else {
                            viewH2.offsetTopAndBottom(i24 - i25);
                        }
                    }
                }
            }
        }
        if (I() > 0) {
            if (this.Y0) {
                a1(n611Var, s611Var, true);
                b1(n611Var, s611Var, false);
            } else {
                b1(n611Var, s611Var, true);
                a1(n611Var, s611Var, false);
            }
        }
        if (z && !s611Var.g && this.d1 != 0 && I() > 0 && i1() != null) {
            RecyclerView recyclerView = ((a) this).b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.l1);
            }
            z2 = U0();
        }
        if (s611Var.g) {
            iab1Var.a();
        }
        this.e1 = iab1Var.c;
        this.f1 = j1();
        if (z2) {
            iab1Var.a();
            l1(n611Var, s611Var, false);
        }
    }

    public final boolean m1(int i) {
        if (this.U0 == 0) {
            return (i == -1) != this.Y0;
        }
        return ((i == -1) == this.Y0) == j1();
    }

    public final void n(String str) {
        if (this.g1 == null) {
            super.n(str);
        }
    }

    public void n0(RecyclerView recyclerView, int i, int i2) {
        h1(i, i2, 1);
    }

    public final void n1(int i, s611 s611Var) {
        int iC1;
        int i2;
        if (i > 0) {
            iC1 = d1();
            i2 = 1;
        } else {
            iC1 = c1();
            i2 = -1;
        }
        rnb0 rnb0Var = this.W0;
        rnb0Var.a = true;
        v1(iC1, s611Var);
        t1(i2);
        rnb0Var.c = iC1 + rnb0Var.d;
        rnb0Var.b = Math.abs(i);
    }

    public void o0(RecyclerView recyclerView) {
        this.c1.d();
        F0();
    }

    public final void o1(n611 n611Var, rnb0 rnb0Var) {
        if (!rnb0Var.a || rnb0Var.i) {
            return;
        }
        int i = rnb0Var.b;
        int i2 = rnb0Var.e;
        if (i == 0) {
            if (i2 == -1) {
                p1(n611Var, rnb0Var.g);
                return;
            } else {
                q1(n611Var, rnb0Var.f);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = rnb0Var.f;
            int iJ = this.R0[0].j(i4);
            while (i3 < this.Q0) {
                int iJ2 = this.R0[i3].j(i4);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i3++;
            }
            int i5 = i4 - iJ;
            int iMin = rnb0Var.g;
            if (i5 >= 0) {
                iMin -= Math.min(i5, rnb0Var.b);
            }
            p1(n611Var, iMin);
            return;
        }
        int i6 = rnb0Var.g;
        int iG = this.R0[0].g(i6);
        while (i3 < this.Q0) {
            int iG2 = this.R0[i3].g(i6);
            if (iG2 < iG) {
                iG = iG2;
            }
            i3++;
        }
        int i7 = iG - rnb0Var.g;
        int iMin2 = rnb0Var.f;
        if (i7 >= 0) {
            iMin2 += Math.min(i7, rnb0Var.b);
        }
        q1(n611Var, iMin2);
    }

    public void p0(RecyclerView recyclerView, int i, int i2) {
        h1(i, i2, 8);
    }

    public final void p1(n611 n611Var, int i) {
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            dyb0 dyb0Var = this.S0;
            if (dyb0Var.g(viewH) < i || dyb0Var.q(viewH) < i) {
                return;
            }
            jab1 jab1Var = (jab1) viewH.getLayoutParams();
            jab1Var.getClass();
            if (jab1Var.e.a.size() == 1) {
                return;
            }
            vb91 vb91Var = jab1Var.e;
            ArrayList arrayList = vb91Var.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            jab1 jab1Var2 = (jab1) view.getLayoutParams();
            jab1Var2.e = null;
            if (((g611) jab1Var2).a.v() || ((g611) jab1Var2).a.y()) {
                vb91Var.d -= ((StaggeredGridLayoutManager) vb91Var.f).S0.e(view);
            }
            if (size == 1) {
                vb91Var.b = os00.INVALID_ID;
            }
            vb91Var.c = os00.INVALID_ID;
            D0(viewH);
            n611Var.i(viewH);
        }
    }

    public final boolean q() {
        return this.U0 == 0;
    }

    public void q0(RecyclerView recyclerView, int i, int i2) {
        h1(i, i2, 2);
    }

    public final void q1(n611 n611Var, int i) {
        while (I() > 0) {
            View viewH = H(0);
            dyb0 dyb0Var = this.S0;
            if (dyb0Var.d(viewH) > i || dyb0Var.p(viewH) > i) {
                return;
            }
            jab1 jab1Var = (jab1) viewH.getLayoutParams();
            jab1Var.getClass();
            if (jab1Var.e.a.size() == 1) {
                return;
            }
            vb91 vb91Var = jab1Var.e;
            ArrayList arrayList = vb91Var.a;
            View view = (View) arrayList.remove(0);
            jab1 jab1Var2 = (jab1) view.getLayoutParams();
            jab1Var2.e = null;
            if (arrayList.size() == 0) {
                vb91Var.c = os00.INVALID_ID;
            }
            if (((g611) jab1Var2).a.v() || ((g611) jab1Var2).a.y()) {
                vb91Var.d -= ((StaggeredGridLayoutManager) vb91Var.f).S0.e(view);
            }
            vb91Var.b = os00.INVALID_ID;
            D0(viewH);
            n611Var.i(viewH);
        }
    }

    public final boolean r() {
        return this.U0 == 1;
    }

    public final void r1() {
        if (this.U0 == 1 || !j1()) {
            this.Y0 = this.X0;
        } else {
            this.Y0 = !this.X0;
        }
    }

    public final boolean s(g611 g611Var) {
        return g611Var instanceof jab1;
    }

    public void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        h1(i, i2, 4);
    }

    public final int s1(int i, n611 n611Var, s611 s611Var) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        n1(i, s611Var);
        rnb0 rnb0Var = this.W0;
        int iW0 = W0(n611Var, rnb0Var, s611Var);
        if (rnb0Var.b >= iW0) {
            i = i < 0 ? -iW0 : iW0;
        }
        this.S0.r(-i);
        this.e1 = this.Y0;
        rnb0Var.b = 0;
        o1(n611Var, rnb0Var);
        return i;
    }

    public final void t0(n611 n611Var, s611 s611Var) {
        l1(n611Var, s611Var, true);
    }

    public final void t1(int i) {
        rnb0 rnb0Var = this.W0;
        rnb0Var.e = i;
        rnb0Var.d = this.Y0 != (i == -1) ? -1 : 1;
    }

    public final void u(int i, int i2, s611 s611Var, a9a a9aVar) {
        rnb0 rnb0Var;
        int iG;
        int iJ;
        if (this.U0 != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        n1(i, s611Var);
        int[] iArr = this.k1;
        if (iArr == null || iArr.length < this.Q0) {
            this.k1 = new int[this.Q0];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.Q0;
            rnb0Var = this.W0;
            if (i3 >= i5) {
                break;
            }
            if (rnb0Var.d == -1) {
                iG = rnb0Var.f;
                iJ = this.R0[i3].j(iG);
            } else {
                iG = this.R0[i3].g(rnb0Var.g);
                iJ = rnb0Var.g;
            }
            int i6 = iG - iJ;
            if (i6 >= 0) {
                this.k1[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.k1, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = rnb0Var.c;
            if (i8 < 0 || i8 >= s611Var.b()) {
                return;
            }
            a9aVar.b(rnb0Var.c, this.k1[i7]);
            rnb0Var.c += rnb0Var.d;
        }
    }

    public final void u0(s611 s611Var) {
        this.a1 = -1;
        this.b1 = os00.INVALID_ID;
        this.g1 = null;
        this.i1.a();
    }

    public final void u1(int i) {
        n(null);
        if (i != this.Q0) {
            this.c1.d();
            F0();
            this.Q0 = i;
            this.Z0 = new BitSet(this.Q0);
            this.R0 = new vb91[this.Q0];
            for (int i2 = 0; i2 < this.Q0; i2++) {
                this.R0[i2] = new vb91(this, i2);
            }
            F0();
        }
    }

    public final void v1(int i, s611 s611Var) {
        int iN;
        int iN2;
        int i2;
        rnb0 rnb0Var = this.W0;
        boolean z = false;
        rnb0Var.b = 0;
        rnb0Var.c = i;
        wic0 wic0Var = ((a) this).e;
        dyb0 dyb0Var = this.S0;
        if (wic0Var == null || !wic0Var.g() || (i2 = s611Var.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.Y0 == (i2 < i)) {
                iN = dyb0Var.n();
                iN2 = 0;
            } else {
                iN2 = dyb0Var.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = ((a) this).b;
        if (recyclerView == null || !recyclerView.h) {
            rnb0Var.g = dyb0Var.h() + iN;
            rnb0Var.f = -iN2;
        } else {
            rnb0Var.f = dyb0Var.m() - iN2;
            rnb0Var.g = dyb0Var.i() + iN;
        }
        rnb0Var.h = false;
        rnb0Var.a = true;
        if (dyb0Var.k() == 0 && dyb0Var.h() == 0) {
            z = true;
        }
        rnb0Var.i = z;
    }

    public final int w(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return prn1.g(s611Var, this.S0, Y0(z), X0(z), this, this.j1);
    }

    public final void w0(Parcelable parcelable) {
        if (parcelable instanceof lab1) {
            lab1 lab1Var = (lab1) parcelable;
            this.g1 = lab1Var;
            if (this.a1 != -1) {
                lab1Var.a = -1;
                lab1Var.b = -1;
                lab1Var.d = null;
                lab1Var.c = 0;
                lab1Var.e = 0;
                lab1Var.f = null;
                lab1Var.g = null;
            }
            F0();
        }
    }

    public final void w1(vb91 vb91Var, int i, int i2) {
        int i3 = vb91Var.d;
        int i4 = vb91Var.e;
        if (i != -1) {
            int i5 = vb91Var.c;
            if (i5 == Integer.MIN_VALUE) {
                vb91Var.b();
                i5 = vb91Var.c;
            }
            if (i5 - i3 >= i2) {
                this.Z0.set(i4, false);
                return;
            }
            return;
        }
        int i6 = vb91Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) vb91Var.a.get(0);
            jab1 jab1Var = (jab1) view.getLayoutParams();
            vb91Var.b = ((StaggeredGridLayoutManager) vb91Var.f).S0.g(view);
            jab1Var.getClass();
            i6 = vb91Var.b;
        }
        if (i6 + i3 <= i2) {
            this.Z0.set(i4, false);
        }
    }

    public final int x(s611 s611Var) {
        return V0(s611Var);
    }

    public Parcelable x0() {
        int iJ;
        int iM;
        int[] iArr;
        lab1 lab1Var = this.g1;
        if (lab1Var != null) {
            lab1 lab1Var2 = new lab1();
            lab1Var2.c = lab1Var.c;
            lab1Var2.a = lab1Var.a;
            lab1Var2.b = lab1Var.b;
            lab1Var2.d = lab1Var.d;
            lab1Var2.e = lab1Var.e;
            lab1Var2.f = lab1Var.f;
            lab1Var2.h = lab1Var.h;
            lab1Var2.i = lab1Var.i;
            lab1Var2.t = lab1Var.t;
            lab1Var2.g = lab1Var.g;
            return lab1Var2;
        }
        lab1 lab1Var3 = new lab1();
        lab1Var3.h = this.X0;
        lab1Var3.i = this.e1;
        lab1Var3.t = this.f1;
        hp91 hp91Var = this.c1;
        if (hp91Var == null || (iArr = (int[]) hp91Var.b) == null) {
            lab1Var3.e = 0;
        } else {
            lab1Var3.f = iArr;
            lab1Var3.e = iArr.length;
            lab1Var3.g = (ArrayList) hp91Var.c;
        }
        if (I() <= 0) {
            lab1Var3.a = -1;
            lab1Var3.b = -1;
            lab1Var3.c = 0;
            return lab1Var3;
        }
        lab1Var3.a = this.e1 ? d1() : c1();
        View viewX0 = this.Y0 ? X0(true) : Y0(true);
        lab1Var3.b = viewX0 != null ? a.V(viewX0) : -1;
        int i = this.Q0;
        lab1Var3.c = i;
        lab1Var3.d = new int[i];
        for (int i2 = 0; i2 < this.Q0; i2++) {
            boolean z = this.e1;
            vb91[] vb91VarArr = this.R0;
            dyb0 dyb0Var = this.S0;
            if (z) {
                iJ = vb91VarArr[i2].g(os00.INVALID_ID);
                if (iJ != Integer.MIN_VALUE) {
                    iM = dyb0Var.i();
                    iJ -= iM;
                }
            } else {
                iJ = vb91VarArr[i2].j(os00.INVALID_ID);
                if (iJ != Integer.MIN_VALUE) {
                    iM = dyb0Var.m();
                    iJ -= iM;
                }
            }
            lab1Var3.d[i2] = iJ;
        }
        return lab1Var3;
    }

    public final int y(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return prn1.i(s611Var, this.S0, Y0(z), X0(z), this, this.j1);
    }

    public final void y0(int i) {
        if (i == 0) {
            U0();
        }
    }

    public final int z(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return prn1.g(s611Var, this.S0, Y0(z), X0(z), this, this.j1);
    }

    public StaggeredGridLayoutManager() {
        this.Q0 = -1;
        this.X0 = false;
        this.Y0 = false;
        this.a1 = -1;
        this.b1 = os00.INVALID_ID;
        this.c1 = new hp91();
        this.d1 = (byte) 2;
        this.h1 = new Rect();
        this.i1 = new iab1(this);
        this.j1 = true;
        this.l1 = new xfz0(this, (byte) 20);
        this.U0 = 1;
        u1(2);
        this.W0 = new rnb0();
        this.S0 = dyb0.b(this, this.U0);
        this.T0 = dyb0.b(this, 1 - this.U0);
    }
}
