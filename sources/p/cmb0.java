package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cmb0 extends ndo0 {
    public static final lw4 I1;
    public zlb0 E1;
    public hjl F1;
    public amb0 G1;
    public z06 H1;

    static {
        lw4 lw4VarL = fdg1.l();
        int i = u7h.l;
        lw4VarL.c(nfb.j());
        lw4VarL.f(1.0f);
        lw4VarL.g(1);
        I1 = lw4VarL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cmb0(hmb0 hmb0Var, zlb0 zlb0Var) {
        super(hmb0Var);
        this.E1 = zlb0Var;
        this.G1 = hmb0Var.i != null ? new amb0(this) : null;
        this.H1 = (((pim0) zlb0Var).a.c & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? new z06(this, (v06) zlb0Var) : null;
    }

    @Override // p.afh0
    public final int C(int i) {
        z06 z06Var = this.H1;
        if (z06Var != null) {
            v06 v06VarD = z06Var.d();
            ndo0 ndo0Var = this.X0;
            ndo0Var.getClass();
            return v06VarD.r0(z06Var, ndo0Var, i);
        }
        zlb0 zlb0Var = this.E1;
        ndo0 ndo0Var2 = this.X0;
        ndo0Var2.getClass();
        return zlb0Var.V0(this, ndo0Var2, i);
    }

    @Override // p.ndo0
    public final void C1(fid fidVar, be50 be50Var) throws Throwable {
        ndo0 ndo0Var;
        ndo0 ndo0Var2 = this.X0;
        ndo0Var2.getClass();
        ndo0Var2.V0(fidVar, be50Var);
        if (!((ha4) kmb0.a(this.U0)).getShowLayoutBounds() || (ndo0Var = this.X0) == null) {
            return;
        }
        if (yr80.b(this.c, ndo0Var.c) && qr80.b(ndo0Var.h1, 0L)) {
            return;
        }
        long j = this.c;
        fidVar.d(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, I1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    @Override // p.afh0
    public final q5t0 H(long j) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        hfh0 hfh0VarD;
        boolean z;
        hjl hjlVar;
        if (this.W0) {
            hjl hjlVar2 = this.F1;
            if (hjlVar2 == null) {
                hhg1.n("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = hjlVar2.a;
        }
        k0(j);
        z06 z06Var = this.H1;
        if (z06Var != null) {
            v06 v06VarD = z06Var.d();
            z06Var.e(v06VarD.y0(z06Var.v0()) || (hjlVar = this.F1) == null || j != hjlVar.a);
            if (!z06Var.c()) {
                ndo0 ndo0Var = this.X0;
                ndo0Var.getClass();
                ndo0Var.W0 = true;
            }
            ndo0 ndo0Var2 = this.X0;
            ndo0Var2.getClass();
            hfh0VarD = v06VarD.G0(z06Var, ndo0Var2, j);
            ndo0 ndo0Var3 = this.X0;
            ndo0Var3.getClass();
            ndo0Var3.W0 = false;
            int width = hfh0VarD.getWidth();
            amb0 amb0Var = this.G1;
            amb0Var.getClass();
            if (width == amb0Var.a) {
                int height = hfh0VarD.getHeight();
                amb0 amb0Var2 = this.G1;
                amb0Var2.getClass();
                z = height == amb0Var2.b;
            }
            if (!z06Var.c()) {
                ndo0 ndo0Var4 = this.X0;
                ndo0Var4.getClass();
                long j2 = ndo0Var4.c;
                ndo0 ndo0Var5 = this.X0;
                ndo0Var5.getClass();
                z5f0 z5f0VarC1 = ndo0Var5.c1();
                if (yr80.a(j2, z5f0VarC1 != null ? new yr80(z5f0VarC1.V0()) : null) && !z) {
                    hfh0VarD = new bmb0(hfh0VarD, this);
                }
            }
        } else {
            zlb0 zlb0Var = this.E1;
            ndo0 ndo0Var6 = this.X0;
            ndo0Var6.getClass();
            hfh0VarD = zlb0Var.d(this, ndo0Var6, j);
        }
        G1(hfh0VarD);
        x1();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    public final void P1() {
        boolean z;
        if (this.N0) {
            return;
        }
        y1();
        ndo0 ndo0Var = this.X0;
        ndo0Var.getClass();
        z06 z06Var = this.H1;
        if (z06Var != null) {
            v06 v06VarD = z06Var.d();
            amb0 amb0Var = this.G1;
            amb0Var.getClass();
            if (v06VarD.l1(this.P0, amb0Var.T0()) || z06Var.c()) {
                z = false;
            } else {
                long j = this.c;
                amb0 amb0Var2 = this.G1;
                if (yr80.a(j, amb0Var2 != null ? new yr80(amb0Var2.V0()) : null)) {
                    long j2 = ndo0Var.c;
                    z5f0 z5f0VarC1 = ndo0Var.c1();
                    if (yr80.a(j2, z5f0VarC1 != null ? new yr80(z5f0VarC1.V0()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            ndo0Var.V0 = z;
        }
        boolean z2 = ndo0Var.O0;
        ndo0Var.O0 = this.O0;
        A0().a();
        ndo0Var.O0 = z2;
        ndo0Var.V0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q1(zlb0 zlb0Var) {
        if (!zlb0Var.equals(this.E1)) {
            if ((((pim0) zlb0Var).a.c & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                v06 v06Var = (v06) zlb0Var;
                z06 z06Var = this.H1;
                if (z06Var != null) {
                    z06Var.f(v06Var);
                } else {
                    z06Var = new z06(this, v06Var);
                }
                this.H1 = z06Var;
            } else {
                this.H1 = null;
            }
        }
        this.E1 = zlb0Var;
    }

    @Override // p.ndo0
    public final void Y0() {
        if (this.G1 == null) {
            this.G1 = new amb0(this);
        }
    }

    @Override // p.ndo0
    public final z5f0 c1() {
        return this.G1;
    }

    @Override // p.afh0
    public final int d(int i) {
        z06 z06Var = this.H1;
        if (z06Var != null) {
            v06 v06VarD = z06Var.d();
            ndo0 ndo0Var = this.X0;
            ndo0Var.getClass();
            return v06VarD.u(z06Var, ndo0Var, i);
        }
        zlb0 zlb0Var = this.E1;
        ndo0 ndo0Var2 = this.X0;
        ndo0Var2.getClass();
        return zlb0Var.x(this, ndo0Var2, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.q5t0
    public final void e0(long j, float f, iu30 iu30Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.V0) {
            z5f0 z5f0VarC1 = c1();
            z5f0VarC1.getClass();
            D1(z5f0VarC1.E0(), f, iu30Var, null);
        } else {
            D1(j, f, iu30Var, null);
        }
        P1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.ndo0, p.q5t0
    public final void f0(long j, float f, be50 be50Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        cmb0 cmb0Var;
        if (this.V0) {
            z5f0 z5f0VarC1 = c1();
            z5f0VarC1.getClass();
            cmb0Var = this;
            cmb0Var.D1(z5f0VarC1.E0(), f, null, be50Var);
        } else {
            cmb0Var = this;
            cmb0Var.D1(j, f, null, be50Var);
        }
        cmb0Var.P1();
    }

    @Override // p.ndo0
    public final pim0 f1() {
        return ((pim0) this.E1).a;
    }

    @Override // p.afh0
    public final int n(int i) {
        z06 z06Var = this.H1;
        if (z06Var != null) {
            v06 v06VarD = z06Var.d();
            ndo0 ndo0Var = this.X0;
            ndo0Var.getClass();
            return v06VarD.A(z06Var, ndo0Var, i);
        }
        zlb0 zlb0Var = this.E1;
        ndo0 ndo0Var2 = this.X0;
        ndo0Var2.getClass();
        return zlb0Var.s0(this, ndo0Var2, i);
    }

    @Override // p.x5f0
    public final int o0(ul3 ul3Var) {
        amb0 amb0Var = this.G1;
        return amb0Var != null ? amb0Var.O0(ul3Var) : zho1.B(this, ul3Var);
    }

    @Override // p.afh0
    public final int w(int i) {
        z06 z06Var = this.H1;
        if (z06Var != null) {
            v06 v06VarD = z06Var.d();
            ndo0 ndo0Var = this.X0;
            ndo0Var.getClass();
            return v06VarD.p(z06Var, ndo0Var, i);
        }
        zlb0 zlb0Var = this.E1;
        ndo0 ndo0Var2 = this.X0;
        ndo0Var2.getClass();
        return zlb0Var.P0(this, ndo0Var2, i);
    }
}
