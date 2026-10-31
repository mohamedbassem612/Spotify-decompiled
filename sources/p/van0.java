package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class van0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ van0(lob1 lob1Var, byte b) {
        super(3);
        this.a = b;
        this.b = lob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lob1 lob1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV = u291.v(nim0.a, 88.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarV, cbx.a(x340Var).a.a.a(), d4o1.a);
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(4.0f));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
                if (lob1Var.g) {
                    x340Var3.i0(-1027840834);
                    vpb1.i(x340Var, 0);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1027786088);
                    vpb1.h(lob1Var, x340Var, 6);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                vpb1.g(lob1Var, (b0k) obj2, 0);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = lob1Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1722);
                return rih1Var;
        }
    }
}
