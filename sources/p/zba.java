package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zba implements EventSource {
    public final /* synthetic */ b a;

    public zba(String str, xrc0 xrc0Var) {
        bhh1 bhh1Var = igu.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new lt20(new ik(new yc2(new m441(new wc5(xrc0Var, str, (lnm) null, (byte) 26)), (byte) 1), (byte) 19), new rf2(3, (lnm) null, (byte) 5), (byte) 0)};
        companion.getClass();
        this.a = new b(bhh1Var, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
