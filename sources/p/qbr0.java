package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qbr0 implements EventSource {
    public final pbr0 a;
    public final q8n b;

    public qbr0(pbr0 pbr0Var, q8n q8nVar) {
        this.a = pbr0Var;
        this.b = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.a.b};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 16));
    }
}
