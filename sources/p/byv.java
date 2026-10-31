package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class byv implements Producer {
    public final /* synthetic */ dyv a;

    public byv(dyv dyvVar) {
        this.a = dyvVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
