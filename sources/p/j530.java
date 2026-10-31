package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j530 implements EventSource {
    public final /* synthetic */ b a;

    public j530(String str, g7h g7hVar) {
        bhh1 bhh1Var = igu.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new lt20(new any(rqt0.u(new evz(new yc2(new m441(new f530(g7hVar, str, (lnm) null, (byte) 0)), (byte) 10), str, (byte) 18)), (byte) 23), new ob00(3, (lnm) null, (byte) 1), (byte) 0)};
        companion.getClass();
        this.a = new b(bhh1Var, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
