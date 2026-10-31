package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pr30 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr30(byte b, float f, ven0 ven0Var) {
        super(3);
        this.a = b;
        this.b = ven0Var;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        float f = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    qim0 qim0VarX = lrn1.x(uyn1.B(h2c.a.a(nim0Var, een.f), 0.0f, 0.0f, 8.0f, 0.0f, 11), 1.0f);
                    boolean zI = x340Var2.i(ven0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new i030(ven0Var, (byte) 5);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarU = lrn1.u(qim0VarX, (iu30) objT);
                    boolean zD = x340Var2.d(f);
                    Object objT2 = x340Var2.T();
                    if (zD || objT2 == m4cVar) {
                        objT2 = new yy2((byte) 4, f);
                        x340Var2.s0(objT2);
                    }
                    qim0 qim0VarX2 = j9k1.x(qim0VarU, (xu30) objT2);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    us71.j(iIntValue & 14, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                fue1 fue1Var = (fue1) ven0Var.getValue();
                x340 x340Var3 = (b0k) obj2;
                if (fue1Var == null) {
                    x340Var3.i0(1115768585);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1115768586);
                    x340Var3.i0(1144371558);
                    qim0 qim0VarN = anm1.N(dro.I(fue1Var.c), u291.A(eqr0.C(nim0Var, ((wat) x340Var3.k(t4k.h)).N0(fue1Var.b - f), -46.0f), een.h, true));
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM2 = x340Var3.m();
                    qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var3, y580.O0);
                    nko1.H(xos0VarM2, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE2, x340Var3, y580.Y);
                    dro.i(0, fue1Var.a, x340Var3, (qim0) null);
                    us71.m(x340Var3, true, false, false);
                }
                return rih1Var;
        }
    }
}
