package p;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sh80 extends ndo0 {
    public static final lw4 G1;
    public final gpd1 E1;
    public rh80 F1;

    static {
        lw4 lw4VarL = fdg1.l();
        int i = u7h.l;
        lw4VarL.c(nfb.m());
        lw4VarL.f(1.0f);
        lw4VarL.g(1);
        G1 = lw4VarL;
    }

    public sh80(hmb0 hmb0Var) {
        super(hmb0Var);
        gpd1 gpd1Var = new gpd1();
        gpd1Var.d = 0;
        this.E1 = gpd1Var;
        gpd1Var.h = this;
        this.F1 = hmb0Var.i != null ? new rh80(this) : null;
    }

    @Override // p.afh0
    public final int C(int i) {
        return this.U0.u().w(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.afh0
    public final q5t0 H(long j) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.W0) {
            rh80 rh80Var = this.F1;
            rh80Var.getClass();
            j = rh80Var.P0();
        }
        k0(j);
        hmb0 hmb0Var = this.U0;
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hmb0) objArr[i2]).f1.f68p.m1 = 3;
        }
        G1(hmb0Var.X0.mo23measure3p2s80s(this, hmb0Var.n(), j));
        x1();
        return this;
    }

    @Override // p.ndo0
    public final void Y0() {
        if (this.F1 == null) {
            this.F1 = new rh80(this);
        }
    }

    @Override // p.ndo0
    public final z5f0 c1() {
        return this.F1;
    }

    @Override // p.afh0
    public final int d(int i) {
        return this.U0.u().v(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.q5t0
    public final void e0(long j, float f, iu30 iu30Var) throws Throwable {
        if (this.V0) {
            z5f0 z5f0VarC1 = c1();
            z5f0VarC1.getClass();
            D1(z5f0VarC1.E0(), f, iu30Var, null);
        } else {
            D1(j, f, iu30Var, null);
        }
        if (this.N0) {
            return;
        }
        this.U0.f1.f68p.t0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.ndo0, p.q5t0
    public final void f0(long j, float f, be50 be50Var) throws Throwable {
        sh80 sh80Var;
        if (this.V0) {
            z5f0 z5f0VarC1 = c1();
            z5f0VarC1.getClass();
            sh80Var = this;
            sh80Var.D1(z5f0VarC1.E0(), f, null, be50Var);
        } else {
            sh80Var = this;
            sh80Var.D1(j, f, null, be50Var);
        }
        if (sh80Var.N0) {
            return;
        }
        sh80Var.U0.f1.f68p.t0();
    }

    @Override // p.ndo0
    public final pim0 f1() {
        return this.E1;
    }

    @Override // p.afh0
    public final int n(int i) {
        return this.U0.u().x(i);
    }

    @Override // p.x5f0
    public final int o0(ul3 ul3Var) throws Throwable {
        rh80 rh80Var = this.F1;
        if (rh80Var != null) {
            return rh80Var.o0(ul3Var);
        }
        ffh0 ffh0Var = this.U0.f1.f68p;
        imb0 imb0Var = ffh0Var.X0;
        if (!ffh0Var.Y) {
            if (ffh0Var.f.d == 1) {
                imb0Var.p(true);
                if (imb0Var.d()) {
                    ffh0Var.V0 = true;
                    ffh0Var.W0 = true;
                }
            } else {
                imb0Var.o(true);
            }
        }
        sh80 sh80VarR = ffh0Var.r();
        boolean z = sh80VarR.O0;
        sh80VarR.O0 = true;
        ffh0Var.k();
        sh80VarR.O0 = z;
        Integer num = (Integer) imb0Var.e().get(ul3Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // p.ndo0
    public final void t1(mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        hmb0 hmb0Var;
        long jB;
        hmb0 hmb0Var2 = this.U0;
        boolean z3 = false;
        if (mdo0Var.g(hmb0Var2)) {
            if (!O1(j)) {
                i2 = i;
                if (rav0.b(i2, 1) && (Float.floatToRawIntBits(T0(j, d1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = gk60Var.c;
                    bfn0 bfn0VarZ = hmb0Var2.z();
                    objArr = bfn0VarZ.a;
                    i3 = bfn0VarZ.c - 1;
                    while (i3 >= 0) {
                        hmb0Var = (hmb0) objArr[i3];
                        if (hmb0Var.J()) {
                            mdo0Var.c(hmb0Var, j, gk60Var, i2, z2);
                            jB = gk60Var.b();
                            if (x760.s(jB) >= 0.0f && x760.y(jB) && !x760.x(jB) && !mdo0Var.l(gk60Var, hmb0Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    gk60Var.c = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = gk60Var.c;
                bfn0 bfn0VarZ2 = hmb0Var2.z();
                objArr = bfn0VarZ2.a;
                i3 = bfn0VarZ2.c - 1;
                while (i3 >= 0) {
                    hmb0Var = (hmb0) objArr[i3];
                    if (hmb0Var.J()) {
                        mdo0Var.c(hmb0Var, j, gk60Var, i2, z2);
                        jB = gk60Var.b();
                        if (x760.s(jB) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                gk60Var.c = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = gk60Var.c;
            bfn0 bfn0VarZ3 = hmb0Var2.z();
            objArr = bfn0VarZ3.a;
            i3 = bfn0VarZ3.c - 1;
            while (i3 >= 0) {
                hmb0Var = (hmb0) objArr[i3];
                if (hmb0Var.J()) {
                    mdo0Var.c(hmb0Var, j, gk60Var, i2, z2);
                    jB = gk60Var.b();
                    if (x760.s(jB) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            gk60Var.c = i6;
        }
    }

    @Override // p.afh0
    public final int w(int i) {
        return this.U0.u().y(i);
    }
}
