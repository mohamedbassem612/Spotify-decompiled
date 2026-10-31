package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hbt0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbt0(Integer num, byte b) {
        super(3);
        this.a = b;
        this.b = num;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Integer num = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                wsx wsxVar = wsx.c;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = egs0.a1;
                    x340Var.s0(objT);
                }
                w0h1.a(wsxVar, isl.a, s161.a(qim0VarD, (iu30) objT), num != null ? z4p1.e(num.intValue()) : u7h.k, 0L, false, x340Var, wsx.d | 48, 48);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                cyo1.h(num, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            default:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), een.Z, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                Object objT2 = x340Var4.T();
                if (objT2 == fkj0.X) {
                    objT2 = y5a1.c;
                    x340Var4.s0(objT2);
                }
                wkt0.a(zkt0.a, new uul1(new mi31((iu30) objT2)), (ksl) null, 0L, false, x340Var2, 6, 28);
                uwo1.e(cwl1.U(2131820932, num != null ? num.intValue() : 0, new Object[]{Integer.valueOf(num != null ? num.intValue() : 0)}, x340Var2), new vul1(xl3.a), cbx.d(x340Var2).j, cbx.a(x340Var2).b.c, (a0e1) null, (iu30) null, 2, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 1968);
                x340Var4.r(true);
                return rih1Var;
        }
    }
}
