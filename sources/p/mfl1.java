package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mfl1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi11 b;

    public /* synthetic */ mfl1(vi11 vi11Var, byte b) {
        this.a = b;
        this.b = vi11Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vi11 vi11Var = this.b;
        switch (b) {
            case 0:
                vi11Var.U(((Boolean) obj).booleanValue());
                break;
            default:
                Logger.l((Throwable) obj, "Error listening to the Waze model", new Object[0]);
                vi11Var.U(false);
                break;
        }
    }
}
