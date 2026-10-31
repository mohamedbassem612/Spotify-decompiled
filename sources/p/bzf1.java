package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bzf1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tyq b;
    public final /* synthetic */ jyf1 c;
    public final /* synthetic */ d0r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzf1(tyq tyqVar, jyf1 jyf1Var, d0r d0rVar) {
        super(3);
        this.a = (byte) 1;
        this.b = tyqVar;
        this.c = jyf1Var;
        this.d = d0rVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jyf1 jyf1Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    cev0.i(jyf1Var, this.b, this.d, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i1o1.e(this.b, new p08(jyf1Var.a, jyf1Var.g, jyf1Var.l), this.d, (qim0) null, (ipb1) null, wnj.a, (xu30) null, 0, (xu30) null, x340Var4, 196608, 236);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var6, 48);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(hmb0.t1);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    x340Var6.i0(-1087206143);
                    i1o1.e(this.b, new uho(jyf1Var.a, null, null, lho.a, null, null, 246), this.d, (qim0) null, (ipb1) null, wnj.b, (xu30) null, 0, (xu30) null, x340Var6, 196608, 236);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    ab80.p(nim0Var, 12.0f, x340Var6, false);
                    plx plxVar = plx.c;
                    zov0 zov0Var = cbx.b(x340Var6).g;
                    w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var6).c.b, 0L, false, x340Var6, plx.d | 48, 48);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzf1(jyf1 jyf1Var, tyq tyqVar, d0r d0rVar, byte b) {
        super(3);
        this.a = b;
        this.c = jyf1Var;
        this.b = tyqVar;
        this.d = d0rVar;
    }
}
