package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u8d implements EventSource {
    public final bfd a;
    public final q8n b;

    public u8d(bfd bfdVar, q8n q8nVar) {
        this.a = bfdVar;
        this.b = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new hs6(this.a.S0, (byte) 22)};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 2));
    }
}
