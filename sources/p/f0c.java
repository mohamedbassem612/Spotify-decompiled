package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0c implements Producer {
    public final /* synthetic */ h0c a;

    public f0c(h0c h0cVar) {
        this.a = h0cVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.a);
    }
}
