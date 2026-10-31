package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xbj1 implements EventSource {
    public final /* synthetic */ b a;

    public xbj1(q8n q8nVar, fv0 fv0Var, Flowable flowable) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20 kr41Var = new kr41(fv0Var.d, (byte) 16);
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {kr41Var, new xkb1(new uji1(rqt0.u(new h801(new kge(flowable), (byte) 20)), (byte) 3), (byte) 14)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
