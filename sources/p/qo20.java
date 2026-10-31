package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qo20 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pxg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo20(pxg1 pxg1Var, byte b) {
        super(3);
        this.a = b;
        this.b = pxg1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        pxg1 pxg1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-2110915093);
                x340Var.r(false);
                break;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(1845574190);
                x340Var2.r(false);
                break;
            default:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(-795568257);
                x340Var3.r(false);
                break;
        }
        return pxg1Var;
    }
}
