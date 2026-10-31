package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oio implements EventSource {
    public final /* synthetic */ b a;

    public oio(String str, xlo xloVar) {
        bhh1 bhh1Var = igu.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new lt20(new yc2(new m441(new us0(xloVar, str, (lnm) null, (byte) 26)), (byte) 6), new rf2(3, (lnm) null, (byte) 15), (byte) 0)};
        companion.getClass();
        this.a = new b(bhh1Var, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
