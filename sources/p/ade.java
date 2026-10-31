package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ade extends hab0 implements xu30 {
    public final /* synthetic */ pys0 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ cce c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ade(pys0 pys0Var, iu30 iu30Var, cce cceVar, boolean z, boolean z2) {
        super(3);
        this.a = pys0Var;
        this.b = iu30Var;
        this.c = cceVar;
        this.d = z;
        this.e = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        x340 x340Var2;
        x340 x340Var3 = (b0k) obj2;
        ((Number) obj3).intValue();
        era eraVar = een.Q0;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarW = uyn1.w(u291.f(nim0Var, 1.0f), (vzq0) obj);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var3).b;
        qim0 qim0VarX = uyn1.x(qim0VarW, 16.0f);
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var3, 0);
        x340 x340Var4 = x340Var3;
        int iHashCode = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0VarE = zr7.E(x340Var3, qim0VarX);
        hzj.A.getClass();
        x340 x340Var5 = x340Var3;
        if (x340Var5.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var5.m0();
        if (x340Var5.S) {
            x340Var5.l(hmb0.t1);
        } else {
            x340Var5.v0();
        }
        nko1.H(mbhVarA, x340Var3, y580.O0);
        nko1.H(xos0VarM, x340Var3, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
        nko1.F(x340Var3);
        nko1.H(qim0VarE, x340Var3, y580.Y);
        String strO0 = cwl1.o0(x340Var3, 2131953521);
        lee1 lee1Var = cbx.d(x340Var3).c;
        qim0 qim0VarN = anm1.N("change_pin_title", u291.f(nim0Var, 1.0f));
        Object objT = x340Var5.T();
        if (objT == fkj0.X) {
            objT = jzd.T0;
            x340Var5.s0(objT);
        }
        uwo1.e(strO0, s161.b(qim0VarN, false, (iu30) objT), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var3, 0, 0, 2024);
        op71.g(x340Var3, u291.h(nim0Var, cbx.b(x340Var3).b.a));
        nko1.s(this.a, this.b, this.c, null, x340Var3, 8);
        cvx cvxVar2 = cbx.b(x340Var3).b;
        op71.g(x340Var3, u291.h(nim0Var, 16.0f));
        if (!this.d) {
            x340Var = x340Var5;
            if (this.e) {
                x340Var.i0(-330030982);
                nko1.h(new tq60(eraVar), x340Var3, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-329925117);
                x340Var2 = x340Var;
                uwo1.e(cwl1.o0(x340Var3, 2131953517), u291.f(nim0Var, 1.0f), cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var3, 0, 0, 2016);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            return rih1.a;
        }
        x340Var = x340Var5;
        x340Var.i0(-330143760);
        xto1.e(new tq60(eraVar), 0, 0L, 0L, x340Var3, 0, 14);
        x340Var.r(false);
        x340Var2 = x340Var;
        x340Var2.r(true);
        return rih1.a;
    }
}
