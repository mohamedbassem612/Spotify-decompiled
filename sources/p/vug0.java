package p;

import androidx.car.app.model.Alert;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vug0 extends pim0 implements zlb0, m7v, ay20 {
    public int O0;
    public short Q0;
    public float R0;
    public xab1 V0;
    public be50 W0;
    public final hrr0 X0;
    public final hrr0 Y0;
    public final mdt a1;
    public short P0 = 1200;
    public final err0 S0 = new err0(0);
    public final err0 T0 = new err0(0);
    public final hrr0 U0 = v8r.q(Boolean.FALSE);
    public final o95 Z0 = c97.b(0.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public vug0(int i, int i2, int i3, swg0 swg0Var, float f) {
        this.O0 = i;
        this.Q0 = i3;
        this.R0 = f;
        this.X0 = v8r.q(swg0Var);
        this.Y0 = v8r.q(new jug0(i2));
        this.a1 = yv91.a(new qga0((Object) swg0Var, (Object) this, (byte) 7));
    }

    public final void A1() {
        xab1 xab1Var = this.V0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.V0 = null;
        be50 be50Var = this.W0;
        if (be50Var != null) {
            oap1.y(this).c(be50Var);
            this.W0 = null;
        }
    }

    public final int H1() {
        return ((Number) this.a1.getValue()).intValue();
    }

    public final void I1() {
        xab1 xab1Var = this.V0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (((pim0) this).N0) {
            this.V0 = fn31.T(v1(), null, 0, new m2a0(xab1Var, this, (lnm) null, (byte) 23), 3);
        }
    }

    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return 0;
    }

    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.C(i);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13));
        int iG = jjl.g(q5t0VarH.a, j);
        err0 err0Var = this.T0;
        err0Var.t(iG);
        this.S0.t(q5t0VarH.a);
        return ifh0Var.S(err0Var.s(), q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 11));
    }

    public final void e0(wz20 wz20Var) {
        this.U0.setValue(Boolean.valueOf(wz20Var.a()));
    }

    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.n(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void t0(lsl lslVar) throws Throwable {
        float fS;
        float fFloatValue;
        int iS;
        long j;
        long j2;
        int iB = p3v.b(this.R0, 0.0f);
        err0 err0Var = this.T0;
        err0 err0Var2 = this.S0;
        o95 o95Var = this.Z0;
        if (iB > 0) {
            int iOrdinal = lslVar.getLayoutDirection().ordinal();
            if (iOrdinal == 0) {
                fS = ((Number) o95Var.e()).floatValue();
            } else if (iOrdinal != 1) {
                eg.o();
                return;
            } else {
                fFloatValue = (-((Number) o95Var.e()).floatValue()) + (err0Var2.s() * 2) + H1();
                iS = err0Var.s();
                fS = fFloatValue - iS;
            }
        } else {
            int iOrdinal2 = lslVar.getLayoutDirection().ordinal();
            if (iOrdinal2 == 0) {
                fS = (-((Number) o95Var.e()).floatValue()) + err0Var2.s() + H1();
            } else if (iOrdinal2 != 1) {
                eg.o();
                return;
            } else {
                fFloatValue = ((Number) o95Var.e()).floatValue() + err0Var2.s();
                iS = err0Var.s();
                fS = fFloatValue - iS;
            }
        }
        boolean z = fS < ((float) err0Var2.s());
        boolean z2 = ((float) err0Var.s()) + fS > ((float) (H1() + err0Var2.s()));
        float fH1 = H1() + err0Var2.s();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
        be50 be50Var = this.W0;
        if (be50Var != null) {
            j = 4294967295L;
            lslVar.V((((long) jch0.U(fIntBitsToFloat)) & 4294967295L) | (((long) err0Var2.s()) << 32), new gv20((Object) lslVar, (byte) 21), be50Var);
        } else {
            j = 4294967295L;
        }
        float fS2 = err0Var.s();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() & j));
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            try {
                ((dg8) cabVarA1.b).k(0.0f, 0.0f, fS2, fIntBitsToFloat2, 1);
                float f = -fS;
                ((dg8) lslVar.a1().b).z(f, 0.0f);
                try {
                    be50 be50Var2 = this.W0;
                    if (be50Var2 != null) {
                        if (z) {
                            m5n1.r(lslVar, be50Var2);
                        }
                        if (z2) {
                            ((dg8) lslVar.a1().b).z(fH1, 0.0f);
                            try {
                                m5n1.r(lslVar, be50Var2);
                                ((dg8) lslVar.a1().b).z(-fH1, -0.0f);
                            } catch (Throwable th) {
                                ((dg8) lslVar.a1().b).z(-fH1, -0.0f);
                                throw th;
                            }
                        }
                    } else {
                        if (z) {
                            lslVar.s1();
                        }
                        if (z2) {
                            ((dg8) lslVar.a1().b).z(fH1, 0.0f);
                            try {
                                lslVar.s1();
                                ((dg8) lslVar.a1().b).z(-fH1, -0.0f);
                            } catch (Throwable th2) {
                                ((dg8) lslVar.a1().b).z(-fH1, -0.0f);
                                throw th2;
                            }
                        }
                    }
                    ((dg8) lslVar.a1().b).z(-f, -0.0f);
                    i3a.n(cabVarA1, jU);
                } catch (Throwable th3) {
                    j2 = jU;
                    try {
                        ((dg8) lslVar.a1().b).z(-f, -0.0f);
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        i3a.n(cabVarA1, j2);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                j2 = jU;
            }
        } catch (Throwable th6) {
            th = th6;
            j2 = jU;
        }
    }

    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.d(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void z1() {
        be50 be50Var = this.W0;
        yd50 yd50VarY = oap1.y(this);
        if (be50Var != null) {
            yd50VarY.c(be50Var);
        }
        this.W0 = yd50VarY.b();
        I1();
    }
}
