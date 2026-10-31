package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hrb1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ irb1 b;

    public /* synthetic */ hrb1(irb1 irb1Var, byte b) {
        this.a = b;
        this.b = irb1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        irb1 irb1Var = this.b;
        switch (b) {
            case 0:
                irb1Var.getClass();
                irb1Var.c = spq0.d((PlayerState) obj);
                break;
            default:
                irb1Var.c = j5.a;
                Logger.e((Throwable) obj, "Error to observe the player state.", new Object[0]);
                break;
        }
    }
}
