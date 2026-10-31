package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i16 implements EventSource {
    public final /* synthetic */ b a;

    public i16(lmy0 lmy0Var, nfa0 nfa0Var, vtf vtfVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        byte b = 0;
        mr20[] mr20VarArr = {new ik(new g16(lmy0Var.a("hm://users-nearby-service/v1/approval-granted", new d16(nfa0Var, b)), vtfVar, b), (byte) 12)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
