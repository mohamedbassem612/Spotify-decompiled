package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kcl implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mcl b;

    public /* synthetic */ kcl(mcl mclVar, byte b) {
        this.a = b;
        this.b = mclVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                wh41 wh41Var = this.b.Q0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                synchronized (wh41Var) {
                    if (wh41Var.b) {
                        return;
                    }
                    ((NativeConnectivityManager) wh41Var.c).setBackground(!zBooleanValue);
                    return;
                }
            default:
                lcl lclVar = (lcl) obj;
                this.b.a().setAppState(lclVar.a, lclVar.b);
                return;
        }
    }
}
