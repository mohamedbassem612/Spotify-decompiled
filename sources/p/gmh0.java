package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gmh0 implements EventSource {
    public final twu a;
    public final r2v b;
    public final q8n c;

    public gmh0(twu twuVar, r2v r2vVar, q8n q8nVar) {
        this.a = twuVar;
        this.b = r2vVar;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new dwv(d5p1.g(this.a.f), (byte) 11), new dwv(d5p1.g(this.b.f), (byte) 12)};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(new xu2(consumer, (byte) 10));
    }
}
