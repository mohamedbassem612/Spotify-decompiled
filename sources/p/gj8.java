package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gj8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vf2 b;

    public /* synthetic */ gj8(vf2 vf2Var, byte b) {
        this.a = b;
        this.b = vf2Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = false;
        vf2 vf2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vf2Var.g(((zfe0) obj) == zfe0.a, wzm0.a);
                break;
            default:
                if (((r321) obj) == r321.a && ((cor) ((kly0) vf2Var.c).get()).a.i()) {
                    z = true;
                }
                vf2Var.g(z, xzm0.a);
                break;
        }
    }
}
