package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t9i0 implements EventSource {
    public final q9i0 a;
    public final q8n b;
    public final String c;

    public t9i0(q9i0 q9i0Var, q8n q8nVar, String str) {
        this.a = q9i0Var;
        this.b = q8nVar;
        this.c = str;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new k6e0(this.a.g(this.c), (byte) 4)};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 11));
    }
}
