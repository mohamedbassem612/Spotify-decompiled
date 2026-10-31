package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k5r0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ err0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5r0(err0 err0Var, byte b) {
        super(1);
        this.a = b;
        this.b = err0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                err0Var.t(((Number) obj).intValue());
                break;
            case 1:
                err0Var.t(((Number) obj).intValue());
                break;
            case 2:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 3:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 4:
                err0Var.t(((Number) obj).intValue());
                break;
            default:
                err0Var.t(((Number) obj).intValue());
                break;
        }
        return rih1Var;
    }
}
