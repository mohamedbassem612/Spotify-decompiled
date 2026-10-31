package p;

import com.spotify.cosmos.cosmonaut.Cosmonaut;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y9q implements zu0 {
    public final /* synthetic */ caq a;

    public y9q(caq caqVar) {
        this.a = caqVar;
    }

    public final c0u0 q(xu0 xu0Var, yu0 yu0Var) {
        daq daqVar = this.a.a;
        xrj1 xrj1Var = (xrj1) ((Cosmonaut) daqVar.w3.get()).createCosmosService(xrj1.class);
        c8o.m(xrj1Var);
        return new tkm(xu0Var, yu0Var, xrj1Var, (ao0) daqVar.Hk.get(), (q8n) daqVar.V2.get());
    }
}
