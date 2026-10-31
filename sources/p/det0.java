package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class det0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ get0 b;

    public /* synthetic */ det0(get0 get0Var, byte b) {
        this.a = b;
        this.b = get0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        get0 get0Var = this.b;
        switch (b) {
            case 0:
                get0Var.i = (PlayerState) obj;
                break;
            default:
                get0Var.t = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
