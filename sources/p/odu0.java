package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class odu0 implements EventSource {
    public final q8n a;
    public final yqg b;
    public final m9r0 c;

    public odu0(Flowable flowable, yqg yqgVar, q8n q8nVar) {
        this.a = q8nVar;
        this.b = yqgVar;
        vbm[] vbmVarArr = q601.a;
        this.c = new m9r0(rqt0.u(new dy20(new kge(flowable), (byte) 24)), this, (byte) 13);
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.c};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(consumer);
    }
}
