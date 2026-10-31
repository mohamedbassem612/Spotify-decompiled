package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i750 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jc50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i750(jc50 jc50Var, byte b) {
        super(2);
        this.a = b;
        this.b = jc50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        gex0 gex0Var = h36.a;
        rih1 rih1Var = rih1.a;
        jc50 jc50Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (jc50Var.t) {
                        x340Var2.i0(1754828282);
                        uwr uwrVar = cbx.a;
                        long j = cbx.a(x340Var2).c.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        xto1.e(uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0, j, 0L, x340Var2, 0, 10);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1755018932);
                        x340Var2.r(false);
                    }
                    String strO0 = cwl1.o0(x340Var2, 2131956461);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var2);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    if (jc50Var.X) {
                        x340Var4.i0(-575710927);
                        uwr uwrVar3 = cbx.a;
                        long j2 = cbx.a(x340Var4).c.a;
                        cvx cvxVar2 = cbx.b(x340Var4).b;
                        xto1.e(uyn1.B(nim0Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0, j2, 0L, x340Var4, 0, 10);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-575520277);
                        x340Var4.r(false);
                    }
                    String strO1 = cwl1.o0(x340Var4, 2131956460);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strO1, (qim0) null, cbx.d(x340Var4).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2042);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                fdg1.n(jc50Var, (b0k) obj, czo1.p(7));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                fdg1.p(jc50Var, (b0k) obj, czo1.p(7));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i750(jc50 jc50Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = jc50Var;
    }
}
