package p;

import com.google.protobuf.Empty;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ev71 implements zwz0 {
    public final llm a;
    public final ve01 b;

    public ev71(be beVar, q8n q8nVar) {
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("SharedReachabilityMonitor")));
        this.a = llmVarE;
        this.b = d5p1.r(rqt0.u(new ht20(new ph11(yoi1.g(beVar.callStream("spotify.connectivity.reachability.esperanto.proto.ReachabilityProvider", "reachabilityState", Empty.n()).map(djx0.d)), (byte) 6), new egv0(2, (lnm) null, (byte) 17))), llmVarE, ey71.a, 1);
    }

    public final uwz0 a() {
        uwz0 uwz0Var = (uwz0) o7h.s0(this.b.a.c());
        return uwz0Var == null ? new twz0((Set) null) : uwz0Var;
    }

    public final at71 d() {
        return this.b;
    }
}
