package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zxd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxd1(int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 4:
                this.b = i;
                super(2);
                break;
            default:
                this.b = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        String strE;
        plx plxVar;
        String str;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                z1p1.g((b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                jo31.c(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                return new k3h1(i);
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(cwl1.U(2131820947, i, new Object[]{Integer.valueOf(i)}, x340Var2), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    cr31 cr31VarB = er31.b(4.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = dug.f(nim0Var, cbx.a(x340Var4).a.c, cr31VarB);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarF);
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
                    if (i >= 0) {
                        strE = gvg.e(i, "+", "ms");
                    } else {
                        strE = i + "ms";
                    }
                    uwo1.e(strE, uyn1.y(nim0Var, 4.0f, 2.0f), cbx.d(x340Var4).k, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 48, 0, 2032);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    long j = u7h.f;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var6).g;
                    qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        plxVar = olx.c;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        plxVar = plx.c;
                    }
                    plx plxVar2 = plxVar;
                    int iC2 = l1d.C(i);
                    if (iC2 == 0) {
                        str = "Arrow left";
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return null;
                        }
                        str = "Arrow right";
                    }
                    w0h1.a(plxVar2, new jsl(str), qim0VarR, j, 0L, false, x340Var6, 3080, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                z1a1.f(i, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxd1(byte b, int i, boolean z) {
        super(2);
        this.a = b;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxd1(byte b, int i, int i2) {
        super(2);
        this.a = b;
        this.b = i;
    }
}
