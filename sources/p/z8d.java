package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z8d implements EventSource {
    public final qkr a;
    public final gve b;
    public final q8n c;

    public z8d(qkr qkrVar, gve gveVar, q8n q8nVar) {
        this.a = qkrVar;
        this.b = gveVar;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new mgb(new mgb(this.a.c, this, (byte) 11), this, (byte) 12)};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(new xu2(consumer, (byte) 4));
    }
}
