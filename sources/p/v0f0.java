package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v0f0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w6e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0f0(w6e0 w6e0Var, byte b) {
        super(2);
        this.a = b;
        this.b = w6e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w6e0 w6e0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                sqe.x((pe11) obj2, w6e0Var);
                break;
            default:
                sqe.x((pe11) obj2, w6e0Var);
                break;
        }
        return rih1Var;
    }
}
