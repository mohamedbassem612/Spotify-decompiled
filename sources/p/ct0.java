package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ct0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct0(nt0 nt0Var, byte b) {
        super(1);
        this.a = b;
        this.b = nt0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nt0 nt0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nt0Var.w = (String) obj;
                return rih1.a;
            default:
                return new rm(nt0Var, (byte) 2);
        }
    }
}
