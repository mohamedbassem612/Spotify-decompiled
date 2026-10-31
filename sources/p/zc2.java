package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zc2 implements EventSource {
    public final /* synthetic */ b a;

    public zc2(qns0 qns0Var) {
        bhh1 bhh1Var = igu.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new lt20(new yc2(new m441(new q4(qns0Var, (lnm) null, (byte) 26)), (byte) 0), new jk(3, (lnm) null, (byte) 4), (byte) 0)};
        companion.getClass();
        this.a = new b(bhh1Var, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
