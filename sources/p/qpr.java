package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qpr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpr(op80 op80Var, byte b) {
        super(1);
        this.a = b;
        this.b = op80Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        op80 op80Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return op80Var;
            default:
                ((qyb1) obj).a.a(op80Var);
                return rih1.a;
        }
    }
}
