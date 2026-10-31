package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qya0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shg1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qya0(shg1 shg1Var, String str, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = shg1Var;
        this.c = str;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z50 z50Var = z50.c;
        shg1 shg1Var = this.b;
        String str = this.c;
        iu30 iu30Var = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zI = x340Var2.i(shg1Var) | x340Var2.g(str) | x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new pya0(shg1Var, str, iu30Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT), new tq60(een.Q0), (max) null, (gdx) null, (idn0) null, (vu30) null, (vu30) null, pui.c, x340Var2, 12582912, 124);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zI2 = x340Var4.i(shg1Var) | x340Var4.g(str) | x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new pya0(shg1Var, str, iu30Var, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), new idx(19), new tq60(een.Q0), (max) null, yla.r(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, y5j.a, x340Var4, 0, 48, 2008);
                }
                break;
        }
        return rih1Var;
    }
}
