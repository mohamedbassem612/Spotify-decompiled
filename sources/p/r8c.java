package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r8c implements EsperantoCallbackRouter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CallbackRouter b;

    public /* synthetic */ r8c(CallbackRouter callbackRouter, byte b) {
        this.a = b;
        this.b = callbackRouter;
    }

    public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
        byte b = this.a;
        CallbackRouter callbackRouter = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
        return callbackRouter.resolve(request, resolveCallback);
    }
}
