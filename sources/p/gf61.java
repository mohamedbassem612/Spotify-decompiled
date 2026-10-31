package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gf61 implements EventSource {
    public final /* synthetic */ b a;

    public gf61(ocu ocuVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new dwv(((jdu) ocuVar).a.e, (byte) 18)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
