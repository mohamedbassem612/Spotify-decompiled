package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ecu implements EventSource {
    public final /* synthetic */ b a;

    public ecu(ic9 ic9Var, mjv mjvVar, lmw lmwVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        oir oirVar = (oir) ic9Var.b;
        mr20[] mr20VarArr = {new hs6(rqt0.u(new nf(yoi1.g(oirVar.a), (byte) 20)), (byte) 8), new c64(new ik(new nf(yoi1.g(oirVar.c), (byte) 21), (byte) 15), ic9Var, (byte) 21), new ry50(((zwz0) mjvVar.b).c(), (byte) 13), new ry50(rqt0.u((mr20) lmwVar.b), (byte) 8)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
