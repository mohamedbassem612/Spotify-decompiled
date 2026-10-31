package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bfu0 implements f961 {
    public final RxRouter a;
    public final CallbackRouter b;
    public final j0d1 c = guo1.B();

    public bfu0(RxRouter rxRouter, CallbackRouter callbackRouter) {
        this.a = rxRouter;
        this.b = callbackRouter;
    }

    public final void shutdown() {
        this.c.d((CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
