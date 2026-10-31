package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n7f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7f(int i, vu30 vu30Var, boolean z) {
        super(2);
        this.a = (byte) 3;
        this.b = z;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i5j1 i5j1Var = z ? new i5j1(een.O0) : nim0.a;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, i5j1Var);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    us71.j(0, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x74.a(z, apo.r(-1506148699, new k7f((byte) 14, vu30Var, false), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    fq7.g(true, (qim0) null, xay.d(irn1.o0(400, 0, (dlv) null, 6), z ? een.O0 : een.Z, 12).a(xay.e(2, irn1.o0(400, 200, (dlv) null, 4))), (ln00) null, (String) null, apo.r(1565316297, new a2(vu30Var, (byte) 4), x340Var6), x340Var6, 196614, 26);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                si1.h(z, vu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7f(byte b, vu30 vu30Var, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = vu30Var;
    }
}
