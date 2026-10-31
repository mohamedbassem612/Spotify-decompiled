package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o9d1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n9d1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ x70 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9d1(n9d1 n9d1Var, float f, x70 x70Var, float f2, boolean z, byte b) {
        super(2);
        this.a = b;
        this.b = n9d1Var;
        this.c = f;
        this.d = x70Var;
        this.e = f2;
        this.f = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        long jA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    n9d1 n9d1Var = this.b;
                    int iC = l1d.C(n9d1Var.a);
                    if (iC == 0) {
                        x340Var2.i0(-80016694);
                        uwr uwrVar = cbx.a;
                        jA = cbx.a(x340Var2).a.c;
                        x340Var2.r(false);
                    } else if (iC == 1) {
                        x340Var2.i0(-80014166);
                        uwr uwrVar2 = cbx.a;
                        jA = cbx.a(x340Var2).a.b.a();
                        x340Var2.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var2, -80019228, false);
                        }
                        x340Var2.i0(-80011798);
                        uwr uwrVar3 = cbx.a;
                        jA = cbx.a(x340Var2).a.c;
                        x340Var2.r(false);
                    }
                    h2c h2cVar = h2c.a;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = h2cVar.b(nim0Var);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarC = u291.c(u291.f(nim0Var, this.c), 1.0f);
                    x70 x70Var = this.d;
                    t1c.a(dug.f(h2cVar.a(qim0VarC, x70Var.a), jA, d4o1.a), x340Var2, 0);
                    qim0 qim0VarA = h2cVar.a(u291.c(u291.f(nim0Var, 0.45f), 1.0f), x70Var.a);
                    gfh0 gfh0VarC2 = t1c.c(new gra((1.0f - this.e) * x70Var.b, 0.0f), false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    n9d1Var.c.invoke(Boolean.valueOf(this.f), x340Var2, 0);
                    x340Var2.r(true);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    b3o1.j(cbx.d(x340Var4).j, cbx.a(x340Var4).b.a, apo.r(1206619302, new o9d1(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 384, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
