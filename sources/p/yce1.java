package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yce1 implements EventSource {
    public final q8n a;
    public final mr20 b;

    public yce1(wce1 wce1Var, q8n q8nVar) {
        this.a = q8nVar;
        this.b = rqt0.u(new fts(wce1Var.b, (byte) 8));
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.b};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(new xu2(consumer, (byte) 28));
    }
}
