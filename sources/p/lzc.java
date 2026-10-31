package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lzc implements CallbackRouter {
    public final CallbackRouter a;
    public final CallbackRouter b;

    static {
        new jma((byte) 1);
    }

    public lzc(CallbackRouter callbackRouter, CallbackRouter callbackRouter2) {
        this.a = callbackRouter;
        this.b = callbackRouter2;
    }

    @Override // com.spotify.cosmos.callbackrouter.CallbackRouter
    public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
        return jma.b(request) ? this.b.resolve(request, resolveCallback) : this.a.resolve(request, resolveCallback);
    }
}
