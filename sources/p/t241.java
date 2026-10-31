package p;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t241 implements RxRouter {
    public final RxRouter a;
    public final RxRouter b;

    static {
        new hfb((byte) 23);
    }

    public t241(RxRouter rxRouter, RxRouter rxRouter2) {
        this.a = rxRouter;
        this.b = rxRouter2;
    }

    @Override // com.spotify.cosmos.rxrouter.RxRouter
    public final Observable resolve(Request request) {
        return hfb.h(request) ? this.b.resolve(request) : this.a.resolve(request);
    }
}
