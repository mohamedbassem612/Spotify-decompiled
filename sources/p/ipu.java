package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ipu implements EventSource {
    public final /* synthetic */ b a;

    public ipu(Flowable flowable, p5y p5yVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new x3s(rqt0.u(new pzs(new kge(flowable), p5yVar, (byte) 10)), (byte) 13)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
