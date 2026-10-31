package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class syl extends pim0 implements m7v, zlb0, t161 {
    public tl3 O0;
    public j6m P0;
    public float Q0;
    public ColorFilter R0;
    public boolean S0;
    public String T0;
    public ljl U0;
    public final ni7 V0;

    public syl(ni7 ni7Var, tl3 tl3Var, j6m j6mVar, float f, ColorFilter colorFilter, boolean z, String str, ljl ljlVar) {
        this.O0 = tl3Var;
        this.P0 = j6mVar;
        this.Q0 = f;
        this.R0 = colorFilter;
        this.S0 = z;
        this.T0 = str;
        this.U0 = ljlVar;
        this.V0 = ni7Var;
    }

    public final void A1() {
        this.V0.h();
    }

    public final void B1() {
        this.V0.k((hi7) null);
    }

    public final long H1(long j) {
        if (Size.g(j)) {
            return 0L;
        }
        long jI = this.V0.i();
        if (jI != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jA = this.P0.a(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) <= Float.MAX_VALUE) {
                return t3k1.O(jFloatToRawIntBits, jA);
            }
        }
        return j;
    }

    public final long I1(long j) {
        float fK;
        int iJ;
        float fO;
        boolean zG = hjl.g(j);
        boolean zF = hjl.f(j);
        if (!zG || !zF) {
            boolean z = hjl.e(j) && hjl.d(j);
            ni7 ni7Var = this.V0;
            long jI = ni7Var.i();
            if (jI != 9205357640488583168L) {
                if (!z || (!zG && !zF)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i = xpi1.b;
                        fK = yoi1.o(fIntBitsToFloat, hjl.k(j), hjl.i(j));
                    } else {
                        fK = hjl.k(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = xpi1.b;
                        fO = yoi1.o(fIntBitsToFloat2, hjl.j(j), hjl.h(j));
                    } else {
                        iJ = hjl.j(j);
                    }
                    long jH1 = H1((((long) Float.floatToRawIntBits(fO)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                    return hjl.b(j, jjl.g(jch0.U(Float.intBitsToFloat((int) (jH1 >> 32))), j), 0, jjl.f(jch0.U(Float.intBitsToFloat((int) (jH1 & 4294967295L))), j), 0, 10);
                }
                fK = hjl.i(j);
                iJ = hjl.h(j);
                fO = iJ;
                long jH2 = H1((((long) Float.floatToRawIntBits(fO)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                return hjl.b(j, jjl.g(jch0.U(Float.intBitsToFloat((int) (jH2 >> 32))), j), 0, jjl.f(jch0.U(Float.intBitsToFloat((int) (jH2 & 4294967295L))), j), 0, 10);
            }
            if (z && ((mi7) ni7Var.V0.a.getValue()).a() != null) {
                return hjl.b(j, hjl.i(j), 0, hjl.h(j), 0, 10);
            }
        }
        return j;
    }

    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jB = jjl.b(0, 0, 0, i, 7);
        ljl ljlVar = this.U0;
        if (ljlVar != null) {
            ljlVar.b(jB);
        }
        if (this.V0.i() == 9205357640488583168L) {
            return afh0Var.w(i);
        }
        long jI1 = I1(jB);
        return Math.max(hjl.k(jI1), afh0Var.w(i));
    }

    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jB = jjl.b(0, 0, 0, i, 7);
        ljl ljlVar = this.U0;
        if (ljlVar != null) {
            ljlVar.b(jB);
        }
        if (this.V0.i() == 9205357640488583168L) {
            return afh0Var.C(i);
        }
        long jI1 = I1(jB);
        return Math.max(hjl.k(jI1), afh0Var.C(i));
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        ljl ljlVar = this.U0;
        if (ljlVar != null) {
            ljlVar.b(j);
        }
        q5t0 q5t0VarH = afh0Var.H(I1(j));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 0));
    }

    public final void g(e261 e261Var) {
        String str = this.T0;
        if (str != null) {
            b261.n(e261Var, str);
            b261.x(e261Var, 5);
        }
    }

    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jB = jjl.b(0, i, 0, 0, 13);
        ljl ljlVar = this.U0;
        if (ljlVar != null) {
            ljlVar.b(jB);
        }
        if (this.V0.i() == 9205357640488583168L) {
            return afh0Var.n(i);
        }
        long jI1 = I1(jB);
        return Math.max(hjl.j(jI1), afh0Var.n(i));
    }

    public final void t0(lsl lslVar) {
        long jH1 = H1(lslVar.j());
        long jA = this.O0.a(xpi1.d(jH1), xpi1.d(lslVar.j()), lslVar.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            dg8 dg8Var = (dg8) cabVarA1.b;
            if (this.S0) {
                dg8.m(dg8Var, 0.0f, 0.0f, 31);
            }
            dg8Var.z(i, i2);
            this.V0.e(lslVar, jH1, this.Q0, this.R0);
            cabVarA1.p().i();
            cabVarA1.D(jU);
            lslVar.s1();
        } catch (Throwable th) {
            i3a.n(cabVarA1, jU);
            throw th;
        }
    }

    public final boolean w1() {
        return false;
    }

    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jB = jjl.b(0, i, 0, 0, 13);
        ljl ljlVar = this.U0;
        if (ljlVar != null) {
            ljlVar.b(jB);
        }
        if (this.V0.i() == 9205357640488583168L) {
            return afh0Var.d(i);
        }
        long jI1 = I1(jB);
        return Math.max(hjl.j(jI1), afh0Var.d(i));
    }

    public final void z1() {
        c9n c9nVarV1 = v1();
        ni7 ni7Var = this.V0;
        ni7Var.Z = c9nVarV1;
        ni7Var.b();
    }
}
