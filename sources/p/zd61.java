package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zd61 implements EventSource {
    public final /* synthetic */ b a;

    public zd61(lmy0 lmy0Var, nfa0 nfa0Var, vtf vtfVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new wzv0(new g16(lmy0Var.a("hm://users-nearby-service/v1/session-dismissed", new d16(nfa0Var, (byte) 2)), vtfVar, (byte) 1), (byte) 20)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
