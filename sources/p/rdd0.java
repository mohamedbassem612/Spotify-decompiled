package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdd0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sdd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rdd0(sdd0 sdd0Var, byte b) {
        super(3);
        this.a = b;
        this.b = sdd0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d6i1 c6i1Var;
        ix00 hx00Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sdd0 sdd0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                hgd0 hgd0Var = sdd0Var.k;
                xdd0 xdd0Var = sdd0Var.h;
                String str = xdd0Var.c;
                if (hgd0Var.b()) {
                    x340Var3.i0(-406561083);
                    if (hgd0Var.c()) {
                        hx00Var = str != null ? new hx00(str) : fx00.a;
                    } else {
                        hx00Var = gx00.a;
                    }
                    otw.c(sdd0Var.c, new px00(xdd0Var.b, hx00Var, xdd0Var.e, xdd0Var.d), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-405638771);
                    if (hgd0Var.c()) {
                        c6i1Var = str != null ? new c6i1(str) : a6i1.a;
                    } else {
                        c6i1Var = b6i1.a;
                    }
                    otw.c(sdd0Var.b, new e6i1(xdd0Var.b, c6i1Var, xdd0Var.e, xdd0Var.d), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                otw.c(sdd0Var.a, new jvh(sdd0Var.h.b), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
        }
    }
}
