package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u0l implements EventSource {
    public final q8n a;
    public final yqg b;
    public final qbk c;

    public u0l(g0l g0lVar, q8n q8nVar, yqg yqgVar) {
        this.a = q8nVar;
        this.b = yqgVar;
        this.c = new qbk(rqt0.u(new qbk(yoi1.g(((inr) g0lVar).j()), this, (byte) 4)), this, (byte) 5);
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.c};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(consumer);
    }
}
