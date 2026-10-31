package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ot91 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ j2i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot91(qim0 qim0Var, String str, ven0 ven0Var, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = str;
        this.d = ven0Var;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        j2i j2iVar = this.e;
        String str = this.c;
        qim0 qim0Var = this.b;
        ven0 ven0Var = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarN = anm1.N(str, u291.f(qim0Var, 1.0f));
                    boolean zI = x340Var2.i(ven0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new ry71(ven0Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarX = ern1.x(qim0VarN, (iu30) objT);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(3, (wux) null, apo.r(-1776921490, new ot91(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarN2 = anm1.N(str, qim0Var);
                    boolean zI2 = x340Var6.i(ven0Var);
                    Object objT2 = x340Var6.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new ry71(ven0Var, (byte) 19);
                        x340Var6.s0(objT2);
                    }
                    qim0 qim0VarX2 = ern1.x(qim0VarN2, (iu30) objT2);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarX2);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    dv20.l(0, j2iVar, x340Var6, true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nyx.a(3, (wux) null, apo.r(-412086659, new ot91(this.b, this.c, this.d, this.e, (byte) 2), x340Var8), x340Var8, 3078, 6);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }
}
