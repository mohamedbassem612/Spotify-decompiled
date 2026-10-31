package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lpa1 implements EventSource {
    public final /* synthetic */ b a;

    public lpa1(p3t p3tVar, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new any(new tf2(hu20.e(hu20.e(new any(p3tVar, (byte) 18), new o681(3, (lnm) null, (byte) 2)), new o681(3, (lnm) null, (byte) 3)), (byte) 26), (byte) 18)};
        companion.getClass();
        this.a = new b(q8nVar, mr20VarArr);
    }

    public final Disposable a(Consumer consumer) {
        return this.a.a(consumer);
    }
}
