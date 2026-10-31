package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class by7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ sx7 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by7(sx7 sx7Var, iu30 iu30Var) {
        super(2);
        this.b = sx7Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        sx7 sx7Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (sx7 sx7Var2 : sx7.e) {
                        String str = sx7Var2.a;
                        boolean z = sx7Var == sx7Var2;
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.e(sx7Var2.ordinal());
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new z77(iu30Var, sx7Var2, (byte) 8);
                            x340Var2.s0(objT);
                        }
                        pto1.k(str, z, false, (Function0) objT, x340Var2, 384, 0);
                    }
                } else {
                    x340Var2.b0();
                }
                break;
            default:
                ((Number) obj2).intValue();
                pto1.a(sx7Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by7(sx7 sx7Var, iu30 iu30Var, int i) {
        super(2);
        this.b = sx7Var;
        this.c = iu30Var;
    }
}
