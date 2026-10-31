package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cvn extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvn(mr20 mr20Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = mr20Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mr20 mr20Var = this.b;
        byte b2 = 1;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                rqo1.h(mr20Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    rqo1.h(mr20Var, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(-1868417746, new cvn(mr20Var, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvn(mr20 mr20Var, byte b) {
        super(2);
        this.a = b;
        this.b = mr20Var;
    }
}
