package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h0u0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vf2 b;

    public /* synthetic */ h0u0(vf2 vf2Var, byte b) {
        this.a = b;
        this.b = vf2Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vf2 vf2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                g0u0 g0u0Var = (g0u0) obj;
                zor.i((zor) ((ywp) vf2Var.b).get(), (String) null, 6);
                g0u0Var.getClass();
                vf2Var.d(g0u0Var);
                break;
            default:
                g0u0 g0u0Var2 = (g0u0) obj;
                g0u0Var2.getClass();
                vf2Var.d(g0u0Var2);
                break;
        }
    }
}
