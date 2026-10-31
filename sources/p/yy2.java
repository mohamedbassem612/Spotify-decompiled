package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yy2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy2(byte b, float f) {
        super(3);
        this.a = b;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        float f = this.b;
        switch (b) {
            case 0:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                long j = ((hjl) obj3).a;
                int i = hjl.i(j);
                int iH = hjl.h(j);
                int iU = jch0.U(i / f);
                if (iU <= iH) {
                    iH = iU;
                }
                int iF = jjl.f(iH, j);
                if (!((iF >= 0) & (i >= 0))) {
                    sf80.a("width and height must be >= 0");
                }
                q5t0 q5t0VarH = afh0Var.H(jjl.h(i, i, iF, iF));
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7xVar, new f2(q5t0VarH, (byte) 4));
            case 1:
                ifh0 ifh0Var2 = (ifh0) obj;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(hjl.b(((hjl) obj3).a, 0, 0, 0, Integer.MAX_VALUE, 3));
                float fX0 = ifh0Var2.X0(f);
                int iU2 = jch0.U((jch0.U((q5t0VarH2.U(xl3.b) - q5t0VarH2.U(xl3.a)) / fX0) + 1) * fX0);
                return ifh0Var2.S(q5t0VarH2.a, iU2, b7xVar, new wb5(q5t0VarH2, iU2, (byte) 2));
            case 2:
                ifh0 ifh0Var3 = (ifh0) obj;
                long j2 = ((hjl) obj3).a;
                int iI0 = ifh0Var3.i0(f);
                q5t0 q5t0VarH3 = ((afh0) obj2).H(hjl.b(j2, 0, (iI0 * 2) + hjl.i(j2), 0, 0, 13));
                return ifh0Var3.S(hjl.i(j2), q5t0VarH3.b, b7xVar, new wb5(q5t0VarH3, iI0, (byte) 3));
            case 3:
                ifh0 ifh0Var4 = (ifh0) obj;
                long j3 = ((hjl) obj3).a;
                q5t0 q5t0VarH4 = ((afh0) obj2).H(hjl.b(j3, 0, (jch0.U(ifh0Var4.X0(f)) * 2) + hjl.i(j3), 0, 0, 13));
                return ifh0Var4.S(q5t0VarH4.a, q5t0VarH4.b, b7xVar, new f2(q5t0VarH4, (byte) 8));
            case 4:
                q5t0 q5t0VarH5 = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH5.a, q5t0VarH5.b, b7xVar, new ci6(q5t0VarH5, f, (byte) 2));
            case 5:
                ifh0 ifh0Var5 = (ifh0) obj;
                q5t0 q5t0VarH6 = ((afh0) obj2).H(((hjl) obj3).a);
                int iI1 = ifh0Var5.i0(f);
                int i2 = q5t0VarH6.a - iI1;
                return ifh0Var5.S(i2 >= 0 ? i2 : 0, q5t0VarH6.b, b7xVar, new wb5(q5t0VarH6, iI1, (byte) 12));
            case 6:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, this.b, 0.0f, 11);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    i6p1.d(140.0f, 14.0f, 4.0f, (cr31) null, x340Var2, 438, 8);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                z1a1.g(80.0f, this.b, 4.0f, b0kVar, 0, 0);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                z1a1.g(160.0f, this.b, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                upo1.n(0.0f, 0, 2, (b0k) obj2, u291.h(u291.f(nim0Var, 0.45f), f));
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                upo1.n(4.0f, 0, 0, (b0k) obj2, u291.h(u291.f(nim0Var, 0.33f), f));
                return rih1Var;
        }
    }
}
