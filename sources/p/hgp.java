package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hgp implements q731 {
    public final /* synthetic */ lbp a;

    public hgp(lbp lbpVar) {
        this.a = lbpVar;
    }

    public final v1k a(n6r0 n6r0Var) {
        lbp lbpVar = this.a;
        CallbackRouter callbackRouter = (CallbackRouter) lbp.a(lbpVar).a.n.get();
        c8o.l(callbackRouter);
        jn7 jn7VarU = tk00.u(callbackRouter);
        CallbackRouter callbackRouter2 = (CallbackRouter) lbp.a(lbpVar).a.n.get();
        c8o.l(callbackRouter2);
        return new v1k(jn7VarU, tk00.v(callbackRouter2), n6r0Var, (byte) 26);
    }
}
