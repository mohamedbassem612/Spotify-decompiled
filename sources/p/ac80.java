package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ac80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ r220 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac80(r220 r220Var, qim0 qim0Var, int i) {
        super(2);
        this.b = r220Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        r220 r220Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var2).a.c, d4o1.a);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    eox eoxVar = eox.c;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    w0h1.a(eoxVar, isl.a, uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), 0L, 0L, false, x340Var2, eox.d | 48, 56);
                    uwo1.e(r220Var.a, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                b6p1.e(r220Var, qim0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac80(qim0 qim0Var, r220 r220Var) {
        super(2);
        this.c = qim0Var;
        this.b = r220Var;
    }
}
