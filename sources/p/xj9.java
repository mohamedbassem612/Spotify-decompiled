package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xj9 implements EventSource {
    public final /* synthetic */ b a;

    public xj9(xir xirVar, yqg yqgVar, q8n q8nVar, r65 r65Var) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new c64(new c64(yoi1.g(xirVar.d), r65Var, (byte) 22), yqgVar, (byte) 23), new hs6(rqt0.u(new nf(yoi1.g(xirVar.b), (byte) 22)), (byte) 9)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
