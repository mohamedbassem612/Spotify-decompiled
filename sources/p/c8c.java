package p;

import com.spotify.browse.clientnative.mobius.b;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c8c implements Producer {
    public final /* synthetic */ b a;

    public c8c(b bVar) {
        this.a = bVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
