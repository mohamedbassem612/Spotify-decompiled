package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tha0 implements EventSource {
    public final /* synthetic */ b a;

    public tha0(Flowable flowable, zq51 zq51Var, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new tf2(hu20.e(new kge(flowable), new sz80((lnm) null, zq51Var, (byte) 1)), (byte) 12)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
