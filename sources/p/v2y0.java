package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v2y0 implements Producer {
    public final /* synthetic */ w2y0 a;

    public v2y0(w2y0 w2y0Var) {
        this.a = w2y0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
