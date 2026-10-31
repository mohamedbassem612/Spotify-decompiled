package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p0c1 implements EsperantoCallbackRouter {
    public final /* synthetic */ CallbackRouter a;

    public p0c1(CallbackRouter callbackRouter) {
        this.a = callbackRouter;
    }

    public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
        return this.a.resolve(request, resolveCallback);
    }
}
