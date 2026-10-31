package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v8d implements EventSource {
    public final bfd a;
    public final gve b;
    public final q8n c;

    public v8d(bfd bfdVar, gve gveVar, q8n q8nVar) {
        this.a = bfdVar;
        this.b = gveVar;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new mgb(new mgb(this.a.S0, this, (byte) 9), this, (byte) 10)};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(new xu2(consumer, (byte) 3));
    }
}
