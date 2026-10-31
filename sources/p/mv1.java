package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mv1 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov1 b;

    public /* synthetic */ mv1(ov1 ov1Var, byte b) {
        this.a = b;
        this.b = ov1Var;
    }

    public final void dispose() {
        byte b = this.a;
        ov1 ov1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ov1Var.b.a(new uwq0((twq0) null));
                break;
            default:
                ov1Var.b.a(new uwq0((twq0) null));
                break;
        }
    }
}
