package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s9f implements EventSource {
    public final bfd a;
    public final gqo0 b;
    public final q8n c;

    public s9f(bfd bfdVar, gqo0 gqo0Var, q8n q8nVar) {
        this.a = bfdVar;
        this.b = gqo0Var;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        String str = gqo0.s;
        gqo0 gqo0Var = this.b;
        mr20[] mr20VarArr = {new x010(gqo0Var.k(str, new dqo0(gqo0Var, null, (byte) 0)), this.a.A(), new vm0(3, (lnm) null, (byte) 4), (byte) 1)};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(new xu2(consumer, (byte) 6));
    }
}
