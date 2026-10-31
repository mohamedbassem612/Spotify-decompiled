package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ctv implements Producer {
    public final /* synthetic */ dtv a;

    public ctv(dtv dtvVar) {
        this.a = dtvVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.e);
    }
}
