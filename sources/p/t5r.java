package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t5r extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cl70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5r(cl70 cl70Var, byte b) {
        super(1);
        this.a = b;
        this.b = cl70Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cl70 cl70Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                break;
        }
        return cl70Var;
    }
}
