package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y6p {
    public final ll3 a;

    public y6p(ll3 ll3Var) {
        this.a = ll3Var;
    }

    public final krh a() {
        return new krh(new jn7(new CosmosCoroutineTransport(new r8c((CallbackRouter) this.a.a.get(), (byte) 2))));
    }
}
