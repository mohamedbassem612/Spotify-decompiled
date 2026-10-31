package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gw71 implements EventSource {
    public final fw71 a;
    public final q8n b;

    public gw71(fw71 fw71Var, q8n q8nVar) {
        this.a = fw71Var;
        this.b = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.a.b};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 22));
    }
}
