package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3p implements q731 {
    public final /* synthetic */ b2p a;

    public z3p(b2p b2pVar) {
        this.a = b2pVar;
    }

    @Override // p.q731
    public final v1k a(n6r0 n6r0Var) {
        d4p d4pVar = (d4p) this.a.c;
        CallbackRouter callbackRouter = (CallbackRouter) d4pVar.a.t.get();
        c8o.l(callbackRouter);
        jn7 jn7Var = new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 0)));
        CallbackRouter callbackRouter2 = (CallbackRouter) d4pVar.a.t.get();
        c8o.l(callbackRouter2);
        return new v1k(jn7Var, new a931(new CosmosCoroutineTransport(new r8c(callbackRouter2, (byte) 1))), n6r0Var, (byte) 26);
    }
}
