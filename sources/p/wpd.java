package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wpd implements EventSource {
    public final q8n a;
    public final hs6 b;

    public wpd(ypd ypdVar, q8n q8nVar) {
        this.a = q8nVar;
        this.b = new hs6(rqt0.u(new hs6((mr20) ypdVar.d.getValue(), (byte) 28)), (byte) 29);
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.b};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(consumer);
    }
}
