package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ci3 implements vu30 {
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ j2i f;

    public ci3(vu30 vu30Var, vu30 vu30Var2, long j, long j2, long j3, long j4, j2i j2iVar) {
        this.a = vu30Var;
        this.b = vu30Var2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 1;
        byte b2 = 0;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            qim0 qim0VarW = uyn1.w(nim0.a, gi3.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
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
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var2, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            x340Var2.i0(346092326);
            x340Var2.r(false);
            vu30 vu30Var = this.a;
            if (vu30Var == null) {
                x340Var2.i0(346396529);
            } else {
                x340Var2.i0(346396530);
                y2o1.h(this.c, o2h1.a(x340Var2, 9), apo.r(71284337, new bi3(vu30Var, b2), x340Var2), x340Var2, 384);
            }
            x340Var2.r(false);
            vu30 vu30Var2 = this.b;
            if (vu30Var2 == null) {
                x340Var2.i0(347174009);
            } else {
                x340Var2.i0(347174010);
                y2o1.h(this.d, o2h1.a(x340Var2, 2), apo.r(705583346, new bi3(vu30Var2, b), x340Var2), x340Var2, 384);
            }
            x340Var2.r(false);
            tq60 tq60Var = new tq60(een.R0);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK2 = tgp1.k(x340Var2);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, tq60Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var2, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            y2o1.h(this.e, o2h1.a(x340Var2, 10), this.f, x340Var2, 0);
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
