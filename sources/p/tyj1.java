package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tyj1 implements EventSource {
    public final /* synthetic */ b a;

    public tyj1(d0r d0rVar, b0k1 b0k1Var, bmj1 bmj1Var, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        String str = b0k1Var.a;
        o3r o3rVar = vyj1.a;
        mr20[] mr20VarArr = {new m441(new nsf1(d0rVar, str, bmj1Var, (lnm) null, (byte) 13))};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
