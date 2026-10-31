package p;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.EsperantoRxRouter;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rtp0 implements EsperantoRxRouter {
    public final /* synthetic */ RxRouter a;

    public rtp0(RxRouter rxRouter) {
        this.a = rxRouter;
    }

    public final Observable resolve(Request request) {
        return this.a.resolve(request);
    }
}
