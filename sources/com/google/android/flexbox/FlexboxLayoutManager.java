package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.List;
import p.aq20;
import p.bhn0;
import p.bq20;
import p.dyb0;
import p.g611;
import p.n611;
import p.os00;
import p.qzd;
import p.r611;
import p.rp20;
import p.s611;
import p.tp20;
import p.up20;
import p.uqq0;
import p.vqq0;
import p.wic0;
import p.wp20;
import p.yp20;
import p.z511;
import p.zp20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class FlexboxLayoutManager extends a implements rp20, r611 {
    public static final Rect p1 = new Rect();
    public byte Q0;
    public boolean R0;
    public byte S0;
    public byte T0;
    public boolean V0;
    public boolean W0;
    public n611 Z0;
    public s611 a1;
    public aq20 b1;
    public dyb0 d1;
    public dyb0 e1;
    public bq20 f1;
    public final Context l1;
    public View m1;
    public final int U0 = -1;
    public List X0 = new ArrayList();
    public final wp20 Y0 = new wp20(this);
    public final yp20 c1 = new yp20(this);
    public int g1 = -1;
    public int h1 = os00.INVALID_ID;
    public int i1 = os00.INVALID_ID;
    public int j1 = os00.INVALID_ID;
    public final SparseArray k1 = new SparseArray();
    public int n1 = -1;
    public final up20 o1 = new up20();

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        qzd qzdVarW = a.W(context, attributeSet, i, i2);
        int i3 = qzdVarW.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (qzdVarW.c) {
                    l1(3);
                } else {
                    l1(2);
                }
            }
        } else if (qzdVarW.c) {
            l1(1);
        } else {
            l1(0);
        }
        m1(1);
        k1(4);
        ((a) this).h = true;
        this.l1 = context;
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

    public final int A(s611 s611Var) {
        return V0(s611Var);
    }

    public final int B(s611 s611Var) {
        return W0(s611Var);
    }

    public final g611 E() {
        zp20 zp20Var = new zp20(-2, -2);
        zp20Var.e = 0.0f;
        zp20Var.f = 1.0f;
        zp20Var.g = -1;
        zp20Var.h = -1.0f;
        zp20Var.X = 16777215;
        zp20Var.Y = 16777215;
        return zp20Var;
    }

    public final g611 F(Context context, AttributeSet attributeSet) {
        zp20 zp20Var = new zp20(context, attributeSet);
        zp20Var.e = 0.0f;
        zp20Var.f = 1.0f;
        zp20Var.g = -1;
        zp20Var.h = -1.0f;
        zp20Var.X = 16777215;
        zp20Var.Y = 16777215;
        return zp20Var;
    }

    public final int G0(int i, n611 n611Var, s611 s611Var) {
        if (!k() || (!this.R0 && k())) {
            int iH1 = h1(i, n611Var, s611Var);
            this.k1.clear();
            return iH1;
        }
        int iI1 = i1(i);
        this.c1.d += iI1;
        this.e1.r(-iI1);
        return iI1;
    }

    public final void H0(int i) {
        this.g1 = i;
        this.h1 = os00.INVALID_ID;
        bq20 bq20Var = this.f1;
        if (bq20Var != null) {
            bq20Var.a = -1;
        }
        F0();
    }

    public final int I0(int i, n611 n611Var, s611 s611Var) {
        if (k() || !(this.R0 || k())) {
            int iH1 = h1(i, n611Var, s611Var);
            this.k1.clear();
            return iH1;
        }
        int iI1 = i1(i);
        this.c1.d += iI1;
        this.e1.r(-iI1);
        return iI1;
    }

    public final void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        wic0 wic0Var = new wic0(recyclerView.getContext());
        wic0Var.a = i;
        S0(wic0Var);
    }

    public final int U0(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        int iB = s611Var.b();
        X0();
        View viewZ0 = Z0(iB);
        View viewB1 = b1(iB);
        if (s611Var.b() == 0 || viewZ0 == null || viewB1 == null) {
            return 0;
        }
        return Math.min(this.d1.n(), this.d1.d(viewB1) - this.d1.g(viewZ0));
    }

    public final int V0(s611 s611Var) {
        if (I() == 0) {
            return 0;
        }
        int iB = s611Var.b();
        View viewZ0 = Z0(iB);
        View viewB1 = b1(iB);
        if (s611Var.b() == 0 || viewZ0 == null || viewB1 == null) {
            return 0;
        }
        int iV = a.V(viewZ0);
        int iV2 = a.V(viewB1);
        int iAbs = Math.abs(this.d1.d(viewB1) - this.d1.g(viewZ0));
        int[] iArr = (int[]) this.Y0.c;
        int i = iArr[iV];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iV2] - i) + 1))) + (this.d1.m() - this.d1.g(viewZ0)));
    }

    public final int W0(s611 s611Var) {
        if (I() != 0) {
            int iB = s611Var.b();
            View viewZ0 = Z0(iB);
            View viewB1 = b1(iB);
            if (s611Var.b() != 0 && viewZ0 != null && viewB1 != null) {
                View viewD1 = d1(0, I());
                int iV = viewD1 == null ? -1 : a.V(viewD1);
                View viewD2 = d1(I() - 1, -1);
                return (int) ((Math.abs(this.d1.d(viewB1) - this.d1.g(viewZ0)) / (((viewD2 != null ? a.V(viewD2) : -1) - iV) + 1)) * s611Var.b());
            }
        }
        return 0;
    }

    public final void X0() {
        if (this.d1 != null) {
            return;
        }
        boolean zK = k();
        boolean z = this.R0;
        if (zK) {
            if (z) {
                this.d1 = new vqq0(this);
                this.e1 = new uqq0(this);
                return;
            } else {
                this.d1 = new uqq0(this);
                this.e1 = new vqq0(this);
                return;
            }
        }
        if (z) {
            this.d1 = new uqq0(this);
            this.e1 = new vqq0(this);
        } else {
            this.d1 = new vqq0(this);
            this.e1 = new uqq0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:126:0x0311  */
    /* JADX WARN: Code duplicated, block: B:129:0x033d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0349  */
    /* JADX WARN: Code duplicated, block: B:133:0x037e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0380  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:138:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:139:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.ViewGroup$MarginLayoutParams, p.zp20] */
    /* JADX WARN: Type inference failed for: r6v23, types: [android.view.ViewGroup$MarginLayoutParams, p.zp20] */
    public final int Y0(n611 n611Var, s611 s611Var, aq20 aq20Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float fMax;
        int i4;
        float measuredHeight;
        int i5;
        int i6;
        int i7;
        int i8;
        View viewC;
        int i9;
        int i10;
        int i11;
        ?? r4;
        float f5;
        float f6;
        Rect rect;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        int i14;
        wp20 wp20Var;
        int i15;
        int i16;
        boolean z4;
        int i17;
        int i18;
        float f7;
        float f8;
        float f9;
        float f10;
        float measuredWidth;
        float fMax2;
        int i19;
        int i20;
        int i21;
        View viewC2;
        int i22;
        int i23;
        ?? r6;
        float f11;
        float f12;
        int i24;
        boolean z5;
        wp20 wp20Var2;
        Rect rect2;
        View view;
        int i25 = aq20Var.f;
        if (i25 != Integer.MIN_VALUE) {
            int i26 = aq20Var.a;
            if (i26 < 0) {
                aq20Var.f = i25 + i26;
            }
            j1(n611Var, aq20Var);
        }
        int i27 = aq20Var.a;
        boolean zK = k();
        int i28 = i27;
        int i29 = 0;
        while (true) {
            if (i28 <= 0 && !this.b1.b) {
                break;
            }
            List list = this.X0;
            int i30 = aq20Var.d;
            if (i30 < 0 || i30 >= s611Var.b() || (i = aq20Var.c) < 0 || i >= list.size()) {
                break;
            }
            tp20 tp20Var = (tp20) this.X0.get(aq20Var.c);
            aq20Var.d = tp20Var.o;
            boolean zK2 = k();
            yp20 yp20Var = this.c1;
            boolean z6 = false;
            Rect rect3 = p1;
            wp20 wp20Var3 = this.Y0;
            if (zK2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i31 = ((a) this).O0;
                int i32 = aq20Var.e;
                if (aq20Var.h == -1) {
                    i32 -= tp20Var.g;
                }
                int i33 = i32;
                int i34 = aq20Var.d;
                byte b = this.S0;
                if (b != 0) {
                    i18 = i33;
                    if (b != 1) {
                        if (b == 2) {
                            float f13 = paddingLeft;
                            float f14 = (i31 - tp20Var.e) / 2.0f;
                            f8 = (i31 - paddingRight) - f14;
                            f7 = f13 + f14;
                        } else if (b == 3) {
                            f7 = paddingLeft;
                            int i35 = tp20Var.h;
                            f9 = (i31 - tp20Var.e) / (i35 != 1 ? i35 - 1 : 1.0f);
                            f8 = i31 - paddingRight;
                        } else if (b == 4) {
                            int i36 = tp20Var.h;
                            f9 = i36 != 0 ? (i31 - tp20Var.e) / i36 : 0.0f;
                            float f15 = f9 / 2.0f;
                            f7 = paddingLeft + f15;
                            f8 = (i31 - paddingRight) - f15;
                        } else {
                            if (b != 5) {
                                bhn0.r(this.S0, "Invalid justifyContent is set: ");
                                return 0;
                            }
                            int i37 = tp20Var.h;
                            f9 = i37 != 0 ? (i31 - tp20Var.e) / (i37 + 1) : 0.0f;
                            f7 = paddingLeft + f9;
                            f8 = (i31 - paddingRight) - f9;
                        }
                        float f16 = yp20Var.d;
                        f10 = f7 - f16;
                        measuredWidth = f8 - f16;
                        fMax2 = Math.max(f9, 0.0f);
                        i19 = tp20Var.h;
                        i20 = i34;
                        i21 = 0;
                        while (i20 < i34 + i19) {
                            viewC2 = c(i20);
                            if (viewC2 == null) {
                                wp20Var3 = wp20Var3;
                                i20 = i20;
                                rect2 = rect3;
                            } else {
                                float f17 = measuredWidth;
                                if (aq20Var.h == 1) {
                                    p(rect3, viewC2);
                                    l(viewC2);
                                } else {
                                    p(rect3, viewC2);
                                    m(viewC2, i21, z6);
                                    i21++;
                                }
                                int i38 = i21;
                                long j = ((long[]) wp20Var3.d)[i20];
                                i22 = (int) j;
                                i23 = (int) (j >> 32);
                                r6 = (zp20) viewC2.getLayoutParams();
                                if (n1(viewC2, i22, i23, r6)) {
                                    viewC2.measure(i22, i23);
                                }
                                f11 = f10 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + viewC2.getLayoutParams().b.left;
                                f12 = f17 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + viewC2.getLayoutParams().b.right);
                                i24 = i18 + viewC2.getLayoutParams().b.top;
                                z5 = this.V0;
                                wp20Var2 = this.Y0;
                                if (z5) {
                                    view = viewC2;
                                    rect2 = rect3;
                                    wp20Var2.H(view, tp20Var, Math.round(f12) - viewC2.getMeasuredWidth(), i24, Math.round(f12), viewC2.getMeasuredHeight() + i24);
                                } else {
                                    rect2 = rect3;
                                    view = viewC2;
                                    wp20Var2.H(view, tp20Var, Math.round(f11), i24, view.getMeasuredWidth() + Math.round(f11), view.getMeasuredHeight() + i24);
                                }
                                float measuredWidth2 = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + view.getLayoutParams().b.right + fMax2 + f11;
                                i21 = i38;
                                measuredWidth = f12 - (((view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + view.getLayoutParams().b.left) + fMax2);
                                f10 = measuredWidth2;
                            }
                            i20++;
                            i19 = i19;
                            i34 = i34;
                            zK = zK;
                            rect3 = rect2;
                            wp20Var3 = wp20Var3;
                            z6 = false;
                        }
                        z = zK;
                        aq20Var.c += this.b1.h;
                        i7 = tp20Var.g;
                    } else {
                        int i39 = tp20Var.e;
                        float f18 = (i31 - i39) + paddingRight;
                        float f19 = i39 - paddingLeft;
                        f7 = f18;
                        f8 = f19;
                    }
                } else {
                    i18 = i33;
                    f7 = paddingLeft;
                    f8 = i31 - paddingRight;
                }
                f9 = 0.0f;
                float f110 = yp20Var.d;
                f10 = f7 - f110;
                measuredWidth = f8 - f110;
                fMax2 = Math.max(f9, 0.0f);
                i19 = tp20Var.h;
                i20 = i34;
                i21 = 0;
                while (i20 < i34 + i19) {
                    viewC2 = c(i20);
                    if (viewC2 == null) {
                        wp20Var3 = wp20Var3;
                        i20 = i20;
                        rect2 = rect3;
                    } else {
                        float f111 = measuredWidth;
                        if (aq20Var.h == 1) {
                            p(rect3, viewC2);
                            l(viewC2);
                        } else {
                            p(rect3, viewC2);
                            m(viewC2, i21, z6);
                            i21++;
                        }
                        int i310 = i21;
                        long j2 = ((long[]) wp20Var3.d)[i20];
                        i22 = (int) j2;
                        i23 = (int) (j2 >> 32);
                        r6 = (zp20) viewC2.getLayoutParams();
                        if (n1(viewC2, i22, i23, r6)) {
                            viewC2.measure(i22, i23);
                        }
                        f11 = f10 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + viewC2.getLayoutParams().b.left;
                        f12 = f111 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + viewC2.getLayoutParams().b.right);
                        i24 = i18 + viewC2.getLayoutParams().b.top;
                        z5 = this.V0;
                        wp20Var2 = this.Y0;
                        if (z5) {
                            view = viewC2;
                            rect2 = rect3;
                            wp20Var2.H(view, tp20Var, Math.round(f12) - viewC2.getMeasuredWidth(), i24, Math.round(f12), viewC2.getMeasuredHeight() + i24);
                        } else {
                            rect2 = rect3;
                            view = viewC2;
                            wp20Var2.H(view, tp20Var, Math.round(f11), i24, view.getMeasuredWidth() + Math.round(f11), view.getMeasuredHeight() + i24);
                        }
                        float measuredWidth3 = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + view.getLayoutParams().b.right + fMax2 + f11;
                        i21 = i310;
                        measuredWidth = f12 - (((view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + view.getLayoutParams().b.left) + fMax2);
                        f10 = measuredWidth3;
                    }
                    i20++;
                    i19 = i19;
                    i34 = i34;
                    zK = zK;
                    rect3 = rect2;
                    wp20Var3 = wp20Var3;
                    z6 = false;
                }
                z = zK;
                aq20Var.c += this.b1.h;
                i7 = tp20Var.g;
            } else {
                z = zK;
                Rect rect4 = rect3;
                boolean z7 = true;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i40 = ((a) this).P0;
                int i41 = aq20Var.e;
                if (aq20Var.h == -1) {
                    int i42 = tp20Var.g;
                    i3 = i41 + i42;
                    i2 = i41 - i42;
                } else {
                    i2 = i41;
                    i3 = i2;
                }
                int i43 = aq20Var.d;
                byte b2 = this.S0;
                if (b2 == 0) {
                    f = paddingTop;
                    f2 = i40 - paddingBottom;
                } else if (b2 != 1) {
                    if (b2 == 2) {
                        float f20 = (i40 - tp20Var.e) / 2.0f;
                        f = paddingTop + f20;
                        f2 = (i40 - paddingBottom) - f20;
                    } else if (b2 == 3) {
                        f = paddingTop;
                        int i44 = tp20Var.h;
                        f3 = (i40 - tp20Var.e) / (i44 != 1 ? i44 - 1 : 1.0f);
                        f2 = i40 - paddingBottom;
                    } else if (b2 == 4) {
                        int i45 = tp20Var.h;
                        f3 = i45 != 0 ? (i40 - tp20Var.e) / i45 : 0.0f;
                        float f21 = f3 / 2.0f;
                        f = paddingTop + f21;
                        f2 = (i40 - paddingBottom) - f21;
                    } else {
                        if (b2 != 5) {
                            bhn0.r(this.S0, "Invalid justifyContent is set: ");
                            return 0;
                        }
                        int i46 = tp20Var.h;
                        f3 = i46 != 0 ? (i40 - tp20Var.e) / (i46 + 1) : 0.0f;
                        f = paddingTop + f3;
                        f2 = (i40 - paddingBottom) - f3;
                    }
                    float f22 = yp20Var.d;
                    f4 = f - f22;
                    float f23 = f2 - f22;
                    fMax = Math.max(f3, 0.0f);
                    i4 = tp20Var.h;
                    measuredHeight = f23;
                    i5 = i43;
                    i6 = 0;
                    while (i5 < i43 + i4) {
                        i8 = i43;
                        viewC = c(i5);
                        if (viewC == null) {
                            z4 = z7;
                            i9 = i2;
                            i16 = i4;
                            i17 = i8;
                            rect = rect4;
                            i15 = i5;
                        } else {
                            float f24 = f4;
                            long j3 = ((long[]) wp20Var3.d)[i5];
                            i9 = i2;
                            i10 = (int) j3;
                            i11 = (int) (j3 >> 32);
                            r4 = (zp20) viewC.getLayoutParams();
                            if (n1(viewC, i10, i11, r4)) {
                                viewC.measure(i10, i11);
                            }
                            f5 = f24 + ((ViewGroup.MarginLayoutParams) r4).topMargin + viewC.getLayoutParams().b.top;
                            f6 = measuredHeight - (((ViewGroup.MarginLayoutParams) r4).rightMargin + viewC.getLayoutParams().b.bottom);
                            if (aq20Var.h == 1) {
                                rect = rect4;
                                p(rect, viewC);
                                l(viewC);
                            } else {
                                rect = rect4;
                                p(rect, viewC);
                                m(viewC, i6, false);
                                i6++;
                            }
                            i12 = i9 + viewC.getLayoutParams().b.left;
                            i13 = i3 - viewC.getLayoutParams().b.right;
                            z2 = this.V0;
                            z3 = this.W0;
                            i14 = i4;
                            wp20Var = this.Y0;
                            if (z2) {
                                i15 = i5;
                                i16 = i14;
                                z4 = true;
                                i17 = i8;
                                if (z3) {
                                    wp20Var.I(viewC, tp20Var, z2, i12, Math.round(f6) - viewC.getMeasuredHeight(), viewC.getMeasuredWidth() + i12, Math.round(f6));
                                } else {
                                    wp20Var.I(viewC, tp20Var, z2, i12, Math.round(f5), viewC.getMeasuredWidth() + i12, viewC.getMeasuredHeight() + Math.round(f5));
                                }
                            } else if (z3) {
                                i15 = i5;
                                z4 = true;
                                i16 = i14;
                                i17 = i8;
                                wp20Var.I(viewC, tp20Var, z2, i13 - viewC.getMeasuredWidth(), Math.round(f6) - viewC.getMeasuredHeight(), i13, Math.round(f6));
                            } else {
                                i15 = i5;
                                i16 = i14;
                                z4 = true;
                                i17 = i8;
                                wp20Var.I(viewC, tp20Var, z2, i13 - viewC.getMeasuredWidth(), Math.round(f5), i13, viewC.getMeasuredHeight() + Math.round(f5));
                            }
                            float measuredHeight2 = viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + viewC.getLayoutParams().b.bottom + fMax + f5;
                            measuredHeight = f6 - (((viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin) + viewC.getLayoutParams().b.top) + fMax);
                            f4 = measuredHeight2;
                        }
                        i5 = i15 + 1;
                        rect4 = rect;
                        i2 = i9;
                        i43 = i17;
                        i4 = i16;
                        z7 = z4;
                    }
                    aq20Var.c += this.b1.h;
                    i7 = tp20Var.g;
                } else {
                    int i47 = tp20Var.e;
                    float f25 = (i40 - i47) + paddingBottom;
                    f2 = i47 - paddingTop;
                    f = f25;
                }
                f3 = 0.0f;
                float f26 = yp20Var.d;
                f4 = f - f26;
                float f27 = f2 - f26;
                fMax = Math.max(f3, 0.0f);
                i4 = tp20Var.h;
                measuredHeight = f27;
                i5 = i43;
                i6 = 0;
                while (i5 < i43 + i4) {
                    i8 = i43;
                    viewC = c(i5);
                    if (viewC == null) {
                        z4 = z7;
                        i9 = i2;
                        i16 = i4;
                        i17 = i8;
                        rect = rect4;
                        i15 = i5;
                    } else {
                        float f28 = f4;
                        long j4 = ((long[]) wp20Var3.d)[i5];
                        i9 = i2;
                        i10 = (int) j4;
                        i11 = (int) (j4 >> 32);
                        r4 = (zp20) viewC.getLayoutParams();
                        if (n1(viewC, i10, i11, r4)) {
                            viewC.measure(i10, i11);
                        }
                        f5 = f28 + ((ViewGroup.MarginLayoutParams) r4).topMargin + viewC.getLayoutParams().b.top;
                        f6 = measuredHeight - (((ViewGroup.MarginLayoutParams) r4).rightMargin + viewC.getLayoutParams().b.bottom);
                        if (aq20Var.h == 1) {
                            rect = rect4;
                            p(rect, viewC);
                            l(viewC);
                        } else {
                            rect = rect4;
                            p(rect, viewC);
                            m(viewC, i6, false);
                            i6++;
                        }
                        i12 = i9 + viewC.getLayoutParams().b.left;
                        i13 = i3 - viewC.getLayoutParams().b.right;
                        z2 = this.V0;
                        z3 = this.W0;
                        i14 = i4;
                        wp20Var = this.Y0;
                        if (z2) {
                            i15 = i5;
                            i16 = i14;
                            z4 = true;
                            i17 = i8;
                            if (z3) {
                                wp20Var.I(viewC, tp20Var, z2, i12, Math.round(f6) - viewC.getMeasuredHeight(), viewC.getMeasuredWidth() + i12, Math.round(f6));
                            } else {
                                wp20Var.I(viewC, tp20Var, z2, i12, Math.round(f5), viewC.getMeasuredWidth() + i12, viewC.getMeasuredHeight() + Math.round(f5));
                            }
                        } else if (z3) {
                            i15 = i5;
                            z4 = true;
                            i16 = i14;
                            i17 = i8;
                            wp20Var.I(viewC, tp20Var, z2, i13 - viewC.getMeasuredWidth(), Math.round(f6) - viewC.getMeasuredHeight(), i13, Math.round(f6));
                        } else {
                            i15 = i5;
                            i16 = i14;
                            z4 = true;
                            i17 = i8;
                            wp20Var.I(viewC, tp20Var, z2, i13 - viewC.getMeasuredWidth(), Math.round(f5), i13, viewC.getMeasuredHeight() + Math.round(f5));
                        }
                        float measuredHeight3 = viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + viewC.getLayoutParams().b.bottom + fMax + f5;
                        measuredHeight = f6 - (((viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin) + viewC.getLayoutParams().b.top) + fMax);
                        f4 = measuredHeight3;
                    }
                    i5 = i15 + 1;
                    rect4 = rect;
                    i2 = i9;
                    i43 = i17;
                    i4 = i16;
                    z7 = z4;
                }
                aq20Var.c += this.b1.h;
                i7 = tp20Var.g;
            }
            int i48 = i7;
            i29 += i7;
            if (z || !this.V0) {
                aq20Var.e = (aq20Var.h * i48) + aq20Var.e;
            } else {
                aq20Var.e -= aq20Var.h * i48;
            }
            i28 -= i48;
            zK = z;
            i27 = i27;
        }
        int i49 = i27;
        int i50 = aq20Var.a - i29;
        aq20Var.a = i50;
        int i51 = aq20Var.f;
        if (i51 != Integer.MIN_VALUE) {
            int i52 = i51 + i29;
            aq20Var.f = i52;
            if (i50 < 0) {
                aq20Var.f = i52 + i50;
            }
            j1(n611Var, aq20Var);
        }
        return i49 - aq20Var.a;
    }

    public final View Z0(int i) {
        View viewE1 = e1(0, I(), i);
        if (viewE1 == null) {
            return null;
        }
        int i2 = ((int[]) this.Y0.c)[a.V(viewE1)];
        if (i2 == -1) {
            return null;
        }
        return a1(viewE1, (tp20) this.X0.get(i2));
    }

    public final PointF a(int i) {
        if (I() == 0) {
            return null;
        }
        int i2 = i < a.V(H(0)) ? -1 : 1;
        return k() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View a1(View view, tp20 tp20Var) {
        boolean zK = k();
        int i = tp20Var.h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewH = H(i2);
            if (viewH != null && viewH.getVisibility() != 8) {
                if (!this.V0 || zK) {
                    if (this.d1.g(view) > this.d1.g(viewH)) {
                        view = viewH;
                    }
                } else if (this.d1.d(view) < this.d1.d(viewH)) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // p.rp20
    public final int b(int i, int i2, int i3) {
        return a.J(q(), ((a) this).O0, ((a) this).Z, i2, i3);
    }

    public final View b1(int i) {
        View viewE1 = e1(I() - 1, -1, i);
        if (viewE1 == null) {
            return null;
        }
        return c1(viewE1, (tp20) this.X0.get(((int[]) this.Y0.c)[a.V(viewE1)]));
    }

    @Override // p.rp20
    public final View c(int i) {
        View view = (View) this.k1.get(i);
        return view != null ? view : this.Z0.d(i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View c1(View view, tp20 tp20Var) {
        boolean zK = k();
        int I = (I() - tp20Var.h) - 1;
        for (int I2 = I() - 2; I2 > I; I2--) {
            View viewH = H(I2);
            if (viewH != null && viewH.getVisibility() != 8) {
                if (!this.V0 || zK) {
                    if (this.d1.d(view) < this.d1.d(viewH)) {
                        view = viewH;
                    }
                } else if (this.d1.g(view) > this.d1.g(viewH)) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // p.rp20
    public final int d(int i, int i2, int i3) {
        return a.J(r(), ((a) this).P0, ((a) this).N0, i2, i3);
    }

    public final View d1(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewH = H(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = ((a) this).O0 - getPaddingRight();
            int paddingBottom = ((a) this).P0 - getPaddingBottom();
            int iM = a.M(viewH) - ((ViewGroup.MarginLayoutParams) viewH.getLayoutParams()).leftMargin;
            int iQ = a.Q(viewH) - ((ViewGroup.MarginLayoutParams) viewH.getLayoutParams()).topMargin;
            int iP = a.P(viewH) + ((ViewGroup.MarginLayoutParams) viewH.getLayoutParams()).rightMargin;
            int iL = a.L(viewH) + ((ViewGroup.MarginLayoutParams) viewH.getLayoutParams()).bottomMargin;
            boolean z = iM >= paddingRight || iP >= paddingLeft;
            boolean z2 = iQ >= paddingBottom || iL >= paddingTop;
            if (z && z2) {
                return viewH;
            }
            i += i3;
        }
        return null;
    }

    @Override // p.rp20
    public final void e(View view, int i) {
        this.k1.put(i, view);
    }

    public final View e1(int i, int i2, int i3) {
        X0();
        if (this.b1 == null) {
            aq20 aq20Var = new aq20();
            aq20Var.h = 1;
            this.b1 = aq20Var;
        }
        int iM = this.d1.m();
        int i4 = this.d1.i();
        int i5 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewH = H(i);
            int iV = a.V(viewH);
            if (iV >= 0 && iV < i3) {
                if (viewH.getLayoutParams().a.v()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.d1.g(viewH) >= iM && this.d1.d(viewH) <= i4) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // p.rp20
    public final int f(View view) {
        int i;
        int i2;
        if (k()) {
            i = view.getLayoutParams().b.top;
            i2 = view.getLayoutParams().b.bottom;
        } else {
            i = view.getLayoutParams().b.left;
            i2 = view.getLayoutParams().b.right;
        }
        return i + i2;
    }

    public final void f0(z511 z511Var, z511 z511Var2) {
        A0();
    }

    public final int f1(int i, n611 n611Var, s611 s611Var, boolean z) {
        int iH1;
        int i2;
        if (k() || !this.V0) {
            int i3 = this.d1.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            iH1 = -h1(-i3, n611Var, s611Var);
        } else {
            int iM = i - this.d1.m();
            if (iM <= 0) {
                return 0;
            }
            iH1 = h1(iM, n611Var, s611Var);
        }
        int i4 = i + iH1;
        if (!z || (i2 = this.d1.i() - i4) <= 0) {
            return iH1;
        }
        this.d1.r(i2);
        return i2 + iH1;
    }

    @Override // p.rp20
    public final View g(int i) {
        return c(i);
    }

    public final void g0(RecyclerView recyclerView) {
        this.m1 = (View) recyclerView.getParent();
    }

    public final int g1(int i, n611 n611Var, s611 s611Var, boolean z) {
        int iH1;
        int iM;
        if (k() || !this.V0) {
            int iM2 = i - this.d1.m();
            if (iM2 <= 0) {
                return 0;
            }
            iH1 = -h1(iM2, n611Var, s611Var);
        } else {
            int i2 = this.d1.i() - i;
            if (i2 <= 0) {
                return 0;
            }
            iH1 = h1(-i2, n611Var, s611Var);
        }
        int i3 = i + iH1;
        if (!z || (iM = i3 - this.d1.m()) <= 0) {
            return iH1;
        }
        this.d1.r(-iM);
        return iH1 - iM;
    }

    @Override // p.rp20
    public final int getAlignContent() {
        return 5;
    }

    @Override // p.rp20
    public final int getAlignItems() {
        return this.T0;
    }

    @Override // p.rp20
    public final int getFlexDirection() {
        return this.Q0;
    }

    @Override // p.rp20
    public final int getFlexItemCount() {
        return this.a1.b();
    }

    @Override // p.rp20
    public final List getFlexLinesInternal() {
        return this.X0;
    }

    @Override // p.rp20
    public final int getFlexWrap() {
        return this.R0 ? 1 : 0;
    }

    @Override // p.rp20
    public final int getLargestMainSize() {
        if (this.X0.size() == 0) {
            return 0;
        }
        int size = this.X0.size();
        int iMax = os00.INVALID_ID;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((tp20) this.X0.get(i)).e);
        }
        return iMax;
    }

    @Override // p.rp20
    public final int getMaxLine() {
        return this.U0;
    }

    @Override // p.rp20
    public final int getSumOfCrossSize() {
        int size = this.X0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((tp20) this.X0.get(i2)).g;
        }
        return i;
    }

    @Override // p.rp20
    public final void h(View view, int i, int i2, tp20 tp20Var) {
        p(p1, view);
        if (k()) {
            int i3 = view.getLayoutParams().b.left + view.getLayoutParams().b.right;
            tp20Var.e += i3;
            tp20Var.f += i3;
        } else {
            int i4 = view.getLayoutParams().b.top + view.getLayoutParams().b.bottom;
            tp20Var.e += i4;
            tp20Var.f += i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01e1  */
    public final int h1(int i, n611 n611Var, s611 s611Var) {
        int i2;
        if (I() != 0 && i != 0) {
            X0();
            this.b1.i = true;
            boolean z = !k() && this.V0;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.b1.h = i3;
            boolean zK = k();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((a) this).O0, ((a) this).Z);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((a) this).P0, ((a) this).N0);
            boolean z2 = !zK && this.V0;
            wp20 wp20Var = this.Y0;
            if (i3 == 1) {
                View viewH = H(I() - 1);
                this.b1.e = this.d1.d(viewH);
                int iV = a.V(viewH);
                View viewC1 = c1(viewH, (tp20) this.X0.get(((int[]) wp20Var.c)[iV]));
                aq20 aq20Var = this.b1;
                aq20Var.getClass();
                int i4 = iV + 1;
                aq20Var.d = i4;
                int[] iArr = (int[]) wp20Var.c;
                if (iArr.length <= i4) {
                    aq20Var.c = -1;
                } else {
                    aq20Var.c = iArr[i4];
                }
                dyb0 dyb0Var = this.d1;
                if (z2) {
                    aq20Var.e = dyb0Var.g(viewC1);
                    this.b1.f = this.d1.m() + (-this.d1.g(viewC1));
                    aq20 aq20Var2 = this.b1;
                    int i5 = aq20Var2.f;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    aq20Var2.f = i5;
                } else {
                    aq20Var.e = dyb0Var.d(viewC1);
                    this.b1.f = this.d1.d(viewC1) - this.d1.i();
                }
                int i6 = this.b1.c;
                if ((i6 == -1 || i6 > this.X0.size() - 1) && this.b1.d <= this.a1.b()) {
                    aq20 aq20Var3 = this.b1;
                    int i7 = iAbs - aq20Var3.f;
                    up20 up20Var = this.o1;
                    up20Var.b = null;
                    up20Var.a = 0;
                    if (i7 > 0) {
                        wp20 wp20Var2 = this.Y0;
                        if (zK) {
                            wp20Var2.k(up20Var, iMakeMeasureSpec, iMakeMeasureSpec2, i7, aq20Var3.d, -1, this.X0);
                        } else {
                            wp20Var2.k(up20Var, iMakeMeasureSpec2, iMakeMeasureSpec, i7, aq20Var3.d, -1, this.X0);
                            iMakeMeasureSpec2 = iMakeMeasureSpec2;
                            iMakeMeasureSpec = iMakeMeasureSpec;
                        }
                        wp20Var.r(iMakeMeasureSpec, iMakeMeasureSpec2, this.b1.d);
                        wp20Var.V(this.b1.d);
                    }
                }
            } else {
                View viewH2 = H(0);
                this.b1.e = this.d1.g(viewH2);
                int iV2 = a.V(viewH2);
                View viewA1 = a1(viewH2, (tp20) this.X0.get(((int[]) wp20Var.c)[iV2]));
                aq20 aq20Var4 = this.b1;
                aq20Var4.getClass();
                int i8 = ((int[]) wp20Var.c)[iV2];
                if (i8 == -1) {
                    i8 = 0;
                }
                if (i8 > 0) {
                    tp20 tp20Var = (tp20) this.X0.get(i8 - 1);
                    aq20Var4 = this.b1;
                    aq20Var4.d = iV2 - tp20Var.h;
                } else {
                    aq20Var4.d = -1;
                }
                aq20Var4.c = i8 > 0 ? i8 - 1 : 0;
                dyb0 dyb0Var2 = this.d1;
                if (z2) {
                    aq20Var4.e = dyb0Var2.d(viewA1);
                    this.b1.f = this.d1.d(viewA1) - this.d1.i();
                    aq20 aq20Var5 = this.b1;
                    int i9 = aq20Var5.f;
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    aq20Var5.f = i9;
                } else {
                    aq20Var4.e = dyb0Var2.g(viewA1);
                    this.b1.f = this.d1.m() + (-this.d1.g(viewA1));
                }
            }
            aq20 aq20Var6 = this.b1;
            int i10 = aq20Var6.f;
            aq20Var6.a = iAbs - i10;
            int iY0 = Y0(n611Var, s611Var, aq20Var6) + i10;
            if (iY0 >= 0) {
                if (z) {
                    if (iAbs > iY0) {
                        i2 = (-i3) * iY0;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iY0) {
                    i2 = i3 * iY0;
                } else {
                    i2 = i;
                }
                this.d1.r(-i2);
                this.b1.g = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // p.rp20
    public final int i(View view, int i, int i2) {
        int i3;
        int i4;
        if (k()) {
            i3 = view.getLayoutParams().b.left;
            i4 = view.getLayoutParams().b.right;
        } else {
            i3 = view.getLayoutParams().b.top;
            i4 = view.getLayoutParams().b.bottom;
        }
        return i3 + i4;
    }

    public final int i1(int i) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        X0();
        boolean zK = k();
        View view = this.m1;
        int width = zK ? view.getWidth() : view.getHeight();
        int i2 = zK ? ((a) this).O0 : ((a) this).P0;
        int iS = S();
        yp20 yp20Var = this.c1;
        if (iS == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + yp20Var.d) - width, iAbs);
            }
            int i3 = yp20Var.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - yp20Var.d) - width, i);
            }
            int i4 = yp20Var.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[EDGE_INSN: B:83:0x010f->B:89:? BREAK  A[LOOP:2: B:46:0x00c1->B:62:0x010b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x010b A[SYNTHETIC] */
    public final void j1(n611 n611Var, aq20 aq20Var) {
        int I;
        if (aq20Var.i) {
            int i = aq20Var.h;
            int i2 = aq20Var.f;
            wp20 wp20Var = this.Y0;
            int i3 = -1;
            if (i != -1) {
                if (i2 >= 0 && (I = I()) != 0) {
                    int i4 = 0;
                    int i5 = ((int[]) wp20Var.c)[a.V(H(0))];
                    if (i5 == -1) {
                        return;
                    }
                    tp20 tp20Var = (tp20) this.X0.get(i5);
                    while (true) {
                        if (i4 < I) {
                            View viewH = H(i4);
                            int i6 = aq20Var.f;
                            if (k() || !this.V0) {
                                if (this.d1.d(viewH) <= i6) {
                                    if (tp20Var.f141p != a.V(viewH)) {
                                        if (i5 >= this.X0.size() - 1) {
                                            break;
                                        }
                                        i5 += aq20Var.h;
                                        tp20Var = (tp20) this.X0.get(i5);
                                        i3 = i4;
                                    }
                                    i4++;
                                }
                            } else if (this.d1.h() - this.d1.g(viewH) <= i6) {
                                if (tp20Var.f141p != a.V(viewH)) {
                                    if (i5 >= this.X0.size() - 1) {
                                        break;
                                        break;
                                    } else {
                                        i5 += aq20Var.h;
                                        tp20Var = (tp20) this.X0.get(i5);
                                        i3 = i4;
                                    }
                                }
                                i4++;
                            }
                        }
                        i4 = i3;
                        break;
                    }
                    while (i4 >= 0) {
                        View viewH2 = H(i4);
                        if (H(i4) != null) {
                            ((a) this).a.f(i4);
                        }
                        n611Var.i(viewH2);
                        i4--;
                    }
                    return;
                }
                return;
            }
            if (i2 < 0) {
                return;
            }
            this.d1.h();
            int I2 = I();
            if (I2 == 0) {
                return;
            }
            int i7 = I2 - 1;
            int i8 = ((int[]) wp20Var.c)[a.V(H(i7))];
            if (i8 == -1) {
                return;
            }
            tp20 tp20Var2 = (tp20) this.X0.get(i8);
            for (int i9 = i7; i9 >= 0; i9--) {
                View viewH3 = H(i9);
                int i10 = aq20Var.f;
                if (!k() && this.V0) {
                    if (this.d1.d(viewH3) > i10) {
                        break;
                    }
                    if (tp20Var2.o != a.V(viewH3)) {
                        if (i8 <= 0) {
                            I2 = i9;
                            break;
                        } else {
                            i8 += aq20Var.h;
                            tp20Var2 = (tp20) this.X0.get(i8);
                            I2 = i9;
                        }
                    }
                } else {
                    if (this.d1.g(viewH3) < this.d1.h() - i10) {
                        break;
                    }
                    if (tp20Var2.o != a.V(viewH3)) {
                        if (i8 <= 0) {
                            I2 = i9;
                            break;
                        } else {
                            i8 += aq20Var.h;
                            tp20Var2 = (tp20) this.X0.get(i8);
                            I2 = i9;
                        }
                    }
                }
            }
            while (i7 >= I2) {
                View viewH4 = H(i7);
                if (H(i7) != null) {
                    ((a) this).a.f(i7);
                }
                n611Var.i(viewH4);
                i7--;
            }
        }
    }

    @Override // p.rp20
    public final boolean k() {
        byte b = this.Q0;
        return b == 0 || b == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(int i) {
        byte b = this.T0;
        if (b != i) {
            if (b == 4 || i == 4) {
                A0();
                this.X0.clear();
                yp20 yp20Var = this.c1;
                yp20Var.b();
                yp20Var.d = 0;
            }
            this.T0 = i;
            F0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l1(int i) {
        if (this.Q0 != i) {
            A0();
            this.Q0 = i;
            this.d1 = null;
            this.e1 = null;
            this.X0.clear();
            yp20 yp20Var = this.c1;
            yp20Var.b();
            yp20Var.d = 0;
            F0();
        }
    }

    public final void m1(int i) {
        boolean z = this.R0;
        if (!z) {
            if (!z) {
                A0();
                this.X0.clear();
                yp20 yp20Var = this.c1;
                yp20Var.b();
                yp20Var.d = 0;
            }
            this.R0 = true;
            this.d1 = null;
            this.e1 = null;
            F0();
        }
    }

    public final void n0(RecyclerView recyclerView, int i, int i2) {
        o1(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n1(View view, int i, int i2, zp20 zp20Var) {
        return (!view.isLayoutRequested() && ((a) this).i && a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) zp20Var).width) && a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) zp20Var).height)) ? false : true;
    }

    public final void o1(int i) {
        View viewD1 = d1(I() - 1, -1);
        if (i >= (viewD1 != null ? a.V(viewD1) : -1)) {
            return;
        }
        int I = I();
        wp20 wp20Var = this.Y0;
        wp20Var.t(I);
        wp20Var.u(I);
        wp20Var.s(I);
        if (i >= ((int[]) wp20Var.c).length) {
            return;
        }
        this.n1 = i;
        View viewH = H(0);
        if (viewH == null) {
            return;
        }
        this.g1 = a.V(viewH);
        if (k() || !this.V0) {
            this.h1 = this.d1.g(viewH) - this.d1.m();
        } else {
            this.h1 = this.d1.j() + this.d1.d(viewH);
        }
    }

    public final void p0(RecyclerView recyclerView, int i, int i2) {
        o1(Math.min(i, i2));
    }

    public final void p1(yp20 yp20Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = k() ? ((a) this).N0 : ((a) this).Z;
            this.b1.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.b1.b = false;
        }
        if (k() || !this.V0) {
            this.b1.a = this.d1.i() - yp20Var.c;
        } else {
            this.b1.a = yp20Var.c - getPaddingRight();
        }
        aq20 aq20Var = this.b1;
        aq20Var.d = yp20Var.a;
        aq20Var.h = 1;
        aq20Var.e = yp20Var.c;
        aq20Var.f = os00.INVALID_ID;
        aq20Var.c = yp20Var.b;
        if (!z || this.X0.size() <= 1 || (i = yp20Var.b) < 0 || i >= this.X0.size() - 1) {
            return;
        }
        tp20 tp20Var = (tp20) this.X0.get(yp20Var.b);
        aq20 aq20Var2 = this.b1;
        aq20Var2.c++;
        aq20Var2.d += tp20Var.h;
    }

    public final boolean q() {
        if (!this.R0) {
            return k();
        }
        if (!k()) {
            return true;
        }
        int i = ((a) this).O0;
        View view = this.m1;
        return i > (view != null ? view.getWidth() : 0);
    }

    public final void q0(RecyclerView recyclerView, int i, int i2) {
        o1(i);
    }

    public final void q1(yp20 yp20Var, boolean z, boolean z2) {
        if (z2) {
            int i = k() ? ((a) this).N0 : ((a) this).Z;
            this.b1.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.b1.b = false;
        }
        if (k() || !this.V0) {
            this.b1.a = yp20Var.c - this.d1.m();
        } else {
            this.b1.a = (this.m1.getWidth() - yp20Var.c) - this.d1.m();
        }
        aq20 aq20Var = this.b1;
        aq20Var.d = yp20Var.a;
        aq20Var.h = -1;
        aq20Var.e = yp20Var.c;
        aq20Var.f = os00.INVALID_ID;
        int i2 = yp20Var.b;
        aq20Var.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.X0.size();
        int i3 = yp20Var.b;
        if (size > i3) {
            tp20 tp20Var = (tp20) this.X0.get(i3);
            aq20 aq20Var2 = this.b1;
            aq20Var2.c--;
            aq20Var2.d -= tp20Var.h;
        }
    }

    public final boolean r() {
        if (!this.R0) {
            return !k();
        }
        if (!k()) {
            int i = ((a) this).P0;
            View view = this.m1;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final void r0(int i) {
        o1(i);
    }

    public final boolean s(g611 g611Var) {
        return g611Var instanceof zp20;
    }

    public final void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        o1(i);
        o1(i);
    }

    @Override // p.rp20
    public final void setFlexLines(List list) {
        this.X0 = list;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018e  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01be  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211  */
    /* JADX WARN: Code duplicated, block: B:137:0x0217  */
    /* JADX WARN: Code duplicated, block: B:140:0x0224  */
    /* JADX WARN: Code duplicated, block: B:141:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(n611 n611Var, s611 s611Var) {
        View viewZ0;
        FlexboxLayoutManager flexboxLayoutManager;
        dyb0 dyb0Var;
        int iV;
        int i;
        int size;
        int i2;
        int i3;
        View viewD;
        boolean z;
        int iG;
        dyb0 dyb0Var2;
        boolean z2;
        dyb0 dyb0Var3;
        int iG2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.Z0 = n611Var;
        this.a1 = s611Var;
        int iB = s611Var.b();
        if (iB == 0 && s611Var.g) {
            return;
        }
        int iS = S();
        byte b = this.Q0;
        if (b == 0) {
            this.V0 = iS == 1;
            this.W0 = this.R0 == 2;
        } else if (b == 1) {
            this.V0 = iS != 1;
            this.W0 = this.R0 == 2;
        } else if (b == 2) {
            boolean z5 = iS == 1;
            this.V0 = z5;
            if (this.R0 == 2) {
                this.V0 = !z5;
            }
            this.W0 = false;
        } else if (b != 3) {
            this.V0 = false;
            this.W0 = false;
        } else {
            boolean z6 = iS == 1;
            this.V0 = z6;
            if (this.R0 == 2) {
                this.V0 = !z6;
            }
            this.W0 = true;
        }
        X0();
        if (this.b1 == null) {
            aq20 aq20Var = new aq20();
            aq20Var.h = 1;
            this.b1 = aq20Var;
        }
        wp20 wp20Var = this.Y0;
        wp20Var.t(iB);
        wp20Var.u(iB);
        wp20Var.s(iB);
        this.b1.i = false;
        bq20 bq20Var = this.f1;
        if (bq20Var != null && (i7 = bq20Var.a) >= 0 && i7 < iB) {
            this.g1 = i7;
        }
        yp20 yp20Var = this.c1;
        if (!yp20Var.f || this.g1 != -1 || bq20Var != null) {
            yp20Var.b();
            bq20 bq20Var2 = this.f1;
            if (s611Var.g || (i3 = this.g1) == -1) {
                if (I() != 0) {
                    if (yp20Var.e) {
                        viewZ0 = b1(s611Var.b());
                    } else {
                        viewZ0 = Z0(s611Var.b());
                    }
                    if (viewZ0 != null) {
                        flexboxLayoutManager = yp20Var.h;
                        if (flexboxLayoutManager.R0) {
                            dyb0Var = flexboxLayoutManager.d1;
                        } else {
                            dyb0Var = flexboxLayoutManager.e1;
                        }
                        if (flexboxLayoutManager.k() && flexboxLayoutManager.V0) {
                            if (yp20Var.e) {
                                yp20Var.c = dyb0Var.o() + dyb0Var.g(viewZ0);
                            } else {
                                yp20Var.c = dyb0Var.d(viewZ0);
                            }
                        } else if (yp20Var.e) {
                            yp20Var.c = dyb0Var.o() + dyb0Var.d(viewZ0);
                        } else {
                            yp20Var.c = dyb0Var.g(viewZ0);
                        }
                        iV = a.V(viewZ0);
                        yp20Var.a = iV;
                        yp20Var.g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.Y0.c;
                        if (iV == -1) {
                            iV = 0;
                        }
                        i = iArr[iV];
                        if (i == -1) {
                            i = 0;
                        }
                        yp20Var.b = i;
                        size = flexboxLayoutManager.X0.size();
                        i2 = yp20Var.b;
                        if (size > i2) {
                            yp20Var.a = ((tp20) flexboxLayoutManager.X0.get(i2)).o;
                        }
                    } else {
                        yp20Var.a();
                        yp20Var.a = 0;
                        yp20Var.b = 0;
                    }
                } else {
                    yp20Var.a();
                    yp20Var.a = 0;
                    yp20Var.b = 0;
                }
            } else if (i3 < 0 || i3 >= s611Var.b()) {
                this.g1 = -1;
                this.h1 = os00.INVALID_ID;
                if (I() != 0) {
                    if (yp20Var.e) {
                        viewZ0 = b1(s611Var.b());
                    } else {
                        viewZ0 = Z0(s611Var.b());
                    }
                    if (viewZ0 != null) {
                        flexboxLayoutManager = yp20Var.h;
                        if (flexboxLayoutManager.R0) {
                            dyb0Var = flexboxLayoutManager.e1;
                        } else {
                            dyb0Var = flexboxLayoutManager.d1;
                        }
                        if (flexboxLayoutManager.k()) {
                            if (yp20Var.e) {
                                yp20Var.c = dyb0Var.o() + dyb0Var.d(viewZ0);
                            } else {
                                yp20Var.c = dyb0Var.g(viewZ0);
                            }
                        } else if (yp20Var.e) {
                            yp20Var.c = dyb0Var.o() + dyb0Var.d(viewZ0);
                        } else {
                            yp20Var.c = dyb0Var.g(viewZ0);
                        }
                        iV = a.V(viewZ0);
                        yp20Var.a = iV;
                        yp20Var.g = false;
                        int[] iArr2 = (int[]) flexboxLayoutManager.Y0.c;
                        if (iV == -1) {
                            iV = 0;
                        }
                        i = iArr2[iV];
                        if (i == -1) {
                            i = 0;
                        }
                        yp20Var.b = i;
                        size = flexboxLayoutManager.X0.size();
                        i2 = yp20Var.b;
                        if (size > i2) {
                            yp20Var.a = ((tp20) flexboxLayoutManager.X0.get(i2)).o;
                        }
                    } else {
                        yp20Var.a();
                        yp20Var.a = 0;
                        yp20Var.b = 0;
                    }
                } else {
                    yp20Var.a();
                    yp20Var.a = 0;
                    yp20Var.b = 0;
                }
            } else {
                int i8 = this.g1;
                yp20Var.a = i8;
                yp20Var.b = ((int[]) wp20Var.c)[i8];
                bq20 bq20Var3 = this.f1;
                if (bq20Var3 != null) {
                    int iB2 = s611Var.b();
                    int i9 = bq20Var3.a;
                    if (i9 >= 0 && i9 < iB2) {
                        yp20Var.c = this.d1.m() + bq20Var2.b;
                        yp20Var.g = true;
                        yp20Var.b = -1;
                    } else if (this.h1 == Integer.MIN_VALUE) {
                        viewD = D(this.g1);
                        if (viewD != null) {
                            if (I() > 0) {
                                if (this.g1 < a.V(H(0))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                yp20Var.e = z;
                            }
                            yp20Var.a();
                        } else if (this.d1.e(viewD) > this.d1.n()) {
                            yp20Var.a();
                        } else {
                            iG = this.d1.g(viewD) - this.d1.m();
                            dyb0Var2 = this.d1;
                            if (iG < 0) {
                                yp20Var.c = dyb0Var2.m();
                                yp20Var.e = false;
                            } else if (dyb0Var2.i() - this.d1.d(viewD) < 0) {
                                yp20Var.c = this.d1.i();
                                yp20Var.e = true;
                            } else {
                                z2 = yp20Var.e;
                                dyb0Var3 = this.d1;
                                if (z2) {
                                    iG2 = this.d1.o() + dyb0Var3.d(viewD);
                                } else {
                                    iG2 = dyb0Var3.g(viewD);
                                }
                                yp20Var.c = iG2;
                            }
                        }
                    } else if (k() && this.V0) {
                        yp20Var.c = this.h1 - this.d1.j();
                    } else {
                        yp20Var.c = this.d1.m() + this.h1;
                    }
                } else if (this.h1 == Integer.MIN_VALUE) {
                    viewD = D(this.g1);
                    if (viewD != null) {
                        if (I() > 0) {
                            if (this.g1 < a.V(H(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            yp20Var.e = z;
                        }
                        yp20Var.a();
                    } else if (this.d1.e(viewD) > this.d1.n()) {
                        yp20Var.a();
                    } else {
                        iG = this.d1.g(viewD) - this.d1.m();
                        dyb0Var2 = this.d1;
                        if (iG < 0) {
                            yp20Var.c = dyb0Var2.m();
                            yp20Var.e = false;
                        } else if (dyb0Var2.i() - this.d1.d(viewD) < 0) {
                            yp20Var.c = this.d1.i();
                            yp20Var.e = true;
                        } else {
                            z2 = yp20Var.e;
                            dyb0Var3 = this.d1;
                            if (z2) {
                                iG2 = this.d1.o() + dyb0Var3.d(viewD);
                            } else {
                                iG2 = dyb0Var3.g(viewD);
                            }
                            yp20Var.c = iG2;
                        }
                    }
                } else if (k()) {
                    yp20Var.c = this.d1.m() + this.h1;
                } else {
                    yp20Var.c = this.d1.m() + this.h1;
                }
            }
            yp20Var.f = true;
        }
        C(n611Var);
        if (yp20Var.e) {
            q1(yp20Var, false, true);
        } else {
            p1(yp20Var, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((a) this).O0, ((a) this).Z);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((a) this).P0, ((a) this).N0);
        int i10 = ((a) this).O0;
        int i11 = ((a) this).P0;
        boolean zK = k();
        Context context = this.l1;
        if (zK) {
            int i12 = this.i1;
            z3 = (i12 == Integer.MIN_VALUE || i12 == i10) ? false : true;
            aq20 aq20Var2 = this.b1;
            i4 = aq20Var2.b ? context.getResources().getDisplayMetrics().heightPixels : aq20Var2.a;
        } else {
            int i13 = this.j1;
            z3 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            aq20 aq20Var3 = this.b1;
            i4 = aq20Var3.b ? context.getResources().getDisplayMetrics().widthPixels : aq20Var3.a;
        }
        int i14 = i4;
        this.i1 = i10;
        this.j1 = i11;
        int i15 = this.n1;
        up20 up20Var = this.o1;
        if (i15 != -1 || (this.g1 == -1 && !z3)) {
            int iMin = yp20Var.a;
            if (i15 != -1) {
                iMin = Math.min(i15, iMin);
            }
            up20Var.b = null;
            up20Var.a = 0;
            boolean zK2 = k();
            List list = this.X0;
            if (zK2) {
                if (list.size() > 0) {
                    wp20Var.m(iMin, this.X0);
                    this.Y0.k(this.o1, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, yp20Var.a, this.X0);
                } else {
                    wp20Var.s(iB);
                    this.Y0.k(this.o1, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, -1, this.X0);
                }
            } else if (list.size() > 0) {
                wp20Var.m(iMin, this.X0);
                int i16 = iMin;
                this.Y0.k(this.o1, iMakeMeasureSpec2, iMakeMeasureSpec, i14, i16, yp20Var.a, this.X0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i16;
            } else {
                wp20Var.s(iB);
                this.Y0.k(this.o1, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, -1, this.X0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.X0 = (List) up20Var.b;
            wp20Var.r(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            wp20Var.V(iMin);
        } else if (!yp20Var.e) {
            this.X0.clear();
            up20Var.b = null;
            up20Var.a = 0;
            boolean zK3 = k();
            int i17 = yp20Var.a;
            wp20 wp20Var2 = this.Y0;
            up20 up20Var2 = this.o1;
            if (zK3) {
                wp20Var2.k(up20Var2, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, i17, this.X0);
            } else {
                wp20Var2.k(up20Var2, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, i17, this.X0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.X0 = (List) up20Var.b;
            wp20Var.r(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            wp20Var.V(0);
            int i18 = ((int[]) wp20Var.c)[yp20Var.a];
            yp20Var.b = i18;
            this.b1.c = i18;
        }
        boolean z7 = yp20Var.e;
        aq20 aq20Var4 = this.b1;
        if (z7) {
            Y0(n611Var, s611Var, aq20Var4);
            i6 = this.b1.e;
            z4 = true;
            p1(yp20Var, true, false);
            Y0(n611Var, s611Var, this.b1);
            i5 = this.b1.e;
        } else {
            z4 = true;
            Y0(n611Var, s611Var, aq20Var4);
            i5 = this.b1.e;
            q1(yp20Var, true, false);
            Y0(n611Var, s611Var, this.b1);
            i6 = this.b1.e;
        }
        if (I() > 0) {
            if (yp20Var.e) {
                g1(f1(i5, n611Var, s611Var, z4) + i6, n611Var, s611Var, false);
            } else {
                f1(g1(i6, n611Var, s611Var, z4) + i5, n611Var, s611Var, false);
            }
        }
    }

    public final void u0(s611 s611Var) {
        this.f1 = null;
        this.g1 = -1;
        this.h1 = os00.INVALID_ID;
        this.n1 = -1;
        this.c1.b();
        this.k1.clear();
    }

    public final int w(s611 s611Var) {
        return U0(s611Var);
    }

    public final void w0(Parcelable parcelable) {
        if (parcelable instanceof bq20) {
            this.f1 = (bq20) parcelable;
            F0();
        }
    }

    public final int x(s611 s611Var) {
        return V0(s611Var);
    }

    public final Parcelable x0() {
        bq20 bq20Var = this.f1;
        if (bq20Var != null) {
            bq20 bq20Var2 = new bq20();
            bq20Var2.a = bq20Var.a;
            bq20Var2.b = bq20Var.b;
            return bq20Var2;
        }
        bq20 bq20Var3 = new bq20();
        if (I() <= 0) {
            bq20Var3.a = -1;
            return bq20Var3;
        }
        View viewH = H(0);
        bq20Var3.a = a.V(viewH);
        bq20Var3.b = this.d1.g(viewH) - this.d1.m();
        return bq20Var3;
    }

    public final int y(s611 s611Var) {
        return W0(s611Var);
    }

    public final int z(s611 s611Var) {
        return U0(s611Var);
    }

    @Override // p.rp20
    public final void j(tp20 tp20Var) {
    }

    public final void h0(RecyclerView recyclerView, n611 n611Var) {
    }

    public FlexboxLayoutManager(Context context) {
        l1(0);
        m1(1);
        k1(4);
        ((a) this).h = true;
        this.l1 = context;
    }
}
