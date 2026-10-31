package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f5r0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ahi0 b;
    public final /* synthetic */ g5r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5r0(ahi0 ahi0Var, g5r0 g5r0Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = ahi0Var;
        this.c = g5r0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g5r0 g5r0Var = this.c;
        ahi0 ahi0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    otw.c((maa) ((ynb0) ahi0Var.V0).get(), new xp50(g5r0Var.g), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ahi0Var.k(g5r0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var4).g, 32, nim0.a);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarO);
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
                    otw.c((maa) ((ynb0) ahi0Var.P0).get(), new vyb1(g5r0Var.e), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5r0(ahi0 ahi0Var, g5r0 g5r0Var, byte b) {
        super(2);
        this.a = b;
        this.b = ahi0Var;
        this.c = g5r0Var;
    }
}
