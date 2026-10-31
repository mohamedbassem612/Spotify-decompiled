package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mkf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qkf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mkf(qkf qkfVar, byte b) {
        super(1);
        this.a = b;
        this.b = qkfVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qkf qkfVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b261.n((e261) obj, qkfVar.a);
                break;
            default:
                b261.n((e261) obj, qkfVar.b.b);
                break;
        }
        return rih1Var;
    }
}
