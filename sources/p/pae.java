package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pae implements EventSource {
    public final /* synthetic */ b a;

    public pae(cfd cfdVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new lt20(new yc2(new m441(new nae(cfdVar, null, (byte) 0)), (byte) 4), new rf2(3, (lnm) null, (byte) 9), (byte) 0)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
