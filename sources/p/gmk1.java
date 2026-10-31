package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gmk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ px2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmk1(px2 px2Var, byte b) {
        super(2);
        this.a = b;
        this.b = px2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        px2 px2Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    tgp1.g(px2Var, (qim0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    bzn1.e((qim0) null, (vu30) null, false, apo.r(550115249, new gmk1(px2Var, b2), x340Var4), (sgr0) null, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 3072, 247);
                }
                break;
        }
        return rih1Var;
    }
}
