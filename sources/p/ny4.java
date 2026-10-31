package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ny4 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ifv0 b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ ny4(ifv0 ifv0Var, ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ifv0Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ifv0 ifv0Var = this.b;
        byte b2 = 1;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mod.b(sy4.b.a(Boolean.TRUE), apo.r(1022273628, new ny4(ifv0Var, ven0Var, b2), x340Var2), x340Var2, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = x340Var;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var3.T();
                    Object obj3 = fkj0.X;
                    if (objT == obj3) {
                        objT = new z9((byte) 14);
                        x340Var3.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
                    boolean zI = x340Var3.i(ifv0Var);
                    Object objT2 = x340Var3.T();
                    if (zI || objT2 == obj3) {
                        objT2 = new ly4(ifv0Var, (byte) 0);
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarK = d9y0.k(lrn1.u(qim0VarB, (iu30) objT2), ifv0Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    vu30 vu30Var = (vu30) ven0Var.getValue();
                    Object objT3 = x340Var3.T();
                    if (objT3 == obj3) {
                        objT3 = td4.c;
                        x340Var3.s0(objT3);
                    }
                    gfh0 gfh0Var = (gfh0) objT3;
                    int iHashCode = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, qim0VarK);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(hmb0.t1);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0Var, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    us71.j(0, vu30Var, x340Var3, true);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
        }
    }
}
