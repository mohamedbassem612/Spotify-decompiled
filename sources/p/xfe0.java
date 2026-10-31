package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xfe0 implements EventSource {
    public final q8n a;
    public final mnc0 b;

    public xfe0(c3s c3sVar, q8n q8nVar) {
        this.a = q8nVar;
        this.b = new mnc0(rqt0.u(yoi1.g(c3sVar.e)), (byte) 27);
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.b};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(consumer);
    }
}
