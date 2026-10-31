package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nuy0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rul1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nuy0(rul1 rul1Var, byte b) {
        super(3);
        this.a = b;
        this.b = rul1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rul1 rul1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                gra graVar = een.i;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarA = ((g2c) obj).a(nim0Var, graVar);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
                boolean z = rul1Var.c;
                uwr uwrVar = cbx.a;
                kno1.n(z, (Function0) null, u291.r(nim0Var, 20.0f), false, fno1.g(cbx.a(x340Var).b.f, cbx.a(x340Var).b.b, x340Var), (idn0) null, x340Var, 48, 40);
                x340Var3.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                uwo1.e(rul1Var.b, (qim0) null, (lee1) null, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2030);
                return rih1Var;
        }
    }
}
