package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cyv implements Producer {
    public final /* synthetic */ dyv a;

    public cyv(dyv dyvVar) {
        this.a = dyvVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.e);
    }
}
