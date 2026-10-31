package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ei3 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ j2i c;

    public /* synthetic */ ei3(vu30 vu30Var, j2i j2iVar, byte b) {
        this.a = b;
        this.b = vu30Var;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        vu30 vu30Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (vu30Var == null) {
                        x340Var2.i0(-1102039173);
                    } else {
                        x340Var2.i0(795734342);
                        vu30Var.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    j2iVar.invoke(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zzq0 zzq0Var = gi3.a;
                    gi3.b(438, apo.r(-459506658, new ei3(vu30Var, j2iVar, b2), x340Var4), x340Var4);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    qim0 qim0VarB = uyn1.B(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), vu30Var != null ? 12.0f : 0.0f, 0.0f, 0.0f, 0.0f, 10);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iK = tgp1.k(x340Var6);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
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
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var6.S || !u890.j(x340Var6.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var6, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    dv20.l(0, j2iVar, x340Var6, true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
