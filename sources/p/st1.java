package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class st1 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shq0 b;

    public /* synthetic */ st1(shq0 shq0Var, byte b) {
        this.a = b;
        this.b = shq0Var;
    }

    public final void dispose() {
        byte b = this.a;
        shq0 shq0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                shq0Var.invoke();
                break;
            default:
                shq0Var.invoke();
                break;
        }
    }
}
