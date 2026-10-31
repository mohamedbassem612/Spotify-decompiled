package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lqa0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mqa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqa0(mqa0 mqa0Var, byte b) {
        super(1);
        this.a = b;
        this.b = mqa0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mqa0 mqa0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mqa0Var.a.t(((Number) ((o95) obj).e()).floatValue());
                break;
            case 1:
                mqa0Var.a.t(((Number) ((o95) obj).e()).floatValue());
                break;
            default:
                mqa0Var.c.t((int) (((yr80) obj).a & 4294967295L));
                break;
        }
        return rih1Var;
    }
}
