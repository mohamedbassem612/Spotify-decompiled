package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kx01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ lx01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx01(lx01 lx01Var) {
        super(2);
        this.b = lx01Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lx01 lx01Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    jx01 state = lx01Var.getState();
                    boolean zI = x340Var2.i(lx01Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new vwz0(lx01Var, (byte) 12);
                        x340Var2.s0(objT);
                    }
                    lx01Var.y(state, bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                lx01Var.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx01(lx01 lx01Var, int i) {
        super(2);
        this.b = lx01Var;
    }
}
