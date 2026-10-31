package p;

import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(j2i j2iVar, vu30 vu30Var) {
        super(2);
        this.a = (byte) 0;
        this.c = j2iVar;
        this.b = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2iVar.invoke(x340Var2, 0);
                    vu30Var.invoke(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var = x340Var4.a;
                if (zY) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var4, 48);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    boolean z = x340Var4.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var4, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var4, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var4, lljVar3);
                    nko1.F(x340Var4);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var4, lljVar4);
                    if (vu30Var != null) {
                        x340Var4.i0(-1884051931);
                        zov0 zov0Var = cbx.b(x340Var4).g;
                        qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        int iHashCode2 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM2 = x340Var4.m();
                        qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarR);
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, x340Var4, lljVar);
                        nko1.H(xos0VarM2, x340Var4, lljVar2);
                        x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                        nko1.H(qim0VarE2, x340Var4, lljVar4);
                        vu30Var.invoke(x340Var4, 0);
                        x340Var4.r(true);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1883851082);
                        x340Var4.r(false);
                    }
                    j2iVar.invoke(x340Var4, 0);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                abr0.a(czo1.p(49), j2iVar, (b0k) obj, vu30Var);
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ujo1.c(l6o1.C(0, 0, 1, x340Var6), dug.e(nim0Var, (Brush) vu30Var.invoke(x340Var6, 0), (hw61) null, 0.0f, 6), apo.r(-823105808, new j2r0(j2iVar, (byte) 25), x340Var6), x340Var6, 384);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                r1p1.c(czo1.p(49), j2iVar, (b0k) obj, vu30Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a61(vu30 vu30Var, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = vu30Var;
        this.c = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a61(vu30 vu30Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = vu30Var;
        this.c = j2iVar;
    }
}
