package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n9f implements EventSource {
    public final bfd a;
    public final q8n b;

    public n9f(bfd bfdVar, q8n q8nVar) {
        this.a = bfdVar;
        this.b = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new lt20(new nwd(this.a.A(), (byte) 4), new m9f(3, (lnm) null, (byte) 0), (byte) 0)};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 5));
    }
}
