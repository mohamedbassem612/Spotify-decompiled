package p;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ffh0 extends q5t0 implements afh0, bm3, fnm0 {
    public iu30 N0;
    public be50 O0;
    public float P0;
    public Object R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X;
    public boolean Y;
    public boolean a1;
    public final efh0 c1;
    public final efh0 d1;
    public float e1;
    public final lmb0 f;
    public boolean f1;
    public boolean g;
    public iu30 g1;
    public be50 h1;
    public float j1;
    public final efh0 k1;
    public boolean l1;
    public boolean t;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int m1 = 3;
    public long Z = 0;
    public boolean Q0 = true;
    public final imb0 X0 = new imb0(this);
    public final bfn0 Y0 = new bfn0(0, new ffh0[16]);
    public boolean Z0 = true;
    public long b1 = jjl.b(0, 0, 0, 0, 15);
    public long i1 = 0;

    /* JADX WARN: Type inference failed for: r2v4, types: [p.efh0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [p.efh0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [p.efh0] */
    public ffh0(lmb0 lmb0Var) {
        this.f = lmb0Var;
        final byte b = 1;
        final byte b2 = 0;
        this.c1 = new Function0(this) { // from class: p.efh0
            public final /* synthetic */ ffh0 b;

            {
                this.b = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invoke() throws KotlinNothingValueException {
                byte b3 = b2;
                rih1 rih1Var = rih1.a;
                ffh0 ffh0Var = this.b;
                switch (b3) {
                    case 0:
                        ffh0Var.f.a().H(ffh0Var.b1);
                        break;
                    case 1:
                        lmb0 lmb0Var2 = ffh0Var.f;
                        lmb0Var2.i = 0;
                        hmb0 hmb0Var = lmb0Var2.a;
                        bfn0 bfn0VarA = hmb0Var.A();
                        Object[] objArr = bfn0VarA.a;
                        int i = bfn0VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            ffh0 ffh0Var2 = ((hmb0) objArr[i2]).f1.f68p;
                            ffh0Var2.h = ffh0Var2.i;
                            ffh0Var2.i = Integer.MAX_VALUE;
                            ffh0Var2.T0 = false;
                            if (ffh0Var2.m1 == 2) {
                                ffh0Var2.m1 = 3;
                            }
                        }
                        bfn0 bfn0VarA2 = hmb0Var.A();
                        Object[] objArr2 = bfn0VarA2.a;
                        int i3 = bfn0VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((hmb0) objArr2[i4]).f1.f68p.X0.q(false);
                        }
                        if (ffh0Var.r().O0) {
                            afn0 afn0VarO = hmb0Var.o();
                            int size = afn0VarO.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((ndo0) ((hmb0) afn0VarO.get(i5)).e1.e).O0 = true;
                            }
                        }
                        ffh0Var.r().A0().a();
                        if (ffh0Var.r().O0) {
                            afn0 afn0VarO2 = hmb0Var.o();
                            int size2 = afn0VarO2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ((ndo0) ((hmb0) afn0VarO2.get(i6)).e1.e).O0 = false;
                            }
                        }
                        bfn0 bfn0VarA3 = hmb0Var.A();
                        Object[] objArr3 = bfn0VarA3.a;
                        int i7 = bfn0VarA3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            hmb0 hmb0Var2 = (hmb0) objArr3[i8];
                            lmb0 lmb0Var3 = hmb0Var2.f1;
                            if (lmb0Var3.f68p.h != hmb0Var2.w()) {
                                hmb0Var.P();
                                hmb0Var.D();
                                if (hmb0Var2.w() == Integer.MAX_VALUE) {
                                    if (lmb0Var3.c || gio1.y(hmb0Var2)) {
                                        c6f0 c6f0Var = lmb0Var3.q;
                                        c6f0Var.getClass();
                                        c6f0Var.o0(false);
                                    }
                                    lmb0Var3.f68p.r0();
                                }
                            }
                        }
                        bfn0 bfn0VarA4 = hmb0Var.A();
                        Object[] objArr4 = bfn0VarA4.a;
                        int i9 = bfn0VarA4.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            imb0 imb0Var = ((hmb0) objArr4[i10]).f1.f68p.X0;
                            imb0Var.n(imb0Var.i());
                        }
                        break;
                    default:
                        lmb0 lmb0Var4 = ffh0Var.f;
                        ndo0 ndo0Var = lmb0Var4.a().Y0;
                        y5f0 placementScope = ndo0Var != null ? ndo0Var.P0 : ((ha4) kmb0.a(lmb0Var4.a)).getPlacementScope();
                        iu30 iu30Var = ffh0Var.g1;
                        be50 be50Var = ffh0Var.h1;
                        if (be50Var != null) {
                            ndo0 ndo0VarA = lmb0Var4.a();
                            long j = ffh0Var.i1;
                            float f = ffh0Var.j1;
                            placementScope.e(ndo0VarA);
                            ndo0VarA.f0(qr80.d(j, ndo0VarA.e), f, be50Var);
                        } else if (iu30Var == null) {
                            ndo0 ndo0VarA2 = lmb0Var4.a();
                            long j2 = ffh0Var.i1;
                            float f2 = ffh0Var.j1;
                            placementScope.e(ndo0VarA2);
                            ndo0VarA2.e0(qr80.d(j2, ndo0VarA2.e), f2, null);
                        } else {
                            ndo0 ndo0VarA3 = lmb0Var4.a();
                            long j3 = ffh0Var.i1;
                            float f3 = ffh0Var.j1;
                            placementScope.e(ndo0VarA3);
                            ndo0VarA3.e0(qr80.d(j3, ndo0VarA3.e), f3, iu30Var);
                        }
                        break;
                }
                return rih1Var;
            }
        };
        this.d1 = new Function0(this) { // from class: p.efh0
            public final /* synthetic */ ffh0 b;

            {
                this.b = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invoke() throws KotlinNothingValueException {
                byte b3 = b;
                rih1 rih1Var = rih1.a;
                ffh0 ffh0Var = this.b;
                switch (b3) {
                    case 0:
                        ffh0Var.f.a().H(ffh0Var.b1);
                        break;
                    case 1:
                        lmb0 lmb0Var2 = ffh0Var.f;
                        lmb0Var2.i = 0;
                        hmb0 hmb0Var = lmb0Var2.a;
                        bfn0 bfn0VarA = hmb0Var.A();
                        Object[] objArr = bfn0VarA.a;
                        int i = bfn0VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            ffh0 ffh0Var2 = ((hmb0) objArr[i2]).f1.f68p;
                            ffh0Var2.h = ffh0Var2.i;
                            ffh0Var2.i = Integer.MAX_VALUE;
                            ffh0Var2.T0 = false;
                            if (ffh0Var2.m1 == 2) {
                                ffh0Var2.m1 = 3;
                            }
                        }
                        bfn0 bfn0VarA2 = hmb0Var.A();
                        Object[] objArr2 = bfn0VarA2.a;
                        int i3 = bfn0VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((hmb0) objArr2[i4]).f1.f68p.X0.q(false);
                        }
                        if (ffh0Var.r().O0) {
                            afn0 afn0VarO = hmb0Var.o();
                            int size = afn0VarO.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((ndo0) ((hmb0) afn0VarO.get(i5)).e1.e).O0 = true;
                            }
                        }
                        ffh0Var.r().A0().a();
                        if (ffh0Var.r().O0) {
                            afn0 afn0VarO2 = hmb0Var.o();
                            int size2 = afn0VarO2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ((ndo0) ((hmb0) afn0VarO2.get(i6)).e1.e).O0 = false;
                            }
                        }
                        bfn0 bfn0VarA3 = hmb0Var.A();
                        Object[] objArr3 = bfn0VarA3.a;
                        int i7 = bfn0VarA3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            hmb0 hmb0Var2 = (hmb0) objArr3[i8];
                            lmb0 lmb0Var3 = hmb0Var2.f1;
                            if (lmb0Var3.f68p.h != hmb0Var2.w()) {
                                hmb0Var.P();
                                hmb0Var.D();
                                if (hmb0Var2.w() == Integer.MAX_VALUE) {
                                    if (lmb0Var3.c || gio1.y(hmb0Var2)) {
                                        c6f0 c6f0Var = lmb0Var3.q;
                                        c6f0Var.getClass();
                                        c6f0Var.o0(false);
                                    }
                                    lmb0Var3.f68p.r0();
                                }
                            }
                        }
                        bfn0 bfn0VarA4 = hmb0Var.A();
                        Object[] objArr4 = bfn0VarA4.a;
                        int i9 = bfn0VarA4.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            imb0 imb0Var = ((hmb0) objArr4[i10]).f1.f68p.X0;
                            imb0Var.n(imb0Var.i());
                        }
                        break;
                    default:
                        lmb0 lmb0Var4 = ffh0Var.f;
                        ndo0 ndo0Var = lmb0Var4.a().Y0;
                        y5f0 placementScope = ndo0Var != null ? ndo0Var.P0 : ((ha4) kmb0.a(lmb0Var4.a)).getPlacementScope();
                        iu30 iu30Var = ffh0Var.g1;
                        be50 be50Var = ffh0Var.h1;
                        if (be50Var != null) {
                            ndo0 ndo0VarA = lmb0Var4.a();
                            long j = ffh0Var.i1;
                            float f = ffh0Var.j1;
                            placementScope.e(ndo0VarA);
                            ndo0VarA.f0(qr80.d(j, ndo0VarA.e), f, be50Var);
                        } else if (iu30Var == null) {
                            ndo0 ndo0VarA2 = lmb0Var4.a();
                            long j2 = ffh0Var.i1;
                            float f2 = ffh0Var.j1;
                            placementScope.e(ndo0VarA2);
                            ndo0VarA2.e0(qr80.d(j2, ndo0VarA2.e), f2, null);
                        } else {
                            ndo0 ndo0VarA3 = lmb0Var4.a();
                            long j3 = ffh0Var.i1;
                            float f3 = ffh0Var.j1;
                            placementScope.e(ndo0VarA3);
                            ndo0VarA3.e0(qr80.d(j3, ndo0VarA3.e), f3, iu30Var);
                        }
                        break;
                }
                return rih1Var;
            }
        };
        final byte b3 = 2;
        this.k1 = new Function0(this) { // from class: p.efh0
            public final /* synthetic */ ffh0 b;

            {
                this.b = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invoke() throws KotlinNothingValueException {
                byte b4 = b3;
                rih1 rih1Var = rih1.a;
                ffh0 ffh0Var = this.b;
                switch (b4) {
                    case 0:
                        ffh0Var.f.a().H(ffh0Var.b1);
                        break;
                    case 1:
                        lmb0 lmb0Var2 = ffh0Var.f;
                        lmb0Var2.i = 0;
                        hmb0 hmb0Var = lmb0Var2.a;
                        bfn0 bfn0VarA = hmb0Var.A();
                        Object[] objArr = bfn0VarA.a;
                        int i = bfn0VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            ffh0 ffh0Var2 = ((hmb0) objArr[i2]).f1.f68p;
                            ffh0Var2.h = ffh0Var2.i;
                            ffh0Var2.i = Integer.MAX_VALUE;
                            ffh0Var2.T0 = false;
                            if (ffh0Var2.m1 == 2) {
                                ffh0Var2.m1 = 3;
                            }
                        }
                        bfn0 bfn0VarA2 = hmb0Var.A();
                        Object[] objArr2 = bfn0VarA2.a;
                        int i3 = bfn0VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((hmb0) objArr2[i4]).f1.f68p.X0.q(false);
                        }
                        if (ffh0Var.r().O0) {
                            afn0 afn0VarO = hmb0Var.o();
                            int size = afn0VarO.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((ndo0) ((hmb0) afn0VarO.get(i5)).e1.e).O0 = true;
                            }
                        }
                        ffh0Var.r().A0().a();
                        if (ffh0Var.r().O0) {
                            afn0 afn0VarO2 = hmb0Var.o();
                            int size2 = afn0VarO2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ((ndo0) ((hmb0) afn0VarO2.get(i6)).e1.e).O0 = false;
                            }
                        }
                        bfn0 bfn0VarA3 = hmb0Var.A();
                        Object[] objArr3 = bfn0VarA3.a;
                        int i7 = bfn0VarA3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            hmb0 hmb0Var2 = (hmb0) objArr3[i8];
                            lmb0 lmb0Var3 = hmb0Var2.f1;
                            if (lmb0Var3.f68p.h != hmb0Var2.w()) {
                                hmb0Var.P();
                                hmb0Var.D();
                                if (hmb0Var2.w() == Integer.MAX_VALUE) {
                                    if (lmb0Var3.c || gio1.y(hmb0Var2)) {
                                        c6f0 c6f0Var = lmb0Var3.q;
                                        c6f0Var.getClass();
                                        c6f0Var.o0(false);
                                    }
                                    lmb0Var3.f68p.r0();
                                }
                            }
                        }
                        bfn0 bfn0VarA4 = hmb0Var.A();
                        Object[] objArr4 = bfn0VarA4.a;
                        int i9 = bfn0VarA4.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            imb0 imb0Var = ((hmb0) objArr4[i10]).f1.f68p.X0;
                            imb0Var.n(imb0Var.i());
                        }
                        break;
                    default:
                        lmb0 lmb0Var4 = ffh0Var.f;
                        ndo0 ndo0Var = lmb0Var4.a().Y0;
                        y5f0 placementScope = ndo0Var != null ? ndo0Var.P0 : ((ha4) kmb0.a(lmb0Var4.a)).getPlacementScope();
                        iu30 iu30Var = ffh0Var.g1;
                        be50 be50Var = ffh0Var.h1;
                        if (be50Var != null) {
                            ndo0 ndo0VarA = lmb0Var4.a();
                            long j = ffh0Var.i1;
                            float f = ffh0Var.j1;
                            placementScope.e(ndo0VarA);
                            ndo0VarA.f0(qr80.d(j, ndo0VarA.e), f, be50Var);
                        } else if (iu30Var == null) {
                            ndo0 ndo0VarA2 = lmb0Var4.a();
                            long j2 = ffh0Var.i1;
                            float f2 = ffh0Var.j1;
                            placementScope.e(ndo0VarA2);
                            ndo0VarA2.e0(qr80.d(j2, ndo0VarA2.e), f2, null);
                        } else {
                            ndo0 ndo0VarA3 = lmb0Var4.a();
                            long j3 = ffh0Var.i1;
                            float f3 = ffh0Var.j1;
                            placementScope.e(ndo0VarA3);
                            ndo0VarA3.e0(qr80.d(j3, ndo0VarA3.e), f3, iu30Var);
                        }
                        break;
                }
                return rih1Var;
            }
        };
    }

    @Override // p.bm3
    public final int A() {
        return this.i;
    }

    public final void A0() {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        if (!hmb0Var.J() || lmb0Var.l <= 0) {
            return;
        }
        lmb0 lmb0Var2 = hmb0Var2.f1;
        if ((lmb0Var2.j || lmb0Var2.k) && !lmb0Var2.f68p.V0) {
            hmb0Var2.V(false);
        }
        bfn0 bfn0VarA = hmb0Var2.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hmb0) objArr[i2]).f1.f68p.A0();
        }
    }

    @Override // p.afh0
    public final int C(int i) {
        lmb0 lmb0Var = this.f;
        if (!gio1.y(lmb0Var.a)) {
            s0();
            return lmb0Var.a().C(i);
        }
        c6f0 c6f0Var = lmb0Var.q;
        c6f0Var.getClass();
        return c6f0Var.C(i);
    }

    @Override // p.afh0
    public final q5t0 H(long j) throws Throwable {
        int i;
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        if (hmb0Var.q1 == 3) {
            hmb0Var.f();
        }
        if (gio1.y(hmb0Var2)) {
            c6f0 c6f0Var = lmb0Var.q;
            c6f0Var.getClass();
            c6f0Var.t = 3;
            c6f0Var.H(j);
        }
        hmb0 hmb0VarV = hmb0Var2.v();
        if (hmb0VarV != null) {
            lmb0 lmb0Var2 = hmb0VarV.f1;
            if (this.m1 != 3 && !hmb0Var2.d1) {
                qf80.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iC = l1d.C(lmb0Var2.d);
            if (iC != 0) {
                i = 2;
                if (iC != 2) {
                    eg.m("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(kaa0.p(lmb0Var2.d)));
                    return null;
                }
            } else {
                i = 1;
            }
            this.m1 = i;
        } else {
            this.m1 = 3;
        }
        z0(j);
        return this;
    }

    @Override // p.bm3
    public final void T() {
        hmb0.W(this.f.a, false, 7);
    }

    @Override // p.q5t0
    public final int U(ul3 ul3Var) {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0VarV = lmb0Var.a.v();
        int i = hmb0VarV != null ? hmb0VarV.f1.d : 0;
        imb0 imb0Var = this.X0;
        if (i == 1) {
            imb0Var.r(true);
        } else {
            hmb0 hmb0VarV2 = lmb0Var.a.v();
            if ((hmb0VarV2 != null ? hmb0VarV2.f1.d : 0) == 3) {
                imb0Var.q(true);
            }
        }
        this.Y = true;
        int iU = lmb0Var.a().U(ul3Var);
        this.Y = false;
        return iU;
    }

    @Override // p.q5t0
    public final int X() {
        return this.f.a().X();
    }

    @Override // p.q5t0
    public final int Y() {
        return this.f.a().Y();
    }

    @Override // p.bm3
    public final am3 c() {
        return this.X0;
    }

    @Override // p.afh0
    public final int d(int i) {
        lmb0 lmb0Var = this.f;
        if (!gio1.y(lmb0Var.a)) {
            s0();
            return lmb0Var.a().d(i);
        }
        c6f0 c6f0Var = lmb0Var.q;
        c6f0Var.getClass();
        return c6f0Var.d(i);
    }

    @Override // p.bm3
    public final bm3 e() {
        lmb0 lmb0Var;
        hmb0 hmb0VarV = this.f.a.v();
        if (hmb0VarV == null || (lmb0Var = hmb0VarV.f1) == null) {
            return null;
        }
        return lmb0Var.f68p;
    }

    @Override // p.q5t0
    public final void e0(long j, float f, iu30 iu30Var) throws Throwable {
        y0(j, f, iu30Var, null);
    }

    @Override // p.q5t0
    public final void f0(long j, float f, be50 be50Var) throws Throwable {
        y0(j, f, null, be50Var);
    }

    @Override // p.q5t0, p.afh0
    public final Object g() {
        return this.R0;
    }

    @Override // p.fnm0
    public final void i(boolean z) {
        lmb0 lmb0Var = this.f;
        if (z != lmb0Var.a().Y) {
            lmb0Var.a().Y = z;
            this.l1 = true;
        }
    }

    @Override // p.bm3
    public final void k() throws Throwable {
        boolean zZ0;
        this.a1 = true;
        imb0 imb0Var = this.X0;
        imb0Var.l();
        boolean z = this.V0;
        lmb0 lmb0Var = this.f;
        if (z) {
            bfn0 bfn0VarA = lmb0Var.a.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                hmb0 hmb0Var = (hmb0) objArr[i2];
                boolean zR = hmb0Var.r();
                lmb0 lmb0Var2 = hmb0Var.f1;
                if (zR && hmb0Var.s() == 1) {
                    ffh0 ffh0Var = lmb0Var2.f68p;
                    hjl hjlVar = ffh0Var.t ? new hjl(ffh0Var.d) : null;
                    if (hjlVar != null) {
                        if (hmb0Var.q1 == 3) {
                            hmb0Var.f();
                        }
                        zZ0 = lmb0Var2.f68p.z0(hjlVar.a);
                    } else {
                        zZ0 = false;
                    }
                    if (zZ0) {
                        hmb0.W(lmb0Var.a, false, 7);
                    }
                }
            }
        }
        if (this.W0 || (!this.Y && !r().O0 && this.V0)) {
            this.V0 = false;
            int i3 = lmb0Var.d;
            lmb0Var.d = 3;
            lmb0Var.g(false);
            hmb0 hmb0Var2 = lmb0Var.a;
            uxq0 snapshotObserver = ((ha4) kmb0.a(hmb0Var2)).getSnapshotObserver();
            snapshotObserver.a.d(hmb0Var2, snapshotObserver.e, this.d1);
            lmb0Var.d = i3;
            this.W0 = false;
        }
        if (imb0Var.i()) {
            imb0Var.n(true);
        }
        if (imb0Var.d() && imb0Var.h()) {
            imb0Var.k();
        }
        this.a1 = false;
    }

    public final List l0() {
        lmb0 lmb0Var = this.f;
        lmb0Var.a.g0();
        boolean z = this.Z0;
        bfn0 bfn0Var = this.Y0;
        if (!z) {
            return bfn0Var.f();
        }
        hmb0 hmb0Var = lmb0Var.a;
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (bfn0Var.c <= i2) {
                bfn0Var.b(hmb0Var2.f1.f68p);
            } else {
                ffh0 ffh0Var = hmb0Var2.f1.f68p;
                Object[] objArr2 = bfn0Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = ffh0Var;
            }
        }
        bfn0Var.m(hmb0Var.o().size(), bfn0Var.c);
        this.Z0 = false;
        return bfn0Var.f();
    }

    @Override // p.afh0
    public final int n(int i) {
        lmb0 lmb0Var = this.f;
        if (!gio1.y(lmb0Var.a)) {
            s0();
            return lmb0Var.a().n(i);
        }
        c6f0 c6f0Var = lmb0Var.q;
        c6f0Var.getClass();
        return c6f0Var.n(i);
    }

    public final void o0() {
        boolean z = this.S0;
        this.S0 = true;
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        jdo0 jdo0Var = hmb0Var.e1;
        if (!z) {
            ((sh80) jdo0Var.d).y1();
            ((ha4) kmb0.a(hmb0Var)).getRectManager().g(lmb0Var.a);
            if (hmb0Var.r()) {
                hmb0.W(hmb0Var, true, 6);
            } else if (hmb0Var.f1.e) {
                hmb0.U(hmb0Var, true, 6);
            }
        }
        ndo0 ndo0Var = ((sh80) jdo0Var.d).X0;
        for (ndo0 ndo0Var2 = (ndo0) jdo0Var.e; !u890.j(ndo0Var2, ndo0Var) && ndo0Var2 != null; ndo0Var2 = ndo0Var2.X0) {
            if (ndo0Var2.u1) {
                ndo0Var2.u1();
            }
        }
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (hmb0Var2.w() != Integer.MAX_VALUE) {
                hmb0Var2.f1.f68p.o0();
                hmb0.X(hmb0Var2);
            }
        }
    }

    @Override // p.bm3
    public final sh80 r() {
        return (sh80) this.f.a.e1.d;
    }

    public final void r0() {
        if (this.S0) {
            this.S0 = false;
            lmb0 lmb0Var = this.f;
            hmb0 hmb0Var = lmb0Var.a;
            hmb0 hmb0Var2 = lmb0Var.a;
            ((ha4) kmb0.a(hmb0Var)).getRectManager().h(hmb0Var2);
            jdo0 jdo0Var = hmb0Var2.e1;
            ndo0 ndo0Var = ((sh80) jdo0Var.d).X0;
            for (ndo0 ndo0Var2 = (ndo0) jdo0Var.e; !u890.j(ndo0Var2, ndo0Var) && ndo0Var2 != null; ndo0Var2 = ndo0Var2.X0) {
                ndo0Var2.A1();
                ndo0Var2.F1();
            }
            bfn0 bfn0VarA = hmb0Var2.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((hmb0) objArr[i2]).f1.f68p.r0();
            }
        }
    }

    @Override // p.bm3
    public final void requestLayout() {
        this.f.a.V(false);
    }

    public final void s0() {
        int i;
        lmb0 lmb0Var = this.f;
        hmb0.W(lmb0Var.a, false, 7);
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0VarV = hmb0Var.v();
        if (hmb0VarV == null || hmb0Var.q1 != 3) {
            return;
        }
        int iC = l1d.C(hmb0VarV.f1.d);
        if (iC != 0) {
            i = 2;
            if (iC != 2) {
                i = hmb0VarV.q1;
            }
        } else {
            i = 1;
        }
        hmb0Var.q1 = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void t0() throws Throwable {
        this.f1 = true;
        lmb0 lmb0Var = this.f;
        hmb0 hmb0VarV = lmb0Var.a.v();
        float f = r().i1;
        hmb0 hmb0Var = lmb0Var.a;
        jdo0 jdo0Var = hmb0Var.e1;
        ndo0 ndo0Var = (ndo0) jdo0Var.e;
        sh80 sh80Var = (sh80) jdo0Var.d;
        while (ndo0Var != sh80Var) {
            cmb0 cmb0Var = (cmb0) ndo0Var;
            f += cmb0Var.i1;
            ndo0Var = cmb0Var.X0;
        }
        if (f != this.e1) {
            this.e1 = f;
            if (hmb0VarV != null) {
                hmb0VarV.P();
            }
            if (hmb0VarV != null) {
                hmb0VarV.D();
            }
        }
        if (!r().O0) {
            boolean z = this.S0;
            if (!z || this.X0.g()) {
                o0();
            }
            if (z) {
                ((sh80) hmb0Var.e1.d).y1();
            } else {
                if (hmb0VarV != null) {
                    hmb0VarV.D();
                }
                if (this.g && hmb0VarV != null) {
                    hmb0VarV.V(false);
                }
            }
        }
        if (hmb0VarV != null) {
            lmb0 lmb0Var2 = hmb0VarV.f1;
            if (!this.g && lmb0Var2.d == 3) {
                if (this.i != Integer.MAX_VALUE) {
                    qf80.c("Place was called on a node which was placed already");
                }
                int i = lmb0Var2.i;
                this.i = i;
                lmb0Var2.i = i + 1;
            }
        } else {
            this.i = 0;
        }
        k();
    }

    @Override // p.afh0
    public final int w(int i) {
        lmb0 lmb0Var = this.f;
        if (!gio1.y(lmb0Var.a)) {
            s0();
            return lmb0Var.a().w(i);
        }
        c6f0 c6f0Var = lmb0Var.q;
        c6f0Var.getClass();
        return c6f0Var.w(i);
    }

    @Override // p.bm3
    public final void x(j6 j6Var) {
        bfn0 bfn0VarA = this.f.a.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            j6Var.invoke(((hmb0) objArr[i2]).f1.f68p);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void x0(long j, float f, iu30 iu30Var, be50 be50Var) throws Throwable {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        if (hmb0Var.p1) {
            qf80.a("place is called on a deactivated node");
        }
        lmb0Var.d = 3;
        this.Z = j;
        this.P0 = f;
        this.N0 = iu30Var;
        this.O0 = be50Var;
        this.f1 = false;
        oxq0 oxq0VarA = kmb0.a(hmb0Var2);
        if (this.V0 || !this.S0) {
            this.X0.o(false);
            lmb0Var.f(false);
            this.g1 = iu30Var;
            this.i1 = j;
            this.j1 = f;
            this.h1 = be50Var;
            uxq0 snapshotObserver = ((ha4) oxq0VarA).getSnapshotObserver();
            snapshotObserver.a.d(hmb0Var2, snapshotObserver.f, this.k1);
        } else {
            ndo0 ndo0VarA = lmb0Var.a();
            ndo0VarA.D1(qr80.d(j, ndo0VarA.e), f, iu30Var, be50Var);
            t0();
        }
        lmb0Var.d = 5;
        if (lmb0Var.a().O0 && (lmb0Var.k || lmb0Var.j)) {
            requestLayout();
        }
        this.X = true;
    }

    public final void y0(long j, float f, iu30 iu30Var, be50 be50Var) throws Throwable {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        try {
            this.T0 = true;
            if (!qr80.b(j, this.Z) || iu30Var != this.N0 || this.l1) {
                if (lmb0Var.k || lmb0Var.j || this.l1) {
                    this.V0 = true;
                    this.l1 = false;
                }
            }
            c6f0 c6f0Var = lmb0Var.q;
            if (c6f0Var != null) {
                lmb0 lmb0Var2 = c6f0Var.f;
                if (c6f0Var.R0 == 3 && !gio1.y(lmb0Var2.a)) {
                    lmb0Var2.c = true;
                }
            }
            c6f0 c6f0Var2 = lmb0Var.q;
            if (c6f0Var2 != null && c6f0Var2.l0()) {
                ndo0 ndo0Var = lmb0Var.a().Y0;
                y5f0 placementScope = ndo0Var != null ? ndo0Var.P0 : ((ha4) kmb0.a(hmb0Var2)).getPlacementScope();
                c6f0 c6f0Var3 = lmb0Var.q;
                c6f0Var3.getClass();
                hmb0 hmb0VarV = hmb0Var2.v();
                if (hmb0VarV != null) {
                    hmb0VarV.f1.h = 0;
                }
                c6f0Var3.i = Integer.MAX_VALUE;
                placementScope.f(c6f0Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            c6f0 c6f0Var4 = lmb0Var.q;
            if (c6f0Var4 != null && !c6f0Var4.Y) {
                qf80.c("Error: Placement happened before lookahead.");
            }
            x0(j, f, iu30Var, be50Var);
        } catch (Throwable th) {
            hmb0Var.Z(th);
            throw null;
        }
    }

    public final boolean z0(long j) throws Throwable {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        try {
            if (hmb0Var.p1) {
                qf80.a("measure is called on a deactivated node");
            }
            oxq0 oxq0VarA = kmb0.a(hmb0Var2);
            hmb0 hmb0VarV = hmb0Var2.v();
            boolean z = true;
            hmb0Var2.d1 = hmb0Var2.d1 || (hmb0VarV != null && hmb0VarV.d1);
            if (!hmb0Var2.r() && hjl.c(this.d, j)) {
                ((ha4) oxq0VarA).h(hmb0Var2, false);
                hmb0Var2.Y();
                return false;
            }
            this.X0.p(false);
            bfn0 bfn0VarA = hmb0Var2.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((hmb0) objArr[i2]).f1.f68p.X0.r(false);
            }
            this.t = true;
            long j2 = lmb0Var.a().c;
            k0(j);
            if (lmb0Var.d != 5) {
                qf80.c("layout state is not idle before measure starts");
            }
            this.b1 = j;
            lmb0Var.d = 1;
            this.U0 = false;
            uxq0 snapshotObserver = ((ha4) kmb0.a(hmb0Var2)).getSnapshotObserver();
            snapshotObserver.a.d(hmb0Var2, snapshotObserver.c, this.c1);
            if (lmb0Var.d == 1) {
                this.V0 = true;
                this.W0 = true;
                lmb0Var.d = 5;
            }
            if (yr80.b(lmb0Var.a().c, j2) && lmb0Var.a().a == this.a && lmb0Var.a().b == this.b) {
                z = false;
            }
            h0((((long) lmb0Var.a().b) & 4294967295L) | (((long) lmb0Var.a().a) << 32));
            return z;
        } catch (Throwable th) {
            hmb0Var.Z(th);
            throw null;
        }
    }
}
