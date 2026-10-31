package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class or30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ro30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or30(ro30 ro30Var, int i, float f, float f2, byte b) {
        super(2);
        this.a = b;
        this.b = ro30Var;
        this.c = i;
        this.d = f;
        this.e = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        ro30 ro30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fct fctVar = ((rbt) ro30Var.b).q;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarW = uyn1.w(nim0Var, uyn1.j(16.0f, 0.0f, 16.0f, 0.0f, 10));
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarW, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    qgo1.g(fctVar, ro30.d(qim0VarB, this.c, this.d, this.e, 1, 16.0f), x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rbt rbtVar = (rbt) ro30Var.b;
                    pbq pbqVar = rbtVar.l;
                    qim0 qim0VarW2 = uyn1.w(nim0Var, l6o1.s(x340Var4));
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var4).b;
                    cvx cvxVar6 = cbx.b(x340Var4).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarW2, 0.0f, 8.0f, 0.0f, 4.0f, 5);
                    cvx cvxVar7 = cbx.b(x340Var4).b;
                    qgo1.g(pbqVar, ro30.d(qim0VarB2, this.c, this.d, this.e, 2, 8.0f), x340Var4);
                    pbq pbqVar2 = rbtVar.k;
                    qim0 qim0VarW3 = uyn1.w(nim0Var, l6o1.s(x340Var4));
                    cvx cvxVar8 = cbx.b(x340Var4).b;
                    qim0 qim0VarB3 = uyn1.B(qim0VarW3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    cvx cvxVar9 = cbx.b(x340Var4).b;
                    qgo1.g(pbqVar2, ro30.d(qim0VarB3, this.c, this.d, this.e, 3, 8.0f), x340Var4);
                    pbq pbqVar3 = rbtVar.m;
                    qim0 qim0VarW4 = uyn1.w(nim0Var, l6o1.s(x340Var4));
                    cvx cvxVar10 = cbx.b(x340Var4).b;
                    cvx cvxVar11 = cbx.b(x340Var4).b;
                    qim0 qim0VarB4 = uyn1.B(qim0VarW4, 0.0f, 8.0f, 0.0f, 8.0f, 5);
                    cvx cvxVar12 = cbx.b(x340Var4).b;
                    qgo1.g(pbqVar3, ro30.d(qim0VarB4, this.c, this.d, this.e, 4, 8.0f), x340Var4);
                    qim0 qim0VarB5 = u291.b(0.0f, 52.0f, 1, nim0Var);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarB5);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    qgo1.g(rbtVar.c, uyn1.w(nim0Var, l6o1.r(x340Var4)), x340Var4);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
