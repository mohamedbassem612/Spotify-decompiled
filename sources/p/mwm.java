package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mwm extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ hw2 b;
    public final /* synthetic */ nm1 c;
    public final /* synthetic */ nm1 d;
    public final /* synthetic */ el9 e;
    public final /* synthetic */ lwm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwm(hw2 hw2Var, nm1 nm1Var, nm1 nm1Var2, el9 el9Var, lwm lwmVar, int i) {
        super(2);
        this.b = hw2Var;
        this.c = nm1Var;
        this.d = nm1Var2;
        this.e = el9Var;
        this.f = lwmVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    kiv kivVar = xce0.a;
                    qim0 qim0VarH = l6o1.H(zr7.i(qim0VarF, gce0.c), l6o1.C(0, 0, 1, x340Var2), false, 14);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarB = uyn1.B(qim0VarH, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.a, 7);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    lwm lwmVar = this.f;
                    String str = lwmVar.a;
                    String str2 = lwmVar.g;
                    otw.c(this.b, new sxm(str, lwmVar.b, lwmVar.c, lwmVar.d), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    if (str2 != null) {
                        x340Var2.i0(-809993340);
                        otw.c(this.c, new uwm(str, str2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-809733870);
                        x340Var2.r(false);
                    }
                    otw.c(this.d, new ixm(str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    otw.c(this.e, new fym(str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                gho1.a(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwm(hw2 hw2Var, lwm lwmVar, nm1 nm1Var, nm1 nm1Var2, el9 el9Var) {
        super(2);
        this.b = hw2Var;
        this.f = lwmVar;
        this.c = nm1Var;
        this.d = nm1Var2;
        this.e = el9Var;
    }
}
