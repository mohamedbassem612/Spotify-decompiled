package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tw1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ su1 b;
    public final /* synthetic */ fu1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(su1 su1Var, fu1 fu1Var) {
        super(2);
        this.b = su1Var;
        this.c = fu1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fu1 fu1Var = this.c;
        su1 su1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    v9p1.a(su1Var, fu1Var, x340Var2, 8);
                }
                break;
            default:
                ((Number) obj2).intValue();
                v9p1.a(su1Var, fu1Var, (b0k) obj, czo1.p(9));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(su1 su1Var, fu1 fu1Var, int i) {
        super(2);
        this.b = su1Var;
        this.c = fu1Var;
    }
}
