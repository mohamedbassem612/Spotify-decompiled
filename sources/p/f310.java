package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f310 implements EventSource {
    public final q8n a;
    public final kly0 b;

    public f310(q8n q8nVar, nxo nxoVar) {
        this.a = q8nVar;
        this.b = nxoVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new any((dt71) ((g310) this.b.get()).c.b, (byte) 14)};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(new xu2(consumer, (byte) 9));
    }
}
