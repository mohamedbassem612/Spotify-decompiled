package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mp50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp50(zv31 zv31Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zv31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zv31 zv31Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nyn1.d(zv31Var, b0kVar, czo1.p(1));
                break;
            case 1:
                nyn1.e(zv31Var, b0kVar, czo1.p(1));
                break;
            default:
                tm80.i(zv31Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
