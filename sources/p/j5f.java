package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j5f implements Producer {
    public final /* synthetic */ l5f a;

    public j5f(l5f l5fVar) {
        this.a = l5fVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.g);
    }
}
