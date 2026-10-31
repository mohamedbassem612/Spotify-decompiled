package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xp51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ up51 b;
    public final /* synthetic */ yp51 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp51(up51 up51Var, yp51 yp51Var) {
        super(2);
        this.b = up51Var;
        this.c = yp51Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yp51 yp51Var = this.c;
        up51 up51Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = up51Var.a;
                    hy50 hy50Var = up51Var.g;
                    int i = yp51.Y;
                    yp51Var.g(str, hy50Var, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iC = l1d.C(up51Var.b);
                    if (iC == 0) {
                        x340Var4.i0(147960569);
                        String str2 = up51Var.a;
                        int i2 = yp51.Y;
                        yp51Var.f(str2, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var4, 147958958, false);
                        }
                        x340Var4.i0(147962478);
                        wgo1.f(x340Var4, 0);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp51(yp51 yp51Var, up51 up51Var) {
        super(2);
        this.c = yp51Var;
        this.b = up51Var;
    }
}
