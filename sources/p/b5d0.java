package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b5d0 implements Producer {
    public final /* synthetic */ q8n a;

    public b5d0(q8n q8nVar) {
        this.a = q8nVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a);
    }
}
