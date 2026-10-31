package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azk implements Producer {
    public final /* synthetic */ czk a;

    public azk(czk czkVar) {
        this.a = czkVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.a);
    }
}
