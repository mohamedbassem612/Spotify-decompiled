package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t8h implements EventSource {
    public final /* synthetic */ b a;

    public t8h(Flowable flowable, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new i0h(new i0h(new xy0(new kge(flowable), (byte) 7), (byte) 1), (byte) 2)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
