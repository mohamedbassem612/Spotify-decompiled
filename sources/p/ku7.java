package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ku7 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ru7 b;

    public /* synthetic */ ku7(ru7 ru7Var, byte b) {
        this.a = b;
        this.b = ru7Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ru7 ru7Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ru7Var.W0 = u890.j(((PlayerState) obj).contextMetadata().get("player.arch"), "3");
                break;
            default:
                ru7Var.T0 = false;
                Logger.l((Throwable) obj, "Audio focus player command failed", new Object[0]);
                break;
        }
    }
}
