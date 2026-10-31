package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qbj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w4i1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbj0(w4i1 w4i1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = w4i1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w4i1 w4i1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                gyo1.t(w4i1Var, b0kVar, czo1.p(1));
                break;
            default:
                gyo1.u(w4i1Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
