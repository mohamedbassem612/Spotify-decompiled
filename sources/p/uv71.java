package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uv71 extends pim0 implements zlb0, sjp0, m7v, j4k {
    public pv71 O0;

    public final void A1() {
        this.O0.getClass();
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new ny51(ifh0Var, this, q5t0VarH, (byte) 10));
    }

    public final void f0() {
        this.O0.f();
        p9p1.z(this, this.O0.d);
    }

    public final void t0(lsl lslVar) {
        n511 n511VarC;
        float fE;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        lslVar.s1();
        pv71 pv71Var = this.O0;
        yd50 yd50VarY = oap1.y(this);
        wdn0 wdn0Var = pv71Var.h;
        int iS = pv71Var.g.s();
        if (pv71Var.t != iS) {
            sv71.c(wdn0Var);
            pv71Var.t = iS;
        }
        Object[] objArr = wdn0Var.a;
        int i = wdn0Var.b;
        int i2 = 0;
        while (i2 < i) {
            ys71 ys71Var = (ys71) objArr[i2];
            if (ys71Var.m() && ys71Var.g() == null) {
                ys71Var.w(yd50VarY.b());
            }
            be50 be50VarG = ys71Var.g();
            if (be50VarG == null || (n511VarC = ys71Var.k().c.v().c()) == null || !ys71Var.m()) {
                yd50VarY = yd50VarY;
                objArr = objArr;
                i = i;
            } else {
                long jH = n511VarC.h();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jH & 4294967295L));
                ft71 ft71VarA = ys71Var.a();
                elb0 elb0Var = ft71VarA != null ? ft71VarA.e : null;
                elb0 elb0Var2 = ys71Var.k().b.e;
                if (elb0Var2 != null) {
                    if (ft71VarA != null && ft71VarA.n() && elb0Var != null && elb0Var.a() && elb0Var2.a()) {
                        fE = ft71VarA.e();
                        long jA = vs71.a(elb0Var, elb0Var2, ft71VarA.f());
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA >> 32));
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                    } else {
                        fE = 1.0f;
                        fIntBitsToFloat = 0.0f;
                        fIntBitsToFloat2 = 0.0f;
                    }
                    u8s0 u8s0Var = ys71Var.X;
                    ((dg8) lslVar.a1().b).z(0.0f, 0.0f);
                    try {
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                        cab cabVarA1 = lslVar.a1();
                        long jU = cabVarA1.u();
                        cabVarA1.p().q();
                        try {
                            ((dg8) cabVarA1.b).t(fE, fE, jFloatToRawIntBits);
                            if (u8s0Var != null) {
                                cab cabVarA2 = lslVar.a1();
                                long jU2 = cabVarA2.u();
                                cabVarA2.p().q();
                                try {
                                    ((dg8) cabVarA2.b).i(u8s0Var, 1);
                                    ((dg8) lslVar.a1().b).z(fIntBitsToFloat3, fIntBitsToFloat4);
                                    try {
                                        m5n1.r(lslVar, be50VarG);
                                        ((dg8) lslVar.a1().b).z(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                        cabVarA2.p().i();
                                        cabVarA2.D(jU2);
                                    } catch (Throwable th) {
                                        ((dg8) lslVar.a1().b).z(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    cabVarA2.p().i();
                                    cabVarA2.D(jU2);
                                    throw th2;
                                }
                            } else {
                                ((dg8) lslVar.a1().b).z(fIntBitsToFloat3, fIntBitsToFloat4);
                                try {
                                    m5n1.r(lslVar, be50VarG);
                                    ((dg8) lslVar.a1().b).z(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                } catch (Throwable th3) {
                                    ((dg8) lslVar.a1().b).z(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                    throw th3;
                                }
                            }
                            cabVarA1.p().i();
                            cabVarA1.D(jU);
                            ((dg8) lslVar.a1().b).z(-0.0f, -0.0f);
                        } catch (Throwable th4) {
                            cabVarA1.p().i();
                            cabVarA1.D(jU);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        ((dg8) lslVar.a1().b).z(-0.0f, -0.0f);
                        throw th5;
                    }
                } else {
                    yd50VarY = yd50VarY;
                    objArr = objArr;
                    i = i;
                    hhg1.n("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                }
            }
            i2++;
            objArr = objArr;
            i = i;
            yd50VarY = yd50VarY;
        }
    }

    public final void z1() {
        p9p1.z(this, this.O0.d);
        this.O0.getClass();
    }
}
