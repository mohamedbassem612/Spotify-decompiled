package com.spotify.legacyglue.carousel;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import p.fna;
import p.g611;
import p.hhg1;
import p.i0e;
import p.ij81;
import p.iti1;
import p.j0e;
import p.l0e;
import p.n611;
import p.pkf1;
import p.pzd;
import p.qzd;
import p.rzd;
import p.s611;
import p.uq8;
import p.uwd;
import p.xyd;
import p.yyd;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CarouselLayoutManager extends a implements j0e {
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public ij81 U0;
    public int V0;
    public int W0 = -1;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public final int b1;
    public boolean c1;
    public int d1;
    public final qzd e1;
    public boolean f1;
    public final fna g1;
    public final ArrayList h1;
    public final iti1 i1;
    public i0e j1;

    public CarouselLayoutManager(int i) {
        qzd qzdVar = new qzd();
        qzdVar.a = -1;
        this.e1 = qzdVar;
        this.g1 = new fna(this, (byte) 9);
        this.h1 = new ArrayList();
        iti1 iti1Var = new iti1();
        iti1Var.c = this;
        this.i1 = iti1Var;
        if (i != 0) {
            this.b1 = i;
        } else {
            hhg1.n("MeasureMode must not be null!");
            throw null;
        }
    }

    public final g611 E() {
        return new rzd(-2, -2);
    }

    public final g611 F(Context context, AttributeSet attributeSet) {
        return new rzd(context, attributeSet);
    }

    public final g611 G(ViewGroup.LayoutParams layoutParams) {
        return new rzd(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    public final int G0(int i, n611 n611Var, s611 s611Var) {
        View viewH;
        boolean z;
        boolean z2;
        View viewH2;
        int iY0;
        int i2;
        if (I() == 0) {
            return 0;
        }
        View viewH3 = H(0);
        View viewH4 = H(I() - 1);
        int i3 = this.S0;
        boolean z3 = i3 == 0;
        boolean z4 = i3 + 3 >= R();
        iti1 iti1Var = this.i1;
        if (iti1Var.a) {
            int i4 = iti1Var.b;
            int i5 = i4 - 1;
            int i6 = i4 + 1;
            int iMax = Math.max(i5 - this.S0, 0);
            int iMin = Math.min(i6 - this.S0, I() - 1);
            viewH = H(iMax);
            z2 = viewH != null && this.V0 - 1 >= i5;
            viewH2 = H(iMin);
            z = viewH2 != null && this.V0 + 1 <= i6;
        } else {
            viewH = null;
            z = false;
            z2 = false;
            viewH2 = null;
        }
        if (this.X0 && (i2 = this.V0) > 0 && this.c1) {
            viewH3 = H(i2 - this.S0);
            z3 = true;
        }
        if (this.Y0 && this.V0 < R() - 1 && this.c1) {
            viewH4 = H(this.V0 - this.S0);
            z4 = true;
        }
        if (i > 0) {
            boolean z5 = z4 && this.Y0;
            boolean z6 = z4 && !z;
            if (z5 || z6) {
                iY0 = X0(viewH4, i);
            } else if (z) {
                iY0 = X0(viewH2, i);
            } else {
                iY0 = -i;
            }
        } else {
            boolean z7 = z3 && this.X0;
            boolean z8 = z3 && !z2;
            if (z7 || z8) {
                iY0 = Y0(viewH3, i);
            } else if (z2) {
                iY0 = Y0(viewH, i);
            } else {
                iY0 = -i;
            }
        }
        d0(iY0);
        int i7 = -iY0;
        U0();
        if (i > 0) {
            if (viewH3 == null || a.P(viewH3) >= getPaddingLeft() || z4) {
                V0(1, n611Var, s611Var);
                return i7;
            }
            V0(3, n611Var, s611Var);
            return i7;
        }
        if (viewH3 == null || a.M(viewH3) < getPaddingLeft() || z3) {
            V0(1, n611Var, s611Var);
            return i7;
        }
        V0(2, n611Var, s611Var);
        return i7;
    }

    public final void H0(int i) {
        if (i >= R()) {
            return;
        }
        this.S0 = Math.max(i - 1, 0);
        this.V0 = i;
        this.W0 = i;
        F0();
    }

    public void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        int i2;
        if (i >= R()) {
            return;
        }
        int i3 = this.V0;
        if (i > i3) {
            i2 = 3;
        } else {
            i2 = i < i3 ? 2 : 1;
        }
        this.g1.getClass();
        pzd pzdVar = new pzd(recyclerView.getContext(), i2);
        pzdVar.a = i;
        S0(pzdVar);
        this.V0 = i;
    }

    public final void U0() {
        if (this.U0 == null) {
            return;
        }
        for (int i = 0; i < I(); i++) {
            View viewH = H(i);
            if (viewH != null) {
                int iZ0 = Z0(viewH);
                if (a.M(viewH) < getPaddingLeft() + iZ0) {
                    float paddingLeft = ((getPaddingLeft() + iZ0) - a.M(viewH)) / this.Q0;
                    this.U0.t(viewH, paddingLeft <= 1.0f ? paddingLeft : 1.0f);
                } else {
                    float fM = (a.M(viewH) - (getPaddingLeft() + iZ0)) / this.Q0;
                    this.U0.t(viewH, fM <= 1.0f ? fM : 1.0f);
                }
            }
        }
    }

    public final void V0(int i, n611 n611Var, s611 s611Var) {
        int i2;
        ArrayList<View> arrayList;
        int i3;
        xyd xydVar;
        int I = I();
        qzd qzdVar = this.e1;
        if (I != 0) {
            if (!qzdVar.d) {
                b1(false);
            }
            C(n611Var);
        }
        int i4 = this.S0;
        if (i == 1) {
            i2 = 0;
        } else if (i == 2) {
            i2 = -1;
        } else {
            if (i != 3) {
                throw null;
            }
            i2 = 1;
        }
        this.S0 = i2 + i4;
        int i5 = 0;
        int iMin = -1;
        while (true) {
            arrayList = this.h1;
            if (i5 >= 3 || ((i3 = this.S0 + i5) >= s611Var.b() && !s611Var.g)) {
                break;
            }
            try {
                View viewD = n611Var.d(i3);
                if (viewD.getTag(2131430298) == null) {
                    yyd yydVar = new yyd();
                    yydVar.b = (byte) 0;
                    viewD.setTag(2131430298, yydVar);
                }
                yyd yydVar2 = (yyd) viewD.getTag(2131430298);
                ij81 ij81Var = this.U0;
                if (ij81Var != null) {
                    int i6 = ij81Var.b;
                    if (i5 == 0 && i6 > 0 && this.V0 != 0) {
                        yydVar2.b = (byte) -1;
                        yydVar2.c = i6;
                    } else if (i5 != 2 || i6 <= 0) {
                        yydVar2.b = (byte) 0;
                    } else {
                        yydVar2.b = (byte) 1;
                        yydVar2.c = i6;
                    }
                } else {
                    yydVar2.b = (byte) 0;
                }
                boolean z = i5 == this.V0 - this.S0;
                boolean z2 = !yydVar2.a && z;
                yydVar2.a = z;
                if (z2 && (xydVar = yydVar2.d) != null) {
                    xydVar.f();
                }
                try {
                    try {
                        l(viewD);
                        arrayList.add(viewD);
                        ((rzd) viewD.getLayoutParams()).getClass();
                        a1();
                        viewD.measure(View.MeasureSpec.makeMeasureSpec(this.Q0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.R0, 1073741824));
                        if (((g611) viewD.getLayoutParams()).a.n() == qzdVar.a) {
                            iMin = arrayList.size() - 1;
                        }
                    } catch (IllegalArgumentException unused) {
                        n611Var.i(viewD);
                    }
                } catch (IllegalArgumentException | IllegalStateException unused2) {
                }
                i5++;
            } catch (IndexOutOfBoundsException unused3) {
            }
        }
        if (arrayList.isEmpty()) {
            qzdVar.c = false;
            qzdVar.d = false;
            qzdVar.a = -1;
            arrayList.clear();
            return;
        }
        if (this.Z0 || !qzdVar.c || iMin == -1) {
            iMin = Math.min(this.V0 > 0 ? 1 : 0, arrayList.size() - 1);
            qzdVar.c = true;
            qzdVar.b = getPaddingLeft() + Z0((View) arrayList.get(iMin));
            qzdVar.d = false;
        }
        int measuredWidth = qzdVar.b;
        for (int i7 = iMin - 1; i7 >= 0; i7--) {
            measuredWidth -= ((View) arrayList.get(i7)).getMeasuredWidth() + this.T0;
        }
        for (View view : arrayList) {
            int paddingTop = ((((((a) this).P0 - getPaddingTop()) - getPaddingBottom()) - view.getMeasuredHeight()) / 2) + getPaddingTop();
            ((rzd) view.getLayoutParams()).getClass();
            a1();
            int i8 = this.Q0 + measuredWidth;
            int i9 = this.R0 + paddingTop;
            Rect rect = view.getLayoutParams().b;
            view.layout(rect.left + measuredWidth, paddingTop + rect.top, i8 - rect.right, i9 - rect.bottom);
            measuredWidth += view.getMeasuredWidth() + this.T0;
        }
        qzdVar.c = false;
        qzdVar.d = false;
        qzdVar.a = -1;
        arrayList.clear();
        U0();
    }

    public final int W0() {
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int i2 = 0;
        for (int i3 = 0; i3 < I(); i3++) {
            View viewH = H(i3);
            if (viewH != null) {
                int iAbs = Math.abs(((a1() / 2) + getPaddingLeft()) - (((a.P(viewH) - a.M(viewH)) / 2) + a.M(viewH)));
                if (iAbs < i) {
                    i2 = i3;
                    i = iAbs;
                }
            }
        }
        return i2;
    }

    public final int X0(View view, int i) {
        int iA1;
        int paddingRight = (((a) this).O0 - getPaddingRight()) - (view != null ? a.P(view) : 0);
        if (view != null) {
            ((rzd) view.getLayoutParams()).getClass();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.g1.b;
            iA1 = (carouselLayoutManager.a1() - carouselLayoutManager.Q0) / 2;
        } else {
            iA1 = 0;
        }
        int i2 = paddingRight - iA1;
        return Math.max(-i, Math.abs(i2) > 1 ? i2 : 0);
    }

    public final int Y0(View view, int i) {
        int iM = view != null ? a.M(view) : 0;
        int iZ0 = Z0(view) + getPaddingLeft() + (-iM);
        return Math.min(-i, Math.abs(iZ0) > 1 ? iZ0 : 0);
    }

    public final int Z0(View view) {
        if (view == null) {
            return 0;
        }
        ((rzd) view.getLayoutParams()).getClass();
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.g1.b;
        return (carouselLayoutManager.a1() - carouselLayoutManager.Q0) / 2;
    }

    public final int a1() {
        int paddingLeft = (((a) this).O0 - getPaddingLeft()) - getPaddingRight();
        int i = this.d1;
        if (paddingLeft > i && i != 0) {
            this.e1.c = false;
        }
        this.d1 = paddingLeft;
        return paddingLeft;
    }

    public final void b1(boolean z) {
        View viewH = I() > 1 ? H(1) : H(0);
        if (viewH == null) {
            return;
        }
        int iN = ((g611) ((rzd) viewH.getLayoutParams())).a.n();
        qzd qzdVar = this.e1;
        qzdVar.a = iN;
        qzdVar.b = a.M(viewH);
        qzdVar.d = z;
        qzdVar.c = true;
        if (z) {
            if (getPaddingLeft() + Z0(viewH) != qzdVar.b || this.f1) {
                return;
            }
            qzdVar.c = false;
        }
    }

    public final void f0(z511 z511Var, z511 z511Var2) {
        A0();
    }

    public final void n0(RecyclerView recyclerView, int i, int i2) {
        iti1 iti1Var;
        int i3;
        if (I() == 0) {
            return;
        }
        int i4 = this.V0;
        if (i <= i4) {
            this.V0 = i4 + i2;
        }
        iti1 iti1Var2 = this.i1;
        if (iti1Var2.a && i <= (i3 = (iti1Var = ((CarouselLayoutManager) iti1Var2.c).i1).b)) {
            iti1Var.b = i3 + i2;
        }
        this.a1 = true;
    }

    public final void o0(RecyclerView recyclerView) {
        this.Z0 = true;
        this.a1 = true;
    }

    public final void p0(RecyclerView recyclerView, int i, int i2) {
        int i3 = i + 1;
        int i4 = this.V0;
        if (i3 < i4) {
            if (i2 > i4) {
                this.V0 = i4 - 1;
            }
        } else if (i <= i4 && i3 >= i4) {
            this.V0 = (i2 - i) + i4;
        } else if (i > i4 && i2 <= i4) {
            this.V0 = i4 + 1;
        }
        this.a1 = true;
    }

    public final boolean q() {
        return I() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    public final void q0(RecyclerView recyclerView, int i, int i2) {
        if (I() == 0) {
            return;
        }
        int i3 = i + i2;
        int i4 = i3 - 1;
        int iR = this.V0;
        int iR2 = 0;
        if (i4 < iR) {
            this.V0 = iR - i2;
        } else if (i <= iR && i3 >= iR) {
            if (R() == 0) {
                iR = 0;
            } else if (iR > R() - 1) {
                iR = R() - 1;
            } else if (iR < 0) {
                iR = 0;
            }
            this.V0 = iR;
        }
        iti1 iti1Var = this.i1;
        if (iti1Var.a) {
            int i5 = iti1Var.b;
            if (i4 < i5) {
                iti1Var.b = i5 - i2;
            } else if (i <= i5 && i3 >= i5) {
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) iti1Var.c;
                if (carouselLayoutManager.R() != 0) {
                    if (i5 > carouselLayoutManager.R() - 1) {
                        iR2 = carouselLayoutManager.R() - 1;
                    } else if (i5 >= 0) {
                        iR2 = i5;
                    }
                }
                iti1Var.b = iR2;
            }
        }
        this.a1 = true;
    }

    public final boolean s(g611 g611Var) {
        return g611Var instanceof rzd;
    }

    public final void t0(n611 n611Var, s611 s611Var) {
        int iR;
        uq8 uq8Var;
        int i;
        if (R() == 0) {
            C(n611Var);
            return;
        }
        if (s611Var.f && (i = this.W0) != -1) {
            this.V0 = i;
        }
        if (this.V0 > R() - 1) {
            iR = R() - 1;
            this.V0 = iR;
        } else {
            iR = this.V0;
            if (iR < 0) {
                this.V0 = 0;
                iR = 0;
            }
        }
        if (iR != 0) {
            this.S0 = iR - 1;
        } else {
            this.S0 = iR;
        }
        if (I() != 0) {
            b1(true);
        }
        C(n611Var);
        V0(1, n611Var, s611Var);
        this.Z0 = false;
        this.W0 = -1;
        if (!s611Var.g && (uq8Var = this.j1) != null) {
            boolean z = this.a1;
            uwd uwdVar = (uwd) uq8Var.b;
            int i2 = uwdVar.e;
            if (i2 != -1 && z) {
                ((pkf1) uwdVar.g).y0(i2);
                uwdVar.e = -1;
            }
        }
        this.a1 = false;
    }

    public final void v0(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = U();
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ij81 ij81Var = this.U0;
        if (ij81Var != null) {
            int i4 = ij81Var.b;
            i3 = (i4 + i4) * 2;
        } else {
            i3 = 0;
        }
        int i5 = paddingLeft - i3;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i5;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingBottom);
        } else if (mode2 == 0) {
            size2 = paddingBottom;
        } else if (mode2 != 1073741824) {
            size2 = T();
        }
        RecyclerView.h(((a) this).b, size, size2);
        if (this.b1 == 1) {
            int iMin = Math.min(size2, i5);
            this.Q0 = iMin;
            this.R0 = iMin;
        } else {
            this.Q0 = i5;
            this.R0 = (size2 - getPaddingTop()) - getPaddingBottom();
        }
        this.T0 = (i5 - ((CarouselLayoutManager) this.g1.b).Q0) / 2;
    }

    public final void w0(Parcelable parcelable) {
        this.V0 = ((l0e) parcelable).a;
    }

    public final Parcelable x0() {
        return new l0e(this.V0);
    }

    public final void y0(int i) {
        boolean z = i == 1;
        this.c1 = z;
        this.f1 = i == 2;
        iti1 iti1Var = this.i1;
        if (z && !iti1Var.a && I() > 0) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) iti1Var.c;
            iti1Var.b = carouselLayoutManager.S0 + ((carouselLayoutManager.I() <= 1 || carouselLayoutManager.V0 <= 0) ? 0 : 1);
            iti1Var.a = true;
        }
        if (i == 0) {
            iti1Var.a = false;
        }
    }
}
