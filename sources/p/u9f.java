package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u9f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y9f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9f(y9f y9fVar, byte b) {
        super(2);
        this.a = b;
        this.b = y9fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        y9f y9fVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    otw.c((hao0) y9fVar.n.getValue(), rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    bzn1.e((qim0) null, (vu30) null, false, apo.r(1159527415, new u9f(y9fVar, objArr == true ? 1 : 0), x340Var4), (sgr0) null, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 3072, 247);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
        }
    }
}
