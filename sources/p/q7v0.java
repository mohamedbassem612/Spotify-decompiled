package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class q7v0 implements EsperantoCallbackRouter, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CallbackRouter b;

    public /* synthetic */ q7v0(CallbackRouter callbackRouter, byte b) {
        this.a = b;
        this.b = callbackRouter;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 5:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 6:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 7:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 8:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 9:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
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
        }
        return new tv30(2, this.b, CallbackRouter.class, "resolve", "resolve(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", 0);
    }

    public final int hashCode() {
        switch (this.a) {
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
        }
        return getFunctionDelegate().hashCode();
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
        }
        return callbackRouter.resolve(request, resolveCallback);
    }
}
