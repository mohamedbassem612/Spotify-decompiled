package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rz80 implements EventSource {
    public final /* synthetic */ b a;

    public rz80(Flowable flowable, zq51 zq51Var, b1y b1yVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        boolean zN = b1yVar.a.n();
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new ry50(rqt0.u(hu20.e(rqt0.u(new pd00(new kge(flowable), zN, (byte) 1)), new sz80((lnm) null, zq51Var, (byte) 0))), (byte) 11)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
